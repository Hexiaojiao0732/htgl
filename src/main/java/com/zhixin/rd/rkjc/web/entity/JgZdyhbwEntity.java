package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 重要部门负责人
 * Created by Administrator on 17-2-27.
 */
public class JgZdyhbwEntity implements Serializable{
    private long id;//重要部门负责人标识

    private long personId;//人员标识

    private String personSfzh;//人员身份证号

    private String zybwbh;//重要部位编号

    private String jgbh;//重要部位机构编号

    private String dwmc;//重要部位单位名称

    private String bwms;//重要部位描述

    private String bwlb;//重要部位类别

    private String bwdj;//重要部位等级

    private String zysb;//重要部位重要设备

    private String yjcs;//重要部位应急措施

    private Date qdrq;//重要部位确定日期

    private Date qxrq;//重要部位取消日期

    private String djdw;//重要部位登记单位

    private String djr;//重要部位登记人

    private Date djrq;//重要部位登记日期

    private String czdw;//重要部位操作单位

    private String czr;//重要部位操作人

    private Date czsj;//重要部位操作时间;

    private String czbs;//重要部位操作标识

    private String fw;//重要部位方位

    private String jjjz;//重要部位经济价值

    private String bars;//重要部位保安人数

    private String gzrys;//重要部位工作人员数

    private String hwdrs;//重要部位护卫队人数

    private String jjrs;//重要部位经警人数

    private String wjrs;//重要部位武警人数

    private String  pdgj;//重要部位判定根据

    private String aqffbz;//重要部位安全防范标准

    private String bwzdjlqk;//重要部位保卫制度建立情况

    private String rfcs;//重要部位人防措施

    private String wfcs;//重要部位物防措施

    private String jfcs;//重要部位技防措施

    private String qfcs;//重要部位犬防措施

    private String bwbwmc;//重要部位保卫部位名称

    private String ffcs;//重要部位防范措施

    private String ffcsbcms;//重要部位防范措施补充描述

    private String qtbwbwmc;//重要部位其他保卫部位名称

    private String qtffcs;//重要部位其他防范措施

    private Date createdTime;//创建时间

    private Date updatedTime;//修改时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getPersonSfzh() {
        return personSfzh;
    }

    public void setPersonSfzh(String personSfzh) {
        this.personSfzh = personSfzh;
    }

    public String getZybwbh() {
        return zybwbh;
    }

    public void setZybwbh(String zybwbh) {
        this.zybwbh = zybwbh;
    }

    public String getJgbh() {
        return jgbh;
    }

    public void setJgbh(String jgbh) {
        this.jgbh = jgbh;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getBwms() {
        return bwms;
    }

    public void setBwms(String bwms) {
        this.bwms = bwms;
    }

    public String getBwlb() {
        return bwlb;
    }

    public void setBwlb(String bwlb) {
        this.bwlb = bwlb;
    }

    public String getBwdj() {
        return bwdj;
    }

    public void setBwdj(String bwdj) {
        this.bwdj = bwdj;
    }

    public String getZysb() {
        return zysb;
    }

    public void setZysb(String zysb) {
        this.zysb = zysb;
    }

    public String getYjcs() {
        return yjcs;
    }

    public void setYjcs(String yjcs) {
        this.yjcs = yjcs;
    }

    public Date getQdrq() {
        return qdrq;
    }

    public void setQdrq(Date qdrq) {
        this.qdrq = qdrq;
    }

    public Date getQxrq() {
        return qxrq;
    }

    public void setQxrq(Date qxrq) {
        this.qxrq = qxrq;
    }

    public String getDjdw() {
        return djdw;
    }

    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    public Date getDjrq() {
        return djrq;
    }

    public void setDjrq(Date djrq) {
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

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public String getCzbs() {
        return czbs;
    }

    public void setCzbs(String czbs) {
        this.czbs = czbs;
    }

    public String getFw() {
        return fw;
    }

    public void setFw(String fw) {
        this.fw = fw;
    }

    public String getJjjz() {
        return jjjz;
    }

    public void setJjjz(String jjjz) {
        this.jjjz = jjjz;
    }

    public String getBars() {
        return bars;
    }

    public void setBars(String bars) {
        this.bars = bars;
    }

    public String getGzrys() {
        return gzrys;
    }

    public void setGzrys(String gzrys) {
        this.gzrys = gzrys;
    }

    public String getHwdrs() {
        return hwdrs;
    }

    public void setHwdrs(String hwdrs) {
        this.hwdrs = hwdrs;
    }

    public String getJjrs() {
        return jjrs;
    }

    public void setJjrs(String jjrs) {
        this.jjrs = jjrs;
    }

    public String getWjrs() {
        return wjrs;
    }

    public void setWjrs(String wjrs) {
        this.wjrs = wjrs;
    }

    public String getPdgj() {
        return pdgj;
    }

    public void setPdgj(String pdgj) {
        this.pdgj = pdgj;
    }

    public String getAqffbz() {
        return aqffbz;
    }

    public void setAqffbz(String aqffbz) {
        this.aqffbz = aqffbz;
    }

    public String getBwzdjlqk() {
        return bwzdjlqk;
    }

    public void setBwzdjlqk(String bwzdjlqk) {
        this.bwzdjlqk = bwzdjlqk;
    }

    public String getRfcs() {
        return rfcs;
    }

    public void setRfcs(String rfcs) {
        this.rfcs = rfcs;
    }

    public String getWfcs() {
        return wfcs;
    }

    public void setWfcs(String wfcs) {
        this.wfcs = wfcs;
    }

    public String getJfcs() {
        return jfcs;
    }

    public void setJfcs(String jfcs) {
        this.jfcs = jfcs;
    }

    public String getQfcs() {
        return qfcs;
    }

    public void setQfcs(String qfcs) {
        this.qfcs = qfcs;
    }

    public String getBwbwmc() {
        return bwbwmc;
    }

    public void setBwbwmc(String bwbwmc) {
        this.bwbwmc = bwbwmc;
    }

    public String getFfcs() {
        return ffcs;
    }

    public void setFfcs(String ffcs) {
        this.ffcs = ffcs;
    }

    public String getFfcsbcms() {
        return ffcsbcms;
    }

    public void setFfcsbcms(String ffcsbcms) {
        this.ffcsbcms = ffcsbcms;
    }

    public String getQtbwbwmc() {
        return qtbwbwmc;
    }

    public void setQtbwbwmc(String qtbwbwmc) {
        this.qtbwbwmc = qtbwbwmc;
    }

    public String getQtffcs() {
        return qtffcs;
    }

    public void setQtffcs(String qtffcs) {
        this.qtffcs = qtffcs;
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
        return "JgZdyhbwEntity{" +
                "id=" + id +
                ", personId=" + personId +
                ", personSfzh='" + personSfzh + '\'' +
                ", zybwbh='" + zybwbh + '\'' +
                ", jgbh='" + jgbh + '\'' +
                ", dwmc='" + dwmc + '\'' +
                ", bwms='" + bwms + '\'' +
                ", bwlb='" + bwlb + '\'' +
                ", bwdj='" + bwdj + '\'' +
                ", zysb='" + zysb + '\'' +
                ", yjcs='" + yjcs + '\'' +
                ", qdrq=" + qdrq +
                ", qxrq=" + qxrq +
                ", djdw='" + djdw + '\'' +
                ", djr='" + djr + '\'' +
                ", djrq=" + djrq +
                ", czdw='" + czdw + '\'' +
                ", czr='" + czr + '\'' +
                ", czsj=" + czsj +
                ", czbs='" + czbs + '\'' +
                ", fw='" + fw + '\'' +
                ", jjjz='" + jjjz + '\'' +
                ", bars='" + bars + '\'' +
                ", gzrys='" + gzrys + '\'' +
                ", hwdrs='" + hwdrs + '\'' +
                ", jjrs='" + jjrs + '\'' +
                ", wjrs='" + wjrs + '\'' +
                ", pdgj='" + pdgj + '\'' +
                ", aqffbz='" + aqffbz + '\'' +
                ", bwzdjlqk='" + bwzdjlqk + '\'' +
                ", rfcs='" + rfcs + '\'' +
                ", wfcs='" + wfcs + '\'' +
                ", jfcs='" + jfcs + '\'' +
                ", qfcs='" + qfcs + '\'' +
                ", bwbwmc='" + bwbwmc + '\'' +
                ", ffcs='" + ffcs + '\'' +
                ", ffcsbcms='" + ffcsbcms + '\'' +
                ", qtbwbwmc='" + qtbwbwmc + '\'' +
                ", qtffcs='" + qtffcs + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
