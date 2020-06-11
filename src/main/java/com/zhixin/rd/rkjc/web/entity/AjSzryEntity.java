package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 失踪人员
 * Created by Administrator on 17-2-27.
 */
public class AjSzryEntity implements Serializable{

    private long id;//失踪人员标识

    private long personId;//人员标识

    private String personSfzh;//人员身份证号

    private String szrybh;//失踪人员编号

    private String ajbh;//失踪人员案件编号

    private String jcjbh;//失踪人员接处警编号

    private String rybh;//失踪人员人员编号

    private String jqlb;//失踪人员警情类别

    private String ajmc;//失踪人员案件名称

    private String ajlb;//失踪人员案件类别

    private String afrq;//失踪人员案发日期

    private String afddssxq;//失踪人员案发地点省市县区

    private String afddxz;//失踪人员案发地点详址

    private String afdd;//失踪人员案发地点

    private String bgrgmsfhm;//失踪人员报告人公民身份号码

    private String bgrxm;//失踪人员报告人姓名

    private String bgrxb;//失踪人员报告人性别

    private String bgrcsrq;//失踪人员报告人出生日期

    private String bgrzjzl;//失踪人员报告人证件种类

    private String bgrzjhm;//失踪人员报告人证件号码

    private String bgrlxfs;//失踪人员报告人联系方式

    private String bgrgzdw;//失踪人员报告人工作单位

    private String bgrhjdssxq;//失踪人员报告人户籍地省市县区

    private String bgrhjdxz;//失踪人员报告人户籍地详址

    private String bgrhjd;//失踪人员报告人户籍地

    private String bgrxzzqh;//失踪人员报告人现住址省市县区

    private String bgrxzzxz;//失踪人员报告人现住址详址

    private String bgrxzz;//失踪人员报告人现住址

    private String bgryszrgx;//失踪人员报告人与失踪人关系

    private String szddssxq;//失踪人员失踪地点省市县区

    private String szddxz;//失踪人员失踪地点详址

    private String szdd;//失踪人员失踪地点

    private Date szsj;//失踪人员失踪时间

    private Date fxszsj;//失踪人员发现失踪时间

    private String jbdw;//失踪人员接报单位

    private String jbr;//失踪人员接报人

    private String lxdh;//失踪人员接报人联系电话

    private String szyy;//失踪人员失踪原因

    private String knqx;//失踪人员可能去向

    private String czjg;//失踪人员查找结果

    private String ysbqhyj;//失踪人员疑似被侵害依据

    private String jyqk;//失踪人员简要情况

    private String gmsfhm;//失踪人员公民身份号码

    private String sfjydna;//失踪人员是否检验DNA

    private String dnabh;//失踪人员DNA编号

    private String zwbh;//失踪人员指纹编号

    private String fwcs;//失踪人员服务处所

    private String xdwp;//失踪人员携带物品

    private String szryzqk;//失踪人员衣着情况

    private String shbj;//失踪人员审核标记

    private String spwtgyy;//失踪人员审批未通过原因

    private String spr;//失踪人员审批人

    private Date sprq;//失踪人员审批日期

    private String scbj;//失踪人员上传标记

    private Date sbsj;//失踪人员上报时间

    private Date rsksj;//失踪人员入省库时间

    private String bz;//失踪人员备注

    private Date cxcmrq;//失踪人员撤销查明日期

    private String cxcmfs;//失踪人员撤销查明方式

    private String cxyy;//失踪人员撤销原因

    private String cxyymc;//失踪人员撤销原因名称

    private String cxsfbg;//失踪人员撤销是否被拐

    private String cxcmdw;//失踪人员撤销查明单位

    private String cxcmdwfl;//失踪人员撤销查明单位分类

    private String cxcmr;//失踪人员撤销查明人

    private String cxcmrlxdh;//失踪人员撤销查明人联系电话

    private String cxdw;//失踪人员撤销单位

    private String cxr;//失踪人员撤销人

    private String cxrq;//失踪人员撤销日期

    private String cxjyqk;//失踪人员撤销简要情况

    private String cxbz;//失踪人员撤销备注

    private String cxshbj;//失踪人员撤销审核标记

    private String cxspwtgyy;//失踪人员撤销审批未通过原因

    private String cxpzr;//失踪人员撤销审批人

    private Date cxsprq;//失踪人员撤销审批日期

    private String cxscbj;//失踪人员撤销上传标记

    private Date cxsbsj;//失踪人员撤销上报时间

    private Date cxrsksj;//失踪人员撤销入省库时间

    private String cxbj;//失踪人员撤销标记

    private String djdw;//失踪人员登记单位

    private String djr;//失踪人员登记人

    private Date djrq;//失踪人员登记日期

    private String czdw;//失踪人员操作单位

    private String czr;//失踪人员操作人

    private Date czsj;//失踪人员操作时间

    private String czbs;//失踪人员操作标识

    private String xzQtky;//失踪其他口音

    private String xzJzdpcs;//失踪管辖地派出所

    private String xzJsjkzkrznl;//失踪精神健康状况或认知能力

    private String xzSfbg;//失踪人员刑侦是否被拐

    private String xzFxdw;//失踪人员刑侦发现单位

    private String xzFxr;//失踪人员刑侦发现人

    private Date xzFxsj;//失踪人员刑侦发现时间

    private String xzTz;//失踪人员刑侦体重

    private String xzSfyzxqsdna;//失踪人员刑侦是否验直系亲属DNA

    private String xzBjyrdnabh;//失踪人员刑侦被检验人DNA编号

    private String xzBjyryszrygx;//失踪人员刑侦被检验人与失踪人员关系

    private String xzTbfs;//失踪人员刑侦通报方式

    private String xzSzjg;//失踪人员刑侦失踪经过

    private String xzGxpcs;//失踪人员刑侦管辖派出所

    private String xzClqklxdh;//失踪人员刑侦处理情况联系电话

    private String xzSfbk;//失踪人员刑侦是否布控

    private Date xzBkqsrq;//失踪人员刑侦布控起始日期;

    private String xzBkid;//失踪人员刑侦布控ID

    private String bafs;//失踪人员报案方式

    private Date jbsj;//失踪人员接报时间

    private String wcjdnayy;//失踪人员未采集DNA原因

    private String wcjxxyy;//失踪人员未采集血型原因

    private String wcjzwyy;//失踪人员未采集指纹原因

    private String jdxx;//失踪人员就读学校

    private String ahxg;//失踪人员爱好习惯

    private String szqdscyhd;//失踪人员失踪前打算参与的活动

    private String jchddd;//失踪人员经常活动地点

    private String sfytrymd;//失踪人员是否与他人有矛盾

    private String sfbfzw;//失踪人员是否背负债务

    private String shgx;//失踪人员社会关系

    private String cxqtqx;//失踪人员撤销其他情形

    private String ysbqhbs;//失踪人员疑似被侵害标识

    private String dh;//失踪人员电话

    private String qq;//失踪人员QQ/MSN

    private String sfjyxx;//失踪人员血型检验

    private String sfjyzw;//失踪人员指纹检验

    private String bjrrw;//失踪人员报警人认为

    private String qyrw;//失踪人员亲友认为

    private String qtrrw;//失踪人员其他人认为

    private String cjbs;//失踪人员处警标识

    private String spyj;//失踪人员审批意见

    private String dzyx;//失踪人员电子邮箱

    private String cxlxr;//失踪人员撤销联系人

    private String cxlxrdh;//失踪人员撤销联系人电话

    private String ysdjr;//失踪人员疑似登记人

    private Date ysdjrq;//失踪人员疑似登记日期

    private String ysdjdw;//失踪人员疑似登记单位

    private String sfhf;//失踪人员是否回访

    private String szryszlx;//失踪人员失踪类型

    private String ryzt;//失踪人员人员状态

    private String ryztmx;//失踪人员人员状态描述

    private String tzms;//失踪人员特征描述

    private Date xhsj;//失踪人员寻回时间

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

    public String getSzrybh() {
        return szrybh;
    }

    public void setSzrybh(String szrybh) {
        this.szrybh = szrybh;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getJcjbh() {
        return jcjbh;
    }

    public void setJcjbh(String jcjbh) {
        this.jcjbh = jcjbh;
    }

    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    public String getJqlb() {
        return jqlb;
    }

    public void setJqlb(String jqlb) {
        this.jqlb = jqlb;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getAjlb() {
        return ajlb;
    }

    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    public String getAfrq() {
        return afrq;
    }

    public void setAfrq(String afrq) {
        this.afrq = afrq;
    }

    public String getAfddssxq() {
        return afddssxq;
    }

    public void setAfddssxq(String afddssxq) {
        this.afddssxq = afddssxq;
    }

    public String getAfddxz() {
        return afddxz;
    }

    public void setAfddxz(String afddxz) {
        this.afddxz = afddxz;
    }

    public String getAfdd() {
        return afdd;
    }

    public void setAfdd(String afdd) {
        this.afdd = afdd;
    }

    public String getBgrgmsfhm() {
        return bgrgmsfhm;
    }

    public void setBgrgmsfhm(String bgrgmsfhm) {
        this.bgrgmsfhm = bgrgmsfhm;
    }

    public String getBgrxm() {
        return bgrxm;
    }

    public void setBgrxm(String bgrxm) {
        this.bgrxm = bgrxm;
    }

    public String getBgrxb() {
        return bgrxb;
    }

    public void setBgrxb(String bgrxb) {
        this.bgrxb = bgrxb;
    }

    public String getBgrcsrq() {
        return bgrcsrq;
    }

    public void setBgrcsrq(String bgrcsrq) {
        this.bgrcsrq = bgrcsrq;
    }

    public String getBgrzjzl() {
        return bgrzjzl;
    }

    public void setBgrzjzl(String bgrzjzl) {
        this.bgrzjzl = bgrzjzl;
    }

    public String getBgrzjhm() {
        return bgrzjhm;
    }

    public void setBgrzjhm(String bgrzjhm) {
        this.bgrzjhm = bgrzjhm;
    }

    public String getBgrlxfs() {
        return bgrlxfs;
    }

    public void setBgrlxfs(String bgrlxfs) {
        this.bgrlxfs = bgrlxfs;
    }

    public String getBgrgzdw() {
        return bgrgzdw;
    }

    public void setBgrgzdw(String bgrgzdw) {
        this.bgrgzdw = bgrgzdw;
    }

    public String getBgrhjdssxq() {
        return bgrhjdssxq;
    }

    public void setBgrhjdssxq(String bgrhjdssxq) {
        this.bgrhjdssxq = bgrhjdssxq;
    }

    public String getBgrhjdxz() {
        return bgrhjdxz;
    }

    public void setBgrhjdxz(String bgrhjdxz) {
        this.bgrhjdxz = bgrhjdxz;
    }

    public String getBgrhjd() {
        return bgrhjd;
    }

    public void setBgrhjd(String bgrhjd) {
        this.bgrhjd = bgrhjd;
    }

    public String getBgrxzzqh() {
        return bgrxzzqh;
    }

    public void setBgrxzzqh(String bgrxzzqh) {
        this.bgrxzzqh = bgrxzzqh;
    }

    public String getBgrxzzxz() {
        return bgrxzzxz;
    }

    public void setBgrxzzxz(String bgrxzzxz) {
        this.bgrxzzxz = bgrxzzxz;
    }

    public String getBgrxzz() {
        return bgrxzz;
    }

    public void setBgrxzz(String bgrxzz) {
        this.bgrxzz = bgrxzz;
    }

    public String getBgryszrgx() {
        return bgryszrgx;
    }

    public void setBgryszrgx(String bgryszrgx) {
        this.bgryszrgx = bgryszrgx;
    }

    public String getSzddssxq() {
        return szddssxq;
    }

    public void setSzddssxq(String szddssxq) {
        this.szddssxq = szddssxq;
    }

    public String getSzddxz() {
        return szddxz;
    }

    public void setSzddxz(String szddxz) {
        this.szddxz = szddxz;
    }

    public String getSzdd() {
        return szdd;
    }

    public void setSzdd(String szdd) {
        this.szdd = szdd;
    }

    public Date getSzsj() {
        return szsj;
    }

    public void setSzsj(Date szsj) {
        this.szsj = szsj;
    }

    public Date getFxszsj() {
        return fxszsj;
    }

    public void setFxszsj(Date fxszsj) {
        this.fxszsj = fxszsj;
    }

    public String getJbdw() {
        return jbdw;
    }

    public void setJbdw(String jbdw) {
        this.jbdw = jbdw;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getSzyy() {
        return szyy;
    }

    public void setSzyy(String szyy) {
        this.szyy = szyy;
    }

    public String getKnqx() {
        return knqx;
    }

    public void setKnqx(String knqx) {
        this.knqx = knqx;
    }

    public String getCzjg() {
        return czjg;
    }

    public void setCzjg(String czjg) {
        this.czjg = czjg;
    }

    public String getYsbqhyj() {
        return ysbqhyj;
    }

    public void setYsbqhyj(String ysbqhyj) {
        this.ysbqhyj = ysbqhyj;
    }

    public String getJyqk() {
        return jyqk;
    }

    public void setJyqk(String jyqk) {
        this.jyqk = jyqk;
    }

    public String getGmsfhm() {
        return gmsfhm;
    }

    public void setGmsfhm(String gmsfhm) {
        this.gmsfhm = gmsfhm;
    }

    public String getSfjydna() {
        return sfjydna;
    }

    public void setSfjydna(String sfjydna) {
        this.sfjydna = sfjydna;
    }

    public String getDnabh() {
        return dnabh;
    }

    public void setDnabh(String dnabh) {
        this.dnabh = dnabh;
    }

    public String getZwbh() {
        return zwbh;
    }

    public void setZwbh(String zwbh) {
        this.zwbh = zwbh;
    }

    public String getFwcs() {
        return fwcs;
    }

    public void setFwcs(String fwcs) {
        this.fwcs = fwcs;
    }

    public String getXdwp() {
        return xdwp;
    }

    public void setXdwp(String xdwp) {
        this.xdwp = xdwp;
    }

    public String getSzryzqk() {
        return szryzqk;
    }

    public void setSzryzqk(String szryzqk) {
        this.szryzqk = szryzqk;
    }

    public String getShbj() {
        return shbj;
    }

    public void setShbj(String shbj) {
        this.shbj = shbj;
    }

    public String getSpwtgyy() {
        return spwtgyy;
    }

    public void setSpwtgyy(String spwtgyy) {
        this.spwtgyy = spwtgyy;
    }

    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr;
    }

    public Date getSprq() {
        return sprq;
    }

    public void setSprq(Date sprq) {
        this.sprq = sprq;
    }

    public String getScbj() {
        return scbj;
    }

    public void setScbj(String scbj) {
        this.scbj = scbj;
    }

    public Date getSbsj() {
        return sbsj;
    }

    public void setSbsj(Date sbsj) {
        this.sbsj = sbsj;
    }

    public Date getRsksj() {
        return rsksj;
    }

    public void setRsksj(Date rsksj) {
        this.rsksj = rsksj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Date getCxcmrq() {
        return cxcmrq;
    }

    public void setCxcmrq(Date cxcmrq) {
        this.cxcmrq = cxcmrq;
    }

    public String getCxcmfs() {
        return cxcmfs;
    }

    public void setCxcmfs(String cxcmfs) {
        this.cxcmfs = cxcmfs;
    }

    public String getCxyy() {
        return cxyy;
    }

    public void setCxyy(String cxyy) {
        this.cxyy = cxyy;
    }

    public String getCxyymc() {
        return cxyymc;
    }

    public void setCxyymc(String cxyymc) {
        this.cxyymc = cxyymc;
    }

    public String getCxsfbg() {
        return cxsfbg;
    }

    public void setCxsfbg(String cxsfbg) {
        this.cxsfbg = cxsfbg;
    }

    public String getCxcmdw() {
        return cxcmdw;
    }

    public void setCxcmdw(String cxcmdw) {
        this.cxcmdw = cxcmdw;
    }

    public String getCxcmdwfl() {
        return cxcmdwfl;
    }

    public void setCxcmdwfl(String cxcmdwfl) {
        this.cxcmdwfl = cxcmdwfl;
    }

    public String getCxcmr() {
        return cxcmr;
    }

    public void setCxcmr(String cxcmr) {
        this.cxcmr = cxcmr;
    }

    public String getCxcmrlxdh() {
        return cxcmrlxdh;
    }

    public void setCxcmrlxdh(String cxcmrlxdh) {
        this.cxcmrlxdh = cxcmrlxdh;
    }

    public String getCxdw() {
        return cxdw;
    }

    public void setCxdw(String cxdw) {
        this.cxdw = cxdw;
    }

    public String getCxr() {
        return cxr;
    }

    public void setCxr(String cxr) {
        this.cxr = cxr;
    }

    public String getCxrq() {
        return cxrq;
    }

    public void setCxrq(String cxrq) {
        this.cxrq = cxrq;
    }

    public String getCxjyqk() {
        return cxjyqk;
    }

    public void setCxjyqk(String cxjyqk) {
        this.cxjyqk = cxjyqk;
    }

    public String getCxbz() {
        return cxbz;
    }

    public void setCxbz(String cxbz) {
        this.cxbz = cxbz;
    }

    public String getCxshbj() {
        return cxshbj;
    }

    public void setCxshbj(String cxshbj) {
        this.cxshbj = cxshbj;
    }

    public String getCxspwtgyy() {
        return cxspwtgyy;
    }

    public void setCxspwtgyy(String cxspwtgyy) {
        this.cxspwtgyy = cxspwtgyy;
    }

    public String getCxpzr() {
        return cxpzr;
    }

    public void setCxpzr(String cxpzr) {
        this.cxpzr = cxpzr;
    }

    public Date getCxsprq() {
        return cxsprq;
    }

    public void setCxsprq(Date cxsprq) {
        this.cxsprq = cxsprq;
    }

    public String getCxscbj() {
        return cxscbj;
    }

    public void setCxscbj(String cxscbj) {
        this.cxscbj = cxscbj;
    }

    public Date getCxsbsj() {
        return cxsbsj;
    }

    public void setCxsbsj(Date cxsbsj) {
        this.cxsbsj = cxsbsj;
    }

    public Date getCxrsksj() {
        return cxrsksj;
    }

    public void setCxrsksj(Date cxrsksj) {
        this.cxrsksj = cxrsksj;
    }

    public String getCxbj() {
        return cxbj;
    }

    public void setCxbj(String cxbj) {
        this.cxbj = cxbj;
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

    public String getXzQtky() {
        return xzQtky;
    }

    public void setXzQtky(String xzQtky) {
        this.xzQtky = xzQtky;
    }

    public String getXzJzdpcs() {
        return xzJzdpcs;
    }

    public void setXzJzdpcs(String xzJzdpcs) {
        this.xzJzdpcs = xzJzdpcs;
    }

    public String getXzJsjkzkrznl() {
        return xzJsjkzkrznl;
    }

    public void setXzJsjkzkrznl(String xzJsjkzkrznl) {
        this.xzJsjkzkrznl = xzJsjkzkrznl;
    }

    public String getXzSfbg() {
        return xzSfbg;
    }

    public void setXzSfbg(String xzSfbg) {
        this.xzSfbg = xzSfbg;
    }

    public String getXzFxdw() {
        return xzFxdw;
    }

    public void setXzFxdw(String xzFxdw) {
        this.xzFxdw = xzFxdw;
    }

    public String getXzFxr() {
        return xzFxr;
    }

    public void setXzFxr(String xzFxr) {
        this.xzFxr = xzFxr;
    }

    public Date getXzFxsj() {
        return xzFxsj;
    }

    public void setXzFxsj(Date xzFxsj) {
        this.xzFxsj = xzFxsj;
    }

    public String getXzTz() {
        return xzTz;
    }

    public void setXzTz(String xzTz) {
        this.xzTz = xzTz;
    }

    public String getXzSfyzxqsdna() {
        return xzSfyzxqsdna;
    }

    public void setXzSfyzxqsdna(String xzSfyzxqsdna) {
        this.xzSfyzxqsdna = xzSfyzxqsdna;
    }

    public String getXzBjyrdnabh() {
        return xzBjyrdnabh;
    }

    public void setXzBjyrdnabh(String xzBjyrdnabh) {
        this.xzBjyrdnabh = xzBjyrdnabh;
    }

    public String getXzBjyryszrygx() {
        return xzBjyryszrygx;
    }

    public void setXzBjyryszrygx(String xzBjyryszrygx) {
        this.xzBjyryszrygx = xzBjyryszrygx;
    }

    public String getXzTbfs() {
        return xzTbfs;
    }

    public void setXzTbfs(String xzTbfs) {
        this.xzTbfs = xzTbfs;
    }

    public String getXzSzjg() {
        return xzSzjg;
    }

    public void setXzSzjg(String xzSzjg) {
        this.xzSzjg = xzSzjg;
    }

    public String getXzGxpcs() {
        return xzGxpcs;
    }

    public void setXzGxpcs(String xzGxpcs) {
        this.xzGxpcs = xzGxpcs;
    }

    public String getXzClqklxdh() {
        return xzClqklxdh;
    }

    public void setXzClqklxdh(String xzClqklxdh) {
        this.xzClqklxdh = xzClqklxdh;
    }

    public String getXzSfbk() {
        return xzSfbk;
    }

    public void setXzSfbk(String xzSfbk) {
        this.xzSfbk = xzSfbk;
    }

    public Date getXzBkqsrq() {
        return xzBkqsrq;
    }

    public void setXzBkqsrq(Date xzBkqsrq) {
        this.xzBkqsrq = xzBkqsrq;
    }

    public String getXzBkid() {
        return xzBkid;
    }

    public void setXzBkid(String xzBkid) {
        this.xzBkid = xzBkid;
    }

    public String getBafs() {
        return bafs;
    }

    public void setBafs(String bafs) {
        this.bafs = bafs;
    }

    public Date getJbsj() {
        return jbsj;
    }

    public void setJbsj(Date jbsj) {
        this.jbsj = jbsj;
    }

    public String getWcjdnayy() {
        return wcjdnayy;
    }

    public void setWcjdnayy(String wcjdnayy) {
        this.wcjdnayy = wcjdnayy;
    }

    public String getWcjxxyy() {
        return wcjxxyy;
    }

    public void setWcjxxyy(String wcjxxyy) {
        this.wcjxxyy = wcjxxyy;
    }

    public String getWcjzwyy() {
        return wcjzwyy;
    }

    public void setWcjzwyy(String wcjzwyy) {
        this.wcjzwyy = wcjzwyy;
    }

    public String getJdxx() {
        return jdxx;
    }

    public void setJdxx(String jdxx) {
        this.jdxx = jdxx;
    }

    public String getAhxg() {
        return ahxg;
    }

    public void setAhxg(String ahxg) {
        this.ahxg = ahxg;
    }

    public String getSzqdscyhd() {
        return szqdscyhd;
    }

    public void setSzqdscyhd(String szqdscyhd) {
        this.szqdscyhd = szqdscyhd;
    }

    public String getJchddd() {
        return jchddd;
    }

    public void setJchddd(String jchddd) {
        this.jchddd = jchddd;
    }

    public String getSfytrymd() {
        return sfytrymd;
    }

    public void setSfytrymd(String sfytrymd) {
        this.sfytrymd = sfytrymd;
    }

    public String getSfbfzw() {
        return sfbfzw;
    }

    public void setSfbfzw(String sfbfzw) {
        this.sfbfzw = sfbfzw;
    }

    public String getShgx() {
        return shgx;
    }

    public void setShgx(String shgx) {
        this.shgx = shgx;
    }

    public String getCxqtqx() {
        return cxqtqx;
    }

    public void setCxqtqx(String cxqtqx) {
        this.cxqtqx = cxqtqx;
    }

    public String getYsbqhbs() {
        return ysbqhbs;
    }

    public void setYsbqhbs(String ysbqhbs) {
        this.ysbqhbs = ysbqhbs;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSfjyxx() {
        return sfjyxx;
    }

    public void setSfjyxx(String sfjyxx) {
        this.sfjyxx = sfjyxx;
    }

    public String getSfjyzw() {
        return sfjyzw;
    }

    public void setSfjyzw(String sfjyzw) {
        this.sfjyzw = sfjyzw;
    }

    public String getBjrrw() {
        return bjrrw;
    }

    public void setBjrrw(String bjrrw) {
        this.bjrrw = bjrrw;
    }

    public String getQyrw() {
        return qyrw;
    }

    public void setQyrw(String qyrw) {
        this.qyrw = qyrw;
    }

    public String getQtrrw() {
        return qtrrw;
    }

    public void setQtrrw(String qtrrw) {
        this.qtrrw = qtrrw;
    }

    public String getCjbs() {
        return cjbs;
    }

    public void setCjbs(String cjbs) {
        this.cjbs = cjbs;
    }

    public String getSpyj() {
        return spyj;
    }

    public void setSpyj(String spyj) {
        this.spyj = spyj;
    }

    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
    }

    public String getCxlxr() {
        return cxlxr;
    }

    public void setCxlxr(String cxlxr) {
        this.cxlxr = cxlxr;
    }

    public String getCxlxrdh() {
        return cxlxrdh;
    }

    public void setCxlxrdh(String cxlxrdh) {
        this.cxlxrdh = cxlxrdh;
    }

    public String getYsdjr() {
        return ysdjr;
    }

    public void setYsdjr(String ysdjr) {
        this.ysdjr = ysdjr;
    }

    public Date getYsdjrq() {
        return ysdjrq;
    }

    public void setYsdjrq(Date ysdjrq) {
        this.ysdjrq = ysdjrq;
    }

    public String getYsdjdw() {
        return ysdjdw;
    }

    public void setYsdjdw(String ysdjdw) {
        this.ysdjdw = ysdjdw;
    }

    public String getSfhf() {
        return sfhf;
    }

    public void setSfhf(String sfhf) {
        this.sfhf = sfhf;
    }

    public String getSzryszlx() {
        return szryszlx;
    }

    public void setSzryszlx(String szryszlx) {
        this.szryszlx = szryszlx;
    }

    public String getRyzt() {
        return ryzt;
    }

    public void setRyzt(String ryzt) {
        this.ryzt = ryzt;
    }

    public String getRyztmx() {
        return ryztmx;
    }

    public void setRyztmx(String ryztmx) {
        this.ryztmx = ryztmx;
    }

    public String getTzms() {
        return tzms;
    }

    public void setTzms(String tzms) {
        this.tzms = tzms;
    }

    public Date getXhsj() {
        return xhsj;
    }

    public void setXhsj(Date xhsj) {
        this.xhsj = xhsj;
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
        return "AjSzryEntity{" +
                "id=" + id +
                ", personId=" + personId +
                ", personSfzh='" + personSfzh + '\'' +
                ", szrybh='" + szrybh + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", jcjbh='" + jcjbh + '\'' +
                ", rybh='" + rybh + '\'' +
                ", jqlb='" + jqlb + '\'' +
                ", ajmc='" + ajmc + '\'' +
                ", ajlb='" + ajlb + '\'' +
                ", afrq='" + afrq + '\'' +
                ", afddssxq='" + afddssxq + '\'' +
                ", afddxz='" + afddxz + '\'' +
                ", afdd='" + afdd + '\'' +
                ", bgrgmsfhm='" + bgrgmsfhm + '\'' +
                ", bgrxm='" + bgrxm + '\'' +
                ", bgrxb='" + bgrxb + '\'' +
                ", bgrcsrq='" + bgrcsrq + '\'' +
                ", bgrzjzl='" + bgrzjzl + '\'' +
                ", bgrzjhm='" + bgrzjhm + '\'' +
                ", bgrlxfs='" + bgrlxfs + '\'' +
                ", bgrgzdw='" + bgrgzdw + '\'' +
                ", bgrhjdssxq='" + bgrhjdssxq + '\'' +
                ", bgrhjdxz='" + bgrhjdxz + '\'' +
                ", bgrhjd='" + bgrhjd + '\'' +
                ", bgrxzzqh='" + bgrxzzqh + '\'' +
                ", bgrxzzxz='" + bgrxzzxz + '\'' +
                ", bgrxzz='" + bgrxzz + '\'' +
                ", bgryszrgx='" + bgryszrgx + '\'' +
                ", szddssxq='" + szddssxq + '\'' +
                ", szddxz='" + szddxz + '\'' +
                ", szdd='" + szdd + '\'' +
                ", szsj=" + szsj +
                ", fxszsj=" + fxszsj +
                ", jbdw='" + jbdw + '\'' +
                ", jbr='" + jbr + '\'' +
                ", lxdh='" + lxdh + '\'' +
                ", szyy='" + szyy + '\'' +
                ", knqx='" + knqx + '\'' +
                ", czjg='" + czjg + '\'' +
                ", ysbqhyj='" + ysbqhyj + '\'' +
                ", jyqk='" + jyqk + '\'' +
                ", gmsfhm='" + gmsfhm + '\'' +
                ", sfjydna='" + sfjydna + '\'' +
                ", dnabh='" + dnabh + '\'' +
                ", zwbh='" + zwbh + '\'' +
                ", fwcs='" + fwcs + '\'' +
                ", xdwp='" + xdwp + '\'' +
                ", szryzqk='" + szryzqk + '\'' +
                ", shbj='" + shbj + '\'' +
                ", spwtgyy='" + spwtgyy + '\'' +
                ", spr='" + spr + '\'' +
                ", sprq=" + sprq +
                ", scbj='" + scbj + '\'' +
                ", sbsj=" + sbsj +
                ", rsksj=" + rsksj +
                ", bz='" + bz + '\'' +
                ", cxcmrq=" + cxcmrq +
                ", cxcmfs='" + cxcmfs + '\'' +
                ", cxyy='" + cxyy + '\'' +
                ", cxyymc='" + cxyymc + '\'' +
                ", cxsfbg='" + cxsfbg + '\'' +
                ", cxcmdw='" + cxcmdw + '\'' +
                ", cxcmdwfl='" + cxcmdwfl + '\'' +
                ", cxcmr='" + cxcmr + '\'' +
                ", cxcmrlxdh='" + cxcmrlxdh + '\'' +
                ", cxdw='" + cxdw + '\'' +
                ", cxr='" + cxr + '\'' +
                ", cxrq='" + cxrq + '\'' +
                ", cxjyqk='" + cxjyqk + '\'' +
                ", cxbz='" + cxbz + '\'' +
                ", cxshbj='" + cxshbj + '\'' +
                ", cxspwtgyy='" + cxspwtgyy + '\'' +
                ", cxpzr='" + cxpzr + '\'' +
                ", cxsprq=" + cxsprq +
                ", cxscbj='" + cxscbj + '\'' +
                ", cxsbsj=" + cxsbsj +
                ", cxrsksj=" + cxrsksj +
                ", cxbj='" + cxbj + '\'' +
                ", djdw='" + djdw + '\'' +
                ", djr='" + djr + '\'' +
                ", djrq=" + djrq +
                ", czdw='" + czdw + '\'' +
                ", czr='" + czr + '\'' +
                ", czsj=" + czsj +
                ", czbs='" + czbs + '\'' +
                ", xzQtky='" + xzQtky + '\'' +
                ", xzJzdpcs='" + xzJzdpcs + '\'' +
                ", xzJsjkzkrznl='" + xzJsjkzkrznl + '\'' +
                ", xzSfbg='" + xzSfbg + '\'' +
                ", xzFxdw='" + xzFxdw + '\'' +
                ", xzFxr='" + xzFxr + '\'' +
                ", xzFxsj=" + xzFxsj +
                ", xzTz='" + xzTz + '\'' +
                ", xzSfyzxqsdna='" + xzSfyzxqsdna + '\'' +
                ", xzBjyrdnabh='" + xzBjyrdnabh + '\'' +
                ", xzBjyryszrygx='" + xzBjyryszrygx + '\'' +
                ", xzTbfs='" + xzTbfs + '\'' +
                ", xzSzjg='" + xzSzjg + '\'' +
                ", xzGxpcs='" + xzGxpcs + '\'' +
                ", xzClqklxdh='" + xzClqklxdh + '\'' +
                ", xzSfbk='" + xzSfbk + '\'' +
                ", xzBkqsrq=" + xzBkqsrq +
                ", xzBkid='" + xzBkid + '\'' +
                ", bafs='" + bafs + '\'' +
                ", jbsj=" + jbsj +
                ", wcjdnayy='" + wcjdnayy + '\'' +
                ", wcjxxyy='" + wcjxxyy + '\'' +
                ", wcjzwyy='" + wcjzwyy + '\'' +
                ", jdxx='" + jdxx + '\'' +
                ", ahxg='" + ahxg + '\'' +
                ", szqdscyhd='" + szqdscyhd + '\'' +
                ", jchddd='" + jchddd + '\'' +
                ", sfytrymd='" + sfytrymd + '\'' +
                ", sfbfzw='" + sfbfzw + '\'' +
                ", shgx='" + shgx + '\'' +
                ", cxqtqx='" + cxqtqx + '\'' +
                ", ysbqhbs='" + ysbqhbs + '\'' +
                ", dh='" + dh + '\'' +
                ", qq='" + qq + '\'' +
                ", sfjyxx='" + sfjyxx + '\'' +
                ", sfjyzw='" + sfjyzw + '\'' +
                ", bjrrw='" + bjrrw + '\'' +
                ", qyrw='" + qyrw + '\'' +
                ", qtrrw='" + qtrrw + '\'' +
                ", cjbs='" + cjbs + '\'' +
                ", spyj='" + spyj + '\'' +
                ", dzyx='" + dzyx + '\'' +
                ", cxlxr='" + cxlxr + '\'' +
                ", cxlxrdh='" + cxlxrdh + '\'' +
                ", ysdjr='" + ysdjr + '\'' +
                ", ysdjrq=" + ysdjrq +
                ", ysdjdw='" + ysdjdw + '\'' +
                ", sfhf='" + sfhf + '\'' +
                ", szryszlx='" + szryszlx + '\'' +
                ", ryzt='" + ryzt + '\'' +
                ", ryztmx='" + ryztmx + '\'' +
                ", tzms='" + tzms + '\'' +
                ", xhsj=" + xhsj +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
