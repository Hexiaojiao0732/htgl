package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Date;

//非常住人口
public class RyWlczhkryEntity implements Serializable {
	private Long id;

	private Long personId;// 人口标识

	private String personSfzh;// 人口身份证号

	private String wlhbh;// 未落户编号

	private String rybh;// 未落户人员编号

	private String zzbh; // 未落户住址编号

	private String qtzzbh; // 未落户其他住址编号

	private String poxx; // 未落户配偶信息

	private String zylb; // 未落户职业类别

	private String lxdh;// 未落户联系电话

	private String wlhyy;// 未落户原因

	private String hklb;// 未落户户口类别

	private String sczjzl;// 未落户所持证件类别

	private String sczjbh; // 未落户所持证件编号

	private String bz;// 未落户备注

	private String sfzyfw;// 未落户是否自有房屋

	private String zxbs; // 未落户注销标识

	private String zxlb; // 未落户注销类别

	private String qyldrq;// 未落户迁移流动日期

	private String qyldyy;// 未落户迁移流动原因

	private String qwgjdq;// 未落户去往国家地区

	private String qwsfxq; // 未落户去往省市县区

	private String qwxz;// 未落户去往详址

	private String qwd; // 未落户去往地

	private String swrq; // 未落户死亡日期

	private String swyy; // 未落户死亡原因

	private String zxdw;// 未落户注销单位

	private String zxr; // 未落户注销人

	private String djdw; // 未落户登记单位

	private String djr;// 未落户登记人

	private String djrq;// 未落户登记日期

	private String czdw;// 未落户操作单位

	private String czr;// 未落户操作人

	private String czsj;// 未落户操作时间

	private String czbs; // 未落户操作标识

	private String ryfl;// 未落户人员分类

	private String yhkssxq;// 未落户原户口省市县区

	private String yhkxz; // 未落户原户口详址

	private String ywhk;// 未落户有无户口

	private String whkyy;// 未落户无户口原因

	private String fwcsdz;// 未落户服务处所地址

	private String yfzgx;// 未落户与房主关系

	private String jqsfjzym;// 未落户近期是否接种育苗

	private String sfsy;// 未落户是否生育

	private String sfcqjycs;// 未落户是否采取节育措施

	private String synanhs;// 未落户生育男孩数

	private String synvhs;// 未落户生育女孩数

	private String sfblylbx; // 未落户是否办理养老保险

	private String blylbxqssj;// 未落户养老保险办理起始时间

	private String sfblgsbx;// 未落户是否办理工伤保险

	private String blgsbxqssj;// 未落户工伤保险办理起始时间

	private String sfblsybx;// 未落户是否办理失业保险

	private String blsybxqssj;// 未落户失业保险办理起始时间

	private String fzll;// 未落户辅助力量

	private String bfdx;// 未落户帮扶对象

	private String xzzjlx;// 未落户现住址街路巷

	private String sqgb;// 未落户社区干部

	private String gblxdh;// 未落户社区干部联系电话

	private String sssq;// 未落户所属社区

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

	public String getWlhbh() {
		return wlhbh;
	}

	public void setWlhbh(String wlhbh) {
		this.wlhbh = wlhbh;
	}

	public String getRybh() {
		return rybh;
	}

	public void setRybh(String rybh) {
		this.rybh = rybh;
	}

	public String getZzbh() {
		return zzbh;
	}

	public void setZzbh(String zzbh) {
		this.zzbh = zzbh;
	}

	public String getQtzzbh() {
		return qtzzbh;
	}

	public void setQtzzbh(String qtzzbh) {
		this.qtzzbh = qtzzbh;
	}

	public String getPoxx() {
		return poxx;
	}

	public void setPoxx(String poxx) {
		this.poxx = poxx;
	}

	public String getZylb() {
		return zylb;
	}

	public void setZylb(String zylb) {
		this.zylb = zylb;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getWlhyy() {
		return wlhyy;
	}

	public void setWlhyy(String wlhyy) {
		this.wlhyy = wlhyy;
	}

	public String getHklb() {
		return hklb;
	}

	public void setHklb(String hklb) {
		this.hklb = hklb;
	}

	public String getSczjzl() {
		return sczjzl;
	}

	public void setSczjzl(String sczjzl) {
		this.sczjzl = sczjzl;
	}

	public String getSczjbh() {
		return sczjbh;
	}

	public void setSczjbh(String sczjbh) {
		this.sczjbh = sczjbh;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSfzyfw() {
		return sfzyfw;
	}

	public void setSfzyfw(String sfzyfw) {
		this.sfzyfw = sfzyfw;
	}

	public String getZxbs() {
		return zxbs;
	}

	public void setZxbs(String zxbs) {
		this.zxbs = zxbs;
	}

	public String getZxlb() {
		return zxlb;
	}

	public void setZxlb(String zxlb) {
		this.zxlb = zxlb;
	}

	public String getQyldrq() {
		return qyldrq;
	}

	public void setQyldrq(String qyldrq) {
		this.qyldrq = qyldrq;
	}

	public String getQyldyy() {
		return qyldyy;
	}

	public void setQyldyy(String qyldyy) {
		this.qyldyy = qyldyy;
	}

	public String getQwgjdq() {
		return qwgjdq;
	}

	public void setQwgjdq(String qwgjdq) {
		this.qwgjdq = qwgjdq;
	}

	public String getQwsfxq() {
		return qwsfxq;
	}

	public void setQwsfxq(String qwsfxq) {
		this.qwsfxq = qwsfxq;
	}

	public String getQwxz() {
		return qwxz;
	}

	public void setQwxz(String qwxz) {
		this.qwxz = qwxz;
	}

	public String getQwd() {
		return qwd;
	}

	public void setQwd(String qwd) {
		this.qwd = qwd;
	}

	public String getSwrq() {
		return swrq;
	}

	public void setSwrq(String swrq) {
		this.swrq = swrq;
	}

	public String getSwyy() {
		return swyy;
	}

	public void setSwyy(String swyy) {
		this.swyy = swyy;
	}

	public String getZxdw() {
		return zxdw;
	}

	public void setZxdw(String zxdw) {
		this.zxdw = zxdw;
	}

	public String getZxr() {
		return zxr;
	}

	public void setZxr(String zxr) {
		this.zxr = zxr;
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

	public String getDjrq() {
		return djrq;
	}

	public void setDjrq(String djrq) {
		this.djrq = djrq;
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

	public String getRyfl() {
		return ryfl;
	}

	public void setRyfl(String ryfl) {
		this.ryfl = ryfl;
	}

	public String getYhkssxq() {
		return yhkssxq;
	}

	public void setYhkssxq(String yhkssxq) {
		this.yhkssxq = yhkssxq;
	}

	public String getYhkxz() {
		return yhkxz;
	}

	public void setYhkxz(String yhkxz) {
		this.yhkxz = yhkxz;
	}

	public String getYwhk() {
		return ywhk;
	}

	public void setYwhk(String ywhk) {
		this.ywhk = ywhk;
	}

	public String getWhkyy() {
		return whkyy;
	}

	public void setWhkyy(String whkyy) {
		this.whkyy = whkyy;
	}

	public String getFwcsdz() {
		return fwcsdz;
	}

	public void setFwcsdz(String fwcsdz) {
		this.fwcsdz = fwcsdz;
	}

	public String getYfzgx() {
		return yfzgx;
	}

	public void setYfzgx(String yfzgx) {
		this.yfzgx = yfzgx;
	}

	public String getJqsfjzym() {
		return jqsfjzym;
	}

	public void setJqsfjzym(String jqsfjzym) {
		this.jqsfjzym = jqsfjzym;
	}

	public String getSfsy() {
		return sfsy;
	}

	public void setSfsy(String sfsy) {
		this.sfsy = sfsy;
	}

	public String getSfcqjycs() {
		return sfcqjycs;
	}

	public void setSfcqjycs(String sfcqjycs) {
		this.sfcqjycs = sfcqjycs;
	}

	public String getSynanhs() {
		return synanhs;
	}

	public void setSynanhs(String synanhs) {
		this.synanhs = synanhs;
	}

	public String getSynvhs() {
		return synvhs;
	}

	public void setSynvhs(String synvhs) {
		this.synvhs = synvhs;
	}

	public String getSfblylbx() {
		return sfblylbx;
	}

	public void setSfblylbx(String sfblylbx) {
		this.sfblylbx = sfblylbx;
	}

	public String getBlylbxqssj() {
		return blylbxqssj;
	}

	public void setBlylbxqssj(String blylbxqssj) {
		this.blylbxqssj = blylbxqssj;
	}

	public String getSfblgsbx() {
		return sfblgsbx;
	}

	public void setSfblgsbx(String sfblgsbx) {
		this.sfblgsbx = sfblgsbx;
	}

	public String getBlgsbxqssj() {
		return blgsbxqssj;
	}

	public void setBlgsbxqssj(String blgsbxqssj) {
		this.blgsbxqssj = blgsbxqssj;
	}

	public String getSfblsybx() {
		return sfblsybx;
	}

	public void setSfblsybx(String sfblsybx) {
		this.sfblsybx = sfblsybx;
	}

	public String getBlsybxqssj() {
		return blsybxqssj;
	}

	public void setBlsybxqssj(String blsybxqssj) {
		this.blsybxqssj = blsybxqssj;
	}

	public String getFzll() {
		return fzll;
	}

	public void setFzll(String fzll) {
		this.fzll = fzll;
	}

	public String getBfdx() {
		return bfdx;
	}

	public void setBfdx(String bfdx) {
		this.bfdx = bfdx;
	}

	public String getXzzjlx() {
		return xzzjlx;
	}

	public void setXzzjlx(String xzzjlx) {
		this.xzzjlx = xzzjlx;
	}

	public String getSqgb() {
		return sqgb;
	}

	public void setSqgb(String sqgb) {
		this.sqgb = sqgb;
	}

	public String getGblxdh() {
		return gblxdh;
	}

	public void setGblxdh(String gblxdh) {
		this.gblxdh = gblxdh;
	}

	public String getSssq() {
		return sssq;
	}

	public void setSssq(String sssq) {
		this.sssq = sssq;
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
		return "RyWlczhkry [id=" + id + ", personId=" + personId + ", personSfzh=" + personSfzh + ", wlhbh=" + wlhbh
				+ ", rybh=" + rybh + ", zzbh=" + zzbh + ", qtzzbh=" + qtzzbh + ", poxx=" + poxx + ", zylb=" + zylb
				+ ", lxdh=" + lxdh + ", wlhyy=" + wlhyy + ", hklb=" + hklb + ", sczjzl=" + sczjzl + ", sczjbh=" + sczjbh
				+ ", bz=" + bz + ", sfzyfw=" + sfzyfw + ", zxbs=" + zxbs + ", zxlb=" + zxlb + ", qyldrq=" + qyldrq
				+ ", qyldyy=" + qyldyy + ", qwgjdq=" + qwgjdq + ", qwsfxq=" + qwsfxq + ", qwxz=" + qwxz + ", qwd=" + qwd
				+ ", swrq=" + swrq + ", swyy=" + swyy + ", zxdw=" + zxdw + ", zxr=" + zxr + ", djdw=" + djdw + ", djr="
				+ djr + ", djrq=" + djrq + ", czdw=" + czdw + ", czr=" + czr + ", czsj=" + czsj + ", czbs=" + czbs
				+ ", ryfl=" + ryfl + ", yhkssxq=" + yhkssxq + ", yhkxz=" + yhkxz + ", ywhk=" + ywhk + ", whkyy=" + whkyy
				+ ", fwcsdz=" + fwcsdz + ", yfzgx=" + yfzgx + ", jqsfjzym=" + jqsfjzym + ", sfsy=" + sfsy
				+ ", sfcqjycs=" + sfcqjycs + ", synanhs=" + synanhs + ", synvhs=" + synvhs + ", sfblylbx=" + sfblylbx
				+ ", blylbxqssj=" + blylbxqssj + ", sfblgsbx=" + sfblgsbx + ", blgsbxqssj=" + blgsbxqssj + ", sfblsybx="
				+ sfblsybx + ", blsybxqssj=" + blsybxqssj + ", fzll=" + fzll + ", bfdx=" + bfdx + ", xzzjlx=" + xzzjlx
				+ ", sqgb=" + sqgb + ", gblxdh=" + gblxdh + ", sssq=" + sssq + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + "]";
	}

}
