package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

public class OrganizationEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String organization;

    private String type;

    private String address;

    private String telephone;

    private String postcode;

    private Date createdTime;

    private Date updatedTime;
    
    private Integer upOrgId; //上级部门
    
    /** regionCode  */
    private Long regionCode;
    
    /** gis  */
    private String gis;
    
    /** isMap  */
    private Integer isMap;
    
    private String regionName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
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

	public Integer getUpOrgId() {
		return upOrgId;
	}

	public void setUpOrgId(Integer upOrgId) {
		this.upOrgId = upOrgId;
	}
	
	

	public Long getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(Long regionCode) {
		this.regionCode = regionCode;
	}

	public String getGis() {
		return gis;
	}

	public void setGis(String gis) {
		this.gis = gis;
	}

	public Integer getIsMap() {
		return isMap;
	}

	public void setIsMap(Integer isMap) {
		this.isMap = isMap;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((gis == null) ? 0 : gis.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isMap == null) ? 0 : isMap.hashCode());
		result = prime * result + ((organization == null) ? 0 : organization.hashCode());
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((regionCode == null) ? 0 : regionCode.hashCode());
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((upOrgId == null) ? 0 : upOrgId.hashCode());
		result = prime * result + ((updatedTime == null) ? 0 : updatedTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrganizationEntity other = (OrganizationEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (gis == null) {
			if (other.gis != null)
				return false;
		} else if (!gis.equals(other.gis))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isMap == null) {
			if (other.isMap != null)
				return false;
		} else if (!isMap.equals(other.isMap))
			return false;
		if (organization == null) {
			if (other.organization != null)
				return false;
		} else if (!organization.equals(other.organization))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (regionCode == null) {
			if (other.regionCode != null)
				return false;
		} else if (!regionCode.equals(other.regionCode))
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (upOrgId == null) {
			if (other.upOrgId != null)
				return false;
		} else if (!upOrgId.equals(other.upOrgId))
			return false;
		if (updatedTime == null) {
			if (other.updatedTime != null)
				return false;
		} else if (!updatedTime.equals(other.updatedTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrganizationEntity [id=" + id + ", organization=" + organization + ", type=" + type + ", address="
				+ address + ", telephone=" + telephone + ", postcode=" + postcode + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + ", upOrgId=" + upOrgId + ", regionCode=" + regionCode + ", gis="
				+ gis + ", isMap=" + isMap + ", regionName=" + regionName + "]";
	}

	
    
	
    
    
}