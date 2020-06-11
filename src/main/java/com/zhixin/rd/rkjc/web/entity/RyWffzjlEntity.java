package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyf on 2017/2/27.
 */
public class RyWffzjlEntity implements Serializable {

    private Long id;  //id

    private Long personId;   //人口标识

    private String personSfzh;  //人口身份证号

    private String fzjlbh;//犯罪经历编号

    private String rybh;//犯罪经历人员编号

    private String zjzl;//犯罪经历证件种类

    private String ajbh;//犯罪经历案件编号

    private String ajmc;//犯罪经历案件名称

    private String ajlb;//犯罪经历案件类别

    private  String wddzrq;//违法犯罪日期

    private String wddzdd;//犯罪经历违法犯罪地点

    private String clrq;//犯罪经历处理日期

    private String cldw;//犯罪经历处理单位

    private  String clfs;//犯罪经历处理方式

    private  String clqx;//犯罪经历处理期限

    private  String bmjb;//犯罪经历保密级别

    private  String wffzssjcljg;//犯罪经历违法犯罪事实及处理结果

    private  String djdw;//犯罪经历登记单位

    private String djr;//犯罪经历登记人
    private String djrq;//犯罪经历登记日期

    private  String czdw;//犯罪经历操作单位

    private String czr;//犯罪经历操作人

    private String czsj;//犯罪经历操作时间

    private String czbs;//犯罪经历操作标识
    private String xyrbh;//犯罪经历嫌疑人编号
    private  String glajbh;//犯罪经历关联案件编号

    private Date createdTime;//创建时间

    private Date  updatedTime;//修改时间


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonSfzh() {
        return personSfzh;
    }

    public void setPersonSfzh(String personSfzh) {
        this.personSfzh = personSfzh;
    }

    public String getFzjlbh() {
        return fzjlbh;
    }

    public void setFzjlbh(String fzjlbh) {
        this.fzjlbh = fzjlbh;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getWddzrq() {
        return wddzrq;
    }

    public void setWddzrq(String wddzrq) {
        this.wddzrq = wddzrq;
    }

    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getWddzdd() {
        return wddzdd;
    }

    public void setWddzdd(String wddzdd) {
        this.wddzdd = wddzdd;
    }

    public String getClrq() {
        return clrq;
    }

    public void setClrq(String clrq) {
        this.clrq = clrq;
    }

    public String getCldw() {
        return cldw;
    }

    public void setCldw(String cldw) {
        this.cldw = cldw;
    }

    public String getClfs() {
        return clfs;
    }

    public void setClfs(String clfs) {
        this.clfs = clfs;
    }

    public String getClqx() {
        return clqx;
    }

    public void setClqx(String clqx) {
        this.clqx = clqx;
    }

    public String getBmjb() {
        return bmjb;
    }

    public void setBmjb(String bmjb) {
        this.bmjb = bmjb;
    }

    public String getWffzssjcljg() {
        return wffzssjcljg;
    }

    public void setWffzssjcljg(String wffzssjcljg) {
        this.wffzssjcljg = wffzssjcljg;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public String getDjdw() {
        return djdw;
    }

    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    public String getDjrq() {
        return djrq;
    }

    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }

    public String getCzdw() {
        return czdw;
    }

    public void setCzdw(String czdw) {
        this.czdw = czdw;
    }

    public String getCzr() {
        return czr;
    }

    public void setCzr(String czr) {
        this.czr = czr;
    }

    public String getCzsj() {
        return czsj;
    }

    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }

    public String getCzbs() {
        return czbs;
    }

    public void setCzbs(String czbs) {
        this.czbs = czbs;
    }

    public String getGlajbh() {
        return glajbh;
    }

    public void setGlajbh(String glajbh) {
        this.glajbh = glajbh;
    }

    public String getXyrbh() {
        return xyrbh;
    }

    public void setXyrbh(String xyrbh) {
        this.xyrbh = xyrbh;
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
        return "RyWffzjl{" +
                "id=" + id +
                ", personId=" + personId +
                ", personSfzh='" + personSfzh + '\'' +
                ", fzjlbh='" + fzjlbh + '\'' +
                ", rybh='" + rybh + '\'' +
                ", zjzl='" + zjzl + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", ajmc='" + ajmc + '\'' +
                ", ajlb='" + ajlb + '\'' +
                ", wddzrq='" + wddzrq + '\'' +
                ", wddzdd='" + wddzdd + '\'' +
                ", clrq='" + clrq + '\'' +
                ", cldw='" + cldw + '\'' +
                ", clfs='" + clfs + '\'' +
                ", clqx='" + clqx + '\'' +
                ", bmjb='" + bmjb + '\'' +
                ", wffzssjcljg='" + wffzssjcljg + '\'' +
                ", djdw='" + djdw + '\'' +
                ", djr='" + djr + '\'' +
                ", djrq='" + djrq + '\'' +
                ", czdw='" + czdw + '\'' +
                ", czr='" + czr + '\'' +
                ", czsj='" + czsj + '\'' +
                ", czbs='" + czbs + '\'' +
                ", xyrbh='" + xyrbh + '\'' +
                ", glajbh='" + glajbh + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
