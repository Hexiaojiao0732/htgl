package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

/**
 * Created by yangyk on 2017/3/2.
 */
public class ColumnEntity implements Serializable{
    private String columnComment;
    private String columnName;
    private String tableName;



    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "ColumnEntity{" +
                "columnComment='" + columnComment + '\'' +
                ", columnName='" + columnName + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
