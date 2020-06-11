package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class RwEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String fl;// 分类：政治历史类、传统遗产类、文化艺术类、民族和语言文字类
	private String ztId;// 所属专题ID
	private String sf;// 身份：老战士、老战士亲属、学者、非遗传承人、专题研究者、其他
	private String xb;// 性别
	private int nl;// 年龄
	private String yz;// 语种：中文、英文、少数民族语言
	private String mz;// 名族：汉族、满族、蒙族、维吾尔族、哈萨克族、锡伯族、藏族、傣族、彝族、纳西族、水族
	private String xm;// 姓名
	private String pssj;// 拍摄时间
	private String psdd;// 拍摄地点
	private String jj;// 简介
	private String wzjj;// 完整简介
	private String nbbsh;// 内部标识号'
	private String szn;// 生卒年
	private String gb;// 国别
	private String qtxm;// 其他姓名
	private String jg;// 籍贯
	private String ly;// 领域
	private String zp;// 著作、作品
	private String rwzp;// 人物照片
	private String rwgx;// 人物關係
	public String getRwgx() {
		return rwgx;
	}
	public void setRwgx(String rwgx) {
		this.rwgx = rwgx;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getZtId() {
		return ztId;
	}
	public void setZtId(String ztId) {
		this.ztId = ztId;
	}
	public String getSf() {
		return sf;
	}
	public void setSf(String sf) {
		this.sf = sf;
	}
	public String getXb() {
		return xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public int getNl() {
		return nl;
	}
	public void setNl(int nl) {
		this.nl = nl;
	}
	public String getYz() {
		return yz;
	}
	public void setYz(String yz) {
		this.yz = yz;
	}
	public String getMz() {
		return mz;
	}
	public void setMz(String mz) {
		this.mz = mz;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getPssj() {
		return pssj;
	}
	public void setPssj(String pssj) {
		this.pssj = pssj;
	}
	public String getPsdd() {
		return psdd;
	}
	public void setPsdd(String psdd) {
		this.psdd = psdd;
	}
	public String getJj() {
		return jj;
	}
	public void setJj(String jj) {
		this.jj = jj;
	}
	public String getWzjj() {
		return wzjj;
	}
	public void setWzjj(String wzjj) {
		this.wzjj = wzjj;
	}
	public String getNbbsh() {
		return nbbsh;
	}
	public void setNbbsh(String nbbsh) {
		this.nbbsh = nbbsh;
	}
	public String getSzn() {
		return szn;
	}
	public void setSzn(String szn) {
		this.szn = szn;
	}
	public String getGb() {
		return gb;
	}
	public void setGb(String gb) {
		this.gb = gb;
	}
	public String getQtxm() {
		return qtxm;
	}
	public void setQtxm(String qtxm) {
		this.qtxm = qtxm;
	}
	public String getJg() {
		return jg;
	}
	public void setJg(String jg) {
		this.jg = jg;
	}
	public String getLy() {
		return ly;
	}
	public void setLy(String ly) {
		this.ly = ly;
	}
	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	public String getRwzp() {
		return rwzp;
	}
	public void setRwzp(String rwzp) {
		this.rwzp = rwzp;
	}
	@Override
	public String toString() {
		return "RwEntity [id=" + id + ", fl=" + fl + ", ztId=" + ztId + ", sf=" + sf + ", xb=" + xb + ", nl=" + nl
				+ ", yz=" + yz + ", mz=" + mz + ", xm=" + xm + ", pssj=" + pssj + ", psdd=" + psdd + ", jj=" + jj
				+ ", wzjj=" + wzjj + ", nbbsh=" + nbbsh + ", szn=" + szn + ", gb=" + gb + ", qtxm=" + qtxm + ", jg="
				+ jg + ", ly=" + ly + ", zp=" + zp + ", rwzp=" + rwzp + ", rwgx=" + rwgx + "]";
	}
	
}
