package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangyk on 2017/3/2.
 */
public class TagTypeEntity implements Serializable{
    private long id;                    //编号
    private String tagName;               //标签名称
    private String tagTableName;        //标签表名
    private Date createdTime;            //创建时间
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getTagTableName() {
		return tagTableName;
	}
	public void setTagTableName(String tagTableName) {
		this.tagTableName = tagTableName;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	@Override
	public String toString() {
		return "TagTypeEntity [id=" + id + ", tagName=" + tagName
				+ ", tagTableName=" + tagTableName + ", createdTime="
				+ createdTime + "]";
	}
	public TagTypeEntity(long id, String tagName, String tagTableName,
			Date createdTime) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.tagTableName = tagTableName;
		this.createdTime = createdTime;
	}
	public TagTypeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

   
}
