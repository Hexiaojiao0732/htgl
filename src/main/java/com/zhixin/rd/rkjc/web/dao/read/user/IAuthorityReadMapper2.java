package com.zhixin.rd.rkjc.web.dao.read.user;

import java.util.List;
import java.util.Map;

import com.zhixin.rd.rkjc.web.entity.AuthorityEntity;
import com.zhixin.rd.rkjc.web.entity.UserAuthority;
import com.zhixin.rd.rkjc.web.form.AuthorityForm;

public interface IAuthorityReadMapper2 {

    List<AuthorityEntity> listAuthority() throws Exception;

	List<AuthorityEntity> listAuthorityNotHide();

    List<Long> queryAuthorityIdsByRole(Long roleId);

    List<String> queryCodeKeyByRole(Long roleId);

	List<AuthorityEntity> listAuthorityData(AuthorityForm form);

	List<AuthorityEntity> queryRootid(Long parentId);

	List<AuthorityEntity> queryByUserId(Long userId);

	List<AuthorityEntity> getlistMenu(Integer userid);

	List<AuthorityEntity> listAuthorityById(long pid);

	List<String> listHideUrlByPid(Long pid);
	/**
	 * 查询所有用户id和权限id
	 * @return
	 */
	List<UserAuthority> listAllUserAuth();

	int queryMaxRootId();
	
	/**
	 * 查询权限附加菜单
	 * @return
	 */
	List<AuthorityEntity> listAuthorityExtraMenu();
 }
