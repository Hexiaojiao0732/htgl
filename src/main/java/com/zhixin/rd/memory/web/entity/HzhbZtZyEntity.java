package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.sql.rowset.Predicate;

public class HzhbZtZyEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;// ID
	private String wjmc;//文件名称
	private String sfr;//受访人
	private String cfr;//采访人
	private String pssj;//拍摄时间
	private String gzry;//工作人员
	private String psdd;//拍摄地点
	private String zy;//摘要
	private  String  glrw;//关联人物
	private String gldd;//关联地点
	private String zyDz;//摘要地址
	private  int  zyLx;//摘要类型1视频 2音频 3文档 4图片
	private  String hzhbZtId;//所属合作伙伴专题4
	private  int zyZt;//资源状态 0 未审核1 已审核
	private String zp; //照片
	private String zybzfc;//资源部字符串

	public String getZp() {
		return zp;
	}
	public void setZp(String zp) {
		this.zp = zp;
	}
	public String getZybzfc() {
		return zybzfc;
	}
	public void setZybzfc(String zybzfc) {
		this.zybzfc = zybzfc;
	}
	private  String hzhbztmc;
	public String getHzhbztmc() {
		return hzhbztmc;
	}
	public void setHzhbztmc(String hzhbztmc) {
		this.hzhbztmc = hzhbztmc;
	}
	public int getZyLx() {
		return zyLx;
	}
	public int getZyZt() {
		return zyZt;
	}
	public void setZyZt(int zyZt) {
		this.zyZt = zyZt;
	}
	public void setZyLx(int zyLx) {
		this.zyLx = zyLx;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWjmc() {
		return wjmc;
	}
	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}
	public String getSfr() {
		return sfr;
	}
	public void setSfr(String sfr) {
		this.sfr = sfr;
	}
	public String getCfr() {
		return cfr;
	}
	public void setCfr(String cfr) {
		this.cfr = cfr;
	}
	public String getPssj() {
		return pssj;
	}
	public void setPssj(String pssj) {
		this.pssj = pssj;
	}
	public String getGzry() {
		return gzry;
	}
	public void setGzry(String gzry) {
		this.gzry = gzry;
	}
	public String getPsdd() {
		return psdd;
	}
	public void setPsdd(String psdd) {
		this.psdd = psdd;
	}
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getGlrw() {
		return glrw;
	}
	public void setGlrw(String glrw) {
		this.glrw = glrw;
	}
	public String getGldd() {
		return gldd;
	}
	public void setGldd(String gldd) {
		this.gldd = gldd;
	}
	public String getZyDz() {
		return zyDz;
	}
	public void setZyDz(String zyDz) {
		this.zyDz = zyDz;
	}
	public String getHzhbZtId() {
		return hzhbZtId;
	}
	public void setHzhbZtId(String hzhbZtId) {
		this.hzhbZtId = hzhbZtId;
	}
	@Override
	public String toString() {
		return "HzhbZtZyEntity [id=" + id + ", wjmc=" + wjmc + ", sfr=" + sfr + ", cfr=" + cfr + ", pssj=" + pssj
				+ ", gzry=" + gzry + ", psdd=" + psdd + ", zy=" + zy + ", glrw=" + glrw + ", gldd=" + gldd + ", zyDz="
				+ zyDz + ", zyLx=" + zyLx + ", hzhbZtId=" + hzhbZtId + ", zyZt=" + zyZt + ", zp=" + zp + ", zybzfc="
				+ zybzfc  + ", hzhbztmc=" + hzhbztmc + "]";
	}
	
}
