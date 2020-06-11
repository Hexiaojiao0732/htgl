package com.ideal.rd.web.framework.entity.page;

public class MenuAttributes {

	private String url = null;

	private String other = null;

	@Override
	public String toString() {
		return "Attributes [url=" + url + ", other=" + other + "]";
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}

	/**
	 * @param other
	 *            the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}

}
