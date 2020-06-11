package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class UserEntity implements Serializable{
	
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

    private Integer isActive;

    private String description;

    private Date createdTime;

    private Date updatedTime;
    
    private String certificateName;
    
    private String organizationName;
    
    private String organizationType;
    
    private Integer organizationId;
    
	private String oldPwd;
	
	private String newPwd;
	
	private String confirmPwd;

	public boolean Success;

	public String Msg;
	//0:本所民警,1:本所辅警,2:他所民警
	public Integer type;
	
	public Integer cuff_id;
	

    public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

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
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
		return "UserEntity [id=" + id + ", loginName=" + loginName + ", realName=" + realName + ", jobTitle=" + jobTitle
				+ ", password=" + password + ", mobile=" + mobile + ", email=" + email + ", telephone=" + telephone
				+ ", address=" + address + ", certificateTypeId=" + certificateTypeId + ", certificateNo="
				+ certificateNo + ", sex=" + sex + ", isActive=" + isActive + ", description=" + description
				+ ", createdTime=" + createdTime + ", updatedTime=" + updatedTime + ", certificateName="
				+ certificateName + ", organizationName=" + organizationName + ", organizationType=" + organizationType
				+ ", organizationId=" + organizationId + ", oldPwd=" + oldPwd + ", newPwd=" + newPwd + ", confirmPwd="
				+ confirmPwd + ", Success=" + Success + ", Msg=" + Msg + ", type=" + type + ", cuff_id=" + cuff_id
				+ "]";
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
    
    
}