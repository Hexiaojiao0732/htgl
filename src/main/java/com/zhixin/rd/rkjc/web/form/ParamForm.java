package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Jet on 2017/5/8.
 */
public class ParamForm implements Serializable{

    /** Serial UID */
    private static final long serialVersionUID = 1L;


    /** xm 姓名 */
    private String xm;

    /** xb 性别 */
    private String xb;

    /** gmsfhm 身份证号 */
    private String gmsfhm;

    /** 羁押状态 1=在押 2=释放 */
    private int jyzt;

    /** csrq 出生日期 yyyy-HH-mm*/
    private String csrq;

    private String csrqStart;

    private  String csrqEnd;
    /** hjd 户籍地 */
    private String hjd;

    /** lyd 来源地 */
    private String lyd;

    /** afd 案发地 */
    private String afd;

    /** px 排序 */
    private String px;

    
    private Byte[] zp;

    /** 图片路径 **/
    private String imgSrc;

    private String fromTable;

    /** 身份证集 形如123,123,12312,12312,12312 **/
    private String sfzhAll;

    //分页 当前页
    private int pageIndex;

    private int rd;
    
    /** ajlx 案件类型 */
    private String ajlx;

    /**
     * 民族
     */
    private String mz;

    /**
     * 年龄段 开始年龄
     */
    private String startAge;

    /**
     * 年龄段 结束年龄
     */
    private String endAge;

    private String tableName;

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

    public String getGmsfhm() {
        return gmsfhm;
    }

    public void setGmsfhm(String gmsfhm) {
        this.gmsfhm = gmsfhm;
    }

    public int getJyzt() {
        return jyzt;
    }

    public void setJyzt(int jyzt) {
        this.jyzt = jyzt;
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

    public String getAfd() {
        return afd;
    }

    public void setAfd(String afd) {
        this.afd = afd;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public Byte[] getZp() {
        return zp;
    }

    public void setZp(Byte[] zp) {
        this.zp = zp;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getFromTable() {
        return fromTable;
    }

    public void setFromTable(String fromTable) {
        this.fromTable = fromTable;
    }

    public String getSfzhAll() {
        return sfzhAll;
    }

    public void setSfzhAll(String sfzhAll) {
        this.sfzhAll = sfzhAll;
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

    public String getAjlx() {
        return ajlx;
    }

    public void setAjlx(String ajlx) {
        this.ajlx = ajlx;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "ParamForm{" +
                "xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", gmsfhm='" + gmsfhm + '\'' +
                ", jyzt=" + jyzt +
                ", csrq='" + csrq + '\'' +
                ", csrqStart='" + csrqStart + '\'' +
                ", csrqEnd='" + csrqEnd + '\'' +
                ", hjd='" + hjd + '\'' +
                ", lyd='" + lyd + '\'' +
                ", afd='" + afd + '\'' +
                ", px='" + px + '\'' +
                ", zp=" + Arrays.toString(zp) +
                ", imgSrc='" + imgSrc + '\'' +
                ", fromTable='" + fromTable + '\'' +
                ", sfzhAll='" + sfzhAll + '\'' +
                ", pageIndex=" + pageIndex +
                ", rd=" + rd +
                ", ajlx='" + ajlx + '\'' +
                ", mz='" + mz + '\'' +
                ", startAge='" + startAge + '\'' +
                ", endAge='" + endAge + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
