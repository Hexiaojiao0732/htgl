package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;
import java.util.Date;

public class RoleForm implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String trefresh;
	private String name;

    private int dataAuth;

    private String description;

    private Date createdTime;

    private Date updatedTime;
    
    private Boolean isSelect=false;

    public Boolean getIsSelect() {
		return isSelect;
	}

	public void setIsSelect(Boolean isSelect) {
		this.isSelect = isSelect;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

	@Override
	public String toString() {
		return "RoleForm [id=" + id + ", name=" + name + ", description=" + description + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + ", isSelect=" + isSelect + "]";
	}


    public int getDataAuth() {
        return dataAuth;
    }

    public void setDataAuth(int dataAuth) {
        this.dataAuth = dataAuth;
    }

	public String getTrefresh() {
		return trefresh;
	}

	public void setTrefresh(String trefresh) {
		this.trefresh = trefresh;
	}
}