package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Date;

//限制活动人员
public class XzXzhdfwjdsEntity implements Serializable{
	private Long id;

	private Long personId;// 人口标识

	private String personSfzh;// 人口身份证号

	private String zj; // 2131

	private String ajbh;// 2131案件编号

	private String rybh; // 2131人员编号

	private String glbh;// 2131关联编号

	private String wsbh;// 2131文书编号

	private String wsbt;// 2131文书标题

	private String gaj;// 2131公安局

	private String fjwsz;// 2131局文书字

	private String wsn; // 2131文书年

	private String wsz;// 2131文书字

	private String wsh; // 2131文书号

	private String wfxyrsfzjzl; // 2131违法嫌疑人身份证件种类

	private String wfxyrsfjhm; // 2131违法嫌疑人身份证件号码

	private String xzhdfwyy; // 2131限制活动范围原因

	private String flyj;// 2131法律依据

	private String xzqsrq;// 2131限制起始日期

	private String xzzzrq; // 2131限制终止日期

	private String xzhdqy; // 2131限制活动区域

	private String fyjg;// 2131复议机关

	private String badw;// 2131办案单位

	private String bar;// 2131办案人

	private String pzdw;// 2131批准单位

	private String pzr;// 2131批准人

	private String pzrq; // 2131批准日期

	private String tfr; // 2131填发人

	private String tfrq;// 2131填发日期

	private String czdw;// 2131操作单位

	private String czr;// 2131操作人

	private String czsj;// 2131操作时间

	private String czbs; // 2131操作标识

	private String xzhdfwyybs;// 2131限制活动范围原因标识

	private String qtsm;// 2131其他说明
	private Date createdTime;// 创建时间

	private Date updatedTime; // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonSfzh() {
		return personSfzh;
	}

	public void setPersonSfzh(String personSfzh) {
		this.personSfzh = personSfzh;
	}

	public String getZj() {
		return zj;
	}

	public void setZj(String zj) {
		this.zj = zj;
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

	public String getGlbh() {
		return glbh;
	}

	public void setGlbh(String glbh) {
		this.glbh = glbh;
	}

	public String getWsbh() {
		return wsbh;
	}

	public void setWsbh(String wsbh) {
		this.wsbh = wsbh;
	}

	public String getWsbt() {
		return wsbt;
	}

	public void setWsbt(String wsbt) {
		this.wsbt = wsbt;
	}

	public String getGaj() {
		return gaj;
	}

	public void setGaj(String gaj) {
		this.gaj = gaj;
	}

	public String getFjwsz() {
		return fjwsz;
	}

	public void setFjwsz(String fjwsz) {
		this.fjwsz = fjwsz;
	}

	public String getWsn() {
		return wsn;
	}

	public void setWsn(String wsn) {
		this.wsn = wsn;
	}

	public String getWsz() {
		return wsz;
	}

	public void setWsz(String wsz) {
		this.wsz = wsz;
	}

	public String getWsh() {
		return wsh;
	}

	public void setWsh(String wsh) {
		this.wsh = wsh;
	}

	public String getWfxyrsfzjzl() {
		return wfxyrsfzjzl;
	}

	public void setWfxyrsfzjzl(String wfxyrsfzjzl) {
		this.wfxyrsfzjzl = wfxyrsfzjzl;
	}

	public String getWfxyrsfjhm() {
		return wfxyrsfjhm;
	}

	public void setWfxyrsfjhm(String wfxyrsfjhm) {
		this.wfxyrsfjhm = wfxyrsfjhm;
	}

	public String getXzhdfwyy() {
		return xzhdfwyy;
	}

	public void setXzhdfwyy(String xzhdfwyy) {
		this.xzhdfwyy = xzhdfwyy;
	}

	public String getFlyj() {
		return flyj;
	}

	public void setFlyj(String flyj) {
		this.flyj = flyj;
	}

	public String getXzqsrq() {
		return xzqsrq;
	}

	public void setXzqsrq(String xzqsrq) {
		this.xzqsrq = xzqsrq;
	}

	public String getXzzzrq() {
		return xzzzrq;
	}

	public void setXzzzrq(String xzzzrq) {
		this.xzzzrq = xzzzrq;
	}

	public String getXzhdqy() {
		return xzhdqy;
	}

	public void setXzhdqy(String xzhdqy) {
		this.xzhdqy = xzhdqy;
	}

	public String getFyjg() {
		return fyjg;
	}

	public void setFyjg(String fyjg) {
		this.fyjg = fyjg;
	}

	public String getBadw() {
		return badw;
	}

	public void setBadw(String badw) {
		this.badw = badw;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public String getPzdw() {
		return pzdw;
	}

	public void setPzdw(String pzdw) {
		this.pzdw = pzdw;
	}

	public String getPzr() {
		return pzr;
	}

	public void setPzr(String pzr) {
		this.pzr = pzr;
	}

	public String getPzrq() {
		return pzrq;
	}

	public void setPzrq(String pzrq) {
		this.pzrq = pzrq;
	}

	public String getTfr() {
		return tfr;
	}

	public void setTfr(String tfr) {
		this.tfr = tfr;
	}

	public String getTfrq() {
		return tfrq;
	}

	public void setTfrq(String tfrq) {
		this.tfrq = tfrq;
	}

	public String getCzdw() {
		return czdw;
	}

	public void setCzdw(String czdw) {
		this.czdw = czdw;
	}

	public String getCzr() {
		return czr;
	}

	public void setCzr(String czr) {
		this.czr = czr;
	}

	public String getCzsj() {
		return czsj;
	}

	public void setCzsj(String czsj) {
		this.czsj = czsj;
	}

	public String getCzbs() {
		return czbs;
	}

	public void setCzbs(String czbs) {
		this.czbs = czbs;
	}

	public String getXzhdfwyybs() {
		return xzhdfwyybs;
	}

	public void setXzhdfwyybs(String xzhdfwyybs) {
		this.xzhdfwyybs = xzhdfwyybs;
	}

	public String getQtsm() {
		return qtsm;
	}

	public void setQtsm(String qtsm) {
		this.qtsm = qtsm;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public String toString() {
		return "XzXzhdfwjds [id=" + id + ", personId=" + personId + ", personSfzh=" + personSfzh + ", zj=" + zj
				+ ", ajbh=" + ajbh + ", rybh=" + rybh + ", glbh=" + glbh + ", wsbh=" + wsbh + ", wsbt=" + wsbt
				+ ", gaj=" + gaj + ", fjwsz=" + fjwsz + ", wsn=" + wsn + ", wsz=" + wsz + ", wsh=" + wsh
				+ ", wfxyrsfzjzl=" + wfxyrsfzjzl + ", wfxyrsfjhm=" + wfxyrsfjhm + ", xzhdfwyy=" + xzhdfwyy + ", flyj="
				+ flyj + ", xzqsrq=" + xzqsrq + ", xzzzrq=" + xzzzrq + ", xzhdqy=" + xzhdqy + ", fyjg=" + fyjg
				+ ", badw=" + badw + ", bar=" + bar + ", pzdw=" + pzdw + ", pzr=" + pzr + ", pzrq=" + pzrq + ", tfr="
				+ tfr + ", tfrq=" + tfrq + ", czdw=" + czdw + ", czr=" + czr + ", czsj=" + czsj + ", czbs=" + czbs
				+ ", xzhdfwyybs=" + xzhdfwyybs + ", qtsm=" + qtsm + ", createdTime=" + createdTime + ", updatedTime="
				+ updatedTime + "]";
	}

}
