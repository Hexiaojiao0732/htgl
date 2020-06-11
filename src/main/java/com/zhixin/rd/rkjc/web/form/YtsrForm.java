package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Jet on 2017/5/8.
 */
public class YtsrForm implements Serializable{

    /** Serial UID */
    private static final long serialVersionUID = 1L;

    /** 图片路径 */
    private String imgSrc;

    /**户籍地*/
    private String hjd;
    /**来源地*/
    private String lyd;
    /*以图搜人性别*/
    private String ytsrxb;
    /** mz民族*/
    private String mz;
   /*起始年龄*/
   private Integer startAge;
   /*结束年龄*/
   private Integer endAge;
    /** csrq 出生日期 yyyy-HH-mm*/
    private String csrq;
    private String csrqStart;
    private  String csrqEnd;
   /*案件类别*/
   private String ajlb;
   /*数据来源*/
   private String sjly;
    //分页 当前页
    private int pageIndex;

    private int rd;
    /** 身份证集 形如123,123,12312,12312,12312 **/
    private String sfzhAll;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    public String getLyd() {
        return lyd;
    }

    public void setLyd(String lyd) {
        this.lyd = lyd;
    }

    public String getYtsrxb() {
        return ytsrxb;
    }

    public void setYtsrxb(String ytsrxb) {
        this.ytsrxb = ytsrxb;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public Integer getStartAge() {
        return startAge;
    }

    public void setStartAge(Integer startAge) {
        this.startAge = startAge;
    }

    public Integer getEndAge() {
        return endAge;
    }

    public void setEndAge(Integer endAge) {
        this.endAge = endAge;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getCsrqStart() {
        return csrqStart;
    }

    public void setCsrqStart(String csrqStart) {
        this.csrqStart = csrqStart;
    }

    public String getCsrqEnd() {
        return csrqEnd;
    }

    public void setCsrqEnd(String csrqEnd) {
        this.csrqEnd = csrqEnd;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getSjly() {
        return sjly;
    }

    public void setSjly(String sjly) {
        this.sjly = sjly;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }

    public String getSfzhAll() {
        return sfzhAll;
    }

    public void setSfzhAll(String sfzhAll) {
        this.sfzhAll = sfzhAll;
    }

    @Override
    public String toString() {
        return "YtsrForm{" +
                "imgSrc='" + imgSrc + '\'' +
                ", hjd='" + hjd + '\'' +
                ", lyd='" + lyd + '\'' +
                ", ytsrxb='" + ytsrxb + '\'' +
                ", mz='" + mz + '\'' +
                ", startAge=" + startAge +
                ", endAge=" + endAge +
                ", csrq='" + csrq + '\'' +
                ", csrqStart='" + csrqStart + '\'' +
                ", csrqEnd='" + csrqEnd + '\'' +
                ", ajlb='" + ajlb + '\'' +
                ", sjly='" + sjly + '\'' +
                ", pageIndex=" + pageIndex +
                ", rd=" + rd +
                ", sfzhAll='" + sfzhAll + '\'' +
                '}';
    }
}
