package com.zhixin.rd.rkjc.web.entity;

import java.util.ArrayList;
import java.util.List;

public class AbstractTree implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	protected Long id;
	protected String text;
	protected Integer  type;
	protected List<AbstractTree> children = new ArrayList<AbstractTree>();

	public void addChildren(AbstractTree entity) {
		if (children == null) {
			children = new ArrayList<AbstractTree>();
		}
		children.add(entity);
	}
	public void addChildren(List<AbstractTree> entityList) {
		if (children == null) {
			children = new ArrayList<AbstractTree>();
		}
		children.addAll(entityList);
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

	public List<AbstractTree> getChildren() {
		return children;
	}

	public void setChildren(List<AbstractTree> children) {
		this.children = children;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
