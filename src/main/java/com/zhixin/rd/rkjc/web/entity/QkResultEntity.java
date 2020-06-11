package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Jet on 2017/5/8.
 */
public class QkResultEntity implements Serializable{

    /** Serial UID */
    private static final long serialVersionUID = 1L;


    /** xm 姓名 */
    private String xm;

    /** 人员编号 */
    private String rybh;

    /** 案件编号 */
    private String ajbh;

    /** xb 性别 */
    private String xb;

    /** gmsfhm 身份证号 */
    private String gmsfhm;

    /** csrq 出生日期 yyyy-HH-mm*/
    private String csrq;

    /** hjd 户籍地 */
    private String hjd;

    /** xzz 现住址 */
    private String xzz;

    /** zbdw 主办单位 */
    private String zbdw;

    /** djcs 打击措施 */
    private String djcs;

    /** 案发时间 **/
    private String afsj;

    /** jyaq 简要案情 */
    private String jyaq;

    /** lyd 来源地 */
    private String lyd;

    /**来源表*/
    private String fromTable;

    private String zpUrl;

    private Byte[] zp;

    /**打处时间*/
    private String dcsj;
    
    private Integer gzs;

    public Integer getGzs() {
		return gzs;
	}

	public void setGzs(Integer gzs) {
		this.gzs = gzs;
	}

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

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getHjd() {
        return hjd;
    }

    public void setHjd(String hjd) {
        this.hjd = hjd;
    }

    public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }

    public String getZbdw() {
        return zbdw;
    }

    public void setZbdw(String zbdw) {
        this.zbdw = zbdw;
    }

    public String getDjcs() {
        return djcs;
    }

    public void setDjcs(String djcs) {
        this.djcs = djcs;
    }

    public String getJyaq() {
        return jyaq;
    }

    public void setJyaq(String jyaq) {
        this.jyaq = jyaq;
    }

    public String getLyd() {
        return lyd;
    }

    public void setLyd(String lyd) {
        this.lyd = lyd;
    }

    public Byte[] getZp() {
        return zp;
    }

    public void setZp(Byte[] zp) {
        this.zp = zp;
    }

    public String getZpUrl() {
        return zpUrl;
    }

    public void setZpUrl(String zpUrl) {
        this.zpUrl = zpUrl;
    }

    public String getFromTable() {
        return fromTable;
    }

    public void setFromTable(String fromTable) {
        this.fromTable = fromTable;
    }

    public String getDcsj() {
        return dcsj;
    }

    public void setDcsj(String dcsj) {
        this.dcsj = dcsj;
    }

    @Override
    public String toString() {
        return "PqResultEntity{" +
                "xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", gmsfhm='" + gmsfhm + '\'' +
                ", csrq='" + csrq + '\'' +
                ", hjd='" + hjd + '\'' +
                ", xzz='" + xzz + '\'' +
                ", zbdw='" + zbdw + '\'' +
                ", djcs='" + djcs + '\'' +
                ", jyaq='" + jyaq + '\'' +
                ", lyd='" + lyd + '\'' +
                ", zpUrl='" + zpUrl + '\'' +
                ", afsj='" + afsj + '\'' +
                ", dcsj='" + dcsj + '\'' +
                ", rybh='" + rybh + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", fromTable='" + fromTable + '\'' +
                ", zp=" + Arrays.toString(zp) +
                '}';
    }

    public String getAfsj() {
        return afsj;
    }

    public void setAfsj(String afsj) {
        this.afsj = afsj;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }
}
