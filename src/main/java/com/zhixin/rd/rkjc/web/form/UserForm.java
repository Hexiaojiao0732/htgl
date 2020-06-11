package com.zhixin.rd.rkjc.web.form;

import com.ideal.rd.web.framework.form.AbstactForm;

public class UserForm extends AbstactForm {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String loginName;

	private String realName;

	private String jobTitle;

	private String password;

	private String mobile;

	private String email;

	private String telephone;

	private String address;

	private Integer certificateTypeId;

	private String certificateNo;

	private Integer sex;

	private String isActive;

	private String description;

	private Integer organizationId;

	private String oldPwd;

	private String newPwd;

	private String confirmPwd;

	private String certificateName;

	private String organizationName;

	// 0:本所民警,1:本所辅警,2:他所民警
	public Integer type;

	public Integer cuff_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCertificateTypeId() {
		return certificateTypeId;
	}

	public void setCertificateTypeId(Integer certificateTypeId) {
		this.certificateTypeId = certificateTypeId;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Integer getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCuff_id() {
		return cuff_id;
	}

	public void setCuff_id(Integer cuff_id) {
		this.cuff_id = cuff_id;
	}

	@Override
	public String toString() {
		return "UserForm [id=" + id + ", loginName=" + loginName + ", realName=" + realName + ", jobTitle=" + jobTitle
				+ ", password=" + password + ", mobile=" + mobile + ", email=" + email + ", telephone=" + telephone
				+ ", address=" + address + ", certificateTypeId=" + certificateTypeId + ", certificateNo="
				+ certificateNo + ", sex=" + sex + ", isActive=" + isActive + ", description=" + description
				+ ", organizationId=" + organizationId + ", oldPwd=" + oldPwd + ", newPwd=" + newPwd + ", confirmPwd="
				+ confirmPwd + ", certificateName=" + certificateName + ", organizationName=" + organizationName
				+ ", type=" + type + ", cuff_id=" + cuff_id + "]";
	}

}
