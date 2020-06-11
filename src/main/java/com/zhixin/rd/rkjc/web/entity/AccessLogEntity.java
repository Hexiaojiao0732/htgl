package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyf on 2017/2/28.
 */
public class AccessLogEntity implements Serializable {

    private Long id;

    private String accessUrl;
    private  Integer accessInterfaceType;

    private  String accessIp;

    private Long responseReultTime;

    private  String responseResultCode;

    private Date responseTime;

    private String tableName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public Integer getAccessInterfaceType() {
        return accessInterfaceType;
    }

    public void setAccessInterfaceType(Integer accessInterfaceType) {
        this.accessInterfaceType = accessInterfaceType;
    }

    public Long getResponseReultTime() {
        return responseReultTime;
    }

    public void setResponseReultTime(Long responseReultTime) {
        this.responseReultTime = responseReultTime;
    }

    public String getResponseResultCode() {
        return responseResultCode;
    }

    public void setResponseResultCode(String responseResultCode) {
        this.responseResultCode = responseResultCode;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return "AccessLogEntity{" +
                "id=" + id +
                ", accessUrl='" + accessUrl + '\'' +
                ", accessInterfaceType=" + accessInterfaceType +
                ", accessIp='" + accessIp + '\'' +
                ", responseReultTime=" + responseReultTime +
                ", responseResultCode='" + responseResultCode + '\'' +
                ", responseTime=" + responseTime +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
