package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

/**
 * Created by 19703 on 2017/3/16.
 */
public class AccessLogTagTypeEntity implements Serializable{
    /*类型*/
    private int accessInterfaceType;
    /*数据总数*/
    private int sum;
    /*某天*/
    private String date;
    /*表名*/
    private String tableName;
    /*标签名*/
    private String tagName;

    public int getAccessInterfaceType() {
        return accessInterfaceType;
    }

    public void setAccessInterfaceType(int accessInterfaceType) {
        this.accessInterfaceType = accessInterfaceType;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
