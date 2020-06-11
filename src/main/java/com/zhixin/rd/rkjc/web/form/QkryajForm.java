package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyf on 2017/7/20.
 * 以案搜人页面数据接受
 */
public class QkryajForm implements Serializable {

    private String sfzh;//身份证号

    private String xm;//姓名

    private String ajbh;//案件编号

    private String sjly;//数据来源

    private String sjlx;//数据类型

    private String xb;//性别

    private String csrq;//出生日期

    private String mz;//民族

    private String lad;//立案地

    private Date rksj;//入库时间

    private Date zhgxsj;//最后更新时间

    private String hjd;//户籍地

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public String getSjlx() {
        return sjlx;
    }

    public void setSjlx(String sjlx) {
        this.sjlx = sjlx;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getLad() {
        return lad;
    }

    public void setLad(String lad) {
        this.lad = lad;
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public Date getZhgxsj() {
        return zhgxsj;
    }

    public void setZhgxsj(Date zhgxsj) {
        this.zhgxsj = zhgxsj;
    }

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    @Override
    public String toString() {
        return "QkryajForm{" +
                "sfzh='" + sfzh + '\'' +
                ", xm='" + xm + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", sjly='" + sjly + '\'' +
                ", sjlx='" + sjlx + '\'' +
                ", xb='" + xb + '\'' +
                ", csrq='" + csrq + '\'' +
                ", mz='" + mz + '\'' +
                ", lad='" + lad + '\'' +
                ", rksj=" + rksj +
                ", zhgxsj=" + zhgxsj +
                ", hjd='" + hjd + '\'' +
                '}';
    }
}
