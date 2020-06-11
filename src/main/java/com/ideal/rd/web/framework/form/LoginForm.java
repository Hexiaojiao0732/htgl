package com.ideal.rd.web.framework.form;

import java.io.Serializable;

public class LoginForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String rememberme;

	public String getRememberme() {
		return rememberme;
	}

	public void setRememberme(String rememberme) {
		this.rememberme = rememberme;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password + ", rememberme=" + rememberme + "]";
	}
}
