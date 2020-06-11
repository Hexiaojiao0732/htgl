package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 车主
 * Created by Administrator on 17-2-27.
 */
public class WsJwczryclxxEntity implements Serializable{

    private long id;//车主标识

    private long personId;//人口标识

    private String personSfzh;//人口身份证号

    private String clbh;//外事车辆编号

    private String rybh;//外事车辆人员编号

    private String ch;//外事车辆车号

    private String cx;//外事车辆车型

    private String ssdwmc;//外事车辆所属单位名称

    private String ys;//外事车辆颜色

    private String bz;//外事车辆备注

    private String lrdw;//外事车辆录入单位

    private String lrr;//外事车辆录入人

    private Date lrrq;//外事车辆录入日期

    private String czr;//外事车辆操作人

    private String czdw;//外事车辆操作单位

    private Date czsj;//外事车辆操作时间

    private String czbs;//外事车辆操作标识

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

    public String getClbh() {
        return clbh;
    }

    public void setClbh(String clbh) {
        this.clbh = clbh;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public String getSsdwmc() {
        return ssdwmc;
    }

    public void setSsdwmc(String ssdwmc) {
        this.ssdwmc = ssdwmc;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getLrdw() {
        return lrdw;
    }

    public void setLrdw(String lrdw) {
        this.lrdw = lrdw;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public String getCzr() {
        return czr;
    }

    public void setCzr(String czr) {
        this.czr = czr;
    }

    public String getCzdw() {
        return czdw;
    }

    public void setCzdw(String czdw) {
        this.czdw = czdw;
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
        return "WsJwczryclxxEntity{" +
                "id=" + id +
                ", personId=" + personId +
                ", personSfzh='" + personSfzh + '\'' +
                ", clbh='" + clbh + '\'' +
                ", rybh='" + rybh + '\'' +
                ", ch='" + ch + '\'' +
                ", cx='" + cx + '\'' +
                ", ssdwmc='" + ssdwmc + '\'' +
                ", ys='" + ys + '\'' +
                ", bz='" + bz + '\'' +
                ", lrdw='" + lrdw + '\'' +
                ", lrr='" + lrr + '\'' +
                ", lrrq=" + lrrq +
                ", czr='" + czr + '\'' +
                ", czdw='" + czdw + '\'' +
                ", czsj=" + czsj +
                ", czbs='" + czbs + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
