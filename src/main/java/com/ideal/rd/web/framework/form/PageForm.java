package com.ideal.rd.web.framework.form;

import java.io.Serializable;

/**
 *@author ：HeChuanBing
 *
 *	All right reserved.
 *
 *@version Create on 2012-11-28 下午3:07:00
 */
public class PageForm implements Serializable {

	private static final long serialVersionUID = 1L;


	private String rows;//每页显示的记录数  

    private String page;//当前第几页  

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	

	
	
}
