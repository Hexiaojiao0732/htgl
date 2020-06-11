package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

public class CodeEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String type;
	private String codeKey;
	private String codeValue;
	
	private String typeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCodeKey() {
		return codeKey;
	}
	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "CodeEntity [id=" + id + ", type=" + type + ", codeKey=" + codeKey + ", codeValue=" + codeValue
				+ ", typeName=" + typeName + "]";
	}
	
}
