package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;
import java.util.List;

/**
 * 页面数据接受
 */
public class WffzqkForm implements Serializable {

	private static final long serialVersionUID = 2016904729069119178L;
	private String xm;// 姓名
	private int xmLike = 0;// 姓名模糊查询标记0为模糊查询，1为精确查询
	private String sfzh;// 身份证号
	private int sfzhLike = 1;// 身份证号模糊查询标记0为模糊查询，1为精确查询
	private String xb;// 性别
	private String mz;// 民族
	private String hjd;// 户籍地
	private Integer startAge;// 起始年龄
	private Integer endAge;// 结束年龄
	private String csrq;// 出生日期
	private String sjly;// 数据来源
	private String sjlx;// 数据类型
	private String lad;// 立案地
	private String ajbh;// 案件编号
	private String tableName;// 获取表名
	private int pageIndex;// 分页
	private int pageCount;// 总页数
    private String imgSrc;
    private List<String> list;

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public int getXmLike() {
		return xmLike;
	}

	public void setXmLike(int xmLike) {
		this.xmLike = xmLike;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public int getSfzhLike() {
		return sfzhLike;
	}

	public void setSfzhLike(int sfzhLike) {
		this.sfzhLike = sfzhLike;
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

	public String getHjd() {
		return hjd;
	}

	public void setHjd(String hjd) {
		this.hjd = hjd;
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

	public String getLad() {
		return lad;
	}

	public void setLad(String lad) {
		this.lad = lad;
	}

	public String getAjbh() {
		return ajbh;
	}

	public void setAjbh(String ajbh) {
		this.ajbh = ajbh;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "WffzqkForm{" +
				"xm='" + xm + '\'' +
				", xmLike=" + xmLike +
				", sfzh='" + sfzh + '\'' +
				", sfzhLike=" + sfzhLike +
				", xb='" + xb + '\'' +
				", mz='" + mz + '\'' +
				", hjd='" + hjd + '\'' +
				", startAge=" + startAge +
				", endAge=" + endAge +
				", csrq='" + csrq + '\'' +
				", sjly='" + sjly + '\'' +
				", sjlx='" + sjlx + '\'' +
				", lad='" + lad + '\'' +
				", ajbh='" + ajbh + '\'' +
				", tableName='" + tableName + '\'' +
				", pageIndex=" + pageIndex +
				", pageCount=" + pageCount +
				", imgSrc='" + imgSrc + '\'' +
				", list=" + list +
				'}';
	}
}
