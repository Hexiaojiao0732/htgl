package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.List;

public class MenuTree implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8856024350859746791L;
	
	private Long id;

	private String parentTitle;
	
	private List<LowerMenu>lowerMenu;

	public String getParentTitle() {
		return parentTitle;
	}

	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}

	public List<LowerMenu> getLowerMenu() {
		return lowerMenu;
	}

	public void setLowerMenu(List<LowerMenu> lowerMenu) {
		this.lowerMenu = lowerMenu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
