/*
 * FormName: AuthorityExtraEntity.java
 * auto create by wangguhua
 * Description: AuthorityExtraForm实体类   
 */
 
package com.zhixin.rd.rkjc.web.form;

import java.io.Serializable;





/**
 * 实体类AuthorityExtraEntity table: authority_extra
 * 
 * @author wangguhua
 */
public class AuthorityExtraForm implements Serializable {
    /** Serial UID */
    private static final long serialVersionUID = 1L;
    
    /** id  */
    private Long id;
    
    /** authorityId  */
    private Long authorityId;
    
    /** areaId  */
    private Long areaId;
    
    /** description  */
    private String description;
    
    /** url  */
    private String url;
    

    /**
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the authorityId
     */
    public Long getAuthorityId() {
        return this.authorityId;
    }

    /**
     * @param authorityId the authorityId to set
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }
    
    /**
     * @return the areaId
     */
    public Long getAreaId() {
        return this.areaId;
    }

    /**
     * @param areaId the areaId to set
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
    
    /**
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @return the url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
	/**
     * 覆盖父类toString方法
     */    
    @Override
    public String toString() {
        return "AuthorityExtraForm ["
        	+"id:"+id
        	+",authorityId:"+authorityId
        	+",areaId:"+areaId
        	+",description:"+description
        	+",url:"+url
        +"]";
    }
    

}