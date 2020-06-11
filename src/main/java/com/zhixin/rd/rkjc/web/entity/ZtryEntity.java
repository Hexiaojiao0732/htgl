package com.zhixin.rd.rkjc.web.entity;

import java.util.Date;

/**
 * 作者：yangyk
 * 时间： 2017-3-13
 * 名   : Ztry
 */
public class ZtryEntity implements java.io.Serializable{
	private String ryid;	//人员标识
	private String rybh;	//人员编号
	private String jrybh;	//旧人员编号
	private String xm;		//姓名
	private String xbDm;	//性别代码
	private Date csrqSx;	//出生日期
	private Date csrqXx;	//出生日期下限
	private String sfzh;	//身份证号
	private String mzDm;	//民族代码
	private Integer sg;		//身高
	private String kyDm;	//口音代码
	private String zyDm;	//职业代码
	private String hjdqh;	//户籍地区划
	private String hjdXz;	//户籍地详址
	private String xzdQh;	//显著地区划
	private String xzdXz;	//现住地详址
	private String jgQh;	//籍贯区划
	private String jqXz;	//籍贯详址
	private String zwbh;	//指纹编号
	private String dna;		//dna
	private String ryfjxx;
	private String ajbh;
	private String ajlbDm;
	private String ztlxDm;	//在逃类型代码
	private long jj;		//奖金
	private String jyaq;
	private String tprq;	//逃跑日期
	private String tpfxQh;	//逃跑方向
	private String lasj;
	private String laDwqh;
	private String laDwdm;
	private String laDwxc;
	private String laDwxtDm;
	private String zbDwqh;
	private String zbDwdm;
	private String zbDwxc;
	private String zblxr;
	private String zblxfs;
	private String djTbr;	//登记填表人
	private String djRq;	//登记日期
	private String djSpr;	//登记审批人
	private String dbjbDm;	//督捕级别代码
	private String tjlbh;	
	private String blyy;	//补录原因
	private String blbs;	//补录标识
	private String sp;		//审批标识
	private String spyy;	//审批未通过
	private String lrDwdm;	//录入单位
	private String lrr;		//录入人
	private String lrsj;	//录入时间
	private String xgDwdm;	//修改时间
	private String xgr;		//修改人
	private String xgsj;	//修改时间
	private String scDwdm;	//删除单位代码
	private String scr;		//删除人
	private String scsj;	//删除时间
	private String scDwxc;	//删除单位详称
	private String scDwxtDm;//删除单位业务系统
	private String scSpr;	//删除审批人
	private String zkbz;	//转库备注
	private String rbksjDj;	//登记入部库时间
	private String rbksjCx;	//撤销入部库时间
	private String rbksjSc;	//删除入部库时间
	private String syDwdm;	//责任单位代码
	private String sbsj;	//上报时间
	
	public String getRyid() {
		return ryid;
	}
	public void setRyid(String ryid) {
		this.ryid = ryid;
	}
	public String getRybh() {
		return rybh;
	}
	public void setRybh(String rybh) {
		this.rybh = rybh;
	}
	public String getJrybh() {
		return jrybh;
	}
	public void setJrybh(String jrybh) {
		this.jrybh = jrybh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXbDm() {
		return xbDm;
	}
	public void setXbDm(String xbDm) {
		this.xbDm = xbDm;
	}
	public Date getCsrqSx() {
		return csrqSx;
	}
	public void setCsrqSx(Date csrqSx) {
		this.csrqSx = csrqSx;
	}
	public Date getCsrqXx() {
		return csrqXx;
	}
	public void setCsrqXx(Date csrqXx) {
		this.csrqXx = csrqXx;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getMzDm() {
		return mzDm;
	}
	public void setMzDm(String mzDm) {
		this.mzDm = mzDm;
	}
	public Integer getSg() {
		return sg;
	}
	public void setSg(Integer sg) {
		this.sg = sg;
	}
	public String getKyDm() {
		return kyDm;
	}
	public void setKyDm(String kyDm) {
		this.kyDm = kyDm;
	}
	public String getZyDm() {
		return zyDm;
	}
	public void setZyDm(String zyDm) {
		this.zyDm = zyDm;
	}
	public String getHjdqh() {
		return hjdqh;
	}
	public void setHjdqh(String hjdqh) {
		this.hjdqh = hjdqh;
	}
	public String getHjdXz() {
		return hjdXz;
	}
	public void setHjdXz(String hjdXz) {
		this.hjdXz = hjdXz;
	}
	public String getXzdQh() {
		return xzdQh;
	}
	public void setXzdQh(String xzdQh) {
		this.xzdQh = xzdQh;
	}
	public String getXzdXz() {
		return xzdXz;
	}
	public void setXzdXz(String xzdXz) {
		this.xzdXz = xzdXz;
	}
	public String getJgQh() {
		return jgQh;
	}
	public void setJgQh(String jgQh) {
		this.jgQh = jgQh;
	}
	public String getJqXz() {
		return jqXz;
	}
	public void setJqXz(String jqXz) {
		this.jqXz = jqXz;
	}
	public String getZwbh() {
		return zwbh;
	}
	public void setZwbh(String zwbh) {
		this.zwbh = zwbh;
	}
	public String getDna() {
		return dna;
	}
	public void setDna(String dna) {
		this.dna = dna;
	}
	public String getRyfjxx() {
		return ryfjxx;
	}
	public void setRyfjxx(String ryfjxx) {
		this.ryfjxx = ryfjxx;
	}
	public String getAjbh() {
		return ajbh;
	}
	public void setAjbh(String ajbh) {
		this.ajbh = ajbh;
	}
	public String getAjlbDm() {
		return ajlbDm;
	}
	public void setAjlbDm(String ajlbDm) {
		this.ajlbDm = ajlbDm;
	}
	public String getZtlxDm() {
		return ztlxDm;
	}
	public void setZtlxDm(String ztlxDm) {
		this.ztlxDm = ztlxDm;
	}
	public long getJj() {
		return jj;
	}
	public void setJj(long jj) {
		this.jj = jj;
	}
	public String getJyaq() {
		return jyaq;
	}
	public void setJyaq(String jyaq) {
		this.jyaq = jyaq;
	}
	public String getTprq() {
		return tprq;
	}
	public void setTprq(String tprq) {
		this.tprq = tprq;
	}
	public String getTpfxQh() {
		return tpfxQh;
	}
	public void setTpfxQh(String tpfxQh) {
		this.tpfxQh = tpfxQh;
	}
	public String getLasj() {
		return lasj;
	}
	public void setLasj(String lasj) {
		this.lasj = lasj;
	}
	public String getLaDwqh() {
		return laDwqh;
	}
	public void setLaDwqh(String laDwqh) {
		this.laDwqh = laDwqh;
	}
	public String getLaDwdm() {
		return laDwdm;
	}
	public void setLaDwdm(String laDwdm) {
		this.laDwdm = laDwdm;
	}
	public String getLaDwxc() {
		return laDwxc;
	}
	public void setLaDwxc(String laDwxc) {
		this.laDwxc = laDwxc;
	}
	public String getLaDwxtDm() {
		return laDwxtDm;
	}
	public void setLaDwxtDm(String laDwxtDm) {
		this.laDwxtDm = laDwxtDm;
	}
	public String getZbDwqh() {
		return zbDwqh;
	}
	public void setZbDwqh(String zbDwqh) {
		this.zbDwqh = zbDwqh;
	}
	public String getZbDwdm() {
		return zbDwdm;
	}
	public void setZbDwdm(String zbDwdm) {
		this.zbDwdm = zbDwdm;
	}
	public String getZbDwxc() {
		return zbDwxc;
	}
	public void setZbDwxc(String zbDwxc) {
		this.zbDwxc = zbDwxc;
	}
	public String getZblxr() {
		return zblxr;
	}
	public void setZblxr(String zblxr) {
		this.zblxr = zblxr;
	}
	public String getZblxfs() {
		return zblxfs;
	}
	public void setZblxfs(String zblxfs) {
		this.zblxfs = zblxfs;
	}
	public String getDjTbr() {
		return djTbr;
	}
	public void setDjTbr(String djTbr) {
		this.djTbr = djTbr;
	}
	public String getDjRq() {
		return djRq;
	}
	public void setDjRq(String djRq) {
		this.djRq = djRq;
	}
	public String getDjSpr() {
		return djSpr;
	}
	public void setDjSpr(String djSpr) {
		this.djSpr = djSpr;
	}
	public String getDbjbDm() {
		return dbjbDm;
	}
	public void setDbjbDm(String dbjbDm) {
		this.dbjbDm = dbjbDm;
	}
	public String getTjlbh() {
		return tjlbh;
	}
	public void setTjlbh(String tjlbh) {
		this.tjlbh = tjlbh;
	}
	public String getBlyy() {
		return blyy;
	}
	public void setBlyy(String blyy) {
		this.blyy = blyy;
	}
	public String getBlbs() {
		return blbs;
	}
	public void setBlbs(String blbs) {
		this.blbs = blbs;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public String getSpyy() {
		return spyy;
	}
	public void setSpyy(String spyy) {
		this.spyy = spyy;
	}
	public String getLrDwdm() {
		return lrDwdm;
	}
	public void setLrDwdm(String lrDwdm) {
		this.lrDwdm = lrDwdm;
	}
	public String getLrr() {
		return lrr;
	}
	public void setLrr(String lrr) {
		this.lrr = lrr;
	}
	public String getLrsj() {
		return lrsj;
	}
	public void setLrsj(String lrsj) {
		this.lrsj = lrsj;
	}
	public String getXgDwdm() {
		return xgDwdm;
	}
	public void setXgDwdm(String xgDwdm) {
		this.xgDwdm = xgDwdm;
	}
	public String getXgr() {
		return xgr;
	}
	public void setXgr(String xgr) {
		this.xgr = xgr;
	}
	public String getXgsj() {
		return xgsj;
	}
	public void setXgsj(String xgsj) {
		this.xgsj = xgsj;
	}
	public String getScDwdm() {
		return scDwdm;
	}
	public void setScDwdm(String scDwdm) {
		this.scDwdm = scDwdm;
	}
	public String getScr() {
		return scr;
	}
	public void setScr(String scr) {
		this.scr = scr;
	}
	public String getScsj() {
		return scsj;
	}
	public void setScsj(String scsj) {
		this.scsj = scsj;
	}
	public String getScDwxc() {
		return scDwxc;
	}
	public void setScDwxc(String scDwxc) {
		this.scDwxc = scDwxc;
	}
	public String getScDwxtDm() {
		return scDwxtDm;
	}
	public void setScDwxtDm(String scDwxtDm) {
		this.scDwxtDm = scDwxtDm;
	}
	public String getScSpr() {
		return scSpr;
	}
	public void setScSpr(String scSpr) {
		this.scSpr = scSpr;
	}
	public String getZkbz() {
		return zkbz;
	}
	public void setZkbz(String zkbz) {
		this.zkbz = zkbz;
	}
	public String getRbksjDj() {
		return rbksjDj;
	}
	public void setRbksjDj(String rbksjDj) {
		this.rbksjDj = rbksjDj;
	}
	public String getRbksjCx() {
		return rbksjCx;
	}
	public void setRbksjCx(String rbksjCx) {
		this.rbksjCx = rbksjCx;
	}
	public String getRbksjSc() {
		return rbksjSc;
	}
	public void setRbksjSc(String rbksjSc) {
		this.rbksjSc = rbksjSc;
	}
	public String getSyDwdm() {
		return syDwdm;
	}
	public void setSyDwdm(String syDwdm) {
		this.syDwdm = syDwdm;
	}
	public String getSbsj() {
		return sbsj;
	}
	public void setSbsj(String sbsj) {
		this.sbsj = sbsj;
	}
	public ZtryEntity(String ryid, String rybh, String jrybh, String xm, String xbDm,
			Date csrqSx, Date csrqXx, String sfzh, String mzDm, Integer sg,
			String kyDm, String zyDm, String hjdqh, String hjdXz, String xzdQh,
			String xzdXz, String jgQh, String jqXz, String zwbh, String dna,
			String ryfjxx, String ajbh, String ajlbDm, String ztlxDm, long jj,
			String jyaq, String tprq, String tpfxQh, String lasj,
			String laDwqh, String laDwdm, String laDwxc, String laDwxtDm,
			String zbDwqh, String zbDwdm, String zbDwxc, String zblxr,
			String zblxfs, String djTbr, String djRq, String djSpr,
			String dbjbDm, String tjlbh, String blyy, String blbs, String sp,
			String spyy, String lrDwdm, String lrr, String lrsj, String xgDwdm,
			String xgr, String xgsj, String scDwdm, String scr, String scsj,
			String scDwxc, String scDwxtDm, String scSpr, String zkbz,
			String rbksjDj, String rbksjCx, String rbksjSc, String syDwdm,
			String sbsj) {
		super();
		this.ryid = ryid;
		this.rybh = rybh;
		this.jrybh = jrybh;
		this.xm = xm;
		this.xbDm = xbDm;
		this.csrqSx = csrqSx;
		this.csrqXx = csrqXx;
		this.sfzh = sfzh;
		this.mzDm = mzDm;
		this.sg = sg;
		this.kyDm = kyDm;
		this.zyDm = zyDm;
		this.hjdqh = hjdqh;
		this.hjdXz = hjdXz;
		this.xzdQh = xzdQh;
		this.xzdXz = xzdXz;
		this.jgQh = jgQh;
		this.jqXz = jqXz;
		this.zwbh = zwbh;
		this.dna = dna;
		this.ryfjxx = ryfjxx;
		this.ajbh = ajbh;
		this.ajlbDm = ajlbDm;
		this.ztlxDm = ztlxDm;
		this.jj = jj;
		this.jyaq = jyaq;
		this.tprq = tprq;
		this.tpfxQh = tpfxQh;
		this.lasj = lasj;
		this.laDwqh = laDwqh;
		this.laDwdm = laDwdm;
		this.laDwxc = laDwxc;
		this.laDwxtDm = laDwxtDm;
		this.zbDwqh = zbDwqh;
		this.zbDwdm = zbDwdm;
		this.zbDwxc = zbDwxc;
		this.zblxr = zblxr;
		this.zblxfs = zblxfs;
		this.djTbr = djTbr;
		this.djRq = djRq;
		this.djSpr = djSpr;
		this.dbjbDm = dbjbDm;
		this.tjlbh = tjlbh;
		this.blyy = blyy;
		this.blbs = blbs;
		this.sp = sp;
		this.spyy = spyy;
		this.lrDwdm = lrDwdm;
		this.lrr = lrr;
		this.lrsj = lrsj;
		this.xgDwdm = xgDwdm;
		this.xgr = xgr;
		this.xgsj = xgsj;
		this.scDwdm = scDwdm;
		this.scr = scr;
		this.scsj = scsj;
		this.scDwxc = scDwxc;
		this.scDwxtDm = scDwxtDm;
		this.scSpr = scSpr;
		this.zkbz = zkbz;
		this.rbksjDj = rbksjDj;
		this.rbksjCx = rbksjCx;
		this.rbksjSc = rbksjSc;
		this.syDwdm = syDwdm;
		this.sbsj = sbsj;
	}
	public ZtryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ztry [ryid=" + ryid + ", rybh=" + rybh + ", jrybh=" + jrybh
				+ ", xm=" + xm + ", xbDm=" + xbDm + ", csrqSx=" + csrqSx
				+ ", csrqXx=" + csrqXx + ", sfzh=" + sfzh + ", mzDm=" + mzDm
				+ ", sg=" + sg + ", kyDm=" + kyDm + ", zyDm=" + zyDm
				+ ", hjdqh=" + hjdqh + ", hjdXz=" + hjdXz + ", xzdQh=" + xzdQh
				+ ", xzdXz=" + xzdXz + ", jgQh=" + jgQh + ", jqXz=" + jqXz
				+ ", zwbh=" + zwbh + ", dna=" + dna + ", ryfjxx=" + ryfjxx
				+ ", ajbh=" + ajbh + ", ajlbDm=" + ajlbDm + ", ztlxDm="
				+ ztlxDm + ", jj=" + jj + ", jyaq=" + jyaq + ", tprq=" + tprq
				+ ", tpfxQh=" + tpfxQh + ", lasj=" + lasj + ", laDwqh="
				+ laDwqh + ", laDwdm=" + laDwdm + ", laDwxc=" + laDwxc
				+ ", laDwxtDm=" + laDwxtDm + ", zbDwqh=" + zbDwqh + ", zbDwdm="
				+ zbDwdm + ", zbDwxc=" + zbDwxc + ", zblxr=" + zblxr
				+ ", zblxfs=" + zblxfs + ", djTbr=" + djTbr + ", djRq=" + djRq
				+ ", djSpr=" + djSpr + ", dbjbDm=" + dbjbDm + ", tjlbh="
				+ tjlbh + ", blyy=" + blyy + ", blbs=" + blbs + ", sp=" + sp
				+ ", spyy=" + spyy + ", lrDwdm=" + lrDwdm + ", lrr=" + lrr
				+ ", lrsj=" + lrsj + ", xgDwdm=" + xgDwdm + ", xgr=" + xgr
				+ ", xgsj=" + xgsj + ", scDwdm=" + scDwdm + ", scr=" + scr
				+ ", scsj=" + scsj + ", scDwxc=" + scDwxc + ", scDwxtDm="
				+ scDwxtDm + ", scSpr=" + scSpr + ", zkbz=" + zkbz
				+ ", rbksjDj=" + rbksjDj + ", rbksjCx=" + rbksjCx
				+ ", rbksjSc=" + rbksjSc + ", syDwdm=" + syDwdm + ", sbsj="
				+ sbsj + "]";
	}
	
}
