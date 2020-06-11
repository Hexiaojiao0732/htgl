package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;

/**
 * Created by zyf on 2017/7/20.
 * 以案搜人页面数据接受
 */
public class YasrForm implements Serializable {

    private String xm;//姓名

    private String xb;//性别

    private String gmsfhm;//身份证号

    private String mz;//民族

    private String startAge;//启示年龄

    private String endAge;//终止年龄

    private String ajlb;//案件类别

    private String hjd;//户籍地

    private String afd;//案发地

    private String ajbh;//案件编号

    private int pageIndex;//分页

    private int pageCount;//


    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }



    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getStartAge() {
        return startAge;
    }

    public void setStartAge(String startAge) {
        this.startAge = startAge;
    }

    public String getEndAge() {
        return endAge;
    }

    public void setEndAge(String endAge) {
        this.endAge = endAge;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    public String getAfd() {
        return afd;
    }

    public void setAfd(String afd) {
        this.afd = afd;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGmsfhm() {
        return gmsfhm;
    }

    public void setGmsfhm(String gmsfhm) {
        this.gmsfhm = gmsfhm;
    }

    @Override
    public String toString() {
        return "YasrForm{" +
                "xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", gmsfhm='" + gmsfhm + '\'' +
                ", mz='" + mz + '\'' +
                ", startAge='" + startAge + '\'' +
                ", endAge='" + endAge + '\'' +
                ", ajlb='" + ajlb + '\'' +
                ", hjd='" + hjd + '\'' +
                ", afd='" + afd + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", pageIndex=" + pageIndex +
                ", pageCount=" + pageCount +
                '}';
    }
}
