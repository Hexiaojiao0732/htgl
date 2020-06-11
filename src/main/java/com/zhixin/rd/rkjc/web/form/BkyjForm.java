package com.zhixin.rd.rkjc.web.form;

import java.util.Date;

/**
 * Created by 19703 on 2017/7/17.
 */
public class BkyjForm {
    private long id;
    private String gzryxm;//关注人员姓名
    private String gzrysfzh;//关注人员身份证号
    private String bkdw;//布控单位
    private Date bksj;//布控时间
    private String bkmjxm1;//布控民警姓名1
    private String bkmjzjhm1;//布控民警证件号码1
    private String bkmjlxdh1;//布控民警联系电话1
    private String bkmjxm2;//布控民警姓名2
    private String bkmjzjhm2;//布控民警证件号码2
    private String bkmjlxdh2;//布控民警联系电话2
    private String bkzt;//布控状态0:未布控 1：已布控 2：已撤销
    private Date createTime;
    private Date updateTime;
    private String updateMjxm;//修改民警姓名

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGzryxm() {
        return gzryxm;
    }

    public void setGzryxm(String gzryxm) {
        this.gzryxm = gzryxm;
    }

    public String getGzrysfzh() {
        return gzrysfzh;
    }

    public void setGzrysfzh(String gzrysfzh) {
        this.gzrysfzh = gzrysfzh;
    }

    public String getBkdw() {
        return bkdw;
    }

    public void setBkdw(String bkdw) {
        this.bkdw = bkdw;
    }

    public Date getBksj() {
        return bksj;
    }

    public void setBksj(Date bksj) {
        this.bksj = bksj;
    }

    public String getBkmjxm1() {
        return bkmjxm1;
    }

    public void setBkmjxm1(String bkmjxm1) {
        this.bkmjxm1 = bkmjxm1;
    }

    public String getBkmjzjhm1() {
        return bkmjzjhm1;
    }

    public void setBkmjzjhm1(String bkmjzjhm1) {
        this.bkmjzjhm1 = bkmjzjhm1;
    }

    public String getBkmjlxdh1() {
        return bkmjlxdh1;
    }

    public void setBkmjlxdh1(String bkmjlxdh1) {
        this.bkmjlxdh1 = bkmjlxdh1;
    }

    public String getBkmjxm2() {
        return bkmjxm2;
    }

    public void setBkmjxm2(String bkmjxm2) {
        this.bkmjxm2 = bkmjxm2;
    }

    public String getBkmjzjhm2() {
        return bkmjzjhm2;
    }

    public void setBkmjzjhm2(String bkmjzjhm2) {
        this.bkmjzjhm2 = bkmjzjhm2;
    }

    public String getBkmjlxdh2() {
        return bkmjlxdh2;
    }

    public void setBkmjlxdh2(String bkmjlxdh2) {
        this.bkmjlxdh2 = bkmjlxdh2;
    }

    public String getBkzt() {
        return bkzt;
    }

    public void setBkzt(String bkzt) {
        this.bkzt = bkzt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateMjxm() {
        return updateMjxm;
    }

    public void setUpdateMjxm(String updateMjxm) {
        this.updateMjxm = updateMjxm;
    }

    @Override
    public String toString() {
        return "BkyjEntity{" +
                "id=" + id +
                ", gzryxm='" + gzryxm + '\'' +
                ", gzrysfzh='" + gzrysfzh + '\'' +
                ", bkdw='" + bkdw + '\'' +
                ", bksj=" + bksj +
                ", bkmjxm1='" + bkmjxm1 + '\'' +
                ", bkmjzjhm1='" + bkmjzjhm1 + '\'' +
                ", bkmjlxdh1='" + bkmjlxdh1 + '\'' +
                ", bkmjxm2='" + bkmjxm2 + '\'' +
                ", bkmjzjhm2='" + bkmjzjhm2 + '\'' +
                ", bkmjlxdh2='" + bkmjlxdh2 + '\'' +
                ", bkzt='" + bkzt + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", updateMjxm='" + updateMjxm + '\'' +
                '}';
    }
}
