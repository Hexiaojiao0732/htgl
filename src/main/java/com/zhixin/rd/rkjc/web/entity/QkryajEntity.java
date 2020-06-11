package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyf on 2017/7/19.
 */
public class QkryajEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String  sfzh;

    private String xm;

    private String ajbh;

    private  String sjly;

    private String sjlx;

    private Date rksj;

    private Date zhgxsj;

    private String xb;

    private Date csrq;

    private String csrqstr;

    private String mz;

    private String lad;

    private String hjd;

    private String hjdxz;

    private String sjlyName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    public String getCsrqstr() {
        return csrqstr;
    }

    public void setCsrqstr(String csrqstr) {
        this.csrqstr = csrqstr;
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

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    public String getHjdxz() {
        return hjdxz;
    }

    public void setHjdxz(String hjdxz) {
        this.hjdxz = hjdxz;
    }

    public String getSjlyName() {
        return sjlyName;
    }

    public void setSjlyName(String sjlyName) {
        this.sjlyName = sjlyName;
    }

    @Override
    public String toString() {
        return "QkryajEntity{" +
                "id=" + id +
                ", sfzh='" + sfzh + '\'' +
                ", xm='" + xm + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", sjly='" + sjly + '\'' +
                ", sjlx='" + sjlx + '\'' +
                ", rksj=" + rksj +
                ", zhgxsj=" + zhgxsj +
                ", xb='" + xb + '\'' +
                ", csrq=" + csrq +
                ", csrqstr='" + csrqstr + '\'' +
                ", mz='" + mz + '\'' +
                ", lad='" + lad + '\'' +
                ", hjd='" + hjd + '\'' +
                ", hjdxz='" + hjdxz + '\'' +
                ", sjlyName='" + sjlyName + '\'' +
                '}';
    }
}
