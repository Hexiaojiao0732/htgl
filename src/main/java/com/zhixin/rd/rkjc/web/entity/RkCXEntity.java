package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;

public class RkCXEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String cr_ly;
	
	private Integer rkCount;
	
	private String sq;
	
	private Integer dqrkCount;
	
	private Integer sjlyCount;

	public Integer getDqrkCount() {
		return dqrkCount;
	}

	public void setDqrkCount(Integer dqrkCount) {
		this.dqrkCount = dqrkCount;
	}

	public Integer getSjlyCount() {
		return sjlyCount;
	}

	public void setSjlyCount(Integer sjlyCount) {
		this.sjlyCount = sjlyCount;
	}

	public String getCr_ly() {
		return cr_ly;
	}

	public void setCr_ly(String cr_ly) {
		this.cr_ly = cr_ly;
	}

	public Integer getRkCount() {
		return rkCount;
	}

	public void setRkCount(Integer rkCount) {
		this.rkCount = rkCount;
	}

	public String getSq() {
		return sq;
	}

	public void setSq(String sq) {
		this.sq = sq;
	}

	@Override
	public String toString() {
		return "RkCXEntity [cr_ly=" + cr_ly + ", rkCount=" + rkCount + ", sq=" + sq + ", dqrkCount=" + dqrkCount
				+ ", sjlyCount=" + sjlyCount + "]";
	}
	
	

}
