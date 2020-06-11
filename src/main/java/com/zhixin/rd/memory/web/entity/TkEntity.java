package com.zhixin.rd.memory.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.sql.rowset.Predicate;

public class TkEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;// 主键ID
	private  String mc;//名称
	private String tpdz;//图片地址（与信网部通讯关联）
	private  String ztId;//所属专题
	private String rwId;//所属人物
	private  String jlId;//所属记录
	private  String wjlx;//文件类型
	private String pssj;//拍摄时间
	private  String  psdd;//拍摄地点
	private  String jj;//简介
	private int gxzId;//贡献者ID
	private String ztmc;//专题名称
	private String jlmc;//记录名称
	private String rwxm;//人物姓名
	private String gxzxm;//贡献者姓名
	
	
	private  String  userId;//yonghu id
	private  int  sfGk;//是否公开
	private String syz;//所有者
	private String bz;//备注
	private int  tkZt;//图库状态 0未审核 1已审核
	public int getTkZt() {
		return tkZt;
	}
	public void setTkZt(int tkZt) {
		this.tkZt = tkZt;
	}
	public String getZtmc() {
		return ztmc;
	}
	public void setZtmc(String ztmc) {
		this.ztmc = ztmc;
	}
	public String getJlmc() {
		return jlmc;
	}
	public void setJlmc(String jlmc) {
		this.jlmc = jlmc;
	}
	public String getRwxm() {
		return rwxm;
	}
	public void setRwxm(String rwxm) {
		this.rwxm = rwxm;
	}
	public String getGxzxm() {
		return gxzxm;
	}
	public void setGxzxm(String gxzxm) {
		this.gxzxm = gxzxm;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public String getTpdz() {
		return tpdz;
	}
	public void setTpdz(String tpdz) {
		this.tpdz = tpdz;
	}
	public String getZtId() {
		return ztId;
	}
	public void setZtId(String ztId) {
		this.ztId = ztId;
	}
	public String getRwId() {
		return rwId;
	}
	public void setRwId(String rwId) {
		this.rwId = rwId;
	}
	public String getJlId() {
		return jlId;
	}
	public void setJlId(String jlId) {
		this.jlId = jlId;
	}
	public String getWjlx() {
		return wjlx;
	}
	public void setWjlx(String wjlx) {
		this.wjlx = wjlx;
	}
	public String getPssj() {
		return pssj;
	}
	public void setPssj(String pssj) {
		this.pssj = pssj;
	}
	public String getPsdd() {
		return psdd;
	}
	public void setPsdd(String psdd) {
		this.psdd = psdd;
	}
	public String getJj() {
		return jj;
	}
	public void setJj(String jj) {
		this.jj = jj;
	}
	public int getGxzId() {
		return gxzId;
	}
	public void setGxzId(int gxzId) {
		this.gxzId = gxzId;
	}
	@Override
	public String toString() {
		return "TkEntity [id=" + id + ", mc=" + mc + ", tpdz=" + tpdz + ", ztId=" + ztId + ", rwId=" + rwId + ", jlId="
				+ jlId + ", wjlx=" + wjlx + ", pssj=" + pssj + ", psdd=" + psdd + ", jj=" + jj + ", gxzId=" + gxzId
				+ ", ztmc=" + ztmc + ", jlmc=" + jlmc + ", rwxm=" + rwxm + ", gxzxm=" + gxzxm + ", tkZt=" + tkZt + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
