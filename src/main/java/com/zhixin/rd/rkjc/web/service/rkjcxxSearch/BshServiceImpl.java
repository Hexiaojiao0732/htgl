package com.zhixin.rd.rkjc.web.service.rkjcxxSearch;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.IBshMapper;
import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.IGjMapper;
import com.zhixin.rd.rkjc.web.entity.BshEntity;
import com.zhixin.rd.rkjc.web.entity.GjEntity;
/**
 * Created by yangyk on 2017/07/19
 */
@Service
public class BshServiceImpl implements IBshService {
	@Autowired
    private IBshMapper bshMapper;
	//根据证件号码查询全部
	@Override
	public List<BshEntity> queryAll(String zjhm) {
		List<BshEntity> list = bshMapper.selectAll(zjhm);
		return list;
	}
	//根据前后时间查询
	@Override
	public Map<String,Object> queryBshByTime(String zjhm,String startTime,String endTime,Integer pageStart,Integer rows) {
		//时间转换
		String str = startTime.replaceAll("-","");
		String end = endTime.replaceAll("-","");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("endTime", end);
		map.put("startTime", str);
		map.put("zjhm", zjhm);
		List<BshEntity> list = bshMapper.selectBshByTime(map);
		System.out.println(list);
		List<BshEntity> result = new ArrayList<BshEntity>();
		//获取总数
		int size = 0;
		//如果list不为空，则执行添加数据
		if(list != null&& list.size()>0){
			size = list.size();
			//获取可循环次数
			int index=(pageStart-1)*rows;
			int count =size-index;
			//判断如果每页显示行数大于可循环次数，则取可循环次数，如果小于则取每页显示行数
			int cnt=rows>count?count:rows;
			//循环添加数据
			for(int i = index;i<cnt;i++){
				result.add(list.get(i));
			}
		}
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("total", size);
		m.put("rows", result);
		return m;
	}
	//查询最新
	@Override
	public Map<String,Object> queryBshByNew(String zjhm,Integer count) {
		List<BshEntity> list = bshMapper.selectBshByNew(zjhm);
		List<BshEntity> result = new ArrayList<BshEntity>();
		//获取总数
		int size = 0;
		//如果list不为空，则执行添加数据
		if(list != null&& list.size()>0){
			size = list.size();

			//判断如果每页显示行数大于可循环次数，则取可循环次数，如果小于则取每页显示行数
			int cnt=count>size?size:count;
			//循环添加数据
			for(int i = 0;i<cnt;i++){
				result.add(list.get(i));
			}
		}
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("total", size);
		m.put("rows", result);
		return m;
	}
	//按证件号码查询
	@Override
	public Map<String,Object> queryBshByZjhm(String zjhm,Integer pageStart,Integer rows) {
		List<BshEntity> list = bshMapper.selectBshByZjhm(zjhm);
		List<BshEntity> result = new ArrayList<BshEntity>();
		//获取总数
		int size = 0;
		//如果list不为空，则执行添加数据
		if(list != null&& list.size()>0){
			size = list.size();
			//获取可循环次数
			int index=(pageStart-1)*rows;
			int count =size-index;
			//判断如果每页显示行数大于可循环次数，则取可循环次数，如果小于则取每页显示行数
			int cnt=rows>count?count:rows;
			//循环添加数据
			for(int i = index;i<cnt;i++){
				result.add(list.get(i));
			}
		}
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("total", size);
		m.put("rows", result);
		return m;
	}

}
