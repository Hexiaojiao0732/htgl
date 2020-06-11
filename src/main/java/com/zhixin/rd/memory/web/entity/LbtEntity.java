package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;

public class LbtEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String tpmc;// 图片名称
	private String tplj;// 图片路径
	private int lbsx;// 轮播顺序
	private String lbsc;// 轮播时长
	private String lbwz;// 轮播文字
	private String url;//外链地址
	private int lblx;// 轮播类型 0 首页 1 合作者
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTpmc() {
		return tpmc;
	}
	public void setTpmc(String tpmc) {
		this.tpmc = tpmc;
	}
	public String getTplj() {
		return tplj;
	}
	public void setTplj(String tplj) {
		this.tplj = tplj;
	}
	public int getLbsx() {
		return lbsx;
	}
	public void setLbsx(int lbsx) {
		this.lbsx = lbsx;
	}
	public String getLbsc() {
		return lbsc;
	}
	public void setLbsc(String lbsc) {
		this.lbsc = lbsc;
	}
	public String getLbwz() {
		return lbwz;
	}
	public void setLbwz(String lbwz) {
		this.lbwz = lbwz;
	}
	public int getLblx() {
		return lblx;
	}
	public void setLblx(int lblx) {
		this.lblx = lblx;
	}
	@Override
	public String toString() {
		return "LbtEntity [id=" + id + ", tpmc=" + tpmc + ", tplj=" + tplj + ", lbsx=" + lbsx + ", lbsc=" + lbsc
				+ ", lbwz=" + lbwz + ", lblx=" + lblx + ", url=" + url + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
