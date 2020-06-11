package com.ideal.rd.web.framework.entity.page;

public class CheckTreeEntity extends AbstractTree {

	private static final long serialVersionUID = 1L;

	private boolean checked = false;

	@Override
	public String toString() {
		return "CheckTreeEntity [checked=" + checked + ", id=" + id + ", text=" + text + ", children=" + children + "]";
	}

	/**
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            the checked to set
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

}
