package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

/**
 *时间： 2017-3-6
 *名   : ApplicationDetailEntity
 *中间表interface——application——detail
 */
public class InterfaceApplicationDetailEntity implements Serializable{
	private long id;
	private Integer applictionId;
	private Integer tagId;
	private String tagColumnName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getApplictionId() {
		return applictionId;
	}
	public void setApplictionId(Integer applictionId) {
		this.applictionId = applictionId;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	public String getTagColumnName() {
		return tagColumnName;
	}
	public void setTagColumnName(String tagColumnName) {
		this.tagColumnName = tagColumnName;
	}
	
	@Override
	public String toString() {
		return "ApplicationDetailEntity [id=" + id + ", applictionId="
				+ applictionId + ", tagId=" + tagId + ", tagColumnName="
				+ tagColumnName + "]";
	}
	
	
}
