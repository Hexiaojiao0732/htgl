package com.zhixin.rd.rkjc.web.service.rkjcxxSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhixin.rd.rkjc.web.dao.read.rkjcxxSearch.ISfxxMapper;
import com.zhixin.rd.rkjc.web.entity.GjEntity;
import com.zhixin.rd.rkjc.web.entity.SfxxEntity;
/**
 * Created by yangyk on 2017/07/19
 */
@Service
public class SfxxServiceImpl implements ISfxxService {
	@Autowired
    private ISfxxMapper sfxxMapper;
	//根据证件号码查询全部
	@Override
	public List<SfxxEntity> queryAll(String zjhm) {
		List<SfxxEntity> list = sfxxMapper.selectAll(zjhm);
		return list;
	}
	//根据证件号码和来源查询
	@Override
	public Map<String,Object> queryAllByLy(String zjhm, String ly,Integer pageStart,Integer rows) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("zjhm", zjhm);
		map.put("ly", ly);
		List<SfxxEntity> list = sfxxMapper.selectAllByLy(map);
		List<SfxxEntity> result = new ArrayList<SfxxEntity>();
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
