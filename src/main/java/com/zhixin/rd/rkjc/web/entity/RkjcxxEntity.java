package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * 人口基础信息
 * Created by yangyk on 17-7-16
 */
public class RkjcxxEntity implements Serializable {

		private static final long serialVersionUID = 1L;

		/** zjhm 证件证号 */
		private String zjhm;

		/** xm 姓名 */
		private String xm;

		/** wwx 外文姓 */
		private String wwx;

		/** wwm 外文名 */
		private String wwm;

		/** cym 曾用名 */
		private String cym;

		/** bmch 别名/绰号 */
		private String bmch;

		/** xb 性别 */
		private String xb;

		/** csrq 出生日期 */
		private Timestamp csrq;

		/** mz 民族 */
		private String mz;

		/** zjxy 宗教信仰 */
		private String zjxy;

		/** sg 身高 */
		private String sg;

		/** xx 血型 */
		private String xx;

		/** jgGjdm 籍贯_国籍代码 */
		private String jgGjdm;

		/** jgGj 籍贯_国籍 */
		private String jgGj;

		/** jgssxdm 籍贯（省市县）代码 */
		private String jgssxdm;

		/** jgssx 籍贯（省市县） */
		private String jgssx;

		/** csdGjdm 出生地_国籍代码 */
		private String csdGjdm;

		/** csdGj 出生地_国籍 */
		private String csdGj;

		/** csdssxdm 出生地_省市县（区）代码 */
		private String csdssxdm;

		/** csdssx 出生地_省市县（区） */
		private String csdssx;

		/** csdxz 出生地详址 */
		private String csdxz;

		/** hjdSssxqdm 户籍地_所属市县（区）代码 */
		private String hjdSssxqdm;

		/** hjdSssxq 户籍地_所属市县（区） */
		private String hjdSssxq;

		/** hjdSsgajgdm 户籍地_所属公安机关代码 */
		private String hjdSsgajgdm;

		/** hjdSsgajg 户籍地_所属公安机关 */
		private String hjdSsgajg;

		/** hjdXz 户籍地详址 */
		private String hjdXz;

		/** hkxzfldm 户口性质分类代码 */
		private String hkxzfldm;

		/** hkxz 户口性质 */
		private String hkxz;

		/** hh 户号 */
		private String hh;

		/** yhzgxdm 与户主关系代码 */
		private String yhzgxdm;

		/** yhzgx 与户主关系 */
		private String yhzgx;

		/** xzzXz 现住址 */
		private String xzzXz;

		/** xl 学历 */
		private String xl;

		/** zzmm 政治面貌 */
		private String zzmm;

		/** hyzk 婚姻状况 */
		private String hyzk;

		/** byzk 兵役状况 */
		private String byzk;

		/** zy 职业 */
		private String zy;

		/** zw 职务 */
		private String zw;

		/** grsf 个人身份 */
		private String grsf;

		/** fwcs 服务处所 */
		private String fwcs;

		/** swrq 死亡日期 */
		private Timestamp swrq;

		/** czrkbs  */
		private String czrkbs;

		/** zxsj 注销日期 */
		private Timestamp zxsj;

		/** jlsj 建立时间 */
		private Timestamp jlsj;

		/** gxsj 更新时间 */
		private Timestamp gxsj;

		/** cyzjdm 常用证件代码 */
		private String cyzjdm;

		/** rylbdm  */
		private String rylbdm;

		/** 照片URL*/
		private String zpURL;

		public String getZjhm() {
			return zjhm;
		}

		public void setZjhm(String zjhm) {
			this.zjhm = zjhm;
		}

		public String getXm() {
			return xm;
		}

		public void setXm(String xm) {
			this.xm = xm;
		}

		public String getWwx() {
			return wwx;
		}

		public void setWwx(String wwx) {
			this.wwx = wwx;
		}

		public String getWwm() {
			return wwm;
		}

		public void setWwm(String wwm) {
			this.wwm = wwm;
		}

		public String getCym() {
			return cym;
		}

		public void setCym(String cym) {
			this.cym = cym;
		}

		public String getBmch() {
			return bmch;
		}

		public void setBmch(String bmch) {
			this.bmch = bmch;
		}

		public String getXb() {
			return xb;
		}

		public void setXb(String xb) {
			this.xb = xb;
		}

		public Timestamp getCsrq() {
			return csrq;
		}

		public void setCsrq(Timestamp csrq) {
			this.csrq = csrq;
		}

		public String getMz() {
			return mz;
		}

		public void setMz(String mz) {
			this.mz = mz;
		}

		public String getZjxy() {
			return zjxy;
		}

		public void setZjxy(String zjxy) {
			this.zjxy = zjxy;
		}

		public String getSg() {
			return sg;
		}

		public void setSg(String sg) {
			this.sg = sg;
		}

		public String getXx() {
			return xx;
		}

		public void setXx(String xx) {
			this.xx = xx;
		}

		public String getJgGjdm() {
			return jgGjdm;
		}

		public void setJgGjdm(String jgGjdm) {
			this.jgGjdm = jgGjdm;
		}

		public String getJgGj() {
			return jgGj;
		}

		public void setJgGj(String jgGj) {
			this.jgGj = jgGj;
		}

		public String getJgssxdm() {
			return jgssxdm;
		}

		public void setJgssxdm(String jgssxdm) {
			this.jgssxdm = jgssxdm;
		}

		public String getJgssx() {
			return jgssx;
		}

		public void setJgssx(String jgssx) {
			this.jgssx = jgssx;
		}

		public String getCsdGjdm() {
			return csdGjdm;
		}

		public void setCsdGjdm(String csdGjdm) {
			this.csdGjdm = csdGjdm;
		}

		public String getCsdGj() {
			return csdGj;
		}

		public void setCsdGj(String csdGj) {
			this.csdGj = csdGj;
		}

		public String getCsdssxdm() {
			return csdssxdm;
		}

		public void setCsdssxdm(String csdssxdm) {
			this.csdssxdm = csdssxdm;
		}

		public String getCsdssx() {
			return csdssx;
		}

		public void setCsdssx(String csdssx) {
			this.csdssx = csdssx;
		}

		public String getCsdxz() {
			return csdxz;
		}

		public void setCsdxz(String csdxz) {
			this.csdxz = csdxz;
		}

		public String getHjdSssxqdm() {
			return hjdSssxqdm;
		}

		public void setHjdSssxqdm(String hjdSssxqdm) {
			this.hjdSssxqdm = hjdSssxqdm;
		}

		public String getHjdSssxq() {
			return hjdSssxq;
		}

		public void setHjdSssxq(String hjdSssxq) {
			this.hjdSssxq = hjdSssxq;
		}

		public String getHjdSsgajgdm() {
			return hjdSsgajgdm;
		}

		public void setHjdSsgajgdm(String hjdSsgajgdm) {
			this.hjdSsgajgdm = hjdSsgajgdm;
		}

		public String getHjdSsgajg() {
			return hjdSsgajg;
		}

		public void setHjdSsgajg(String hjdSsgajg) {
			this.hjdSsgajg = hjdSsgajg;
		}

		public String getHjdXz() {
			return hjdXz;
		}

		public void setHjdXz(String hjdXz) {
			this.hjdXz = hjdXz;
		}

		public String getHkxzfldm() {
			return hkxzfldm;
		}

		public void setHkxzfldm(String hkxzfldm) {
			this.hkxzfldm = hkxzfldm;
		}

		public String getHkxz() {
			return hkxz;
		}

		public void setHkxz(String hkxz) {
			this.hkxz = hkxz;
		}

		public String getHh() {
			return hh;
		}

		public void setHh(String hh) {
			this.hh = hh;
		}

		public String getYhzgxdm() {
			return yhzgxdm;
		}

		public void setYhzgxdm(String yhzgxdm) {
			this.yhzgxdm = yhzgxdm;
		}

		public String getYhzgx() {
			return yhzgx;
		}

		public void setYhzgx(String yhzgx) {
			this.yhzgx = yhzgx;
		}

		public String getXzzXz() {
			return xzzXz;
		}

		public void setXzzXz(String xzzXz) {
			this.xzzXz = xzzXz;
		}

		public String getXl() {
			return xl;
		}

		public void setXl(String xl) {
			this.xl = xl;
		}

		public String getZzmm() {
			return zzmm;
		}

		public void setZzmm(String zzmm) {
			this.zzmm = zzmm;
		}

		public String getHyzk() {
			return hyzk;
		}

		public void setHyzk(String hyzk) {
			this.hyzk = hyzk;
		}

		public String getByzk() {
			return byzk;
		}

		public void setByzk(String byzk) {
			this.byzk = byzk;
		}

		public String getZy() {
			return zy;
		}

		public void setZy(String zy) {
			this.zy = zy;
		}

		public String getZw() {
			return zw;
		}

		public void setZw(String zw) {
			this.zw = zw;
		}

		public String getGrsf() {
			return grsf;
		}

		public void setGrsf(String grsf) {
			this.grsf = grsf;
		}

		public String getFwcs() {
			return fwcs;
		}

		public void setFwcs(String fwcs) {
			this.fwcs = fwcs;
		}

		public Timestamp getSwrq() {
			return swrq;
		}

		public void setSwrq(Timestamp swrq) {
			this.swrq = swrq;
		}

		public String getCzrkbs() {
			return czrkbs;
		}

		public void setCzrkbs(String czrkbs) {
			this.czrkbs = czrkbs;
		}

		public Timestamp getZxsj() {
			return zxsj;
		}

		public void setZxsj(Timestamp zxsj) {
			this.zxsj = zxsj;
		}

		public Timestamp getJlsj() {
			return jlsj;
		}

		public void setJlsj(Timestamp jlsj) {
			this.jlsj = jlsj;
		}

		public Timestamp getGxsj() {
			return gxsj;
		}

		public void setGxsj(Timestamp gxsj) {
			this.gxsj = gxsj;
		}

		public String getCyzjdm() {
			return cyzjdm;
		}

		public void setCyzjdm(String cyzjdm) {
			this.cyzjdm = cyzjdm;
		}

		public String getRylbdm() {
			return rylbdm;
		}

		public void setRylbdm(String rylbdm) {
			this.rylbdm = rylbdm;
		}

	public String getZpURL() {
		return zpURL;
	}

	public void setZpURL(String zpURL) {
		this.zpURL = zpURL;
	}

	@Override
	public String toString() {
		return "RkjcxxEntity{" +
				"zjhm='" + zjhm + '\'' +
				", xm='" + xm + '\'' +
				", wwx='" + wwx + '\'' +
				", wwm='" + wwm + '\'' +
				", cym='" + cym + '\'' +
				", bmch='" + bmch + '\'' +
				", xb='" + xb + '\'' +
				", csrq=" + csrq +
				", mz='" + mz + '\'' +
				", zjxy='" + zjxy + '\'' +
				", sg='" + sg + '\'' +
				", xx='" + xx + '\'' +
				", jgGjdm='" + jgGjdm + '\'' +
				", jgGj='" + jgGj + '\'' +
				", jgssxdm='" + jgssxdm + '\'' +
				", jgssx='" + jgssx + '\'' +
				", csdGjdm='" + csdGjdm + '\'' +
				", csdGj='" + csdGj + '\'' +
				", csdssxdm='" + csdssxdm + '\'' +
				", csdssx='" + csdssx + '\'' +
				", csdxz='" + csdxz + '\'' +
				", hjdSssxqdm='" + hjdSssxqdm + '\'' +
				", hjdSssxq='" + hjdSssxq + '\'' +
				", hjdSsgajgdm='" + hjdSsgajgdm + '\'' +
				", hjdSsgajg='" + hjdSsgajg + '\'' +
				", hjdXz='" + hjdXz + '\'' +
				", hkxzfldm='" + hkxzfldm + '\'' +
				", hkxz='" + hkxz + '\'' +
				", hh='" + hh + '\'' +
				", yhzgxdm='" + yhzgxdm + '\'' +
				", yhzgx='" + yhzgx + '\'' +
				", xzzXz='" + xzzXz + '\'' +
				", xl='" + xl + '\'' +
				", zzmm='" + zzmm + '\'' +
				", hyzk='" + hyzk + '\'' +
				", byzk='" + byzk + '\'' +
				", zy='" + zy + '\'' +
				", zw='" + zw + '\'' +
				", grsf='" + grsf + '\'' +
				", fwcs='" + fwcs + '\'' +
				", swrq=" + swrq +
				", czrkbs='" + czrkbs + '\'' +
				", zxsj=" + zxsj +
				", jlsj=" + jlsj +
				", gxsj=" + gxsj +
				", cyzjdm='" + cyzjdm + '\'' +
				", rylbdm='" + rylbdm + '\'' +
				", zpURL='" + zpURL + '\'' +
				'}';
	}
}
