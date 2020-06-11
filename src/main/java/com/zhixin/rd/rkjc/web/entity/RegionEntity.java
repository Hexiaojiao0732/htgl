package com.zhixin.rd.rkjc.web.entity;

public class RegionEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long code;
	private Long parentId;
	private String name;
	private int level;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
        return "RegionEntity ["
        	+"id:"+id
        	+",code:"+code
        	+",parentId:"+parentId
        	+",name:"+name
        	+",level:"+level
        +"]";
   
	}
	

}
