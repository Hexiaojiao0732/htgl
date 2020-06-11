/**
 * 
 */
package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

/**
 * @author zhiqiang
 *
 */
public class UserAuthority implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 300161812220575387L;
	

	private Integer userId;
	
	private Long authId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}
}
