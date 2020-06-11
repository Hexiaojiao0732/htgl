package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 19703 on 2017/6/19.
 */
public class PoliceQueryLogsEntity implements Serializable{
    public Long id;
    /**
     * 民警姓名
     */
    public String policeName;
    /**
     * 查询时间
     */
    public Date queryTime;
    /**
     * 描述
     */
    public String describe;
    /**
     * 登录ip
     */
    public String loginIp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public Date getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    public String getDescription() {
        return describe;
    }

    public void setDescription(String description) {
        this.describe = description;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public String toString() {
        return "PoliceQueryLogsEntity{" +
                "id=" + id +
                ", policeName='" + policeName + '\'' +
                ", queryTime=" + queryTime +
                ", description='" + describe + '\'' +
                ", loginIp='" + loginIp + '\'' +
                '}';
    }
}
