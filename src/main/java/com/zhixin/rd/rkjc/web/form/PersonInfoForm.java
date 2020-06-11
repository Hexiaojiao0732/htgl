package com.zhixin.rd.rkjc.web.form;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Date;

public class PersonInfoForm implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;


	private String gmsfhm ; // GMSFHM '身份证号',
	private String txm;//tXM; // '姓名',
	private String tcym;//tCYM; // '曾用名',
	private String tbmch;//tBMCH; // '别名绰号',
	private String xb;//XB; // '性别',
	private String tcsrq;//tCSRQ; // '出生日期',
	private String tzzmm;//tZZMM; // '政治面貌',
	private String tqfjgmzwz;//tQFJGMZWZ; // '民族汉字',
	private String gl;//GJ; // '国籍',
	private String tgssxdm;//tJGSSXDM; // '籍贯_代码',
	private String tjghz;  // tJGHZ; // '籍贯汉字',
	private String thjdXzqhdm;//tHJD_XZQHDM; // '户籍地区划_代码',
	private String hjdXzqhmc;//  HJD_XZQHMC; // '户籍地区划汉字',
	private String thjdxz;//tHJDXZ; // '户籍地详址',
	private String thjGajgmc;//   tHJ_GAJGMC; // '户籍所属公安机关名称',
	private String tjzdXzqhdm;//    tJZD_XZQHDM; // '居住地区划',
	private String jzdxz;//JZDXZ; // '居住地详址',
	private String tjud2_xzqhdm;//    tJUD2_XZQHDM; // '居住地区划2_代码',
	private String txzzxz1;//   tXZZXZ1; // '居住地详址2',
	private String thh; //tHH; // '户号',
	private String yhzgx ;//YHZGX; // '与户主关系',
	private String tcsdssxdm;//    tCSDSSXDM; // '出生地区划_代码',
	private String tcsdqhzx;//   tCSDQHXZ; // '出生地详址',
	private String tcszQfrq;//   tCSZ_QFRQ; // '出生证签发日期',
	private String csdgj;//  CSDGJ; // '出生地国家',
	private String tsfzQfrq;//  tSFZ_QFRQ; // '身份证签发日期',
	private String zjxy;//     ZJXY; // '宗教信仰',
	private String tlxdh;   // tLXDH; // '电话（本人手机优先',
	private String tlxdh2;    //tLXDH2; // '电话2',
	private String tqqhm;   //tQQHM; // 'QQ号码',
	private String wxhm;  //WXHM; // '微信号码',
	private String tdzyxhm;  //tDZYXHM; // '电子邮箱',
	private String hdqr;   //HDQR; // '何地迁入',
	private String tqlbslb;    //tQLBSLB; // '迁来本市类别',
	private String tqlbsRq;   //tQLBS_RQ; // '迁来本市日期',
	private String tqlbsyy;   //tQLBSYY; // '迁来本市原因',
	private String qlbsssq; // QLBSSSQ; // '迁来本市省市区',
	private String tqlbsMlxxdz;  // tQLBS_MLXXDZ; // '迁来本市详址',
	private String tqlbzlb;    //tQLBZLB; // '迁来本址类别',
	private String tqlbzRq;   //tQLBZ_RQ; // '迁来本址日期',
	private String qlbzyy;  //QLBZYY; // '迁来本址原因',
	private String tqlbzGajgjgdm;   //tQLBZ_GAJGJGDM; // '迁来本址公安机关',
	private String tqlbzJlxdm;    //tQLBZ_JLXDM; // '迁来本址街路项',
	private String tglbzMlph;   //tQLBZ_MLPH; // '迁来本址门牌号',
	private String czrBs;     //CZR_BS; // '标识有效无效',
	private String thyzk;    //tHYZK; // '婚姻状况',
	private String sg;  //SG; // '身高',
	private String twhcd;//tWHCD; // '文化程度',
	private String tzy;//tZY; // '职业',
	private String tgzDwmc; //tGZ_DWMC; // '工作单位',
	private String zw;//ZW; // '职位',
	private String tgrsf; //tGRSF; // '身份',
	private String tfssf; //tTSSF; // '特殊身份',
	private String xmpy;  //XMPY; // '姓名拼音',
	private String bmpy;  //BMPY; // '别名拼音',
	private String tbz; //tBZ; // '人员备注/简历',
	private String ttmtzms;   //tTMTZMS; // '体貌特征',
	private String tkytd;   //tKYTD; // '口音特点',
	private String tfwcs;  //tFWCS; // '服务处所',
	private String tbd_rq;   // tBD_RQ; // '变动日期',
	private String bdyy;   // BDYY;   // '变动原因',
	private String tbyzk;   //tBYZK; // '兵役情况',
	private String txx; //tXX; // '血型',
	private String ttx;  //tTX; // '体型',
	private String lx; //LX; // '脸型',
	private String txpdz;  //tXPDZ; // '相片地址',
	private String tcrSj; //  tCR_SJ; // '插入时间',
	private String crlx;  //CRLX; // '插入类型',
	private String tcrlyd;  //tCRLYD; // '插入来源地',
	private String tagInfo;
	private JSON expandInfo;
	private Date createdTime;
	private Date updatedTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGmsfhm() {
		return gmsfhm;
	}

	public void setGmsfhm(String gmsfhm) {
		this.gmsfhm = gmsfhm;
	}

	public String getTxm() {
		return txm;
	}

	public void setTxm(String txm) {
		this.txm = txm;
	}

	public String getTcym() {
		return tcym;
	}

	public void setTcym(String tcym) {
		this.tcym = tcym;
	}

	public String getTbmch() {
		return tbmch;
	}

	public void setTbmch(String tbmch) {
		this.tbmch = tbmch;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getTcsrq() {
		return tcsrq;
	}

	public void setTcsrq(String tcsrq) {
		this.tcsrq = tcsrq;
	}

	public String getTzzmm() {
		return tzzmm;
	}

	public void setTzzmm(String tzzmm) {
		this.tzzmm = tzzmm;
	}

	public String getTqfjgmzwz() {
		return tqfjgmzwz;
	}

	public void setTqfjgmzwz(String tqfjgmzwz) {
		this.tqfjgmzwz = tqfjgmzwz;
	}

	public String getGl() {
		return gl;
	}

	public void setGl(String gl) {
		this.gl = gl;
	}

	public String getTgssxdm() {
		return tgssxdm;
	}

	public void setTgssxdm(String tgssxdm) {
		this.tgssxdm = tgssxdm;
	}

	public String getTjghz() {
		return tjghz;
	}

	public void setTjghz(String tjghz) {
		this.tjghz = tjghz;
	}

	public String getThjdXzqhdm() {
		return thjdXzqhdm;
	}

	public void setThjdXzqhdm(String thjdXzqhdm) {
		this.thjdXzqhdm = thjdXzqhdm;
	}

	public String getHjdXzqhmc() {
		return hjdXzqhmc;
	}

	public void setHjdXzqhmc(String hjdXzqhmc) {
		this.hjdXzqhmc = hjdXzqhmc;
	}

	public String getThjdxz() {
		return thjdxz;
	}

	public void setThjdxz(String thjdxz) {
		this.thjdxz = thjdxz;
	}

	public String getThjGajgmc() {
		return thjGajgmc;
	}

	public void setThjGajgmc(String thjGajgmc) {
		this.thjGajgmc = thjGajgmc;
	}

	public String getTjzdXzqhdm() {
		return tjzdXzqhdm;
	}

	public void setTjzdXzqhdm(String tjzdXzqhdm) {
		this.tjzdXzqhdm = tjzdXzqhdm;
	}

	public String getJzdxz() {
		return jzdxz;
	}

	public void setJzdxz(String jzdxz) {
		this.jzdxz = jzdxz;
	}

	public String getTjud2_xzqhdm() {
		return tjud2_xzqhdm;
	}

	public void setTjud2_xzqhdm(String tjud2_xzqhdm) {
		this.tjud2_xzqhdm = tjud2_xzqhdm;
	}

	public String getTxzzxz1() {
		return txzzxz1;
	}

	public void setTxzzxz1(String txzzxz1) {
		this.txzzxz1 = txzzxz1;
	}

	public String getThh() {
		return thh;
	}

	public void setThh(String thh) {
		this.thh = thh;
	}

	public String getYhzgx() {
		return yhzgx;
	}

	public void setYhzgx(String yhzgx) {
		this.yhzgx = yhzgx;
	}

	public String getTcsdssxdm() {
		return tcsdssxdm;
	}

	public void setTcsdssxdm(String tcsdssxdm) {
		this.tcsdssxdm = tcsdssxdm;
	}

	public String getTcsdqhzx() {
		return tcsdqhzx;
	}

	public void setTcsdqhzx(String tcsdqhzx) {
		this.tcsdqhzx = tcsdqhzx;
	}

	public String getTcszQfrq() {
		return tcszQfrq;
	}

	public void setTcszQfrq(String tcszQfrq) {
		this.tcszQfrq = tcszQfrq;
	}

	public String getCsdgj() {
		return csdgj;
	}

	public void setCsdgj(String csdgj) {
		this.csdgj = csdgj;
	}

	public String getTsfzQfrq() {
		return tsfzQfrq;
	}

	public void setTsfzQfrq(String tsfzQfrq) {
		this.tsfzQfrq = tsfzQfrq;
	}

	public String getZjxy() {
		return zjxy;
	}

	public void setZjxy(String zjxy) {
		this.zjxy = zjxy;
	}

	public String getTlxdh() {
		return tlxdh;
	}

	public void setTlxdh(String tlxdh) {
		this.tlxdh = tlxdh;
	}

	public String getTlxdh2() {
		return tlxdh2;
	}

	public void setTlxdh2(String tlxdh2) {
		this.tlxdh2 = tlxdh2;
	}

	public String getTqqhm() {
		return tqqhm;
	}

	public void setTqqhm(String tqqhm) {
		this.tqqhm = tqqhm;
	}

	public String getWxhm() {
		return wxhm;
	}

	public void setWxhm(String wxhm) {
		this.wxhm = wxhm;
	}

	public String getTdzyxhm() {
		return tdzyxhm;
	}

	public void setTdzyxhm(String tdzyxhm) {
		this.tdzyxhm = tdzyxhm;
	}

	public String getHdqr() {
		return hdqr;
	}

	public void setHdqr(String hdqr) {
		this.hdqr = hdqr;
	}

	public String getTqlbslb() {
		return tqlbslb;
	}

	public void setTqlbslb(String tqlbslb) {
		this.tqlbslb = tqlbslb;
	}

	public String getTqlbsRq() {
		return tqlbsRq;
	}

	public void setTqlbsRq(String tqlbsRq) {
		this.tqlbsRq = tqlbsRq;
	}

	public String getTqlbsyy() {
		return tqlbsyy;
	}

	public void setTqlbsyy(String tqlbsyy) {
		this.tqlbsyy = tqlbsyy;
	}

	public String getQlbsssq() {
		return qlbsssq;
	}

	public void setQlbsssq(String qlbsssq) {
		this.qlbsssq = qlbsssq;
	}

	public String getTqlbsMlxxdz() {
		return tqlbsMlxxdz;
	}

	public void setTqlbsMlxxdz(String tqlbsMlxxdz) {
		this.tqlbsMlxxdz = tqlbsMlxxdz;
	}

	public String getTqlbzlb() {
		return tqlbzlb;
	}

	public void setTqlbzlb(String tqlbzlb) {
		this.tqlbzlb = tqlbzlb;
	}

	public String getTqlbzRq() {
		return tqlbzRq;
	}

	public void setTqlbzRq(String tqlbzRq) {
		this.tqlbzRq = tqlbzRq;
	}

	public String getQlbzyy() {
		return qlbzyy;
	}

	public void setQlbzyy(String qlbzyy) {
		this.qlbzyy = qlbzyy;
	}

	public String getTqlbzGajgjgdm() {
		return tqlbzGajgjgdm;
	}

	public void setTqlbzGajgjgdm(String tqlbzGajgjgdm) {
		this.tqlbzGajgjgdm = tqlbzGajgjgdm;
	}

	public String getTqlbzJlxdm() {
		return tqlbzJlxdm;
	}

	public void setTqlbzJlxdm(String tqlbzJlxdm) {
		this.tqlbzJlxdm = tqlbzJlxdm;
	}

	public String getTglbzMlph() {
		return tglbzMlph;
	}

	public void setTglbzMlph(String tglbzMlph) {
		this.tglbzMlph = tglbzMlph;
	}

	public String getCzrBs() {
		return czrBs;
	}

	public void setCzrBs(String czrBs) {
		this.czrBs = czrBs;
	}

	public String getThyzk() {
		return thyzk;
	}

	public void setThyzk(String thyzk) {
		this.thyzk = thyzk;
	}

	public String getSg() {
		return sg;
	}

	public void setSg(String sg) {
		this.sg = sg;
	}

	public String getTwhcd() {
		return twhcd;
	}

	public void setTwhcd(String twhcd) {
		this.twhcd = twhcd;
	}

	public String getTzy() {
		return tzy;
	}

	public void setTzy(String tzy) {
		this.tzy = tzy;
	}

	public String getTgzDwmc() {
		return tgzDwmc;
	}

	public void setTgzDwmc(String tgzDwmc) {
		this.tgzDwmc = tgzDwmc;
	}

	public String getZw() {
		return zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

	public String getTgrsf() {
		return tgrsf;
	}

	public void setTgrsf(String tgrsf) {
		this.tgrsf = tgrsf;
	}

	public String getTfssf() {
		return tfssf;
	}

	public void setTfssf(String tfssf) {
		this.tfssf = tfssf;
	}

	public String getXmpy() {
		return xmpy;
	}

	public void setXmpy(String xmpy) {
		this.xmpy = xmpy;
	}

	public String getBmpy() {
		return bmpy;
	}

	public void setBmpy(String bmpy) {
		this.bmpy = bmpy;
	}

	public String getTbz() {
		return tbz;
	}

	public void setTbz(String tbz) {
		this.tbz = tbz;
	}

	public String getTtmtzms() {
		return ttmtzms;
	}

	public void setTtmtzms(String ttmtzms) {
		this.ttmtzms = ttmtzms;
	}

	public String getTkytd() {
		return tkytd;
	}

	public void setTkytd(String tkytd) {
		this.tkytd = tkytd;
	}

	public String getTfwcs() {
		return tfwcs;
	}

	public void setTfwcs(String tfwcs) {
		this.tfwcs = tfwcs;
	}

	public String getTbd_rq() {
		return tbd_rq;
	}

	public void setTbd_rq(String tbd_rq) {
		this.tbd_rq = tbd_rq;
	}

	public String getBdyy() {
		return bdyy;
	}

	public void setBdyy(String bdyy) {
		this.bdyy = bdyy;
	}

	public String getTbyzk() {
		return tbyzk;
	}

	public void setTbyzk(String tbyzk) {
		this.tbyzk = tbyzk;
	}

	public String getTxx() {
		return txx;
	}

	public void setTxx(String txx) {
		this.txx = txx;
	}

	public String getTtx() {
		return ttx;
	}

	public void setTtx(String ttx) {
		this.ttx = ttx;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public String getTxpdz() {
		return txpdz;
	}

	public void setTxpdz(String txpdz) {
		this.txpdz = txpdz;
	}

	public String getTcrSj() {
		return tcrSj;
	}

	public void setTcrSj(String tcrSj) {
		this.tcrSj = tcrSj;
	}

	public String getCrlx() {
		return crlx;
	}

	public void setCrlx(String crlx) {
		this.crlx = crlx;
	}

	public String getTcrlyd() {
		return tcrlyd;
	}

	public void setTcrlyd(String tcrlyd) {
		this.tcrlyd = tcrlyd;
	}

	public String getTagInfo() {
		return tagInfo;
	}

	public void setTagInfo(String tagInfo) {
		this.tagInfo = tagInfo;
	}

	public JSON getExpandInfo() {
		return expandInfo;
	}

	public void setExpandInfo(JSON expandInfo) {
		this.expandInfo = expandInfo;
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
		return "PersonInfoForm{" +
				"id=" + id +
				", gmsfhm='" + gmsfhm + '\'' +
				", txm='" + txm + '\'' +
				", tcym='" + tcym + '\'' +
				", tbmch='" + tbmch + '\'' +
				", xb='" + xb + '\'' +
				", tcsrq='" + tcsrq + '\'' +
				", tzzmm='" + tzzmm + '\'' +
				", tqfjgmzwz='" + tqfjgmzwz + '\'' +
				", gl='" + gl + '\'' +
				", tgssxdm='" + tgssxdm + '\'' +
				", tjghz='" + tjghz + '\'' +
				", thjdXzqhdm='" + thjdXzqhdm + '\'' +
				", hjdXzqhmc='" + hjdXzqhmc + '\'' +
				", thjdxz='" + thjdxz + '\'' +
				", thjGajgmc='" + thjGajgmc + '\'' +
				", tjzdXzqhdm='" + tjzdXzqhdm + '\'' +
				", jzdxz='" + jzdxz + '\'' +
				", tjud2_xzqhdm='" + tjud2_xzqhdm + '\'' +
				", txzzxz1='" + txzzxz1 + '\'' +
				", thh='" + thh + '\'' +
				", yhzgx='" + yhzgx + '\'' +
				", tcsdssxdm='" + tcsdssxdm + '\'' +
				", tcsdqhzx='" + tcsdqhzx + '\'' +
				", tcszQfrq='" + tcszQfrq + '\'' +
				", csdgj='" + csdgj + '\'' +
				", tsfzQfrq='" + tsfzQfrq + '\'' +
				", zjxy='" + zjxy + '\'' +
				", tlxdh='" + tlxdh + '\'' +
				", tlxdh2='" + tlxdh2 + '\'' +
				", tqqhm='" + tqqhm + '\'' +
				", wxhm='" + wxhm + '\'' +
				", tdzyxhm='" + tdzyxhm + '\'' +
				", hdqr='" + hdqr + '\'' +
				", tqlbslb='" + tqlbslb + '\'' +
				", tqlbsRq='" + tqlbsRq + '\'' +
				", tqlbsyy='" + tqlbsyy + '\'' +
				", qlbsssq='" + qlbsssq + '\'' +
				", tqlbsMlxxdz='" + tqlbsMlxxdz + '\'' +
				", tqlbzlb='" + tqlbzlb + '\'' +
				", tqlbzRq='" + tqlbzRq + '\'' +
				", qlbzyy='" + qlbzyy + '\'' +
				", tqlbzGajgjgdm='" + tqlbzGajgjgdm + '\'' +
				", tqlbzJlxdm='" + tqlbzJlxdm + '\'' +
				", tglbzMlph='" + tglbzMlph + '\'' +
				", czrBs='" + czrBs + '\'' +
				", thyzk='" + thyzk + '\'' +
				", sg='" + sg + '\'' +
				", twhcd='" + twhcd + '\'' +
				", tzy='" + tzy + '\'' +
				", tgzDwmc='" + tgzDwmc + '\'' +
				", zw='" + zw + '\'' +
				", tgrsf='" + tgrsf + '\'' +
				", tfssf='" + tfssf + '\'' +
				", xmpy='" + xmpy + '\'' +
				", bmpy='" + bmpy + '\'' +
				", tbz='" + tbz + '\'' +
				", ttmtzms='" + ttmtzms + '\'' +
				", tkytd='" + tkytd + '\'' +
				", tfwcs='" + tfwcs + '\'' +
				", tbd_rq='" + tbd_rq + '\'' +
				", bdyy='" + bdyy + '\'' +
				", tbyzk='" + tbyzk + '\'' +
				", txx='" + txx + '\'' +
				", ttx='" + ttx + '\'' +
				", lx='" + lx + '\'' +
				", txpdz='" + txpdz + '\'' +
				", tcrSj='" + tcrSj + '\'' +
				", crlx='" + crlx + '\'' +
				", tcrlyd='" + tcrlyd + '\'' +
				", tagInfo='" + tagInfo + '\'' +
				", expandInfo=" + expandInfo +
				", createdTime=" + createdTime +
				", updatedTime=" + updatedTime +
				'}';
	}
}
