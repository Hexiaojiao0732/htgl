package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zyf on 2017/3/13.
 */
public class SzryEntity  implements Serializable{
    private String bh;//失踪人员信息编号
    private String bgrXm;//报告人姓名
    private String bgrXb;//报告人性别
    private Date bgrCsrq;//报告人出生日期
    private String bgrZjhm;//报告人身份证号
    private String bgrDh;//报告人联系电话
    private String bgrYszrgx;//报告人与失踪人关系
    private String bgrGzdw;//报告人工作单位
    private String bgrXzzxz;//报告人详细地址
    private String bgrHjdxz;///报告人户籍地详址
    private String bgrSzdd;//失踪地点
    private Date bgrSzsj;//失踪时间
    private Date brgFxszsj;//发现失踪时间
    private String jbdwdm;//接报单位
    private String jbdwmc;//接报单位详细名称
    private String jbr;//接报人姓名
    private String jbrDh;//接报人联系电话
    private String bgrJyqk;//简要情况
    private String szrXm;//失踪人姓名
    private String szrBm;//失踪人别名
    private String szrXb;//失踪人性别
    private String szrMz;//失踪人民族
    private String szrIfdna;//是否检验DNA信息
    private String szrDna;//DNA的编号
    private Date szrCsrq;//失踪人出生日期
    private String szrZjhm;//失踪人身份证号
    private String szrGzdw;//失踪人工作单位
    private String szrHjdxz;//失踪人户籍地详细地址
    private String szrXzzxz;//失踪人现住址详细地址
    private String szrTx;//失踪人体形
    private String szrLx;//失踪人脸形
    private Integer szrSg;//失踪人身高（单位厘米）
    private String szrXx;//失踪人血型
    private Integer szrZc;//失踪人足长（单位毫米）
    private String szrKouyin;//失踪人口音
    private String szrSsjbltz;//损伤及病理特征
    private String szrSswp;//随身物品
    private String szrYzqk;//衣着情况
    private String tbr;//填表人
    private String tbdw;//填表单位所属地区
    private String tbdwmc;//填表单位详细名称
    private String tbsj;//填表时间
    private String spr;//审批人
    private String bz;//备注
    private String shbj;//审核标记
    private String cxbj;//撤销标记
    private String scbj;//上报标记
    private Date sbsj;//上报时间
    private Date rksj;//入省库时间
    private String delbj;//删除标记
    private String bgrXzzdw;//报告人现住址代码
    private String bgrHjddm;//报告人户籍地代码
    private String szrXzzdw;//失踪人现住址代码
    private String szrHjddm;//失踪人户籍地代码
    private String szrYsbqhyjdm;//疑似被侵害依据代码
    private String szrZwbh;//失踪人指纹编号
    private String spwtgyy;//审批未通过原因
    private String delsj;//删除时间
    private String szrXmQp;//失踪人姓名全拼
    private String bgrSzdddm;//失踪地点代码
    private String jyflg;//
    private Date zhxgsj;//最后修改时间
    private Date shsj;//审批时间
    private String opterid;//操作人员ID
    private Date rbksj;//入部库时间
    private Date rbksjo;//初次入部库时间
    private String  fname;//入部库传输文件名
    private String fnameo;//初次入部库传输文件名
    private String sberr;//入部库错误描述
    private Date version;//数据版本
    private String szrXmPy;//失踪人姓名拼音


    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getBgrXm() {
        return bgrXm;
    }

    public void setBgrXm(String bgrXm) {
        this.bgrXm = bgrXm;
    }

    public String getBgrXb() {
        return bgrXb;
    }

    public void setBgrXb(String bgrXb) {
        this.bgrXb = bgrXb;
    }

    public Date getBgrCsrq() {
        return bgrCsrq;
    }

    public void setBgrCsrq(Date bgrCsrq) {
        this.bgrCsrq = bgrCsrq;
    }

    public String getBgrZjhm() {
        return bgrZjhm;
    }

    public void setBgrZjhm(String bgrZjhm) {
        this.bgrZjhm = bgrZjhm;
    }

    public String getBgrDh() {
        return bgrDh;
    }

    public void setBgrDh(String bgrDh) {
        this.bgrDh = bgrDh;
    }

    public String getBgrYszrgx() {
        return bgrYszrgx;
    }

    public void setBgrYszrgx(String bgrYszrgx) {
        this.bgrYszrgx = bgrYszrgx;
    }

    public String getBgrGzdw() {
        return bgrGzdw;
    }

    public void setBgrGzdw(String bgrGzdw) {
        this.bgrGzdw = bgrGzdw;
    }

    public String getBgrXzzxz() {
        return bgrXzzxz;
    }

    public void setBgrXzzxz(String bgrXzzxz) {
        this.bgrXzzxz = bgrXzzxz;
    }

    public String getBgrHjdxz() {
        return bgrHjdxz;
    }

    public void setBgrHjdxz(String bgrHjdxz) {
        this.bgrHjdxz = bgrHjdxz;
    }

    public String getBgrSzdd() {
        return bgrSzdd;
    }

    public void setBgrSzdd(String bgrSzdd) {
        this.bgrSzdd = bgrSzdd;
    }

    public Date getBgrSzsj() {
        return bgrSzsj;
    }

    public void setBgrSzsj(Date bgrSzsj) {
        this.bgrSzsj = bgrSzsj;
    }

    public Date getBrgFxszsj() {
        return brgFxszsj;
    }

    public void setBrgFxszsj(Date brgFxszsj) {
        this.brgFxszsj = brgFxszsj;
    }

    public String getJbdwdm() {
        return jbdwdm;
    }

    public void setJbdwdm(String jbdwdm) {
        this.jbdwdm = jbdwdm;
    }

    public String getJbdwmc() {
        return jbdwmc;
    }

    public void setJbdwmc(String jbdwmc) {
        this.jbdwmc = jbdwmc;
    }

    public String getJbrDh() {
        return jbrDh;
    }

    public void setJbrDh(String jbrDh) {
        this.jbrDh = jbrDh;
    }

    public String getJbr() {
        return jbr;
    }

    public void setJbr(String jbr) {
        this.jbr = jbr;
    }

    public String getBgrJyqk() {
        return bgrJyqk;
    }

    public void setBgrJyqk(String bgrJyqk) {
        this.bgrJyqk = bgrJyqk;
    }

    public String getSzrXm() {
        return szrXm;
    }

    public void setSzrXm(String szrXm) {
        this.szrXm = szrXm;
    }

    public String getSzrBm() {
        return szrBm;
    }

    public void setSzrBm(String szrBm) {
        this.szrBm = szrBm;
    }

    public String getSzrXb() {
        return szrXb;
    }

    public void setSzrXb(String szrXb) {
        this.szrXb = szrXb;
    }

    public String getSzrMz() {
        return szrMz;
    }

    public void setSzrMz(String szrMz) {
        this.szrMz = szrMz;
    }

    public String getSzrIfdna() {
        return szrIfdna;
    }

    public void setSzrIfdna(String szrIfdna) {
        this.szrIfdna = szrIfdna;
    }

    public String getSzrDna() {
        return szrDna;
    }

    public void setSzrDna(String szrDna) {
        this.szrDna = szrDna;
    }

    public Date getSzrCsrq() {
        return szrCsrq;
    }

    public void setSzrCsrq(Date szrCsrq) {
        this.szrCsrq = szrCsrq;
    }

    public String getSzrZjhm() {
        return szrZjhm;
    }

    public void setSzrZjhm(String szrZjhm) {
        this.szrZjhm = szrZjhm;
    }

    public String getSzrGzdw() {
        return szrGzdw;
    }

    public void setSzrGzdw(String szrGzdw) {
        this.szrGzdw = szrGzdw;
    }

    public String getSzrXzzxz() {
        return szrXzzxz;
    }

    public void setSzrXzzxz(String szrXzzxz) {
        this.szrXzzxz = szrXzzxz;
    }

    public String getSzrHjdxz() {
        return szrHjdxz;
    }

    public void setSzrHjdxz(String szrHjdxz) {
        this.szrHjdxz = szrHjdxz;
    }

    public String getSzrLx() {
        return szrLx;
    }

    public void setSzrLx(String szrLx) {
        this.szrLx = szrLx;
    }

    public String getSzrTx() {
        return szrTx;
    }

    public void setSzrTx(String szrTx) {
        this.szrTx = szrTx;
    }

    public Integer getSzrSg() {
        return szrSg;
    }

    public void setSzrSg(Integer szrSg) {
        this.szrSg = szrSg;
    }

    public String getSzrXx() {
        return szrXx;
    }

    public void setSzrXx(String szrXx) {
        this.szrXx = szrXx;
    }

    public Integer getSzrZc() {
        return szrZc;
    }

    public void setSzrZc(Integer szrZc) {
        this.szrZc = szrZc;
    }

    public String getSzrKouyin() {
        return szrKouyin;
    }

    public void setSzrKouyin(String szrKouyin) {
        this.szrKouyin = szrKouyin;
    }

    public String getSzrSsjbltz() {
        return szrSsjbltz;
    }

    public void setSzrSsjbltz(String szrSsjbltz) {
        this.szrSsjbltz = szrSsjbltz;
    }

    public String getSzrSswp() {
        return szrSswp;
    }

    public void setSzrSswp(String szrSswp) {
        this.szrSswp = szrSswp;
    }

    public String getSzrYzqk() {
        return szrYzqk;
    }

    public void setSzrYzqk(String szrYzqk) {
        this.szrYzqk = szrYzqk;
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    public String getTbr() {
        return tbr;
    }

    public void setTbr(String tbr) {
        this.tbr = tbr;
    }

    public String getTbdwmc() {
        return tbdwmc;
    }

    public void setTbdwmc(String tbdwmc) {
        this.tbdwmc = tbdwmc;
    }

    public String getTbsj() {
        return tbsj;
    }

    public void setTbsj(String tbsj) {
        this.tbsj = tbsj;
    }

    public String getSpr() {
        return spr;
    }

    public void setSpr(String spr) {
        this.spr = spr;
    }

    public String getShbj() {
        return shbj;
    }

    public void setShbj(String shbj) {
        this.shbj = shbj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getCxbj() {
        return cxbj;
    }

    public void setCxbj(String cxbj) {
        this.cxbj = cxbj;
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

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    public String getBgrXzzdw() {
        return bgrXzzdw;
    }

    public void setBgrXzzdw(String bgrXzzdw) {
        this.bgrXzzdw = bgrXzzdw;
    }

    public String getDelbj() {
        return delbj;
    }

    public void setDelbj(String delbj) {
        this.delbj = delbj;
    }

    public String getBgrHjddm() {
        return bgrHjddm;
    }

    public void setBgrHjddm(String bgrHjddm) {
        this.bgrHjddm = bgrHjddm;
    }

    public String getSzrXzzdw() {
        return szrXzzdw;
    }

    public void setSzrXzzdw(String szrXzzdw) {
        this.szrXzzdw = szrXzzdw;
    }

    public String getSzrHjddm() {
        return szrHjddm;
    }

    public void setSzrHjddm(String szrHjddm) {
        this.szrHjddm = szrHjddm;
    }

    public String getSzrZwbh() {
        return szrZwbh;
    }

    public void setSzrZwbh(String szrZwbh) {
        this.szrZwbh = szrZwbh;
    }

    public String getSzrYsbqhyjdm() {
        return szrYsbqhyjdm;
    }

    public void setSzrYsbqhyjdm(String szrYsbqhyjdm) {
        this.szrYsbqhyjdm = szrYsbqhyjdm;
    }

    public String getSpwtgyy() {
        return spwtgyy;
    }

    public void setSpwtgyy(String spwtgyy) {
        this.spwtgyy = spwtgyy;
    }

    public String getDelsj() {
        return delsj;
    }

    public void setDelsj(String delsj) {
        this.delsj = delsj;
    }

    public String getSzrXmQp() {
        return szrXmQp;
    }

    public void setSzrXmQp(String szrXmQp) {
        this.szrXmQp = szrXmQp;
    }

    public String getBgrSzdddm() {
        return bgrSzdddm;
    }

    public void setBgrSzdddm(String bgrSzdddm) {
        this.bgrSzdddm = bgrSzdddm;
    }

    public String getJyflg() {
        return jyflg;
    }

    public void setJyflg(String jyflg) {
        this.jyflg = jyflg;
    }

    public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
    }

    public Date getZhxgsj() {
        return zhxgsj;
    }

    public void setZhxgsj(Date zhxgsj) {
        this.zhxgsj = zhxgsj;
    }

    public String getOpterid() {
        return opterid;
    }

    public void setOpterid(String opterid) {
        this.opterid = opterid;
    }

    public Date getRbksj() {
        return rbksj;
    }

    public void setRbksj(Date rbksj) {
        this.rbksj = rbksj;
    }

    public Date getRbksjo() {
        return rbksjo;
    }

    public void setRbksjo(Date rbksjo) {
        this.rbksjo = rbksjo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFnameo() {
        return fnameo;
    }

    public void setFnameo(String fnameo) {
        this.fnameo = fnameo;
    }

    public Date getVersion() {
        return version;
    }

    public void setVersion(Date version) {
        this.version = version;
    }

    public String getSberr() {
        return sberr;
    }

    public void setSberr(String sberr) {
        this.sberr = sberr;
    }

    public String getSzrXmPy() {
        return szrXmPy;
    }

    public void setSzrXmPy(String szrXmPy) {
        this.szrXmPy = szrXmPy;
    }

    @Override
    public String toString() {
        return "SzryEntity{" +
                "bh='" + bh + '\'' +
                ", bgrXm='" + bgrXm + '\'' +
                ", bgrXb='" + bgrXb + '\'' +
                ", bgrCsrq=" + bgrCsrq +
                ", bgrZjhm='" + bgrZjhm + '\'' +
                ", bgrDh='" + bgrDh + '\'' +
                ", bgrYszrgx='" + bgrYszrgx + '\'' +
                ", bgrGzdw='" + bgrGzdw + '\'' +
                ", bgrXzzxz='" + bgrXzzxz + '\'' +
                ", bgrHjdxz='" + bgrHjdxz + '\'' +
                ", bgrSzdd='" + bgrSzdd + '\'' +
                ", bgrSzsj=" + bgrSzsj +
                ", brgFxszsj=" + brgFxszsj +
                ", jbdwdm='" + jbdwdm + '\'' +
                ", jbdwmc='" + jbdwmc + '\'' +
                ", jbr='" + jbr + '\'' +
                ", jbrDh='" + jbrDh + '\'' +
                ", bgrJyqk='" + bgrJyqk + '\'' +
                ", szrXm='" + szrXm + '\'' +
                ", szrBm='" + szrBm + '\'' +
                ", szrXb='" + szrXb + '\'' +
                ", szrMz='" + szrMz + '\'' +
                ", szrIfdna='" + szrIfdna + '\'' +
                ", szrDna='" + szrDna + '\'' +
                ", szrCsrq=" + szrCsrq +
                ", szrZjhm='" + szrZjhm + '\'' +
                ", szrGzdw='" + szrGzdw + '\'' +
                ", szrHjdxz='" + szrHjdxz + '\'' +
                ", szrXzzxz='" + szrXzzxz + '\'' +
                ", szrTx='" + szrTx + '\'' +
                ", szrLx='" + szrLx + '\'' +
                ", szrSg=" + szrSg +
                ", szrXx='" + szrXx + '\'' +
                ", szrZc=" + szrZc +
                ", szrKouyin='" + szrKouyin + '\'' +
                ", szrSsjbltz='" + szrSsjbltz + '\'' +
                ", szrSswp='" + szrSswp + '\'' +
                ", szrYzqk='" + szrYzqk + '\'' +
                ", tbr='" + tbr + '\'' +
                ", tbdw='" + tbdw + '\'' +
                ", tbdwmc='" + tbdwmc + '\'' +
                ", tbsj='" + tbsj + '\'' +
                ", spr='" + spr + '\'' +
                ", bz='" + bz + '\'' +
                ", shbj='" + shbj + '\'' +
                ", cxbj='" + cxbj + '\'' +
                ", scbj='" + scbj + '\'' +
                ", sbsj=" + sbsj +
                ", rksj=" + rksj +
                ", delbj='" + delbj + '\'' +
                ", bgrXzzdw='" + bgrXzzdw + '\'' +
                ", bgrHjddm='" + bgrHjddm + '\'' +
                ", szrXzzdw='" + szrXzzdw + '\'' +
                ", szrHjddm='" + szrHjddm + '\'' +
                ", szrYsbqhyjdm='" + szrYsbqhyjdm + '\'' +
                ", szrZwbh='" + szrZwbh + '\'' +
                ", spwtgyy='" + spwtgyy + '\'' +
                ", delsj='" + delsj + '\'' +
                ", szrXmQp='" + szrXmQp + '\'' +
                ", bgrSzdddm='" + bgrSzdddm + '\'' +
                ", jyflg='" + jyflg + '\'' +
                ", zhxgsj=" + zhxgsj +
                ", shsj=" + shsj +
                ", opterid='" + opterid + '\'' +
                ", rbksj=" + rbksj +
                ", rbksjo=" + rbksjo +
                ", fname='" + fname + '\'' +
                ", fnameo='" + fnameo + '\'' +
                ", sberr='" + sberr + '\'' +
                ", version=" + version +
                ", szrXmPy='" + szrXmPy + '\'' +
                '}';
    }
}
