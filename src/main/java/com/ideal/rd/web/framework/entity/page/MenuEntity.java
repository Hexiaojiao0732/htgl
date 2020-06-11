package com.ideal.rd.web.framework.entity.page;

public class MenuEntity extends AbstractTree {

	private static final long serialVersionUID = 1L;

	private MenuAttributes attributes = null;

	private String iconCls = null;

	@Override
	public String toString() {
		return "MenuEntity [id=" + id + ", text=" + text + ",attributes=" + attributes + ", iconCls=" + iconCls
				+ ", children=" + children + "]";
	}

	/**
	 * @return the attributes
	 */
	public MenuAttributes getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(MenuAttributes attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the iconCls
	 */
//	public String getIconCls() {
//		return iconCls;
//	}

	/**
	 * @param iconCls
	 *            the iconCls to set
	 */
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

}
