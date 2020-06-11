package com.zhixin.rd.rkjc.web.service.tagType;

import com.zhixin.rd.rkjc.web.dao.read.tagtype.ITagTypeReadMapper;
import com.zhixin.rd.rkjc.web.entity.ColumnEntity;
import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;
import com.zhixin.rd.rkjc.web.entity.TagTypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/3/2. 标签信息
 */
@Service
public class TagTypeServiceImpl implements ITagTypeService {
	@Autowired
	private ITagTypeReadMapper tagTypeMapper;


    //查询全部信息
    public List<TagTypeEntity> queryAll(Map<String,Object> map){
		return  tagTypeMapper.selectAll(map);
    }


	// 根据tagTableName查询
	public List<ColumnEntity> queryByTagTableName(String tagTableName) {
		List<ColumnEntity> list = tagTypeMapper.selectByTagTableName(tagTableName);
		return list;
	}

	// 根据tagName查询
	public TagTypeEntity queryOne(String tagName) {
		TagTypeEntity list = tagTypeMapper.selectOne(tagName);
		return list;
	}

	@Override
	public List<Map<String, String>> selectTableNameAndCloum(Map map) {
		List<Map<String, String>> list = tagTypeMapper.selectTableNameAndCloum(map);
		return list;
	}

	@Override
	public List<Map<String, String>> selectByMap(Map<String, String> map) {
		List<Map<String, String>> list = tagTypeMapper.selectByMap(map);
		return list;
	}


	@Override
	public int queryCount(Map<String, Object> map) {
		int count = tagTypeMapper.queryCount(map);
		return count;
	}

	@Override
	public int queryValidCount(Map<String, Object> map) {
		int count = tagTypeMapper.queryValidCount(map);
		return count;
	}

	@Override
	public List<Map<String, Object>> queryAllTagOfOnePerson(String personSFZH) {
		return tagTypeMapper.selectAllTagOfOnePerson(personSFZH);
	}
	@Override
	public PersonInfoEntity queryMsgSFZH(String personSFZH) {
		 PersonInfoEntity person = tagTypeMapper.selectMsgSFZH(personSFZH);
		return person;
	}
	@Override
	public List<ColumnEntity> selectBatchByTagTableNames(String[]tagTableName) {

		StringBuffer tableName= new StringBuffer();
		for(String str :tagTableName){
			tableName.append("'").append(str).append("'").append(",");
		}
		String tableNames=tableName.substring(0,tableName.length()-1);

		return tagTypeMapper.selectBatchByTagTableNames(tableNames);
	}

	@Override
	public List<Map<String, String>> queryPsBySfzh(Map<String, String> map) {
		return tagTypeMapper.queryPsBySfzh(map);
	}
}
