package com.ideal.rd.web.framework.form;

public abstract class AbstactForm  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Boolean isBoxChecked(String cb){
		return "on".equalsIgnoreCase(cb);
	}

}
