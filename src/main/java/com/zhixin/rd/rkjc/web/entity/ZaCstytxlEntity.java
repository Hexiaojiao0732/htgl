package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Date;
//场所特业人员
public class ZaCstytxlEntity implements Serializable{

	private Long id;

	private Long personId;// 人口标识

	private String personSfzh;// 人口身份证号

	private String txlbh;// 通讯录编号

	private String bz;// 通讯录备注

	private String sfgx; // 通讯录是否共享

	private String djdw;// 通讯录登记单位

	private String djr;// 通讯录登记人

	private String djsj;// 通讯录登记时间

	private String czdw;// 通讯录操作单位

	private String czr;// 通讯录操作人

	private String czsj;// 通讯录操作时间

	private String czbs;// 通讯录操作标识

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

	public String getTxlbh() {
		return txlbh;
	}

	public void setTxlbh(String txlbh) {
		this.txlbh = txlbh;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSfgx() {
		return sfgx;
	}

	public void setSfgx(String sfgx) {
		this.sfgx = sfgx;
	}

	public String getDjdw() {
		return djdw;
	}

	public void setDjdw(String djdw) {
		this.djdw = djdw;
	}

	public String getDjr() {
		return djr;
	}

	public void setDjr(String djr) {
		this.djr = djr;
	}

	public String getDjsj() {
		return djsj;
	}

	public void setDjsj(String djsj) {
		this.djsj = djsj;
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
		return "ZaCstytxl [id=" + id + ", personId=" + personId + ", personSfzh=" + personSfzh + ", txlbh=" + txlbh
				+ ", bz=" + bz + ", sfgx=" + sfgx + ", djdw=" + djdw + ", djr=" + djr + ", djsj=" + djsj + ", czdw="
				+ czdw + ", czr=" + czr + ", czsj=" + czsj + ", czbs=" + czbs + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + "]";
	}

}
