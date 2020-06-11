package com.zhixin.rd.rkjc.web.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhixin.rd.rkjc.web.dao.read.user.IAuthorityReadMapper2;
import com.zhixin.rd.rkjc.web.dao.read.user.IRoleReadMapper;
import com.zhixin.rd.rkjc.web.dao.read.user.IUserReadMapper;
import com.zhixin.rd.rkjc.web.dao.read.user.IUserOrganizationReadMapper;
import com.zhixin.rd.rkjc.web.entity.AuthorityEntity;
import com.zhixin.rd.rkjc.web.entity.MenuMap;
import com.zhixin.rd.rkjc.web.entity.RoleEntity;

public class AuthorityCacheUtil implements InitializingBean, Runnable {

	private static final Logger logger = LoggerFactory.getLogger(AuthorityCacheUtil.class);

	@Autowired
	IAuthorityReadMapper2 authorityMapper;

	@Autowired
	IUserReadMapper userMapper;

	@Autowired
	private IUserOrganizationReadMapper userOrganizationMapper;

	@Autowired
	private IRoleReadMapper roleMapper;

	private final static ReadWriteLock rwl = new ReentrantReadWriteLock();
	private final static Lock readLock = rwl.readLock();
	private final static Lock writeLock = rwl.writeLock();

	// 所有权限(key: authorityId, value：权限集合)
	private static Map<Long, AuthorityEntity> authorityMap = null;

	// 所有角色权限(key:roleId vale< key: authorityId, value：权限集合>)
	private static Map<Integer, Map<Long, AuthorityEntity>> roleAuthorityMap = null;
	// 所有角色菜单(key:roleId vale： MenuMap root)
	private static Map<Integer, MenuMap> roleMenuMap = null;

	// 系统所有的部门用户关系(key:部门ID)
	// private static Map<Integer, List<UserOrganizationEntity>> allUserOrgMap =
	// null;

	public void refreshCache() {
		logger.info("--------------加载用户权限数据缓存(" + System.currentTimeMillis() + ")------------------------");
		initMaps();

	}

	private void initMaps() {
		writeLock.lock();
		if (null != authorityMap) {
			authorityMap.clear();
		} else {
			authorityMap = new LinkedHashMap<Long, AuthorityEntity>();
		}
		if (null != roleAuthorityMap) {
			roleAuthorityMap.clear();
		} else {
			roleAuthorityMap = new HashMap<Integer, Map<Long, AuthorityEntity>>();
		}
		if (null != roleMenuMap) {
			roleMenuMap.clear();
		} else {
			roleMenuMap = new HashMap<Integer, MenuMap>();
		}

		try {

			List<AuthorityEntity> list = authorityMapper.listAuthority();
			for (AuthorityEntity entity : list) {
				authorityMap.put(entity.getId(), entity);
			}
			// 获取所有权限
			Collection<RoleEntity> roleColl = roleMapper.getAllRoles();
			for (RoleEntity role : roleColl) {
				List<Long> authorityIds = authorityMapper.queryAuthorityIdsByRole(role.getId().longValue());
				Map<Long, AuthorityEntity> rmap = new HashMap<Long, AuthorityEntity>();
				for (Long authId : authorityIds) {
					AuthorityEntity auth = authorityMap.get(authId);
					if (auth != null) {
						rmap.put(auth.getId(), auth);
					}
				}
				roleAuthorityMap.put(role.getId(), rmap);
				// 菜单
				MenuMap rootMenu = new MenuMap();
				rootMenu.setId(0L);
				rootMenu.setTitle("root");
				rootMenu.setType(-1);

				// 获取所有权限的集合
				formateMenuMap(rmap.values(), rootMenu);
				
				roleMenuMap.put(role.getId(), rootMenu);
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			writeLock.unlock();
		}
	}

	public static List<MenuMap> getMenuMapsByRole(Integer roleId,boolean needRoot) {
		List<MenuMap> menuMapList = new ArrayList<MenuMap>();
		readLock.lock();
		try {
			MenuMap rootMenu =roleMenuMap.get(roleId);
			if(rootMenu!=null)
			{
				if(needRoot){
					menuMapList.add(rootMenu);
				}else if(rootMenu.getChildren()!=null ){
					menuMapList.addAll(rootMenu.getChildren());
				}
			}
			

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			readLock.unlock();
		}

		return menuMapList;
	}

	private static void formateMenuMap(Collection<AuthorityEntity> collection, MenuMap rootMenu) {
		if (collection != null && collection.size() > 0) {
			Map<Long, MenuMap> map = new LinkedHashMap<Long, MenuMap>();
			for (AuthorityEntity entity : collection) {

				MenuMap menuMap = new MenuMap(entity, false);
				if(menuMap.getType()<3){
					map.put(menuMap.getId(), menuMap);
				}
				

			}
			menuMapFindParent(map, rootMenu);
		}

	}

	private static void menuMapFindParent(Map<Long, MenuMap> map, MenuMap parent) {
		if (parent != null && parent.getId() != null) {
			for (MenuMap child : map.values()) {
				if (child.getParentId() != null && parent.getId().longValue() == child.getParentId().longValue()) {
					menuMapFindParent(map, child);
					parent.addChild(child);
				}else if(child.getParentId() == null && parent.getId().longValue() ==0){
					menuMapFindParent(map, child);
					parent.addChild(child);
				}
			}
		}

	}

	@Override
	public void run() {
		refreshCache();
	}

	/**
	 * 异步方式刷新缓存
	 */
	public void refreshCacheAsyc() {
		new Thread(this).start();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//refreshCacheAsyc();

	}

}
