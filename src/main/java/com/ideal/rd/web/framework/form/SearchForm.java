package com.ideal.rd.web.framework.form;

import java.io.Serializable;

/**
 *@author ：HeChuanBing
 *
 *	All right reserved.
 *
 *@version Create on 2012-12-7 下午2:29:56
 */
public class SearchForm implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
