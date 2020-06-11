package com.zhixin.rd.rkjc.web.entity;

import java.util.Date;

public class CombogridEntity implements java.io.Serializable {

	private static final long serialVersionUID = -4783107711681656029L;

	private int id;

	private String serialNo;

	private String name;

	private String certificateNo;

	private int certificateTypeId;

	private int orderRequestId;

	private int caseType;

	private String caseNature;

	private Integer userId;

	private Integer status;

	private String sex;

	private String birth;

	private String nation;

	private String education;

	private String inPhotoId;

	private int personId;

	private int interrogateAreaId;

	private int lawCaseId;

	private int recordId;

	// 案件信息
	private Date involvedDate;

	private String involvedPeople;

	private String involvedAddress;

	private String involvedReason;

	private String type;

	private String caseNo;

	private String caseName;

	private String orderNo;

	private Date timenow;

	private Integer inUserId1;

	private String inUserNo1;

	private Integer inUserId2;

	private String inUserNo2;
	
	private String personInfo;

	private String cuffNo;
	private String policeName1;
	private String policeName2;
	
	private int policeId;
	
	public int getPoliceId() {
		return policeId;
	}

	public void setPoliceId(int policeId) {
		this.policeId = policeId;
	}

	public String getCuffNo() {
		return cuffNo;
	}

	public void setCuffNo(String cuffNo) {
		this.cuffNo = cuffNo;
	}

	private String policeCuffNo1;
	private String policeCuffNo2;
	public String getPoliceCuffNo1() {
		return policeCuffNo1;
	}

	public void setPoliceCuffNo1(String policeCuffNo1) {
		this.policeCuffNo1 = policeCuffNo1;
	}

	public String getPoliceCuffNo2() {
		return policeCuffNo2;
	}

	public void setPoliceCuffNo2(String policeCuffNo2) {
		this.policeCuffNo2 = policeCuffNo2;
	}

	@Override
	public String toString() {
		return "CombogridEntity [id=" + id + ", serialNo=" + serialNo + ", name=" + name + ", certificateNo="
				+ certificateNo + ", certificateTypeId=" + certificateTypeId + ", orderRequestId=" + orderRequestId
				+ ", caseType=" + caseType + ", caseNature=" + caseNature + ", userId=" + userId + ", status=" + status
				+ ", sex=" + sex + ", birth=" + birth + ", nation=" + nation + ", education=" + education
				+ ", personId=" + personId + ", interrogateAreaId=" + interrogateAreaId + ", lawCaseId=" + lawCaseId
				+ ", recordId=" + recordId + ", involvedDate=" + involvedDate + ", involvedPeople=" + involvedPeople
				+ ", involvedAddress=" + involvedAddress + ", involvedReason=" + involvedReason + ", type=" + type
				+ ", caseNo=" + caseNo + ", caseName=" + caseName + ", orderNo=" + orderNo + ", timenow=" + timenow
				+ ", inUserId1=" + inUserId1 + ", inUserNo1=" + inUserNo1 + ", inUserId2=" + inUserId2 + ", inUserNo2="
				+ inUserNo2 + ", personInfo=" + personInfo + ", cuffNo=" + cuffNo + ", policeName1=" + policeName1
				+ ", policeName2=" + policeName2 + ", policeId=" + policeId + ", policeCuffNo1=" + policeCuffNo1
				+ ", policeCuffNo2=" + policeCuffNo2 + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getInterrogateAreaId() {
		return interrogateAreaId;
	}

	public void setInterrogateAreaId(int interrogateAreaId) {
		this.interrogateAreaId = interrogateAreaId;
	}

	public int getLawCaseId() {
		return lawCaseId;
	}

	public void setLawCaseId(int lawCaseId) {
		this.lawCaseId = lawCaseId;
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	/*
	 * public String getInvolvedDate() { return involvedDate; }
	 * 
	 * public void setInvolvedDate(String involvedDate) { this.involvedDate =
	 * involvedDate; }
	 */

	public String getInvolvedPeople() {
		return involvedPeople;
	}

	public void setInvolvedPeople(String involvedPeople) {
		this.involvedPeople = involvedPeople;
	}

	public String getInvolvedAddress() {
		return involvedAddress;
	}

	public void setInvolvedAddress(String involvedAddress) {
		this.involvedAddress = involvedAddress;
	}

	public String getInvolvedReason() {
		return involvedReason;
	}

	public void setInvolvedReason(String involvedReason) {
		this.involvedReason = involvedReason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public Date getInvolvedDate() {
		return involvedDate;
	}

	public void setInvolvedDate(Date involvedDate) {
		this.involvedDate = involvedDate;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getTimenow() {
		return timenow;
	}

	public void setTimenow(Date timenow) {
		this.timenow = timenow;
	}

	public Integer getInUserId1() {
		return inUserId1;
	}

	public void setInUserId1(Integer inUserId1) {
		this.inUserId1 = inUserId1;
	}

	public String getInUserNo1() {
		return inUserNo1;
	}

	public void setInUserNo1(String inUserNo1) {
		this.inUserNo1 = inUserNo1;
	}

	public Integer getInUserId2() {
		return inUserId2;
	}

	public void setInUserId2(Integer inUserId2) {
		this.inUserId2 = inUserId2;
	}

	public String getInUserNo2() {
		return inUserNo2;
	}

	public void setInUserNo2(String inUserNo2) {
		this.inUserNo2 = inUserNo2;
	}

	public int getCertificateTypeId() {
		return certificateTypeId;
	}

	public void setCertificateTypeId(int certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
	}

	public int getOrderRequestId() {
		return orderRequestId;
	}

	public void setOrderRequestId(int orderRequestId) {
		this.orderRequestId = orderRequestId;
	}

	public int getCaseType() {
		return caseType;
	}

	public void setCaseType(int caseType) {
		this.caseType = caseType;
	}

	public String getCaseNature() {
		return caseNature;
	}

	public void setCaseNature(String caseNature) {
		this.caseNature = caseNature;
	}

	public String getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(String personInfo) {
		this.personInfo = personInfo;
	}

	public String getPoliceName1() {
		return policeName1;
	}

	public void setPoliceName1(String policeName1) {
		this.policeName1 = policeName1;
	}

	public String getPoliceName2() {
		return policeName2;
	}

	public void setPoliceName2(String policeName2) {
		this.policeName2 = policeName2;
	}


	public String getInPhotoId() {
		return inPhotoId;
	}

	public void setInPhotoId(String inPhotoId) {
		this.inPhotoId = inPhotoId;
	}
}
