package com.ideal.rd.web.framework.entity.page;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTree implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	protected Long id;
	protected String text;
	protected List<AbstractTree> children = new ArrayList<AbstractTree>();

	public void addChildren(AbstractTree entity) {
		if (children == null) {
			children = new ArrayList<AbstractTree>();
		}
		children.add(entity);
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

}
