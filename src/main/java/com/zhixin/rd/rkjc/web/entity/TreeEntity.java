package com.zhixin.rd.rkjc.web.entity;

import java.util.ArrayList;
import java.util.List;

import com.ideal.rd.web.framework.entity.page.AbstractTree;

public class TreeEntity {

	private Long id ;

	private String text = "";
	
	private Long parentId;
	
	private String status;
	
	private String state="closed";
	
	private List<AbstractTree> children = new ArrayList<AbstractTree>();

	public TreeEntity() {
	}
	
	public TreeEntity(Long id,String text,Long parentId) {
		this.id=id;
		this.text=text;
		this.parentId=parentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	public List<AbstractTree> getChildren() {
		return children;
	}

	public void setChildren(List<AbstractTree> children) {
		this.children = children;
	}
	
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TreeEntity [id=" + id + ", text=" + text + ", parentId=" + parentId + ", status=" + status
				+ ", children=" + children + "]";
	}

	

}
