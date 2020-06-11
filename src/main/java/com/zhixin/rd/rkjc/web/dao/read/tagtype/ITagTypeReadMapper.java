package com.zhixin.rd.rkjc.web.dao.read.tagtype;

import com.zhixin.rd.rkjc.web.entity.ColumnEntity;
import com.zhixin.rd.rkjc.web.entity.PersonInfoEntity;
import com.zhixin.rd.rkjc.web.entity.TagTypeEntity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * reated by yangyk on 2017/3/2.
 * 标签
 */
public interface ITagTypeReadMapper {
    //查询全部标签
    public List<TagTypeEntity> selectAll(Map<String, Object> map);
    //根据tagTableName查询
    public List<ColumnEntity> selectByTagTableName(String tagTableName);
    //根据tagName查询
    public TagTypeEntity selectOne(String tagName);
    public List<Map<String,String>> selectTableNameAndCloum(Map map);
    public List<Map<String,String>> selectByMap(Map<String, String> map);
    //根据身份证号和标明查询该人员的标签
    public List<Map<String, Object>> selectAllTagOfOnePerson(@Param("personSFZH") String personSFZH);
    //查询身份证号码的名字
    public PersonInfoEntity selectMsgSFZH(String personSFZH);

	public int queryCount(Map<String, Object> map);
	public int queryValidCount(Map<String, Object> map);

    List<ColumnEntity> selectBatchByTagTableNames(String tagTableName);

    //通过Sfzhc查询
    List<Map<String,String>> queryPsBySfzh(Map<String, String> map);


}
