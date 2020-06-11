package com.ideal.rd.web.framework.entity.page;


/**
 *@author ：HeChuanBing
 *
 *	All right reserved.
 *
 *@version Create on 2012-11-27 下午5:53:43
 */
public class PageEntity implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private int start;//每页的开始记录 

    private int number;//每页显示条数   
    
    private int limit;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

    
	
}
	
