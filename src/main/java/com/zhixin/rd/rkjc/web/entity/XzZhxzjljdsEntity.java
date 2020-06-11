package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *名称: XzZhxzjljds
 *	   行政拘留人员
 */

public class XzZhxzjljdsEntity implements Serializable{
	private long id;			//主键
	private long personId;		//人口标识
	private String personSfzh;	//人口身份证号
	private String zj;			//主键
	private String ajbh;		//案件编号
	private String wsbh;		//文书编号
	private String wsbt;		//文书标题
	private String gaj;			//公安局
	private String wsn;			//文书年
	private String wsz;			//文书字
	private String wsh;			//文书号
	private String xzjlwh;		//行政拘留决定书文号
	private String bjdzjzl;		//被处罚人身份证件种类
	private String bjdzjhm;		//被处罚人身份证件号码
	private String jdqx;		//行政拘留期限
	private String zhzxtj;		//暂缓执行条件
	private String cbr;			//承办人
	private String pzr;			//批准人
	private String tfr;			//填发人
	private String tfrq;		//填发日期
	private String czdw;		//操作单位
	private String czr;			//操作人
	private String czsj;		//操作时间
	private String czbs;		//操作标识
	private String glbh;		//关联编号
	private String fjwsz;		//局文书字
	private String flyj;		//法律依据
	private String rybh;		//人员编号
	private String pzdw;		//批准单位
	private String pzrq;		//批准日期
	private Date createdTime;	//创建时间
	private Date updatedTime;	//修改时间
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
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
	public String getXzjlwh() {
		return xzjlwh;
	}
	public void setXzjlwh(String xzjlwh) {
		this.xzjlwh = xzjlwh;
	}
	public String getBjdzjzl() {
		return bjdzjzl;
	}
	public void setBjdzjzl(String bjdzjzl) {
		this.bjdzjzl = bjdzjzl;
	}
	public String getBjdzjhm() {
		return bjdzjhm;
	}
	public void setBjdzjhm(String bjdzjhm) {
		this.bjdzjhm = bjdzjhm;
	}
	public String getJdqx() {
		return jdqx;
	}
	public void setJdqx(String jdqx) {
		this.jdqx = jdqx;
	}
	public String getZhzxtj() {
		return zhzxtj;
	}
	public void setZhzxtj(String zhzxtj) {
		this.zhzxtj = zhzxtj;
	}
	public String getCbr() {
		return cbr;
	}
	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	public String getPzr() {
		return pzr;
	}
	public void setPzr(String pzr) {
		this.pzr = pzr;
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
	public String getGlbh() {
		return glbh;
	}
	public void setGlbh(String glbh) {
		this.glbh = glbh;
	}
	public String getFjwsz() {
		return fjwsz;
	}
	public void setFjwsz(String fjwsz) {
		this.fjwsz = fjwsz;
	}
	public String getFlyj() {
		return flyj;
	}
	public void setFlyj(String flyj) {
		this.flyj = flyj;
	}
	public String getRybh() {
		return rybh;
	}
	public void setRybh(String rybh) {
		this.rybh = rybh;
	}
	public String getPzdw() {
		return pzdw;
	}
	public void setPzdw(String pzdw) {
		this.pzdw = pzdw;
	}
	public String getPzrq() {
		return pzrq;
	}
	public void setPzrq(String pzrq) {
		this.pzrq = pzrq;
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
		return "XzZhxzjljds [id=" + id + ", personId=" + personId
				+ ", personSfzh=" + personSfzh + ", zj=" + zj + ", ajbh="
				+ ajbh + ", wsbh=" + wsbh + ", wsbt=" + wsbt + ", gaj=" + gaj
				+ ", wsn=" + wsn + ", wsz=" + wsz + ", wsh=" + wsh
				+ ", xzjlwh=" + xzjlwh + ", bjdzjzl=" + bjdzjzl + ", bjdzjhm="
				+ bjdzjhm + ", jdqx=" + jdqx + ", zhzxtj=" + zhzxtj + ", cbr="
				+ cbr + ", pzr=" + pzr + ", tfr=" + tfr + ", tfrq=" + tfrq
				+ ", czdw=" + czdw + ", czr=" + czr + ", czsj=" + czsj
				+ ", czbs=" + czbs + ", glbh=" + glbh + ", fjwsz=" + fjwsz
				+ ", flyj=" + flyj + ", rybh=" + rybh + ", pzdw=" + pzdw
				+ ", pzrq=" + pzrq + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + "]";
	}
	
	public XzZhxzjljdsEntity(long id, long personId, String personSfzh, String zj,
			String ajbh, String wsbh, String wsbt, String gaj, String wsn,
			String wsz, String wsh, String xzjlwh, String bjdzjzl,
			String bjdzjhm, String jdqx, String zhzxtj, String cbr, String pzr,
			String tfr, String tfrq, String czdw, String czr, String czsj,
			String czbs, String glbh, String fjwsz, String flyj, String rybh,
			String pzdw, String pzrq, Date createdTime, Date updatedTime) {
		super();
		this.id = id;
		this.personId = personId;
		this.personSfzh = personSfzh;
		this.zj = zj;
		this.ajbh = ajbh;
		this.wsbh = wsbh;
		this.wsbt = wsbt;
		this.gaj = gaj;
		this.wsn = wsn;
		this.wsz = wsz;
		this.wsh = wsh;
		this.xzjlwh = xzjlwh;
		this.bjdzjzl = bjdzjzl;
		this.bjdzjhm = bjdzjhm;
		this.jdqx = jdqx;
		this.zhzxtj = zhzxtj;
		this.cbr = cbr;
		this.pzr = pzr;
		this.tfr = tfr;
		this.tfrq = tfrq;
		this.czdw = czdw;
		this.czr = czr;
		this.czsj = czsj;
		this.czbs = czbs;
		this.glbh = glbh;
		this.fjwsz = fjwsz;
		this.flyj = flyj;
		this.rybh = rybh;
		this.pzdw = pzdw;
		this.pzrq = pzrq;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}
	public XzZhxzjljdsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
