package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 19703 on 2017/3/13.
 */
public class SdryEntity implements Serializable{
    private long nXh;//    N_XH	NUMBER(23,0)	涉毒人员序号
    private String cBh;//C_BH	VARCHAR2(23 BYTE)	涉毒人员编号
    private String cDwdm;//C_DWDM	VARCHAR2(12 BYTE)	填报单位
    private String cDjr;//C_DJR	  VARCHAR2(30 BYTE)	登记人
    private String cXm;//C_XM	VARCHAR2(30 BYTE)	姓名
    private String cSfzjzl;//C_SFZJZL	VARCHAR2(4 BYTE)	证件种类
    private String cSfzhm;//C_SFZHM	VARCHAR2(20 BYTE)	证件号码
    private String cQtzjhm;//C_QTZJHM	VARCHAR2(200 BYTE)	其它证件及号码
    private String cHjszd;//C_HJSZD	VARCHAR2(10 BYTE)	户籍地
    private String cHjszdxz;//C_HJSZDXZ	VARCHAR2(128 BYTE)	户籍地详址
    private String cHjpcs;//C_HJPCS	VARCHAR2(60 BYTE)	户籍地派出所
    private String cSjjzd;//C_SJJZD	VARCHAR2(10 BYTE)	居住地
    private String cSjjzdxz;//C_SJJZDXZ	VARCHAR2(400 BYTE)	居住地详址
    private String cSjpcs;//C_SJPCS	VARCHAR2(60 BYTE)	实际居住地派出所
    private String cCh;//C_CH	VARCHAR2(100 BYTE)	绰号/别名
    private String cXb;//C_XB	VARCHAR2(4 BYTE)	性别
    private Date dCs;//D_CS	DATE	出生日期
    private String cSf;//C_SF	VARCHAR2(4 BYTE)	身份
    private String cWhcd;//C_WHCD	VARCHAR2(4 BYTE)	文化程度
    private String cMz;//C_MZ	VARCHAR2(4 BYTE)	民族
    private String cFwcs;//C_FWCS	VARCHAR2(100 BYTE)	服务场所
    private int nSg;//N_SG	NUMBER(4,0)	身高
    private String cTbtmtz;//C_TBTMTZ	VARCHAR2(200 BYTE)	特殊体貌特征
    private String cBrlxfs;//    C_BRLXFS	VARCHAR2(200 BYTE)	本人联系电话
    private String cLxrxx;//    C_LXRXX	VARCHAR2(200 BYTE)	单位联系电话
    private String cGj;//    C_GJ	VARCHAR2(4 BYTE)	国籍
    private String cHyzk;//    C_HYZK	VARCHAR2(4 BYTE)	婚姻状况
    private String cXz;//    C_XZ	VARCHAR2(4 BYTE)	人员现状
    private Date dXz;//    D_XZ	DATE	现状登记日期
    private String cJkzk;//    C_JKZK	VARCHAR2(4 BYTE)	健康状况
    private Date dCcxd;//    D_CCXD	DATE	初次吸毒日期
    private int nSfzt;//    N_SFZT	NUMBER(1,0)	毒品犯罪嫌疑人类型
    private String cGxxz;//    C_GXXZ	VARCHAR2(50 BYTE)	管辖乡镇/街道
    private String cGxsq;//    C_GXSQ	VARCHAR2(50 BYTE)	管辖社区/村
    private String cBjmj;//    C_BJMJ	VARCHAR2(100 BYTE)	列管民警
    private String cBz;//    C_BZ	VARCHAR2(300 BYTE)	备注
    private Date dDj;//    D_DJ	DATE	登记日期
    private Date dGxsj;//    D_GXSJ	DATE	更新时间
    private long nYxh;//    N_YXH	NUMBER(23,0)	原涉毒人员序号
    private String cYdwdm;//    C_YDWDM	VARCHAR2(12 BYTE)	原填报单位
    private String cRylx;//    C_RYLX	VARCHAR2(10 BYTE)	涉毒人员类型
    private String cCxdw;//    C_CXDW	VARCHAR2(100 BYTE)	查询单位
    private int nCxzt;//    N_CXZT	NUMBER(2,0)	可查状态
    private long nAjxh;//    N_AJXH	NUMBER(23,0)	案件序号
    private long nChxh;//    N_CHXH	NUMBER(23,0)	查获序号
    private Date dCcch;//    D_CCCH	DATE	初吸查获日期
    private String cBjdw;//    C_BJDW	VARCHAR2(12 BYTE)	列管单位
    private int nSy;//    N_SY	NUMBER(1,0)	吸毒人员实有标识
    private int nYxx;//    N_YXX	NUMBER(1,0)	有效性
    private String cAction;//    C_ACTION	VARCHAR2(10 BYTE)	操作标识
    private String cPinyin;//    C_PINYIN	VARCHAR2(300 BYTE)	姓名/绰号拼音
    private String cTstamp;//    C_TSTAMP	VARCHAR2(24 BYTE)	更新时间戳
    private String cXgbsdw;//    C_XGBSDW	VARCHAR2(12 BYTE)	修改部署单位
    private String cCcbz;//    C_CCBZ	VARCHAR2(7 BYTE)	查重标志
    private String cChdq;//    C_CHDQ	VARCHAR2(10 BYTE)	填报地区
    private String cZtlx;//    C_ZTLX	VARCHAR2(4 BYTE)	在逃类型
    private String cFlwsbh;//    C_FLWSBH	VARCHAR2(30 BYTE)	法律文书编号
    private String cXdcs;//    C_XDCS	VARCHAR2(4 BYTE)	吸毒场所
    private String cXsdpzl;//    C_XSDPZL	VARCHAR2(100 BYTE)	滥用毒品种类
    private String cZsdpzl;//    C_ZSDPZL	VARCHAR2(100 BYTE)	注射毒品种类
    private String cXdhgsh;//    C_XDHGSH	VARCHAR2(100 BYTE)	吸毒后果(危害社会)
    private String cXdhgjt;//    C_XDHGJT	VARCHAR2(12 BYTE)	初吸查获填报单位
    private String cXdhgst;//    C_XDHGST	VARCHAR2(23 BYTE)	指纹编号
    private String cHg;//    C_HG	VARCHAR2(7 BYTE)	审核结果
    private int nShid;//    N_SHID	NUMBER(1,0)	审核标志
    private String cShdw;//    C_SHDW	VARCHAR2(12 BYTE)	审核单位
    private int nHszt;//    N_HSZT	NUMBER(1,0)	核实结果
    private String cZrmj;//    C_ZRMJ	VARCHAR2(30 BYTE)	办案民警
    private String cMjlxdh;//    C_MJLXDH	VARCHAR2(32 BYTE)	联系电话
    private String cShr;//    C_SHR	VARCHAR2(30 BYTE)	审核人
    private String cBjdwxc;//    C_BJDWXC	VARCHAR2(100 BYTE)	列管单位详称
    private Date dBj;//    D_BJ  DATE	列管日期
    private int nGraz;//    N_GRAZ	NUMBER(1,0)	未知1
    private long nYlcschxh;//    N_YLCSCHXH	NUMBER(23,0)	末次娱乐场所查获序号
    private String cWlsfxx;//    C_WLSFXX	VARCHAR2(100 BYTE)	网络身份信息

    public long getnXh() {
        return nXh;
    }

    public void setnXh(long nXh) {
        this.nXh = nXh;
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcDwdm() {
        return cDwdm;
    }

    public void setcDwdm(String cDwdm) {
        this.cDwdm = cDwdm;
    }

    public String getcDjr() {
        return cDjr;
    }

    public void setcDjr(String cDjr) {
        this.cDjr = cDjr;
    }

    public String getcXm() {
        return cXm;
    }

    public void setcXm(String cXm) {
        this.cXm = cXm;
    }

    public String getcSfzjzl() {
        return cSfzjzl;
    }

    public void setcSfzjzl(String cSfzjzl) {
        this.cSfzjzl = cSfzjzl;
    }

    public String getcSfzhm() {
        return cSfzhm;
    }

    public void setcSfzhm(String cSfzhm) {
        this.cSfzhm = cSfzhm;
    }

    public String getcQtzjhm() {
        return cQtzjhm;
    }

    public void setcQtzjhm(String cQtzjhm) {
        this.cQtzjhm = cQtzjhm;
    }

    public String getcHjszd() {
        return cHjszd;
    }

    public void setcHjszd(String cHjszd) {
        this.cHjszd = cHjszd;
    }

    public String getcHjszdxz() {
        return cHjszdxz;
    }

    public void setcHjszdxz(String cHjszdxz) {
        this.cHjszdxz = cHjszdxz;
    }

    public String getcHjpcs() {
        return cHjpcs;
    }

    public void setcHjpcs(String cHjpcs) {
        this.cHjpcs = cHjpcs;
    }

    public String getcSjjzd() {
        return cSjjzd;
    }

    public void setcSjjzd(String cSjjzd) {
        this.cSjjzd = cSjjzd;
    }

    public String getcSjjzdxz() {
        return cSjjzdxz;
    }

    public void setcSjjzdxz(String cSjjzdxz) {
        this.cSjjzdxz = cSjjzdxz;
    }

    public String getcSjpcs() {
        return cSjpcs;
    }

    public void setcSjpcs(String cSjpcs) {
        this.cSjpcs = cSjpcs;
    }

    public String getcCh() {
        return cCh;
    }

    public void setcCh(String cCh) {
        this.cCh = cCh;
    }

    public String getcXb() {
        return cXb;
    }

    public void setcXb(String cXb) {
        this.cXb = cXb;
    }

    public Date getdCs() {
        return dCs;
    }

    public void setdCs(Date dCs) {
        this.dCs = dCs;
    }

    public String getcSf() {
        return cSf;
    }

    public void setcSf(String cSf) {
        this.cSf = cSf;
    }

    public String getcWhcd() {
        return cWhcd;
    }

    public void setcWhcd(String cWhcd) {
        this.cWhcd = cWhcd;
    }

    public String getcMz() {
        return cMz;
    }

    public void setcMz(String cMz) {
        this.cMz = cMz;
    }

    public String getcFwcs() {
        return cFwcs;
    }

    public void setcFwcs(String cFwcs) {
        this.cFwcs = cFwcs;
    }

    public int getnSg() {
        return nSg;
    }

    public void setnSg(int nSg) {
        this.nSg = nSg;
    }

    public String getcTbtmtz() {
        return cTbtmtz;
    }

    public void setcTbtmtz(String cTbtmtz) {
        this.cTbtmtz = cTbtmtz;
    }

    public String getcBrlxfs() {
        return cBrlxfs;
    }

    public void setcBrlxfs(String cBrlxfs) {
        this.cBrlxfs = cBrlxfs;
    }

    public String getcLxrxx() {
        return cLxrxx;
    }

    public void setcLxrxx(String cLxrxx) {
        this.cLxrxx = cLxrxx;
    }

    public String getcGj() {
        return cGj;
    }

    public void setcGj(String cGj) {
        this.cGj = cGj;
    }

    public String getcHyzk() {
        return cHyzk;
    }

    public void setcHyzk(String cHyzk) {
        this.cHyzk = cHyzk;
    }

    public String getcXz() {
        return cXz;
    }

    public void setcXz(String cXz) {
        this.cXz = cXz;
    }

    public Date getdXz() {
        return dXz;
    }

    public void setdXz(Date dXz) {
        this.dXz = dXz;
    }

    public String getcJkzk() {
        return cJkzk;
    }

    public void setcJkzk(String cJkzk) {
        this.cJkzk = cJkzk;
    }

    public Date getdCcxd() {
        return dCcxd;
    }

    public void setdCcxd(Date dCcxd) {
        this.dCcxd = dCcxd;
    }

    public int getnSfzt() {
        return nSfzt;
    }

    public void setnSfzt(int nSfzt) {
        this.nSfzt = nSfzt;
    }

    public String getcGxxz() {
        return cGxxz;
    }

    public void setcGxxz(String cGxxz) {
        this.cGxxz = cGxxz;
    }

    public String getcGxsq() {
        return cGxsq;
    }

    public void setcGxsq(String cGxsq) {
        this.cGxsq = cGxsq;
    }

    public String getcBjmj() {
        return cBjmj;
    }

    public void setcBjmj(String cBjmj) {
        this.cBjmj = cBjmj;
    }

    public String getcBz() {
        return cBz;
    }

    public void setcBz(String cBz) {
        this.cBz = cBz;
    }

    public Date getdDj() {
        return dDj;
    }

    public void setdDj(Date dDj) {
        this.dDj = dDj;
    }

    public Date getdGxsj() {
        return dGxsj;
    }

    public void setdGxsj(Date dGxsj) {
        this.dGxsj = dGxsj;
    }

    public long getnYxh() {
        return nYxh;
    }

    public void setnYxh(long nYxh) {
        this.nYxh = nYxh;
    }

    public String getcYdwdm() {
        return cYdwdm;
    }

    public void setcYdwdm(String cYdwdm) {
        this.cYdwdm = cYdwdm;
    }

    public String getcRylx() {
        return cRylx;
    }

    public void setcRylx(String cRylx) {
        this.cRylx = cRylx;
    }

    public String getcCxdw() {
        return cCxdw;
    }

    public void setcCxdw(String cCxdw) {
        this.cCxdw = cCxdw;
    }

    public int getnCxzt() {
        return nCxzt;
    }

    public void setnCxzt(int nCxzt) {
        this.nCxzt = nCxzt;
    }

    public long getnAjxh() {
        return nAjxh;
    }

    public void setnAjxh(long nAjxh) {
        this.nAjxh = nAjxh;
    }

    public long getnChxh() {
        return nChxh;
    }

    public void setnChxh(long nChxh) {
        this.nChxh = nChxh;
    }

    public Date getdCcch() {
        return dCcch;
    }

    public void setdCcch(Date dCcch) {
        this.dCcch = dCcch;
    }

    public String getcBjdw() {
        return cBjdw;
    }

    public void setcBjdw(String cBjdw) {
        this.cBjdw = cBjdw;
    }

    public int getnSy() {
        return nSy;
    }

    public void setnSy(int nSy) {
        this.nSy = nSy;
    }

    public int getnYxx() {
        return nYxx;
    }

    public void setnYxx(int nYxx) {
        this.nYxx = nYxx;
    }

    public String getcAction() {
        return cAction;
    }

    public void setcAction(String cAction) {
        this.cAction = cAction;
    }

    public String getcPinyin() {
        return cPinyin;
    }

    public void setcPinyin(String cPinyin) {
        this.cPinyin = cPinyin;
    }

    public String getcTstamp() {
        return cTstamp;
    }

    public void setcTstamp(String cTstamp) {
        this.cTstamp = cTstamp;
    }

    public String getcXgbsdw() {
        return cXgbsdw;
    }

    public void setcXgbsdw(String cXgbsdw) {
        this.cXgbsdw = cXgbsdw;
    }

    public String getcCcbz() {
        return cCcbz;
    }

    public void setcCcbz(String cCcbz) {
        this.cCcbz = cCcbz;
    }

    public String getcChdq() {
        return cChdq;
    }

    public void setcChdq(String cChdq) {
        this.cChdq = cChdq;
    }

    public String getcZtlx() {
        return cZtlx;
    }

    public void setcZtlx(String cZtlx) {
        this.cZtlx = cZtlx;
    }

    public String getcFlwsbh() {
        return cFlwsbh;
    }

    public void setcFlwsbh(String cFlwsbh) {
        this.cFlwsbh = cFlwsbh;
    }

    public String getcXdcs() {
        return cXdcs;
    }

    public void setcXdcs(String cXdcs) {
        this.cXdcs = cXdcs;
    }

    public String getcXsdpzl() {
        return cXsdpzl;
    }

    public void setcXsdpzl(String cXsdpzl) {
        this.cXsdpzl = cXsdpzl;
    }

    public String getcZsdpzl() {
        return cZsdpzl;
    }

    public void setcZsdpzl(String cZsdpzl) {
        this.cZsdpzl = cZsdpzl;
    }

    public String getcXdhgsh() {
        return cXdhgsh;
    }

    public void setcXdhgsh(String cXdhgsh) {
        this.cXdhgsh = cXdhgsh;
    }

    public String getcXdhgjt() {
        return cXdhgjt;
    }

    public void setcXdhgjt(String cXdhgjt) {
        this.cXdhgjt = cXdhgjt;
    }

    public String getcXdhgst() {
        return cXdhgst;
    }

    public void setcXdhgst(String cXdhgst) {
        this.cXdhgst = cXdhgst;
    }

    public String getcHg() {
        return cHg;
    }

    public void setcHg(String cHg) {
        this.cHg = cHg;
    }

    public int getnShid() {
        return nShid;
    }

    public void setnShid(int nShid) {
        this.nShid = nShid;
    }

    public String getcShdw() {
        return cShdw;
    }

    public void setcShdw(String cShdw) {
        this.cShdw = cShdw;
    }

    public int getnHszt() {
        return nHszt;
    }

    public void setnHszt(int nHszt) {
        this.nHszt = nHszt;
    }

    public String getcZrmj() {
        return cZrmj;
    }

    public void setcZrmj(String cZrmj) {
        this.cZrmj = cZrmj;
    }

    public String getcMjlxdh() {
        return cMjlxdh;
    }

    public void setcMjlxdh(String cMjlxdh) {
        this.cMjlxdh = cMjlxdh;
    }

    public String getcShr() {
        return cShr;
    }

    public void setcShr(String cShr) {
        this.cShr = cShr;
    }

    public String getcBjdwxc() {
        return cBjdwxc;
    }

    public void setcBjdwxc(String cBjdwxc) {
        this.cBjdwxc = cBjdwxc;
    }

    public Date getdBj() {
        return dBj;
    }

    public void setdBj(Date dBj) {
        this.dBj = dBj;
    }

    public int getnGraz() {
        return nGraz;
    }

    public void setnGraz(int nGraz) {
        this.nGraz = nGraz;
    }

    public long getnYlcschxh() {
        return nYlcschxh;
    }

    public void setnYlcschxh(long nYlcschxh) {
        this.nYlcschxh = nYlcschxh;
    }

    public String getcWlsfxx() {
        return cWlsfxx;
    }

    public void setcWlsfxx(String cWlsfxx) {
        this.cWlsfxx = cWlsfxx;
    }

    @Override
    public String toString() {
        return "SdryEntity{" +
                "nXh=" + nXh +
                ", cBh='" + cBh + '\'' +
                ", cDwdm='" + cDwdm + '\'' +
                ", cDjr='" + cDjr + '\'' +
                ", cXm='" + cXm + '\'' +
                ", cSfzjzl='" + cSfzjzl + '\'' +
                ", cSfzhm='" + cSfzhm + '\'' +
                ", cQtzjhm='" + cQtzjhm + '\'' +
                ", cHjszd='" + cHjszd + '\'' +
                ", cHjszdxz='" + cHjszdxz + '\'' +
                ", cHjpcs='" + cHjpcs + '\'' +
                ", cSjjzd='" + cSjjzd + '\'' +
                ", cSjjzdxz='" + cSjjzdxz + '\'' +
                ", cSjpcs='" + cSjpcs + '\'' +
                ", cCh='" + cCh + '\'' +
                ", cXb='" + cXb + '\'' +
                ", dCs=" + dCs +
                ", cSf='" + cSf + '\'' +
                ", cWhcd='" + cWhcd + '\'' +
                ", cMz='" + cMz + '\'' +
                ", cFwcs='" + cFwcs + '\'' +
                ", nSg=" + nSg +
                ", cTbtmtz='" + cTbtmtz + '\'' +
                ", cBrlxfs='" + cBrlxfs + '\'' +
                ", cLxrxx='" + cLxrxx + '\'' +
                ", cGj='" + cGj + '\'' +
                ", cHyzk='" + cHyzk + '\'' +
                ", cXz='" + cXz + '\'' +
                ", dXz=" + dXz +
                ", cJkzk='" + cJkzk + '\'' +
                ", dCcxd=" + dCcxd +
                ", nSfzt=" + nSfzt +
                ", cGxxz='" + cGxxz + '\'' +
                ", cGxsq='" + cGxsq + '\'' +
                ", cBjmj='" + cBjmj + '\'' +
                ", cBz='" + cBz + '\'' +
                ", dDj=" + dDj +
                ", dGxsj=" + dGxsj +
                ", nYxh=" + nYxh +
                ", cYdwdm='" + cYdwdm + '\'' +
                ", cRylx='" + cRylx + '\'' +
                ", cCxdw='" + cCxdw + '\'' +
                ", nCxzt=" + nCxzt +
                ", nAjxh=" + nAjxh +
                ", nChxh=" + nChxh +
                ", dCcch=" + dCcch +
                ", cBjdw='" + cBjdw + '\'' +
                ", nSy=" + nSy +
                ", nYxx=" + nYxx +
                ", cAction='" + cAction + '\'' +
                ", cPinyin='" + cPinyin + '\'' +
                ", cTstamp='" + cTstamp + '\'' +
                ", cXgbsdw='" + cXgbsdw + '\'' +
                ", cCcbz='" + cCcbz + '\'' +
                ", cChdq='" + cChdq + '\'' +
                ", cZtlx='" + cZtlx + '\'' +
                ", cFlwsbh='" + cFlwsbh + '\'' +
                ", cXdcs='" + cXdcs + '\'' +
                ", cXsdpzl='" + cXsdpzl + '\'' +
                ", cZsdpzl='" + cZsdpzl + '\'' +
                ", cXdhgsh='" + cXdhgsh + '\'' +
                ", cXdhgjt='" + cXdhgjt + '\'' +
                ", cXdhgst='" + cXdhgst + '\'' +
                ", cHg='" + cHg + '\'' +
                ", nShid=" + nShid +
                ", cShdw='" + cShdw + '\'' +
                ", nHszt=" + nHszt +
                ", cZrmj='" + cZrmj + '\'' +
                ", cMjlxdh='" + cMjlxdh + '\'' +
                ", cShr='" + cShr + '\'' +
                ", cBjdwxc='" + cBjdwxc + '\'' +
                ", dBj=" + dBj +
                ", nGraz=" + nGraz +
                ", nYlcschxh=" + nYlcschxh +
                ", cWlsfxx='" + cWlsfxx + '\'' +
                '}';
    }
}
