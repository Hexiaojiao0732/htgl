package com.zhixin.rd.rkjc.web.restful.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/** 添加此注解符后才可以支持XML **/
@XmlRootElement
public class XmlBean{

	private int id;
	private String name;
	private Date birth = new Date();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "XmlBean [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}

}
