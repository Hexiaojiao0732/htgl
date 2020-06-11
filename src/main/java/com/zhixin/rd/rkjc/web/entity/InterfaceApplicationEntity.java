package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.sql.Date;


public class InterfaceApplicationEntity implements Serializable {
    // `id` int(11) NOT NULL AUTO_INCREMENT,
    private Long id;

    private String applicationPerson;// 申请人

    private String applicationOrg;// 申请单位

    private String applicationIp;// 申请电脑ip

    private String applicationUse;// 申请用途

    private Long status;// 状态：0.初始化 1.有效 2.失效

    private Date createdTime;// 创建时间

    private Date updateTime;// 修改时间

    public InterfaceApplicationEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public InterfaceApplicationEntity(Long id, String applicationPerson, String applicationOrg, String applicationIp,
                                      String applicationUse, Long status, Date createdTime, Date updateTime) {
        super();
        this.id = id;
        this.applicationPerson = applicationPerson;
        this.applicationOrg = applicationOrg;
        this.applicationIp = applicationIp;
        this.applicationUse = applicationUse;
        this.status = status;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationIp == null) ? 0 : applicationIp.hashCode());
        result = prime * result + ((applicationOrg == null) ? 0 : applicationOrg.hashCode());
        result = prime * result + ((applicationPerson == null) ? 0 : applicationPerson.hashCode());
        result = prime * result + ((applicationUse == null) ? 0 : applicationUse.hashCode());
        result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((updateTime == null) ? 0 : updateTime.hashCode());
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
        InterfaceApplicationEntity other = (InterfaceApplicationEntity) obj;
        if (applicationIp == null) {
            if (other.applicationIp != null)
                return false;
        } else if (!applicationIp.equals(other.applicationIp))
            return false;
        if (applicationOrg == null) {
            if (other.applicationOrg != null)
                return false;
        } else if (!applicationOrg.equals(other.applicationOrg))
            return false;
        if (applicationPerson == null) {
            if (other.applicationPerson != null)
                return false;
        } else if (!applicationPerson.equals(other.applicationPerson))
            return false;
        if (applicationUse == null) {
            if (other.applicationUse != null)
                return false;
        } else if (!applicationUse.equals(other.applicationUse))
            return false;
        if (createdTime == null) {
            if (other.createdTime != null)
                return false;
        } else if (!createdTime.equals(other.createdTime))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (updateTime == null) {
            if (other.updateTime != null)
                return false;
        } else if (!updateTime.equals(other.updateTime))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicationPerson() {
        return applicationPerson;
    }

    public void setApplicationPerson(String applicationPerson) {
        this.applicationPerson = applicationPerson;
    }

    public String getApplicationOrg() {
        return applicationOrg;
    }

    public void setApplicationOrg(String applicationOrg) {
        this.applicationOrg = applicationOrg;
    }

    public String getApplicationIp() {
        return applicationIp;
    }

    public void setApplicationIp(String applicationIp) {
        this.applicationIp = applicationIp;
    }

    public String getApplicationUse() {
        return applicationUse;
    }

    public void setApplicationUse(String applicationUse) {
        this.applicationUse = applicationUse;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "InterfaceApplicationEntity [id=" + id + ", applicationPerson=" + applicationPerson + ", applicationOrg="
                + applicationOrg + ", applicationIp=" + applicationIp + ", applicationUse=" + applicationUse
                + ", status=" + status + ", createdTime=" + createdTime + ", updateTime=" + updateTime + "]";
    }

}
