package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *名称: AjXyrxx
 *	       涉毒人员
 */
public class AjXyrxxEntity implements Serializable{
	private long id;			//主键
	private long personId;		//人口标识
	private String personSfzh;	//人口身份证号
	private String xyrbh;		//嫌疑人编号
	private String ajbh;		//案件编号
	private String rybh;		//人员编号
	private String nlxx;		//年龄下限
	private String nlsx;		//年龄上限
	private String hjdzssxq;	//行政区划
	private String sgxx;		//身高下限
	private String qttz;		//其他特征
	private String tstz;		//特殊特征
	private String tssf;		//特殊身份
	private String sfjwry;		//是否境外人员
	private String sflc;		//是否流串
	private String sflf;		//是否累犯
	private String sfgf;		//是否惯犯
	private String zlyy;		//暂留缘由
	private String xgtd;		//习惯特点
	private String bajs;		//本案角色
	private String zatd;		//作案特点
	private String saqk;		//涉案情况
	private String cmsfrq;		//查明身份日期
	private String zayy;		//作案原因
	private String kyyj;		//可疑依据
	private String xszk;		//现实状况
	private String zhrq;		//抓获日期
	private String zhfs;		//抓获方式
	private String zhdq;		//抓获地区
	private String zhdy;		//抓获地域
	private String zhdd;		//抓获地点
	private String zhr;			//抓获人
	private String zhdw;		//外部抓获单位
	private String wffzjl;		//人违法犯罪经历
	private String wffzss;		//违法犯罪事实
	private String ywx;			//外文姓
	private String zjzl;		//证件种类
	private String qzzl;		//签证种类
	private String tlyxq;		//停留有效期
	private String xyrsx;		//嫌疑人属性
	private String zwbh;		//指纹编号
	private String dnabh;		//DNA编号
	private String bjkbh;		//笔记卡编号
	private String xyrbs;		//嫌疑人标识
	private String bscly;		//被审查理由
	private String bfly;		//被否理由
	private String dqzt;		//当前状态
	private String bmjb;		//保密级别
	private String swrq;		//死亡日期
	private String ajmc;		//案件名称
	private String ajlb;		//案件类别
	private String clfs;		//处理方式
	private String cflx;		//处罚类型
	private String cfrq;		//处罚日期
	private String cfqk;		//处罚情况
	private String cfdw;		//处罚单位
	private String bz;			//备注
	private String djdw;		//登记单位
	private String djr;			//登记人
	private String djrq;		//登记日期
	private String czdw;		//操作单位
	private String czr;			//操作人
	private String czsj;		//操作时间
	private String czbs;		//操作标识
	private String xzcflb;		//行政处罚类别
	private String xzcfje;		//处罚金额
	private String xzcfqx;		//处罚期限
	private String xzcfcd;		//程度
	private String xzsplx;		//审批类型
	private String jlx;			//街路巷
	private String xyrjdjg;		//决定结果
	private String xyrjdqx;		//决定期限
	private String xyrqssj;		//起始时间
	private String xyrzzsj;		//终止时间
	private String bzrxm;		//保证人姓名
	private String jdXh;		//序号
	private String jdSdryxh;	//涉毒人员序号
	private String jdSdrybh;	//涉毒人员编号
	private String jdAjxh;		//案件序号
	private String jdSdlx;		//涉毒类型
	private String jdHdqy;		//活动区域
	private String jdCzqk;		//处置情况
	private String jdCzrq;		//处置日期
	private String jdYhkfkyh;	//银行卡发卡银行
	private String jdYhkh;		//银行卡号
	private String jdYhzh;		//银行账号
	private String jdCph;		//车牌号
	private String jdSfxd;		//是否吸毒
	private String jdXsdpzl;	//吸食毒品种类
	private String jdZsdpzl;	//注射毒品种类
	private String jdFxcs;		//复吸次数
	private String jdZtrybh;	//在逃人员编号
	private String jdSwztrq;	//上网追逃日期
	private String jdTjjb;		//通缉级别
	private String jdZhxsly;	//抓获线索来源
	private String jdZhjg;		//抓获经过
	private String jdSphzxqk;	//审判后执行情况
	private String jdYjdq;		//移交地区
	private String jdJhzazzy;	//结伙作案中作用
	private String jdTsrq;		//特殊人群
	private String jdGwyjry;	//高危预警人员
	private String xzQtsf;		//其他身份
	private String xzLxr;		//联系人
	private String xzLxrdh;		//联系人电话
	private String xzSfayzw;	//是否捺印指纹
	private String xzSftqzy;	//是否提取足印
	private String xzSftqxy;	//是否提取鞋印
	private String xzSfbjcj;	//是否笔迹采集
	private String xzSfxzcj;	//是否限制出境
	private String xzSfcxy;		//是否采血样
	private String xzXybcdw;	//血样保存单位
	private String xzSflylx;	//是否录音录相
	private String xzYxbcdw;	//音像保存单位
	private String xzBjbcdw;	//笔迹保存单位
	private String xzZhdw;		//抓获单位
	private String xzZhdwxz;	//抓获单位详址
	private String xzTstzwpms;	//特殊特征物品描述
	private String xzLxdh;		//抓获联系电话
	private String xzXxzk;		//现行状况
	private String xzZxd;		//执行地行政区划
	private String xzZxdxz;		//执行地详址
	private String xzSfrq;		//释放日期
	private String xzSfly;		//释放理由
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
	public String getXyrbh() {
		return xyrbh;
	}
	public void setXyrbh(String xyrbh) {
		this.xyrbh = xyrbh;
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
	public String getNlxx() {
		return nlxx;
	}
	public void setNlxx(String nlxx) {
		this.nlxx = nlxx;
	}
	public String getNlsx() {
		return nlsx;
	}
	public void setNlsx(String nlsx) {
		this.nlsx = nlsx;
	}
	public String getHjdzssxq() {
		return hjdzssxq;
	}
	public void setHjdzssxq(String hjdzssxq) {
		this.hjdzssxq = hjdzssxq;
	}
	public String getSgxx() {
		return sgxx;
	}
	public void setSgxx(String sgxx) {
		this.sgxx = sgxx;
	}
	public String getQttz() {
		return qttz;
	}
	public void setQttz(String qttz) {
		this.qttz = qttz;
	}
	public String getTstz() {
		return tstz;
	}
	public void setTstz(String tstz) {
		this.tstz = tstz;
	}
	public String getTssf() {
		return tssf;
	}
	public void setTssf(String tssf) {
		this.tssf = tssf;
	}
	public String getSfjwry() {
		return sfjwry;
	}
	public void setSfjwry(String sfjwry) {
		this.sfjwry = sfjwry;
	}
	public String getSflc() {
		return sflc;
	}
	public void setSflc(String sflc) {
		this.sflc = sflc;
	}
	public String getSflf() {
		return sflf;
	}
	public void setSflf(String sflf) {
		this.sflf = sflf;
	}
	public String getSfgf() {
		return sfgf;
	}
	public void setSfgf(String sfgf) {
		this.sfgf = sfgf;
	}
	public String getZlyy() {
		return zlyy;
	}
	public void setZlyy(String zlyy) {
		this.zlyy = zlyy;
	}
	public String getXgtd() {
		return xgtd;
	}
	public void setXgtd(String xgtd) {
		this.xgtd = xgtd;
	}
	public String getBajs() {
		return bajs;
	}
	public void setBajs(String bajs) {
		this.bajs = bajs;
	}
	public String getZatd() {
		return zatd;
	}
	public void setZatd(String zatd) {
		this.zatd = zatd;
	}
	public String getSaqk() {
		return saqk;
	}
	public void setSaqk(String saqk) {
		this.saqk = saqk;
	}
	public String getCmsfrq() {
		return cmsfrq;
	}
	public void setCmsfrq(String cmsfrq) {
		this.cmsfrq = cmsfrq;
	}
	public String getZayy() {
		return zayy;
	}
	public void setZayy(String zayy) {
		this.zayy = zayy;
	}
	public String getKyyj() {
		return kyyj;
	}
	public void setKyyj(String kyyj) {
		this.kyyj = kyyj;
	}
	public String getXszk() {
		return xszk;
	}
	public void setXszk(String xszk) {
		this.xszk = xszk;
	}
	public String getZhrq() {
		return zhrq;
	}
	public void setZhrq(String zhrq) {
		this.zhrq = zhrq;
	}
	public String getZhfs() {
		return zhfs;
	}
	public void setZhfs(String zhfs) {
		this.zhfs = zhfs;
	}
	public String getZhdq() {
		return zhdq;
	}
	public void setZhdq(String zhdq) {
		this.zhdq = zhdq;
	}
	public String getZhdy() {
		return zhdy;
	}
	public void setZhdy(String zhdy) {
		this.zhdy = zhdy;
	}
	public String getZhdd() {
		return zhdd;
	}
	public void setZhdd(String zhdd) {
		this.zhdd = zhdd;
	}
	public String getZhr() {
		return zhr;
	}
	public void setZhr(String zhr) {
		this.zhr = zhr;
	}
	public String getZhdw() {
		return zhdw;
	}
	public void setZhdw(String zhdw) {
		this.zhdw = zhdw;
	}
	public String getWffzjl() {
		return wffzjl;
	}
	public void setWffzjl(String wffzjl) {
		this.wffzjl = wffzjl;
	}
	public String getWffzss() {
		return wffzss;
	}
	public void setWffzss(String wffzss) {
		this.wffzss = wffzss;
	}
	public String getYwx() {
		return ywx;
	}
	public void setYwx(String ywx) {
		this.ywx = ywx;
	}
	public String getZjzl() {
		return zjzl;
	}
	public void setZjzl(String zjzl) {
		this.zjzl = zjzl;
	}
	public String getQzzl() {
		return qzzl;
	}
	public void setQzzl(String qzzl) {
		this.qzzl = qzzl;
	}
	public String getTlyxq() {
		return tlyxq;
	}
	public void setTlyxq(String tlyxq) {
		this.tlyxq = tlyxq;
	}
	public String getXyrsx() {
		return xyrsx;
	}
	public void setXyrsx(String xyrsx) {
		this.xyrsx = xyrsx;
	}
	public String getZwbh() {
		return zwbh;
	}
	public void setZwbh(String zwbh) {
		this.zwbh = zwbh;
	}
	public String getDnabh() {
		return dnabh;
	}
	public void setDnabh(String dnabh) {
		this.dnabh = dnabh;
	}
	public String getBjkbh() {
		return bjkbh;
	}
	public void setBjkbh(String bjkbh) {
		this.bjkbh = bjkbh;
	}
	public String getXyrbs() {
		return xyrbs;
	}
	public void setXyrbs(String xyrbs) {
		this.xyrbs = xyrbs;
	}
	public String getBscly() {
		return bscly;
	}
	public void setBscly(String bscly) {
		this.bscly = bscly;
	}
	public String getBfly() {
		return bfly;
	}
	public void setBfly(String bfly) {
		this.bfly = bfly;
	}
	public String getDqzt() {
		return dqzt;
	}
	public void setDqzt(String dqzt) {
		this.dqzt = dqzt;
	}
	public String getBmjb() {
		return bmjb;
	}
	public void setBmjb(String bmjb) {
		this.bmjb = bmjb;
	}
	public String getSwrq() {
		return swrq;
	}
	public void setSwrq(String swrq) {
		this.swrq = swrq;
	}
	public String getAjmc() {
		return ajmc;
	}
	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}
	public String getAjlb() {
		return ajlb;
	}
	public void setAjlb(String ajlb) {
		this.ajlb = ajlb;
	}
	public String getClfs() {
		return clfs;
	}
	public void setClfs(String clfs) {
		this.clfs = clfs;
	}
	public String getCflx() {
		return cflx;
	}
	public void setCflx(String cflx) {
		this.cflx = cflx;
	}
	public String getCfrq() {
		return cfrq;
	}
	public void setCfrq(String cfrq) {
		this.cfrq = cfrq;
	}
	public String getCfqk() {
		return cfqk;
	}
	public void setCfqk(String cfqk) {
		this.cfqk = cfqk;
	}
	public String getCfdw() {
		return cfdw;
	}
	public void setCfdw(String cfdw) {
		this.cfdw = cfdw;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
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
	public String getXzcflb() {
		return xzcflb;
	}
	public void setXzcflb(String xzcflb) {
		this.xzcflb = xzcflb;
	}
	public String getXzcfje() {
		return xzcfje;
	}
	public void setXzcfje(String xzcfje) {
		this.xzcfje = xzcfje;
	}
	public String getXzcfqx() {
		return xzcfqx;
	}
	public void setXzcfqx(String xzcfqx) {
		this.xzcfqx = xzcfqx;
	}
	public String getXzcfcd() {
		return xzcfcd;
	}
	public void setXzcfcd(String xzcfcd) {
		this.xzcfcd = xzcfcd;
	}
	public String getXzsplx() {
		return xzsplx;
	}
	public void setXzsplx(String xzsplx) {
		this.xzsplx = xzsplx;
	}
	public String getJlx() {
		return jlx;
	}
	public void setJlx(String jlx) {
		this.jlx = jlx;
	}
	public String getXyrjdjg() {
		return xyrjdjg;
	}
	public void setXyrjdjg(String xyrjdjg) {
		this.xyrjdjg = xyrjdjg;
	}
	public String getXyrjdqx() {
		return xyrjdqx;
	}
	public void setXyrjdqx(String xyrjdqx) {
		this.xyrjdqx = xyrjdqx;
	}
	public String getXyrqssj() {
		return xyrqssj;
	}
	public void setXyrqssj(String xyrqssj) {
		this.xyrqssj = xyrqssj;
	}
	public String getXyrzzsj() {
		return xyrzzsj;
	}
	public void setXyrzzsj(String xyrzzsj) {
		this.xyrzzsj = xyrzzsj;
	}
	public String getBzrxm() {
		return bzrxm;
	}
	public void setBzrxm(String bzrxm) {
		this.bzrxm = bzrxm;
	}
	public String getJdXh() {
		return jdXh;
	}
	public void setJdXh(String jdXh) {
		this.jdXh = jdXh;
	}
	public String getJdSdryxh() {
		return jdSdryxh;
	}
	public void setJdSdryxh(String jdSdryxh) {
		this.jdSdryxh = jdSdryxh;
	}
	public String getJdSdrybh() {
		return jdSdrybh;
	}
	public void setJdSdrybh(String jdSdrybh) {
		this.jdSdrybh = jdSdrybh;
	}
	public String getJdAjxh() {
		return jdAjxh;
	}
	public void setJdAjxh(String jdAjxh) {
		this.jdAjxh = jdAjxh;
	}
	public String getJdSdlx() {
		return jdSdlx;
	}
	public void setJdSdlx(String jdSdlx) {
		this.jdSdlx = jdSdlx;
	}
	public String getJdHdqy() {
		return jdHdqy;
	}
	public void setJdHdqy(String jdHdqy) {
		this.jdHdqy = jdHdqy;
	}
	public String getJdCzqk() {
		return jdCzqk;
	}
	public void setJdCzqk(String jdCzqk) {
		this.jdCzqk = jdCzqk;
	}
	public String getJdCzrq() {
		return jdCzrq;
	}
	public void setJdCzrq(String jdCzrq) {
		this.jdCzrq = jdCzrq;
	}
	public String getJdYhkfkyh() {
		return jdYhkfkyh;
	}
	public void setJdYhkfkyh(String jdYhkfkyh) {
		this.jdYhkfkyh = jdYhkfkyh;
	}
	public String getJdYhkh() {
		return jdYhkh;
	}
	public void setJdYhkh(String jdYhkh) {
		this.jdYhkh = jdYhkh;
	}
	public String getJdYhzh() {
		return jdYhzh;
	}
	public void setJdYhzh(String jdYhzh) {
		this.jdYhzh = jdYhzh;
	}
	public String getJdCph() {
		return jdCph;
	}
	public void setJdCph(String jdCph) {
		this.jdCph = jdCph;
	}
	public String getJdSfxd() {
		return jdSfxd;
	}
	public void setJdSfxd(String jdSfxd) {
		this.jdSfxd = jdSfxd;
	}
	public String getJdXsdpzl() {
		return jdXsdpzl;
	}
	public void setJdXsdpzl(String jdXsdpzl) {
		this.jdXsdpzl = jdXsdpzl;
	}
	public String getJdZsdpzl() {
		return jdZsdpzl;
	}
	public void setJdZsdpzl(String jdZsdpzl) {
		this.jdZsdpzl = jdZsdpzl;
	}
	public String getJdFxcs() {
		return jdFxcs;
	}
	public void setJdFxcs(String jdFxcs) {
		this.jdFxcs = jdFxcs;
	}
	public String getJdZtrybh() {
		return jdZtrybh;
	}
	public void setJdZtrybh(String jdZtrybh) {
		this.jdZtrybh = jdZtrybh;
	}
	public String getJdSwztrq() {
		return jdSwztrq;
	}
	public void setJdSwztrq(String jdSwztrq) {
		this.jdSwztrq = jdSwztrq;
	}
	public String getJdTjjb() {
		return jdTjjb;
	}
	public void setJdTjjb(String jdTjjb) {
		this.jdTjjb = jdTjjb;
	}
	public String getJdZhxsly() {
		return jdZhxsly;
	}
	public void setJdZhxsly(String jdZhxsly) {
		this.jdZhxsly = jdZhxsly;
	}
	public String getJdZhjg() {
		return jdZhjg;
	}
	public void setJdZhjg(String jdZhjg) {
		this.jdZhjg = jdZhjg;
	}
	public String getJdSphzxqk() {
		return jdSphzxqk;
	}
	public void setJdSphzxqk(String jdSphzxqk) {
		this.jdSphzxqk = jdSphzxqk;
	}
	public String getJdYjdq() {
		return jdYjdq;
	}
	public void setJdYjdq(String jdYjdq) {
		this.jdYjdq = jdYjdq;
	}
	public String getJdJhzazzy() {
		return jdJhzazzy;
	}
	public void setJdJhzazzy(String jdJhzazzy) {
		this.jdJhzazzy = jdJhzazzy;
	}
	public String getJdTsrq() {
		return jdTsrq;
	}
	public void setJdTsrq(String jdTsrq) {
		this.jdTsrq = jdTsrq;
	}
	public String getJdGwyjry() {
		return jdGwyjry;
	}
	public void setJdGwyjry(String jdGwyjry) {
		this.jdGwyjry = jdGwyjry;
	}
	public String getXzQtsf() {
		return xzQtsf;
	}
	public void setXzQtsf(String xzQtsf) {
		this.xzQtsf = xzQtsf;
	}
	public String getXzLxr() {
		return xzLxr;
	}
	public void setXzLxr(String xzLxr) {
		this.xzLxr = xzLxr;
	}
	public String getXzLxrdh() {
		return xzLxrdh;
	}
	public void setXzLxrdh(String xzLxrdh) {
		this.xzLxrdh = xzLxrdh;
	}
	public String getXzSfayzw() {
		return xzSfayzw;
	}
	public void setXzSfayzw(String xzSfayzw) {
		this.xzSfayzw = xzSfayzw;
	}
	public String getXzSftqzy() {
		return xzSftqzy;
	}
	public void setXzSftqzy(String xzSftqzy) {
		this.xzSftqzy = xzSftqzy;
	}
	public String getXzSftqxy() {
		return xzSftqxy;
	}
	public void setXzSftqxy(String xzSftqxy) {
		this.xzSftqxy = xzSftqxy;
	}
	public String getXzSfbjcj() {
		return xzSfbjcj;
	}
	public void setXzSfbjcj(String xzSfbjcj) {
		this.xzSfbjcj = xzSfbjcj;
	}
	public String getXzSfxzcj() {
		return xzSfxzcj;
	}
	public void setXzSfxzcj(String xzSfxzcj) {
		this.xzSfxzcj = xzSfxzcj;
	}
	public String getXzSfcxy() {
		return xzSfcxy;
	}
	public void setXzSfcxy(String xzSfcxy) {
		this.xzSfcxy = xzSfcxy;
	}
	public String getXzXybcdw() {
		return xzXybcdw;
	}
	public void setXzXybcdw(String xzXybcdw) {
		this.xzXybcdw = xzXybcdw;
	}
	public String getXzSflylx() {
		return xzSflylx;
	}
	public void setXzSflylx(String xzSflylx) {
		this.xzSflylx = xzSflylx;
	}
	public String getXzYxbcdw() {
		return xzYxbcdw;
	}
	public void setXzYxbcdw(String xzYxbcdw) {
		this.xzYxbcdw = xzYxbcdw;
	}
	public String getXzBjbcdw() {
		return xzBjbcdw;
	}
	public void setXzBjbcdw(String xzBjbcdw) {
		this.xzBjbcdw = xzBjbcdw;
	}
	public String getXzZhdw() {
		return xzZhdw;
	}
	public void setXzZhdw(String xzZhdw) {
		this.xzZhdw = xzZhdw;
	}
	public String getXzZhdwxz() {
		return xzZhdwxz;
	}
	public void setXzZhdwxz(String xzZhdwxz) {
		this.xzZhdwxz = xzZhdwxz;
	}
	public String getXzTstzwpms() {
		return xzTstzwpms;
	}
	public void setXzTstzwpms(String xzTstzwpms) {
		this.xzTstzwpms = xzTstzwpms;
	}
	public String getXzLxdh() {
		return xzLxdh;
	}
	public void setXzLxdh(String xzLxdh) {
		this.xzLxdh = xzLxdh;
	}
	public String getXzXxzk() {
		return xzXxzk;
	}
	public void setXzXxzk(String xzXxzk) {
		this.xzXxzk = xzXxzk;
	}
	public String getXzZxd() {
		return xzZxd;
	}
	public void setXzZxd(String xzZxd) {
		this.xzZxd = xzZxd;
	}
	public String getXzZxdxz() {
		return xzZxdxz;
	}
	public void setXzZxdxz(String xzZxdxz) {
		this.xzZxdxz = xzZxdxz;
	}
	public String getXzSfrq() {
		return xzSfrq;
	}
	public void setXzSfrq(String xzSfrq) {
		this.xzSfrq = xzSfrq;
	}
	public String getXzSfly() {
		return xzSfly;
	}
	public void setXzSfly(String xzSfly) {
		this.xzSfly = xzSfly;
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
		return "AjXyrxx [id=" + id + ", personId=" + personId + ", personSfzh="
				+ personSfzh + ", xyrbh=" + xyrbh + ", ajbh=" + ajbh
				+ ", rybh=" + rybh + ", nlxx=" + nlxx + ", nlsx=" + nlsx
				+ ", hjdzssxq=" + hjdzssxq + ", sgxx=" + sgxx + ", qttz="
				+ qttz + ", tstz=" + tstz + ", tssf=" + tssf + ", sfjwry="
				+ sfjwry + ", sflc=" + sflc + ", sflf=" + sflf + ", sfgf="
				+ sfgf + ", zlyy=" + zlyy + ", xgtd=" + xgtd + ", bajs=" + bajs
				+ ", zatd=" + zatd + ", saqk=" + saqk + ", cmsfrq=" + cmsfrq
				+ ", zayy=" + zayy + ", kyyj=" + kyyj + ", xszk=" + xszk
				+ ", zhrq=" + zhrq + ", zhfs=" + zhfs + ", zhdq=" + zhdq
				+ ", zhdy=" + zhdy + ", zhdd=" + zhdd + ", zhr=" + zhr
				+ ", zhdw=" + zhdw + ", wffzjl=" + wffzjl + ", wffzss="
				+ wffzss + ", ywx=" + ywx + ", zjzl=" + zjzl + ", qzzl=" + qzzl
				+ ", tlyxq=" + tlyxq + ", xyrsx=" + xyrsx + ", zwbh=" + zwbh
				+ ", dnabh=" + dnabh + ", bjkbh=" + bjkbh + ", xyrbs=" + xyrbs
				+ ", bscly=" + bscly + ", bfly=" + bfly + ", dqzt=" + dqzt
				+ ", bmjb=" + bmjb + ", swrq=" + swrq + ", ajmc=" + ajmc
				+ ", ajlb=" + ajlb + ", clfs=" + clfs + ", cflx=" + cflx
				+ ", cfrq=" + cfrq + ", cfqk=" + cfqk + ", cfdw=" + cfdw
				+ ", bz=" + bz + ", djdw=" + djdw + ", djr=" + djr + ", djrq="
				+ djrq + ", czdw=" + czdw + ", czr=" + czr + ", czsj=" + czsj
				+ ", czbs=" + czbs + ", xzcflb=" + xzcflb + ", xzcfje="
				+ xzcfje + ", xzcfqx=" + xzcfqx + ", xzcfcd=" + xzcfcd
				+ ", xzsplx=" + xzsplx + ", jlx=" + jlx + ", xyrjdjg="
				+ xyrjdjg + ", xyrjdqx=" + xyrjdqx + ", xyrqssj=" + xyrqssj
				+ ", xyrzzsj=" + xyrzzsj + ", bzrxm=" + bzrxm + ", jdXh="
				+ jdXh + ", jdSdryxh=" + jdSdryxh + ", jdSdrybh=" + jdSdrybh
				+ ", jdAjxh=" + jdAjxh + ", jdSdlx=" + jdSdlx + ", jdHdqy="
				+ jdHdqy + ", jdCzqk=" + jdCzqk + ", jdCzrq=" + jdCzrq
				+ ", jdYhkfkyh=" + jdYhkfkyh + ", jdYhkh=" + jdYhkh
				+ ", jdYhzh=" + jdYhzh + ", jdCph=" + jdCph + ", jdSfxd="
				+ jdSfxd + ", jdXsdpzl=" + jdXsdpzl + ", jdZsdpzl=" + jdZsdpzl
				+ ", jdFxcs=" + jdFxcs + ", jdZtrybh=" + jdZtrybh
				+ ", jdSwztrq=" + jdSwztrq + ", jdTjjb=" + jdTjjb
				+ ", jdZhxsly=" + jdZhxsly + ", jdZhjg=" + jdZhjg
				+ ", jdSphzxqk=" + jdSphzxqk + ", jdYjdq=" + jdYjdq
				+ ", jdJhzazzy=" + jdJhzazzy + ", jdTsrq=" + jdTsrq
				+ ", jdGwyjry=" + jdGwyjry + ", xzQtsf=" + xzQtsf + ", xzLxr="
				+ xzLxr + ", xzLxrdh=" + xzLxrdh + ", xzSfayzw=" + xzSfayzw
				+ ", xzSftqzy=" + xzSftqzy + ", xzSftqxy=" + xzSftqxy
				+ ", xzSfbjcj=" + xzSfbjcj + ", xzSfxzcj=" + xzSfxzcj
				+ ", xzSfcxy=" + xzSfcxy + ", xzXybcdw=" + xzXybcdw
				+ ", xzSflylx=" + xzSflylx + ", xzYxbcdw=" + xzYxbcdw
				+ ", xzBjbcdw=" + xzBjbcdw + ", xzZhdw=" + xzZhdw
				+ ", xzZhdwxz=" + xzZhdwxz + ", xzTstzwpms=" + xzTstzwpms
				+ ", xzLxdh=" + xzLxdh + ", xzXxzk=" + xzXxzk + ", xzZxd="
				+ xzZxd + ", xzZxdxz=" + xzZxdxz + ", xzSfrq=" + xzSfrq
				+ ", xzSfly=" + xzSfly + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + "]";
	}
	
	public AjXyrxxEntity(long id, long personId, String personSfzh, String xyrbh,
			String ajbh, String rybh, String nlxx, String nlsx,
			String hjdzssxq, String sgxx, String qttz, String tstz,
			String tssf, String sfjwry, String sflc, String sflf, String sfgf,
			String zlyy, String xgtd, String bajs, String zatd, String saqk,
			String cmsfrq, String zayy, String kyyj, String xszk, String zhrq,
			String zhfs, String zhdq, String zhdy, String zhdd, String zhr,
			String zhdw, String wffzjl, String wffzss, String ywx, String zjzl,
			String qzzl, String tlyxq, String xyrsx, String zwbh, String dnabh,
			String bjkbh, String xyrbs, String bscly, String bfly, String dqzt,
			String bmjb, String swrq, String ajmc, String ajlb, String clfs,
			String cflx, String cfrq, String cfqk, String cfdw, String bz,
			String djdw, String djr, String djrq, String czdw, String czr,
			String czsj, String czbs, String xzcflb, String xzcfje,
			String xzcfqx, String xzcfcd, String xzsplx, String jlx,
			String xyrjdjg, String xyrjdqx, String xyrqssj, String xyrzzsj,
			String bzrxm, String jdXh, String jdSdryxh, String jdSdrybh,
			String jdAjxh, String jdSdlx, String jdHdqy, String jdCzqk,
			String jdCzrq, String jdYhkfkyh, String jdYhkh, String jdYhzh,
			String jdCph, String jdSfxd, String jdXsdpzl, String jdZsdpzl,
			String jdFxcs, String jdZtrybh, String jdSwztrq, String jdTjjb,
			String jdZhxsly, String jdZhjg, String jdSphzxqk, String jdYjdq,
			String jdJhzazzy, String jdTsrq, String jdGwyjry, String xzQtsf,
			String xzLxr, String xzLxrdh, String xzSfayzw, String xzSftqzy,
			String xzSftqxy, String xzSfbjcj, String xzSfxzcj, String xzSfcxy,
			String xzXybcdw, String xzSflylx, String xzYxbcdw, String xzBjbcdw,
			String xzZhdw, String xzZhdwxz, String xzTstzwpms, String xzLxdh,
			String xzXxzk, String xzZxd, String xzZxdxz, String xzSfrq,
			String xzSfly, Date createdTime, Date updatedTime) {
		super();
		this.id = id;
		this.personId = personId;
		this.personSfzh = personSfzh;
		this.xyrbh = xyrbh;
		this.ajbh = ajbh;
		this.rybh = rybh;
		this.nlxx = nlxx;
		this.nlsx = nlsx;
		this.hjdzssxq = hjdzssxq;
		this.sgxx = sgxx;
		this.qttz = qttz;
		this.tstz = tstz;
		this.tssf = tssf;
		this.sfjwry = sfjwry;
		this.sflc = sflc;
		this.sflf = sflf;
		this.sfgf = sfgf;
		this.zlyy = zlyy;
		this.xgtd = xgtd;
		this.bajs = bajs;
		this.zatd = zatd;
		this.saqk = saqk;
		this.cmsfrq = cmsfrq;
		this.zayy = zayy;
		this.kyyj = kyyj;
		this.xszk = xszk;
		this.zhrq = zhrq;
		this.zhfs = zhfs;
		this.zhdq = zhdq;
		this.zhdy = zhdy;
		this.zhdd = zhdd;
		this.zhr = zhr;
		this.zhdw = zhdw;
		this.wffzjl = wffzjl;
		this.wffzss = wffzss;
		this.ywx = ywx;
		this.zjzl = zjzl;
		this.qzzl = qzzl;
		this.tlyxq = tlyxq;
		this.xyrsx = xyrsx;
		this.zwbh = zwbh;
		this.dnabh = dnabh;
		this.bjkbh = bjkbh;
		this.xyrbs = xyrbs;
		this.bscly = bscly;
		this.bfly = bfly;
		this.dqzt = dqzt;
		this.bmjb = bmjb;
		this.swrq = swrq;
		this.ajmc = ajmc;
		this.ajlb = ajlb;
		this.clfs = clfs;
		this.cflx = cflx;
		this.cfrq = cfrq;
		this.cfqk = cfqk;
		this.cfdw = cfdw;
		this.bz = bz;
		this.djdw = djdw;
		this.djr = djr;
		this.djrq = djrq;
		this.czdw = czdw;
		this.czr = czr;
		this.czsj = czsj;
		this.czbs = czbs;
		this.xzcflb = xzcflb;
		this.xzcfje = xzcfje;
		this.xzcfqx = xzcfqx;
		this.xzcfcd = xzcfcd;
		this.xzsplx = xzsplx;
		this.jlx = jlx;
		this.xyrjdjg = xyrjdjg;
		this.xyrjdqx = xyrjdqx;
		this.xyrqssj = xyrqssj;
		this.xyrzzsj = xyrzzsj;
		this.bzrxm = bzrxm;
		this.jdXh = jdXh;
		this.jdSdryxh = jdSdryxh;
		this.jdSdrybh = jdSdrybh;
		this.jdAjxh = jdAjxh;
		this.jdSdlx = jdSdlx;
		this.jdHdqy = jdHdqy;
		this.jdCzqk = jdCzqk;
		this.jdCzrq = jdCzrq;
		this.jdYhkfkyh = jdYhkfkyh;
		this.jdYhkh = jdYhkh;
		this.jdYhzh = jdYhzh;
		this.jdCph = jdCph;
		this.jdSfxd = jdSfxd;
		this.jdXsdpzl = jdXsdpzl;
		this.jdZsdpzl = jdZsdpzl;
		this.jdFxcs = jdFxcs;
		this.jdZtrybh = jdZtrybh;
		this.jdSwztrq = jdSwztrq;
		this.jdTjjb = jdTjjb;
		this.jdZhxsly = jdZhxsly;
		this.jdZhjg = jdZhjg;
		this.jdSphzxqk = jdSphzxqk;
		this.jdYjdq = jdYjdq;
		this.jdJhzazzy = jdJhzazzy;
		this.jdTsrq = jdTsrq;
		this.jdGwyjry = jdGwyjry;
		this.xzQtsf = xzQtsf;
		this.xzLxr = xzLxr;
		this.xzLxrdh = xzLxrdh;
		this.xzSfayzw = xzSfayzw;
		this.xzSftqzy = xzSftqzy;
		this.xzSftqxy = xzSftqxy;
		this.xzSfbjcj = xzSfbjcj;
		this.xzSfxzcj = xzSfxzcj;
		this.xzSfcxy = xzSfcxy;
		this.xzXybcdw = xzXybcdw;
		this.xzSflylx = xzSflylx;
		this.xzYxbcdw = xzYxbcdw;
		this.xzBjbcdw = xzBjbcdw;
		this.xzZhdw = xzZhdw;
		this.xzZhdwxz = xzZhdwxz;
		this.xzTstzwpms = xzTstzwpms;
		this.xzLxdh = xzLxdh;
		this.xzXxzk = xzXxzk;
		this.xzZxd = xzZxd;
		this.xzZxdxz = xzZxdxz;
		this.xzSfrq = xzSfrq;
		this.xzSfly = xzSfly;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}
	public AjXyrxxEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
