package com.zhixin.rd.rkjc.web.service.tagType;

import com.zhixin.rd.rkjc.web.entity.ColumnEntity;
import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;
import com.zhixin.rd.rkjc.web.entity.TagTypeEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/3/2.
 * 标签信息
 */
public interface ITagTypeService {
	//查询全部
	public List<TagTypeEntity> queryAll(Map<String,Object> map);
	//根据tagTableName查询
	public List<ColumnEntity> queryByTagTableName(String tagTableName);
	//根据tagName查询
	public TagTypeEntity queryOne(String tagName);

	public List<Map<String,String>> selectTableNameAndCloum(Map map);

	public List<Map<String,String>> selectByMap(Map<String,String> map);
	
	 //根据身份证号和标明查询该人员的标签
	 public List<Map<String, Object>> queryAllTagOfOnePerson(String personSFZH);
    //查询身份证号码的名字
    public PersonInfoEntity queryMsgSFZH(String personSFZH);	
	public int queryCount(Map<String, Object> map);
	public int queryValidCount(Map<String, Object> map);

	List<ColumnEntity> selectBatchByTagTableNames(String[]tagTableName);

	List<Map<String,String>> queryPsBySfzh(Map<String, String> map);

}
