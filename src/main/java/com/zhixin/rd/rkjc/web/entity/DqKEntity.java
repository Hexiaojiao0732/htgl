/*
 * Copyright (C), 2016-2017 
 * FileName: AjXyrxxOracleEntity.java
 * auto create by wangguhua
 * Author:   
 * Date:     2017-5-6 16:54:58
 * Description: AjXyrxxOracleEntity实体类   
 */
 
package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;



import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * 实体类AjXyrxxOracleEntity table: AJ_XYRXX
 * 
 * @author wangguhua
 */
public class DqKEntity implements Serializable {
    /** Serial UID */
    private static final long serialVersionUID = 1L;
    
    /** xyrbh 嫌疑人编号 */
    private String xyrbh;
    
    /** ajbh 嫌疑人案件编号 */
    private String ajbh;
    
    /** rybh 嫌疑人人员编号 */
    private String rybh;
    
    /** gmsfhm 嫌疑人公民身份号码 */
    private String gmsfhm;
    
    /** xm 嫌疑人姓名 */
    private String xm;
    
    /** xmpy 嫌疑人姓名拼音 */
    private String xmpy;
    
    /** cym 嫌疑人曾用名 */
    private String cym;
    
    /** cympy 嫌疑人曾用名拼音 */
    private String cympy;
    
    /** bmch 嫌疑人别名绰号 */
    private String bmch;
    
    /** bmchpy 嫌疑人别名绰号拼音 */
    private String bmchpy;
    
    /** xb 嫌疑人性别 */
    private String xb;
    
    /** csrq 嫌疑人出生日期 */
    private String csrq;
    
    /** mz 嫌疑人民族 */
    private String mz;
    
    /** nlxx 嫌疑人年龄下限 */
    private Integer nlxx;
    
    /** nlsx 嫌疑人年龄上限 */
    private Integer nlsx;
    
    /** gjdq 嫌疑人国家地区 */
    private String gjdq;
    
    /** jggjdq 嫌疑人籍贯国家地区 */
    private String jggjdq;
    
    /** jgssxq 嫌疑人籍贯省市县区 */
    private String jgssxq;
    
    /** jgxz 嫌疑人籍贯详址 */
    private String jgxz;
    
    /** hjdzssxq 嫌疑人户籍地址省市县区 */
    private String hjdzssxq;
    
    /** hjdzxz 嫌疑人户籍地址详址 */
    private String hjdzxz;
    
    /** zzbh 住址编号 */
    private String zzbh;
    
    /** xzqh 行政区划 */
    private String xzqh;
    
    /** zzxz 住址详址 */
    private String zzxz;
    
    /** whcd 嫌疑人文化程度 */
    private String whcd;
    
    /** hyzk 嫌疑人婚姻状况 */
    private String hyzk;
    
    /** zy 嫌疑人职业 */
    private String zy;
    
    /** zylb 嫌疑人职业类别 */
    private String zylb;
    
    /** fwcs 嫌疑人服务处所 */
    private String fwcs;
    
    /** lxdh 嫌疑人联系方式 */
    private String lxdh;
    
    /** sgxx 嫌疑人身高下限 */
    private Integer sgxx;
    
    /** sgsx 嫌疑人身高上限 */
    private Integer sgsx;
    
    /** xx 嫌疑人血型 */
    private String xx;
    
    /** ky 嫌疑人口音 */
    private String ky;
    
    /** lx 嫌疑人脸型 */
    private String lx;
    
    /** tx 嫌疑人体型 */
    private String tx;
    
    /** qttz 嫌疑人其他特征 */
    private String qttz;
    
    /** tstz 嫌疑人特殊特征 */
    private String tstz;
    
    /** tbtz 嫌疑人体表特征 */
    private String tbtz;
    
    /** zc 嫌疑人专长 */
    private String zc;
    
    /** sf 嫌疑人身份 */
    private String sf;
    
    /** tssf 嫌疑人特殊身份 */
    private String tssf;
    
    /** sfjwry 嫌疑人是否境外人员 */
    private String sfjwry;
    
    /** sflc 嫌疑人是否流串 */
    private String sflc;
    
    /** sflf 嫌疑人是否累犯 */
    private String sflf;
    
    /** sfgf 嫌疑人是否惯犯 */
    private String sfgf;
    
    /** zlyy 嫌疑人暂留缘由 */
    private String zlyy;
    
    /** jkzk 嫌疑人健康状况 */
    private String jkzk;
    
    /** xgtd 嫌疑人习惯特点 */
    private String xgtd;
    
    /** bajs 嫌疑人本案角色 */
    private String bajs;
    
    /** zatd 嫌疑人作案特点 */
    private String zatd;
    
    /** saqk 嫌疑人涉案情况 */
    private String saqk;
    
    /** cmsfrq 嫌疑人查明身份日期 */
    private String cmsfrq;
    
    /** zayy 嫌疑人作案原因 */
    private String zayy;
    
    /** kyyj 嫌疑人可疑依据 */
    private String kyyj;
    
    /** xszk 嫌疑人现实状况 */
    private String xszk;
    
    /** zhrq 嫌疑人抓获日期 */
    private String zhrq;
    
    /** zhfs 嫌疑人抓获方式 */
    private String zhfs;
    
    /** zhdq 嫌疑人抓获地区 */
    private String zhdq;
    
    /** zhdy 嫌疑人抓获地域 */
    private String zhdy;
    
    /** zhdd 嫌疑人抓获地点 */
    private String zhdd;
    
    /** zhr 嫌疑人抓获人 */
    private String zhr;
    
    /** zhdw 嫌疑人抓获单位 */
    private String zhdw;
    
    /** wffzjl 嫌疑人违法犯罪经历 */
    private String wffzjl;
    
    /** wffzss 嫌疑人违法犯罪事实 */
    private String wffzss;
    
    /** ywx 嫌疑人英文姓 */
    private String ywx;
    
    /** ywm 嫌疑人英文名 */
    private String ywm;
    
    /** zjzl 嫌疑人证件种类 */
    private String zjzl;
    
    /** zjhm 嫌疑人证件号码 */
    private String zjhm;
    
    /** qzzl 嫌疑人签证种类 */
    private String qzzl;
    
    /** tlyxq 嫌疑人停留有效期 */
    private String tlyxq;
    
    /** xyrsx 嫌疑人属性 */
    private String xyrsx;
    
    /** zwbh 嫌疑人指纹编号 */
    private String zwbh;
    
    /** dnabh 嫌疑人DNA编号 */
    private String dnabh;
    
    /** bjkbh 嫌疑人笔记卡编号 */
    private String bjkbh;
    
    /** xyrbs 嫌疑人标识 */
    private String xyrbs;
    
    /** bscly 嫌疑人被审查理由 */
    private String bscly;
    
    /** bfly 嫌疑人被否理由 */
    private String bfly;
    
    /** dqzt 嫌疑人当前状态 */
    private String dqzt;
    
    /** bmjb 嫌疑人保密级别 */
    private String bmjb;
    
    /** swrq 嫌疑人死亡日期 */
    private String swrq;
    
    /** ajmc 嫌疑人案件名称 */
    private String ajmc;
    
    /** ajlb 嫌疑人案件类别 */
    private String ajlb;
    
    /** clfs 嫌疑人处理方式 */
    private String clfs;
    
    /** cflx 嫌疑人处罚类型 */
    private String cflx;
    
    /** cfrq 嫌疑人处罚日期 */
    private String cfrq;
    
    /** cfqk 嫌疑人处罚情况 */
    private String cfqk;
    
    /** cfdw 嫌疑人处罚单位 */
    private String cfdw;
    
    /** bz 嫌疑人备注 */
    private String bz;
    
    /** djdw 嫌疑人登记单位 */
    private String djdw;
    
    /** djr 嫌疑人登记人 */
    private String djr;
    
    /** djrq 嫌疑人登记日期 */
    private String djrq;
    
    /** czdw 嫌疑人操作单位 */
    private String czdw;
    
    /** czr 嫌疑人操作人 */
    private String czr;
    
    /** czsj 嫌疑人操作时间 */
    private String czsj;
    
    /** czbs 嫌疑人操作标识 */
    private String czbs;
    
    /** xzcflb 嫌疑人行政处罚类别 */
    private String xzcflb;
    
    /** xzcfje 嫌疑人行政处罚金额 */
    private Integer xzcfje;
    
    /** xzcfqx 嫌疑人行政处罚期限 */
    private String xzcfqx;
    
    /** xzcfcd 嫌疑人处罚规则程度 */
    private String xzcfcd;
    
    /** xzsplx 嫌疑人处罚审批类型 */
    private String xzsplx;
    
    /** jlx 街路巷 */
    private String jlx;
    
    /** xyrjdjg 嫌疑人决定结果 */
    private String xyrjdjg;
    
    /** xyrjdqx 嫌疑人决定期限 */
    private String xyrjdqx;
    
    /** xyrqssj 嫌疑人起始时间 */
    private String xyrqssj;
    
    /** xyrzzsj 嫌疑人终止时间 */
    private String xyrzzsj;
    
    /** bzrxm 嫌疑人保证人姓名 */
    private String bzrxm;
    
    /** jdXh 嫌疑人禁毒序号 */
    private String jdXh;
    
    /** jdSdryxh 嫌疑人禁毒涉毒人员序号 */
    private String jdSdryxh;
    
    /** jdSdrybh 嫌疑人禁毒涉毒人员编号 */
    private String jdSdrybh;
    
    /** jdAjxh 嫌疑人禁毒案件序号 */
    private String jdAjxh;
    
    /** jdSdlx 嫌疑人禁毒涉毒类型 */
    private String jdSdlx;
    
    /** jdHdqy 嫌疑人禁毒活动区域 */
    private String jdHdqy;
    
    /** jdCzqk 嫌疑人禁毒处置情况 */
    private String jdCzqk;
    
    /** jdCzrq 嫌疑人禁毒处置日期 */
    private String jdCzrq;
    
    /** jdYhkfkyh 嫌疑人禁毒银行卡发卡银行 */
    private String jdYhkfkyh;
    
    /** jdYhkh 嫌疑人禁毒银行卡号 */
    private String jdYhkh;
    
    /** jdYhzh 嫌疑人禁毒银行账号 */
    private String jdYhzh;
    
    /** jdCph 嫌疑人禁毒车牌号 */
    private String jdCph;
    
    /** jdSfxd 嫌疑人禁毒是否吸毒 */
    private String jdSfxd;
    
    /** jdXsdpzl 嫌疑人禁毒吸食毒品种类 */
    private String jdXsdpzl;
    
    /** jdZsdpzl 嫌疑人禁毒注射毒品种类 */
    private String jdZsdpzl;
    
    /** jdFxcs 嫌疑人禁毒复吸次数 */
    private String jdFxcs;
    
    /** jdZtrybh 嫌疑人禁毒在逃人员编号 */
    private String jdZtrybh;
    
    /** jdSwztrq 嫌疑人禁毒上网追逃日期 */
    private String jdSwztrq;
    
    /** jdTjjb 嫌疑人禁毒通缉级别 */
    private String jdTjjb;
    
    /** jdZhxsly 嫌疑人禁毒抓获线索来源 */
    private String jdZhxsly;
    
    /** jdZhjg 嫌疑人禁毒抓获经过 */
    private String jdZhjg;
    
    /** jdSphzxqk 嫌疑人禁毒审判后执行情况 */
    private String jdSphzxqk;
    
    /** jdYjdq 嫌疑人禁毒移交地区 */
    private String jdYjdq;
    
    /** jdJhzazzy 嫌疑人禁毒结伙作案中作用 */
    private String jdJhzazzy;
    
    /** jdTsrq 嫌疑人禁毒特殊人群 */
    private String jdTsrq;
    
    /** jdGwyjry 嫌疑人禁毒高危预警人员 */
    private String jdGwyjry;
    
    /** xzQtky 嫌疑人其他口音 */
    private String xzQtky;
    
    /** xzQtsf 嫌疑人其他身份 */
    private String xzQtsf;
    
    /** xzLxr 嫌疑人联系人 */
    private String xzLxr;
    
    /** xzLxrdh 嫌疑人联系人电话 */
    private String xzLxrdh;
    
    /** xzSfayzw 嫌疑人是否捺印指纹 */
    private String xzSfayzw;
    
    /** xzSftqzy 嫌疑人是否提取足印 */
    private String xzSftqzy;
    
    /** xzSftqxy 嫌疑人是否提取鞋印 */
    private String xzSftqxy;
    
    /** xzSfbjcj 嫌疑人是否笔迹采集 */
    private String xzSfbjcj;
    
    /** xzSfxzcj 嫌疑人是否限制出境 */
    private String xzSfxzcj;
    
    /** xzSfcxy 嫌疑人是否采血样 */
    private String xzSfcxy;
    
    /** xzXybcdw 嫌疑人血样保存单位 */
    private String xzXybcdw;
    
    /** xzSflylx 嫌疑人是否录音录相 */
    private String xzSflylx;
    
    /** xzYxbcdw 嫌疑人音像保存单位 */
    private String xzYxbcdw;
    
    /** xzBjbcdw 嫌疑人笔迹保存单位 */
    private String xzBjbcdw;
    
    /** xzZhdw 嫌疑人现抓获单位 */
    private String xzZhdw;
    
    /** xzZhdwxz 嫌疑人抓获单位详址 */
    private String xzZhdwxz;
    
    /** xzTstzwpms 嫌疑人特殊特征物品描述 */
    private String xzTstzwpms;
    
    /** xzLxdh 嫌疑人抓获联系电话 */
    private String xzLxdh;
    
    /** xzXxzk 嫌疑人现行状况 */
    private String xzXxzk;
    
    /** xzZxd 嫌疑人执行地行政区划 */
    private String xzZxd;
    
    /** xzZxdxz 嫌疑人执行地详址 */
    private String xzZxdxz;
    
    /** xzSfrq 嫌疑人释放日期 */
    private String xzSfrq;
    
    /** xzSfly 嫌疑人释放理由 */
    private String xzSfly;
    
    /** xzJbqkjsxbx 嫌疑人基本情况及现实表现 */
    private String xzJbqkjsxbx;
    
    /** xzGlcs 嫌疑人管理措施 */
    private String xzGlcs;
    
    /** xzJgxzcy 嫌疑人监改小组成员 */
    private String xzJgxzcy;
    
    /** xzBgxj 嫌疑人变更续记 */
    private String xzBgxj;
    
    /** xzCfjsrq 嫌疑人处罚结束日期 */
    private String xzCfjsrq;
    
    /** xzYpxq 嫌疑人原判刑期 */
    private String xzYpxq;
    
    /** xzYztz 嫌疑人衣着特征 */
    private String xzYztz;
    
    /** xzZhyj 嫌疑人抓获依据 */
    private String xzZhyj;
    
    /** xzJzddlb 嫌疑人居住地点类别 */
    private String xzJzddlb;
    
    /** xzFwcsdh 嫌疑人服务处所电话 */
    private String xzFwcsdh;
    
    /** xzFwcsdz 嫌疑人服务处所地址 */
    private String xzFwcsdz;
    
    /** xzSfllsf 嫌疑人是否两劳释放 */
    private String xzSfllsf;
    
    /** xzSfyqk 嫌疑人是否有前科 */
    private String xzSfyqk;
    
    /** xzYwjsbs 嫌疑人有无精神病史 */
    private String xzYwjsbs;
    
    /** xzSftsrq 嫌疑人是否特殊人群 */
    private String xzSftsrq;
    
    /** xzGfbh 嫌疑人惯犯编号 */
    private String xzGfbh;
    
    /** xzLcbh 嫌疑人流窜编号 */
    private String xzLcbh;
    
    /** xzQx 嫌疑人去向 */
    private String xzQx;
    
    /** xzZjbh 嫌疑人足迹编号 */
    private String xzZjbh;
    
    /** xzCjdw 嫌疑人采集单位 */
    private String xzCjdw;
    
    /** xzCjsj 嫌疑人采集时间 */
    private String xzCjsj;
    
    /** xzSfsfbm 嫌疑人是否身份不明 */
    private String xzSfsfbm;
    
    /** xzSfbmlx 嫌疑人身份不明类型 */
    private String xzSfbmlx;
    
    /** xzSfbmbz 嫌疑人身份不明备注 */
    private String xzSfbmbz;
    
    /** xzZhdwdh 嫌疑人抓获单位联系电话 */
    private String xzZhdwdh;
    
    /** xzZhddfl 嫌疑人抓获地点分类 */
    private String xzZhddfl;
    
    /** cxbs 嫌疑人撤销标识 */
    private String cxbs;
    
    /** dascz 嫌疑人到案时穿着 */
    private String dascz;
    
    /** daxsly 嫌疑人到案线索来源 */
    private String daxsly;
    
    /** daxs 嫌疑人到案形式 */
    private String daxs;
    
    /** dajyaq 嫌疑人到案简要案情 */
    private String dajyaq;
    
    /** daphgzqk 嫌疑人到案配合工作情况 */
    private String daphgzqk;
    
    /** dajsr 嫌疑人到案接受人 */
    private String dajsr;
    
    /** dacjr 嫌疑人到案出具人 */
    private String dacjr;
    
    /** dacjdw 嫌疑人到案出具单位 */
    private String dacjdw;
    
    /** dacjrq 嫌疑人到案出具日期 */
    private String dacjrq;
    
    /** zjbqjg 嫌疑人证据保全结果 */
    private String zjbqjg;
    
    /** zjflyj 嫌疑人法律依据 */
    private String zjflyj;
    
    /** lxfs 嫌疑人履行方式 */
    private String lxfs;
    
    /** zm 嫌疑人罪名 */
    private String zm;
    
    /** zjnr 当场处罚证据内容 */
    private String zjnr;
    
    /** cfyj 当场处罚处罚依据 */
    private String cfyj;
    
    /** zxfs 当场处罚执行方式 */
    private String zxfs;
    
    /** xzTz 嫌疑人体重 */
    private Double xzTz;
    
    /** bghcs 嫌疑人变更后措施 */
    private String bghcs;
    
    /** sfhbzx 嫌疑人处罚是否合并执行 */
    private String sfhbzx;
    
    /** hbajbh 嫌疑人处罚合并案件编号 */
    private String hbajbh;
    
    /** ssjg 诉讼机关 */
    private String ssjg;
    
    /** fyjg 复议机关 */
    private String fyjg;
    
    /** xzSfgwyjry 嫌疑人是否高危预警人员 */
    private String xzSfgwyjry;
    
    /** jdSfjhgk 嫌疑人禁毒是否接回管控 */
    private String jdSfjhgk;
    
    /** hbzxcd 嫌疑人合并执行程度 */
    private String hbzxcd;
    
    /** hbzxsplx 嫌疑人合并执行审批类型 */
    private String hbzxsplx;
    
    /** hbzxcflb 嫌疑人合并执行处罚类别 */
    private String hbzxcflb;
    
    /** hbzxcfje 嫌疑人合并执行处罚金额 */
    private Integer hbzxcfje;
    
    /** hbzxcfqx 嫌疑人合并执行处罚期限 */
    private String hbzxcfqx;
    
    /** hbzxqssj 嫌疑人合并执行起始时间 */
    private String hbzxqssj;
    
    /** hbzxzzsj 嫌疑人合并执行终止时间 */
    private String hbzxzzsj;
    
    /** hbzxlxfs 嫌疑人合并执行履行方式 */
    private String hbzxlxfs;
    
    /** cflby 嫌疑人处罚类别1 */
    private String cflby;
    
    /** cfqky 嫌疑人处罚情况1 */
    private String cfqky;
    
    /** hbzxcflby 嫌疑人合并执行处罚类别1 */
    private String hbzxcflby;
    
    /** hbzxcfqky 嫌疑人合并执行处罚情况1   */
    private String hbzxcfqky;
    
    /** wbZcbs 嫌疑人外部综查标识 */
    private String wbZcbs;
    
    /** hbzxssjg 嫌疑人合并执行诉讼机关 */
    private String hbzxssjg;
    
    /** hbzxfyjg 嫌疑人合并执行复议机关 */
    private String hbzxfyjg;
    
    /** edZxfs 嫌疑人执行方式 */
    private String edZxfs;
    
    /** edZxsj 嫌疑人执行时间 */
    private String edZxsj;
    
    /** edZxdd 嫌疑人执行地点 */
    private String edZxdd;
    
    /** khjyzgqk 嫌疑人跨行交易产生战果情况 */
    private String khjyzgqk;
    
    /** sdShr 嫌疑人涉毒审核人 */
    private String sdShr;
    
    /** sdShjg 嫌疑人涉毒审核结果 */
    private String sdShjg;
    
    /** sdLgrq 嫌疑人涉毒列管日期 */
    private String sdLgrq;
    
    /** sdLgdwxz 嫌疑人涉毒列管单位详称 */
    private String sdLgdwxz;
    
    /** sdGxxz 嫌疑人涉毒管辖乡镇 */
    private String sdGxxz;
    
    /** sdGxsq 嫌疑人涉毒管辖社区 */
    private String sdGxsq;
    
    /** sdBjmj 嫌疑人涉毒帮教民警 */
    private String sdBjmj;
    
    /** hdzs 嫌疑人话单数 */
    private Integer hdzs;
    
    /** txlzs 嫌疑人通讯录数 */
    private Integer txlzs;
    
    /** bgjyqxyy 嫌疑人变更羁押期限原因 */
    private String bgjyqxyy;
    
    /** sfxdjc 嫌疑人是否吸毒检测 */
    private String sfxdjc;
    
    /** sfxd 嫌疑人是否吸毒 */
    private String sfxd;
    
    /** dpjcjg 嫌疑人毒品检测结果 */
    private String dpjcjg;
    
    /** wffzzj 嫌疑人违法犯罪证据 */
    private String wffzzj;
    
    /** wfxwmc 嫌疑人违法行为名称 */
    private String wfxwmc;
    
    /** sfhc  */
    private String sfhc;
    
    /** ryjs 嫌疑人员角色 */
    private String ryjs;
    
    /** rqgzxx 嫌疑人日期估值下限 */
    private String rqgzxx;
    
    /** rqgzsx 嫌疑人日期估值上限 */
    private String rqgzsx;
    
    /** jwgjdq 嫌疑人境外国家地区 */
    private String jwgjdq;
    
    /** jwdzxz 嫌疑人境外地址详址 */
    private String jwdzxz;
    
    /** tzxx 嫌疑人体重下限 */
    private Integer tzxx;
    
    /** tzsx 嫌疑人体重上限 */
    private Integer tzsx;
    
    /** zcxx 嫌疑人足长下限 */
    private Integer zcxx;
    
    /** zcsx  */
    private Integer zcsx;
    
    /** tmtzms 嫌疑人体貌特征描述 */
    private String tmtzms;
    
    /** tbbjms 嫌疑人体表标记描述 */
    private String tbbjms;
    
    /** ryqttzjyqk 嫌疑人人其他特征简要情况 */
    private String ryqttzjyqk;
    
    /** zylbbcms 嫌疑人职业类别补充描述 */
    private String zylbbcms;
    
    /** rysfbcms 嫌疑人人员身份补充描述 */
    private String rysfbcms;
    
    /** tszc 嫌疑人特殊专长 */
    private String tszc;
    
    /** dmbcms 嫌疑人特殊专长补充描述 */
    private String dmbcms;
    
    /** grahjhdtdjyqk 嫌疑人个人爱好及活动特点简要情况 */
    private String grahjhdtdjyqk;
    
    /** jnwqx 嫌疑人境内外去向 */
    private String jnwqx;
    
    /** rqxjyqk 嫌疑人人去向简要情况 */
    private String rqxjyqk;
    
    /** tpfxjyqk 嫌疑人逃跑方向简要情况 */
    private String tpfxjyqk;
    
    /** sfyxds 嫌疑人是否有吸毒史 */
    private String sfyxds;
    
    /** sfhy  */
    private String sfhy;
    
    /** sfzdjbhz 嫌疑人是否重大疾病患者 */
    private String sfzdjbhz;
    
    /** xyyjjyqk 嫌疑人嫌疑依据简要情况 */
    private String xyyjjyqk;
    
    /** sfszry 嫌疑人是否收赃人员 */
    private String sfszry;
    
    /** szjyqk 嫌疑人收赃简要情况 */
    private String szjyqk;
    
    /** zwjyqk 嫌疑人赃物简要情况 */
    private String zwjyqk;
    
    /** szddxzqh 嫌疑人收赃地点行政区划 */
    private String szddxzqh;
    
    /** szdddzxz 嫌疑人收赃地点地址详址 */
    private String szdddzxz;
    
    /** rdfzsspdbs 嫌疑人认定犯罪事实判断标识 */
    private String rdfzsspdbs;
    
    /** zcxwyjms 嫌疑人侦查行为依据描述 */
    private String zcxwyjms;
    
    /** ssxdwp 嫌疑人随身携带物品 */
    private String ssxdwp;
    
    /** dasj 嫌疑人到案时间 */
    private String dasj;
    
    /** swbh 嫌疑人声纹编号 */
    private String swbh;
    
    /** sissjbh 嫌疑人sis手机编号 */
    private String sissjbh;
    
    /** gtfzfzxyrdwzy 嫌疑人共同犯罪犯罪嫌疑人涉案地位作用 */
    private String gtfzfzxyrdwzy;
    
    /** sfbmyy 嫌疑人身份不明原因 */
    private String sfbmyy;
    
    /** rysfbsh 嫌疑人身份标识号 */
    private String rysfbsh;
    
    /** sdwlsfxx 嫌疑人涉毒网络身份信息 */
    private String sdwlsfxx;
    
    /** sdflwsbh 嫌疑人涉毒法律文书编号 */
    private String sdflwsbh;
    
    /** sdxzbm 嫌疑人涉毒协作部门 */
    private String sdxzbm;
    
    /** sdxzdq 嫌疑人涉毒协作地区 */
    private String sdxzdq;
    
    /** sdxzdw 嫌疑人涉毒协作单位 */
    private String sdxzdw;
    
    /** sdqtzjjhm 嫌疑人涉毒其他证件及号码 */
    private String sdqtzjjhm;
    
    /** sdztlx 嫌疑人涉毒在逃类型 */
    private String sdztlx;
    
    /** sdchlx 嫌疑人涉毒查获日期 */
    private String sdchlx;
    
    /** sdsftp 嫌疑人涉毒是否逃跑 */
    private String sdsftp;
    
    /** sdchdd 嫌疑人涉毒查获地点 */
    private String sdchdd;
    
    /** sdchdw 嫌疑人涉毒查获单位 */
    private String sdchdw;
    
    /** sdlad 嫌疑人涉毒立案地 */
    private String sdlad;
    
    /** zwcjsj 嫌疑人指纹采集时间 */
    private String zwcjsj;
    
    /** lyxdfs 嫌疑人涉毒滥用毒品方式 */
    private String lyxdfs;
    
    /** xsfs 嫌疑人涉毒吸食方式 */
    private String xsfs;
    
    /** xsgj 嫌疑人涉毒吸食工具 */
    private String xsgj;
    
    /** xzfwbshxq 嫌疑人服务标识号详情 */
    private String xzfwbshxq;
    
    /** xzsfmqbs 嫌疑人身份明确标识 */
    private String xzsfmqbs;
    
    /** jsxm 嫌疑人家属姓名 */
    private String jsxm;
    
    /** jslxdh 嫌疑人家属联系电话 */
    private String jslxdh;
    
    /** wftzyy 嫌疑人家属无法通知原因 */
    private String wftzyy;
    
    /** jsdzssxq 嫌疑人家属地址省市县区 */
    private String jsdzssxq;
    
    /** jszzxz 嫌疑人家属地址详址 */
    private String jszzxz;
    
    /** rjsj 嫌疑人入境时间 */
    private String rjsj;
    
    /** rjka 嫌疑人入境口岸 */
    private String rjka;
    
    /** ddsj 嫌疑人抵达时间 */
    private String ddsj;
    
    /** wtzhbs   嫌疑人委托执行标识 */
    private String wtzhbs;
    
    /** dsbs 地市标识 */
    private String dsbs;
    
    /** scrhjksj 首次入汇集库时间 */
    private String scrhjksj;
    
    /** hjkxgsj 汇集库修改时间 */
    private String hjkxgsj;


    private String jyaq;

    private String cbryj;

    public String getCbryj() {
        return cbryj;
    }

    public void setCbryj(String cbryj) {
        this.cbryj = cbryj;
    }

    public String getJyaq() {
        return jyaq;
    }

    public void setJyaq(String jyaq) {
        this.jyaq = jyaq;
    }

    /**
     * @return the xyrbh
     */
    public String getXyrbh() {
        return this.xyrbh;
    }

    /**
     * @param xyrbh the xyrbh to set
     */
    public void setXyrbh(String xyrbh) {
        this.xyrbh = xyrbh;
    }
    
    /**
     * @return the ajbh
     */
    public String getAjbh() {
        return this.ajbh;
    }

    /**
     * @param ajbh the ajbh to set
     */
    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }
    
    /**
     * @return the rybh
     */
    public String getRybh() {
        return this.rybh;
    }

    /**
     * @param rybh the rybh to set
     */
    public void setRybh(String rybh) {
        this.rybh = rybh;
    }
    
    /**
     * @return the gmsfhm
     */
    public String getGmsfhm() {
        return this.gmsfhm;
    }

    /**
     * @param gmsfhm the gmsfhm to set
     */
    public void setGmsfhm(String gmsfhm) {
        this.gmsfhm = gmsfhm;
    }
    
    /**
     * @return the xm
     */
    public String getXm() {
        return this.xm;
    }

    /**
     * @param xm the xm to set
     */
    public void setXm(String xm) {
        this.xm = xm;
    }
    
    /**
     * @return the xmpy
     */
    public String getXmpy() {
        return this.xmpy;
    }

    /**
     * @param xmpy the xmpy to set
     */
    public void setXmpy(String xmpy) {
        this.xmpy = xmpy;
    }
    
    /**
     * @return the cym
     */
    public String getCym() {
        return this.cym;
    }

    /**
     * @param cym the cym to set
     */
    public void setCym(String cym) {
        this.cym = cym;
    }
    
    /**
     * @return the cympy
     */
    public String getCympy() {
        return this.cympy;
    }

    /**
     * @param cympy the cympy to set
     */
    public void setCympy(String cympy) {
        this.cympy = cympy;
    }
    
    /**
     * @return the bmch
     */
    public String getBmch() {
        return this.bmch;
    }

    /**
     * @param bmch the bmch to set
     */
    public void setBmch(String bmch) {
        this.bmch = bmch;
    }
    
    /**
     * @return the bmchpy
     */
    public String getBmchpy() {
        return this.bmchpy;
    }

    /**
     * @param bmchpy the bmchpy to set
     */
    public void setBmchpy(String bmchpy) {
        this.bmchpy = bmchpy;
    }
    
    /**
     * @return the xb
     */
    public String getXb() {
        return this.xb;
    }

    /**
     * @param xb the xb to set
     */
    public void setXb(String xb) {
        this.xb = xb;
    }
    
    /**
     * @return the csrq
     */
    public String getCsrq() {
        return this.csrq;
    }

    /**
     * @param csrq the csrq to set
     */
    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }
    
    /**
     * @return the mz
     */
    public String getMz() {
        return this.mz;
    }

    /**
     * @param mz the mz to set
     */
    public void setMz(String mz) {
        this.mz = mz;
    }
    
    /**
     * @return the nlxx
     */
    public Integer getNlxx() {
        return this.nlxx;
    }

    /**
     * @param nlxx the nlxx to set
     */
    public void setNlxx(Integer nlxx) {
        this.nlxx = nlxx;
    }
    
    /**
     * @return the nlsx
     */
    public Integer getNlsx() {
        return this.nlsx;
    }

    /**
     * @param nlsx the nlsx to set
     */
    public void setNlsx(Integer nlsx) {
        this.nlsx = nlsx;
    }
    
    /**
     * @return the gjdq
     */
    public String getGjdq() {
        return this.gjdq;
    }

    /**
     * @param gjdq the gjdq to set
     */
    public void setGjdq(String gjdq) {
        this.gjdq = gjdq;
    }
    
    /**
     * @return the jggjdq
     */
    public String getJggjdq() {
        return this.jggjdq;
    }

    /**
     * @param jggjdq the jggjdq to set
     */
    public void setJggjdq(String jggjdq) {
        this.jggjdq = jggjdq;
    }
    
    /**
     * @return the jgssxq
     */
    public String getJgssxq() {
        return this.jgssxq;
    }

    /**
     * @param jgssxq the jgssxq to set
     */
    public void setJgssxq(String jgssxq) {
        this.jgssxq = jgssxq;
    }
    
    /**
     * @return the jgxz
     */
    public String getJgxz() {
        return this.jgxz;
    }

    /**
     * @param jgxz the jgxz to set
     */
    public void setJgxz(String jgxz) {
        this.jgxz = jgxz;
    }
    
    /**
     * @return the hjdzssxq
     */
    public String getHjdzssxq() {
        return this.hjdzssxq;
    }

    /**
     * @param hjdzssxq the hjdzssxq to set
     */
    public void setHjdzssxq(String hjdzssxq) {
        this.hjdzssxq = hjdzssxq;
    }
    
    /**
     * @return the hjdzxz
     */
    public String getHjdzxz() {
        return this.hjdzxz;
    }

    /**
     * @param hjdzxz the hjdzxz to set
     */
    public void setHjdzxz(String hjdzxz) {
        this.hjdzxz = hjdzxz;
    }
    
    /**
     * @return the zzbh
     */
    public String getZzbh() {
        return this.zzbh;
    }

    /**
     * @param zzbh the zzbh to set
     */
    public void setZzbh(String zzbh) {
        this.zzbh = zzbh;
    }
    
    /**
     * @return the xzqh
     */
    public String getXzqh() {
        return this.xzqh;
    }

    /**
     * @param xzqh the xzqh to set
     */
    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }
    
    /**
     * @return the zzxz
     */
    public String getZzxz() {
        return this.zzxz;
    }

    /**
     * @param zzxz the zzxz to set
     */
    public void setZzxz(String zzxz) {
        this.zzxz = zzxz;
    }
    
    /**
     * @return the whcd
     */
    public String getWhcd() {
        return this.whcd;
    }

    /**
     * @param whcd the whcd to set
     */
    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }
    
    /**
     * @return the hyzk
     */
    public String getHyzk() {
        return this.hyzk;
    }

    /**
     * @param hyzk the hyzk to set
     */
    public void setHyzk(String hyzk) {
        this.hyzk = hyzk;
    }
    
    /**
     * @return the zy
     */
    public String getZy() {
        return this.zy;
    }

    /**
     * @param zy the zy to set
     */
    public void setZy(String zy) {
        this.zy = zy;
    }
    
    /**
     * @return the zylb
     */
    public String getZylb() {
        return this.zylb;
    }

    /**
     * @param zylb the zylb to set
     */
    public void setZylb(String zylb) {
        this.zylb = zylb;
    }
    
    /**
     * @return the fwcs
     */
    public String getFwcs() {
        return this.fwcs;
    }

    /**
     * @param fwcs the fwcs to set
     */
    public void setFwcs(String fwcs) {
        this.fwcs = fwcs;
    }
    
    /**
     * @return the lxdh
     */
    public String getLxdh() {
        return this.lxdh;
    }

    /**
     * @param lxdh the lxdh to set
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }
    
    /**
     * @return the sgxx
     */
    public Integer getSgxx() {
        return this.sgxx;
    }

    /**
     * @param sgxx the sgxx to set
     */
    public void setSgxx(Integer sgxx) {
        this.sgxx = sgxx;
    }
    
    /**
     * @return the sgsx
     */
    public Integer getSgsx() {
        return this.sgsx;
    }

    /**
     * @param sgsx the sgsx to set
     */
    public void setSgsx(Integer sgsx) {
        this.sgsx = sgsx;
    }
    
    /**
     * @return the xx
     */
    public String getXx() {
        return this.xx;
    }

    /**
     * @param xx the xx to set
     */
    public void setXx(String xx) {
        this.xx = xx;
    }
    
    /**
     * @return the ky
     */
    public String getKy() {
        return this.ky;
    }

    /**
     * @param ky the ky to set
     */
    public void setKy(String ky) {
        this.ky = ky;
    }
    
    /**
     * @return the lx
     */
    public String getLx() {
        return this.lx;
    }

    /**
     * @param lx the lx to set
     */
    public void setLx(String lx) {
        this.lx = lx;
    }
    
    /**
     * @return the tx
     */
    public String getTx() {
        return this.tx;
    }

    /**
     * @param tx the tx to set
     */
    public void setTx(String tx) {
        this.tx = tx;
    }
    
    /**
     * @return the qttz
     */
    public String getQttz() {
        return this.qttz;
    }

    /**
     * @param qttz the qttz to set
     */
    public void setQttz(String qttz) {
        this.qttz = qttz;
    }
    
    /**
     * @return the tstz
     */
    public String getTstz() {
        return this.tstz;
    }

    /**
     * @param tstz the tstz to set
     */
    public void setTstz(String tstz) {
        this.tstz = tstz;
    }
    
    /**
     * @return the tbtz
     */
    public String getTbtz() {
        return this.tbtz;
    }

    /**
     * @param tbtz the tbtz to set
     */
    public void setTbtz(String tbtz) {
        this.tbtz = tbtz;
    }
    
    /**
     * @return the zc
     */
    public String getZc() {
        return this.zc;
    }

    /**
     * @param zc the zc to set
     */
    public void setZc(String zc) {
        this.zc = zc;
    }
    
    /**
     * @return the sf
     */
    public String getSf() {
        return this.sf;
    }

    /**
     * @param sf the sf to set
     */
    public void setSf(String sf) {
        this.sf = sf;
    }
    
    /**
     * @return the tssf
     */
    public String getTssf() {
        return this.tssf;
    }

    /**
     * @param tssf the tssf to set
     */
    public void setTssf(String tssf) {
        this.tssf = tssf;
    }
    
    /**
     * @return the sfjwry
     */
    public String getSfjwry() {
        return this.sfjwry;
    }

    /**
     * @param sfjwry the sfjwry to set
     */
    public void setSfjwry(String sfjwry) {
        this.sfjwry = sfjwry;
    }
    
    /**
     * @return the sflc
     */
    public String getSflc() {
        return this.sflc;
    }

    /**
     * @param sflc the sflc to set
     */
    public void setSflc(String sflc) {
        this.sflc = sflc;
    }
    
    /**
     * @return the sflf
     */
    public String getSflf() {
        return this.sflf;
    }

    /**
     * @param sflf the sflf to set
     */
    public void setSflf(String sflf) {
        this.sflf = sflf;
    }
    
    /**
     * @return the sfgf
     */
    public String getSfgf() {
        return this.sfgf;
    }

    /**
     * @param sfgf the sfgf to set
     */
    public void setSfgf(String sfgf) {
        this.sfgf = sfgf;
    }
    
    /**
     * @return the zlyy
     */
    public String getZlyy() {
        return this.zlyy;
    }

    /**
     * @param zlyy the zlyy to set
     */
    public void setZlyy(String zlyy) {
        this.zlyy = zlyy;
    }
    
    /**
     * @return the jkzk
     */
    public String getJkzk() {
        return this.jkzk;
    }

    /**
     * @param jkzk the jkzk to set
     */
    public void setJkzk(String jkzk) {
        this.jkzk = jkzk;
    }
    
    /**
     * @return the xgtd
     */
    public String getXgtd() {
        return this.xgtd;
    }

    /**
     * @param xgtd the xgtd to set
     */
    public void setXgtd(String xgtd) {
        this.xgtd = xgtd;
    }
    
    /**
     * @return the bajs
     */
    public String getBajs() {
        return this.bajs;
    }

    /**
     * @param bajs the bajs to set
     */
    public void setBajs(String bajs) {
        this.bajs = bajs;
    }
    
    /**
     * @return the zatd
     */
    public String getZatd() {
        return this.zatd;
    }

    /**
     * @param zatd the zatd to set
     */
    public void setZatd(String zatd) {
        this.zatd = zatd;
    }
    
    /**
     * @return the saqk
     */
    public String getSaqk() {
        return this.saqk;
    }

    /**
     * @param saqk the saqk to set
     */
    public void setSaqk(String saqk) {
        this.saqk = saqk;
    }
    
    /**
     * @return the cmsfrq
     */
    public String getCmsfrq() {
        return this.cmsfrq;
    }

    /**
     * @param cmsfrq the cmsfrq to set
     */
    public void setCmsfrq(String cmsfrq) {
        this.cmsfrq = cmsfrq;
    }
    
    /**
     * @return the zayy
     */
    public String getZayy() {
        return this.zayy;
    }

    /**
     * @param zayy the zayy to set
     */
    public void setZayy(String zayy) {
        this.zayy = zayy;
    }
    
    /**
     * @return the kyyj
     */
    public String getKyyj() {
        return this.kyyj;
    }

    /**
     * @param kyyj the kyyj to set
     */
    public void setKyyj(String kyyj) {
        this.kyyj = kyyj;
    }
    
    /**
     * @return the xszk
     */
    public String getXszk() {
        return this.xszk;
    }

    /**
     * @param xszk the xszk to set
     */
    public void setXszk(String xszk) {
        this.xszk = xszk;
    }
    
    /**
     * @return the zhrq
     */
    public String getZhrq() {
        return this.zhrq;
    }

    /**
     * @param zhrq the zhrq to set
     */
    public void setZhrq(String zhrq) {
        this.zhrq = zhrq;
    }
    
    /**
     * @return the zhfs
     */
    public String getZhfs() {
        return this.zhfs;
    }

    /**
     * @param zhfs the zhfs to set
     */
    public void setZhfs(String zhfs) {
        this.zhfs = zhfs;
    }
    
    /**
     * @return the zhdq
     */
    public String getZhdq() {
        return this.zhdq;
    }

    /**
     * @param zhdq the zhdq to set
     */
    public void setZhdq(String zhdq) {
        this.zhdq = zhdq;
    }
    
    /**
     * @return the zhdy
     */
    public String getZhdy() {
        return this.zhdy;
    }

    /**
     * @param zhdy the zhdy to set
     */
    public void setZhdy(String zhdy) {
        this.zhdy = zhdy;
    }
    
    /**
     * @return the zhdd
     */
    public String getZhdd() {
        return this.zhdd;
    }

    /**
     * @param zhdd the zhdd to set
     */
    public void setZhdd(String zhdd) {
        this.zhdd = zhdd;
    }
    
    /**
     * @return the zhr
     */
    public String getZhr() {
        return this.zhr;
    }

    /**
     * @param zhr the zhr to set
     */
    public void setZhr(String zhr) {
        this.zhr = zhr;
    }
    
    /**
     * @return the zhdw
     */
    public String getZhdw() {
        return this.zhdw;
    }

    /**
     * @param zhdw the zhdw to set
     */
    public void setZhdw(String zhdw) {
        this.zhdw = zhdw;
    }
    
    /**
     * @return the wffzjl
     */
    public String getWffzjl() {
        return this.wffzjl;
    }

    /**
     * @param wffzjl the wffzjl to set
     */
    public void setWffzjl(String wffzjl) {
        this.wffzjl = wffzjl;
    }
    
    /**
     * @return the wffzss
     */
    public String getWffzss() {
        return this.wffzss;
    }

    /**
     * @param wffzss the wffzss to set
     */
    public void setWffzss(String wffzss) {
        this.wffzss = wffzss;
    }
    
    /**
     * @return the ywx
     */
    public String getYwx() {
        return this.ywx;
    }

    /**
     * @param ywx the ywx to set
     */
    public void setYwx(String ywx) {
        this.ywx = ywx;
    }
    
    /**
     * @return the ywm
     */
    public String getYwm() {
        return this.ywm;
    }

    /**
     * @param ywm the ywm to set
     */
    public void setYwm(String ywm) {
        this.ywm = ywm;
    }
    
    /**
     * @return the zjzl
     */
    public String getZjzl() {
        return this.zjzl;
    }

    /**
     * @param zjzl the zjzl to set
     */
    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }
    
    /**
     * @return the zjhm
     */
    public String getZjhm() {
        return this.zjhm;
    }

    /**
     * @param zjhm the zjhm to set
     */
    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }
    
    /**
     * @return the qzzl
     */
    public String getQzzl() {
        return this.qzzl;
    }

    /**
     * @param qzzl the qzzl to set
     */
    public void setQzzl(String qzzl) {
        this.qzzl = qzzl;
    }
    
    /**
     * @return the tlyxq
     */
    public String getTlyxq() {
        return this.tlyxq;
    }

    /**
     * @param tlyxq the tlyxq to set
     */
    public void setTlyxq(String tlyxq) {
        this.tlyxq = tlyxq;
    }
    
    /**
     * @return the xyrsx
     */
    public String getXyrsx() {
        return this.xyrsx;
    }

    /**
     * @param xyrsx the xyrsx to set
     */
    public void setXyrsx(String xyrsx) {
        this.xyrsx = xyrsx;
    }
    
    /**
     * @return the zwbh
     */
    public String getZwbh() {
        return this.zwbh;
    }

    /**
     * @param zwbh the zwbh to set
     */
    public void setZwbh(String zwbh) {
        this.zwbh = zwbh;
    }
    
    /**
     * @return the dnabh
     */
    public String getDnabh() {
        return this.dnabh;
    }

    /**
     * @param dnabh the dnabh to set
     */
    public void setDnabh(String dnabh) {
        this.dnabh = dnabh;
    }
    
    /**
     * @return the bjkbh
     */
    public String getBjkbh() {
        return this.bjkbh;
    }

    /**
     * @param bjkbh the bjkbh to set
     */
    public void setBjkbh(String bjkbh) {
        this.bjkbh = bjkbh;
    }
    
    /**
     * @return the xyrbs
     */
    public String getXyrbs() {
        return this.xyrbs;
    }

    /**
     * @param xyrbs the xyrbs to set
     */
    public void setXyrbs(String xyrbs) {
        this.xyrbs = xyrbs;
    }
    
    /**
     * @return the bscly
     */
    public String getBscly() {
        return this.bscly;
    }

    /**
     * @param bscly the bscly to set
     */
    public void setBscly(String bscly) {
        this.bscly = bscly;
    }
    
    /**
     * @return the bfly
     */
    public String getBfly() {
        return this.bfly;
    }

    /**
     * @param bfly the bfly to set
     */
    public void setBfly(String bfly) {
        this.bfly = bfly;
    }
    
    /**
     * @return the dqzt
     */
    public String getDqzt() {
        return this.dqzt;
    }

    /**
     * @param dqzt the dqzt to set
     */
    public void setDqzt(String dqzt) {
        this.dqzt = dqzt;
    }
    
    /**
     * @return the bmjb
     */
    public String getBmjb() {
        return this.bmjb;
    }

    /**
     * @param bmjb the bmjb to set
     */
    public void setBmjb(String bmjb) {
        this.bmjb = bmjb;
    }
    
    /**
     * @return the swrq
     */
    public String getSwrq() {
        return this.swrq;
    }

    /**
     * @param swrq the swrq to set
     */
    public void setSwrq(String swrq) {
        this.swrq = swrq;
    }
    
    /**
     * @return the ajmc
     */
    public String getAjmc() {
        return this.ajmc;
    }

    /**
     * @param ajmc the ajmc to set
     */
    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }
    
    /**
     * @return the ajlb
     */
    public String getAjlb() {
        return this.ajlb;
    }

    /**
     * @param ajlb the ajlb to set
     */
    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }
    
    /**
     * @return the clfs
     */
    public String getClfs() {
        return this.clfs;
    }

    /**
     * @param clfs the clfs to set
     */
    public void setClfs(String clfs) {
        this.clfs = clfs;
    }
    
    /**
     * @return the cflx
     */
    public String getCflx() {
        return this.cflx;
    }

    /**
     * @param cflx the cflx to set
     */
    public void setCflx(String cflx) {
        this.cflx = cflx;
    }
    
    /**
     * @return the cfrq
     */
    public String getCfrq() {
        return this.cfrq;
    }

    /**
     * @param cfrq the cfrq to set
     */
    public void setCfrq(String cfrq) {
        this.cfrq = cfrq;
    }
    
    /**
     * @return the cfqk
     */
    public String getCfqk() {
        return this.cfqk;
    }

    /**
     * @param cfqk the cfqk to set
     */
    public void setCfqk(String cfqk) {
        this.cfqk = cfqk;
    }
    
    /**
     * @return the cfdw
     */
    public String getCfdw() {
        return this.cfdw;
    }

    /**
     * @param cfdw the cfdw to set
     */
    public void setCfdw(String cfdw) {
        this.cfdw = cfdw;
    }
    
    /**
     * @return the bz
     */
    public String getBz() {
        return this.bz;
    }

    /**
     * @param bz the bz to set
     */
    public void setBz(String bz) {
        this.bz = bz;
    }
    
    /**
     * @return the djdw
     */
    public String getDjdw() {
        return this.djdw;
    }

    /**
     * @param djdw the djdw to set
     */
    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }
    
    /**
     * @return the djr
     */
    public String getDjr() {
        return this.djr;
    }

    /**
     * @param djr the djr to set
     */
    public void setDjr(String djr) {
        this.djr = djr;
    }
    
    /**
     * @return the djrq
     */
    public String getDjrq() {
        return this.djrq;
    }

    /**
     * @param djrq the djrq to set
     */
    public void setDjrq(String djrq) {
        this.djrq = djrq;
    }
    
    /**
     * @return the czdw
     */
    public String getCzdw() {
        return this.czdw;
    }

    /**
     * @param czdw the czdw to set
     */
    public void setCzdw(String czdw) {
        this.czdw = czdw;
    }
    
    /**
     * @return the czr
     */
    public String getCzr() {
        return this.czr;
    }

    /**
     * @param czr the czr to set
     */
    public void setCzr(String czr) {
        this.czr = czr;
    }
    
    /**
     * @return the czsj
     */
    public String getCzsj() {
        return this.czsj;
    }

    /**
     * @param czsj the czsj to set
     */
    public void setCzsj(String czsj) {
        this.czsj = czsj;
    }
    
    /**
     * @return the czbs
     */
    public String getCzbs() {
        return this.czbs;
    }

    /**
     * @param czbs the czbs to set
     */
    public void setCzbs(String czbs) {
        this.czbs = czbs;
    }
    
    /**
     * @return the xzcflb
     */
    public String getXzcflb() {
        return this.xzcflb;
    }

    /**
     * @param xzcflb the xzcflb to set
     */
    public void setXzcflb(String xzcflb) {
        this.xzcflb = xzcflb;
    }
    
    /**
     * @return the xzcfje
     */
    public Integer getXzcfje() {
        return this.xzcfje;
    }

    /**
     * @param xzcfje the xzcfje to set
     */
    public void setXzcfje(Integer xzcfje) {
        this.xzcfje = xzcfje;
    }
    
    /**
     * @return the xzcfqx
     */
    public String getXzcfqx() {
        return this.xzcfqx;
    }

    /**
     * @param xzcfqx the xzcfqx to set
     */
    public void setXzcfqx(String xzcfqx) {
        this.xzcfqx = xzcfqx;
    }
    
    /**
     * @return the xzcfcd
     */
    public String getXzcfcd() {
        return this.xzcfcd;
    }

    /**
     * @param xzcfcd the xzcfcd to set
     */
    public void setXzcfcd(String xzcfcd) {
        this.xzcfcd = xzcfcd;
    }
    
    /**
     * @return the xzsplx
     */
    public String getXzsplx() {
        return this.xzsplx;
    }

    /**
     * @param xzsplx the xzsplx to set
     */
    public void setXzsplx(String xzsplx) {
        this.xzsplx = xzsplx;
    }
    
    /**
     * @return the jlx
     */
    public String getJlx() {
        return this.jlx;
    }

    /**
     * @param jlx the jlx to set
     */
    public void setJlx(String jlx) {
        this.jlx = jlx;
    }
    
    /**
     * @return the xyrjdjg
     */
    public String getXyrjdjg() {
        return this.xyrjdjg;
    }

    /**
     * @param xyrjdjg the xyrjdjg to set
     */
    public void setXyrjdjg(String xyrjdjg) {
        this.xyrjdjg = xyrjdjg;
    }
    
    /**
     * @return the xyrjdqx
     */
    public String getXyrjdqx() {
        return this.xyrjdqx;
    }

    /**
     * @param xyrjdqx the xyrjdqx to set
     */
    public void setXyrjdqx(String xyrjdqx) {
        this.xyrjdqx = xyrjdqx;
    }
    
    /**
     * @return the xyrqssj
     */
    public String getXyrqssj() {
        return this.xyrqssj;
    }

    /**
     * @param xyrqssj the xyrqssj to set
     */
    public void setXyrqssj(String xyrqssj) {
        this.xyrqssj = xyrqssj;
    }
    
    /**
     * @return the xyrzzsj
     */
    public String getXyrzzsj() {
        return this.xyrzzsj;
    }

    /**
     * @param xyrzzsj the xyrzzsj to set
     */
    public void setXyrzzsj(String xyrzzsj) {
        this.xyrzzsj = xyrzzsj;
    }
    
    /**
     * @return the bzrxm
     */
    public String getBzrxm() {
        return this.bzrxm;
    }

    /**
     * @param bzrxm the bzrxm to set
     */
    public void setBzrxm(String bzrxm) {
        this.bzrxm = bzrxm;
    }
    
    /**
     * @return the jdXh
     */
    public String getJdXh() {
        return this.jdXh;
    }

    /**
     * @param jdXh the jdXh to set
     */
    public void setJdXh(String jdXh) {
        this.jdXh = jdXh;
    }
    
    /**
     * @return the jdSdryxh
     */
    public String getJdSdryxh() {
        return this.jdSdryxh;
    }

    /**
     * @param jdSdryxh the jdSdryxh to set
     */
    public void setJdSdryxh(String jdSdryxh) {
        this.jdSdryxh = jdSdryxh;
    }
    
    /**
     * @return the jdSdrybh
     */
    public String getJdSdrybh() {
        return this.jdSdrybh;
    }

    /**
     * @param jdSdrybh the jdSdrybh to set
     */
    public void setJdSdrybh(String jdSdrybh) {
        this.jdSdrybh = jdSdrybh;
    }
    
    /**
     * @return the jdAjxh
     */
    public String getJdAjxh() {
        return this.jdAjxh;
    }

    /**
     * @param jdAjxh the jdAjxh to set
     */
    public void setJdAjxh(String jdAjxh) {
        this.jdAjxh = jdAjxh;
    }
    
    /**
     * @return the jdSdlx
     */
    public String getJdSdlx() {
        return this.jdSdlx;
    }

    /**
     * @param jdSdlx the jdSdlx to set
     */
    public void setJdSdlx(String jdSdlx) {
        this.jdSdlx = jdSdlx;
    }
    
    /**
     * @return the jdHdqy
     */
    public String getJdHdqy() {
        return this.jdHdqy;
    }

    /**
     * @param jdHdqy the jdHdqy to set
     */
    public void setJdHdqy(String jdHdqy) {
        this.jdHdqy = jdHdqy;
    }
    
    /**
     * @return the jdCzqk
     */
    public String getJdCzqk() {
        return this.jdCzqk;
    }

    /**
     * @param jdCzqk the jdCzqk to set
     */
    public void setJdCzqk(String jdCzqk) {
        this.jdCzqk = jdCzqk;
    }
    
    /**
     * @return the jdCzrq
     */
    public String getJdCzrq() {
        return this.jdCzrq;
    }

    /**
     * @param jdCzrq the jdCzrq to set
     */
    public void setJdCzrq(String jdCzrq) {
        this.jdCzrq = jdCzrq;
    }
    
    /**
     * @return the jdYhkfkyh
     */
    public String getJdYhkfkyh() {
        return this.jdYhkfkyh;
    }

    /**
     * @param jdYhkfkyh the jdYhkfkyh to set
     */
    public void setJdYhkfkyh(String jdYhkfkyh) {
        this.jdYhkfkyh = jdYhkfkyh;
    }
    
    /**
     * @return the jdYhkh
     */
    public String getJdYhkh() {
        return this.jdYhkh;
    }

    /**
     * @param jdYhkh the jdYhkh to set
     */
    public void setJdYhkh(String jdYhkh) {
        this.jdYhkh = jdYhkh;
    }
    
    /**
     * @return the jdYhzh
     */
    public String getJdYhzh() {
        return this.jdYhzh;
    }

    /**
     * @param jdYhzh the jdYhzh to set
     */
    public void setJdYhzh(String jdYhzh) {
        this.jdYhzh = jdYhzh;
    }
    
    /**
     * @return the jdCph
     */
    public String getJdCph() {
        return this.jdCph;
    }

    /**
     * @param jdCph the jdCph to set
     */
    public void setJdCph(String jdCph) {
        this.jdCph = jdCph;
    }
    
    /**
     * @return the jdSfxd
     */
    public String getJdSfxd() {
        return this.jdSfxd;
    }

    /**
     * @param jdSfxd the jdSfxd to set
     */
    public void setJdSfxd(String jdSfxd) {
        this.jdSfxd = jdSfxd;
    }
    
    /**
     * @return the jdXsdpzl
     */
    public String getJdXsdpzl() {
        return this.jdXsdpzl;
    }

    /**
     * @param jdXsdpzl the jdXsdpzl to set
     */
    public void setJdXsdpzl(String jdXsdpzl) {
        this.jdXsdpzl = jdXsdpzl;
    }
    
    /**
     * @return the jdZsdpzl
     */
    public String getJdZsdpzl() {
        return this.jdZsdpzl;
    }

    /**
     * @param jdZsdpzl the jdZsdpzl to set
     */
    public void setJdZsdpzl(String jdZsdpzl) {
        this.jdZsdpzl = jdZsdpzl;
    }
    
    /**
     * @return the jdFxcs
     */
    public String getJdFxcs() {
        return this.jdFxcs;
    }

    /**
     * @param jdFxcs the jdFxcs to set
     */
    public void setJdFxcs(String jdFxcs) {
        this.jdFxcs = jdFxcs;
    }
    
    /**
     * @return the jdZtrybh
     */
    public String getJdZtrybh() {
        return this.jdZtrybh;
    }

    /**
     * @param jdZtrybh the jdZtrybh to set
     */
    public void setJdZtrybh(String jdZtrybh) {
        this.jdZtrybh = jdZtrybh;
    }
    
    /**
     * @return the jdSwztrq
     */
    public String getJdSwztrq() {
        return this.jdSwztrq;
    }

    /**
     * @param jdSwztrq the jdSwztrq to set
     */
    public void setJdSwztrq(String jdSwztrq) {
        this.jdSwztrq = jdSwztrq;
    }
    
    /**
     * @return the jdTjjb
     */
    public String getJdTjjb() {
        return this.jdTjjb;
    }

    /**
     * @param jdTjjb the jdTjjb to set
     */
    public void setJdTjjb(String jdTjjb) {
        this.jdTjjb = jdTjjb;
    }
    
    /**
     * @return the jdZhxsly
     */
    public String getJdZhxsly() {
        return this.jdZhxsly;
    }

    /**
     * @param jdZhxsly the jdZhxsly to set
     */
    public void setJdZhxsly(String jdZhxsly) {
        this.jdZhxsly = jdZhxsly;
    }
    
    /**
     * @return the jdZhjg
     */
    public String getJdZhjg() {
        return this.jdZhjg;
    }

    /**
     * @param jdZhjg the jdZhjg to set
     */
    public void setJdZhjg(String jdZhjg) {
        this.jdZhjg = jdZhjg;
    }
    
    /**
     * @return the jdSphzxqk
     */
    public String getJdSphzxqk() {
        return this.jdSphzxqk;
    }

    /**
     * @param jdSphzxqk the jdSphzxqk to set
     */
    public void setJdSphzxqk(String jdSphzxqk) {
        this.jdSphzxqk = jdSphzxqk;
    }
    
    /**
     * @return the jdYjdq
     */
    public String getJdYjdq() {
        return this.jdYjdq;
    }

    /**
     * @param jdYjdq the jdYjdq to set
     */
    public void setJdYjdq(String jdYjdq) {
        this.jdYjdq = jdYjdq;
    }
    
    /**
     * @return the jdJhzazzy
     */
    public String getJdJhzazzy() {
        return this.jdJhzazzy;
    }

    /**
     * @param jdJhzazzy the jdJhzazzy to set
     */
    public void setJdJhzazzy(String jdJhzazzy) {
        this.jdJhzazzy = jdJhzazzy;
    }
    
    /**
     * @return the jdTsrq
     */
    public String getJdTsrq() {
        return this.jdTsrq;
    }

    /**
     * @param jdTsrq the jdTsrq to set
     */
    public void setJdTsrq(String jdTsrq) {
        this.jdTsrq = jdTsrq;
    }
    
    /**
     * @return the jdGwyjry
     */
    public String getJdGwyjry() {
        return this.jdGwyjry;
    }

    /**
     * @param jdGwyjry the jdGwyjry to set
     */
    public void setJdGwyjry(String jdGwyjry) {
        this.jdGwyjry = jdGwyjry;
    }
    
    /**
     * @return the xzQtky
     */
    public String getXzQtky() {
        return this.xzQtky;
    }

    /**
     * @param xzQtky the xzQtky to set
     */
    public void setXzQtky(String xzQtky) {
        this.xzQtky = xzQtky;
    }
    
    /**
     * @return the xzQtsf
     */
    public String getXzQtsf() {
        return this.xzQtsf;
    }

    /**
     * @param xzQtsf the xzQtsf to set
     */
    public void setXzQtsf(String xzQtsf) {
        this.xzQtsf = xzQtsf;
    }
    
    /**
     * @return the xzLxr
     */
    public String getXzLxr() {
        return this.xzLxr;
    }

    /**
     * @param xzLxr the xzLxr to set
     */
    public void setXzLxr(String xzLxr) {
        this.xzLxr = xzLxr;
    }
    
    /**
     * @return the xzLxrdh
     */
    public String getXzLxrdh() {
        return this.xzLxrdh;
    }

    /**
     * @param xzLxrdh the xzLxrdh to set
     */
    public void setXzLxrdh(String xzLxrdh) {
        this.xzLxrdh = xzLxrdh;
    }
    
    /**
     * @return the xzSfayzw
     */
    public String getXzSfayzw() {
        return this.xzSfayzw;
    }

    /**
     * @param xzSfayzw the xzSfayzw to set
     */
    public void setXzSfayzw(String xzSfayzw) {
        this.xzSfayzw = xzSfayzw;
    }
    
    /**
     * @return the xzSftqzy
     */
    public String getXzSftqzy() {
        return this.xzSftqzy;
    }

    /**
     * @param xzSftqzy the xzSftqzy to set
     */
    public void setXzSftqzy(String xzSftqzy) {
        this.xzSftqzy = xzSftqzy;
    }
    
    /**
     * @return the xzSftqxy
     */
    public String getXzSftqxy() {
        return this.xzSftqxy;
    }

    /**
     * @param xzSftqxy the xzSftqxy to set
     */
    public void setXzSftqxy(String xzSftqxy) {
        this.xzSftqxy = xzSftqxy;
    }
    
    /**
     * @return the xzSfbjcj
     */
    public String getXzSfbjcj() {
        return this.xzSfbjcj;
    }

    /**
     * @param xzSfbjcj the xzSfbjcj to set
     */
    public void setXzSfbjcj(String xzSfbjcj) {
        this.xzSfbjcj = xzSfbjcj;
    }
    
    /**
     * @return the xzSfxzcj
     */
    public String getXzSfxzcj() {
        return this.xzSfxzcj;
    }

    /**
     * @param xzSfxzcj the xzSfxzcj to set
     */
    public void setXzSfxzcj(String xzSfxzcj) {
        this.xzSfxzcj = xzSfxzcj;
    }
    
    /**
     * @return the xzSfcxy
     */
    public String getXzSfcxy() {
        return this.xzSfcxy;
    }

    /**
     * @param xzSfcxy the xzSfcxy to set
     */
    public void setXzSfcxy(String xzSfcxy) {
        this.xzSfcxy = xzSfcxy;
    }
    
    /**
     * @return the xzXybcdw
     */
    public String getXzXybcdw() {
        return this.xzXybcdw;
    }

    /**
     * @param xzXybcdw the xzXybcdw to set
     */
    public void setXzXybcdw(String xzXybcdw) {
        this.xzXybcdw = xzXybcdw;
    }
    
    /**
     * @return the xzSflylx
     */
    public String getXzSflylx() {
        return this.xzSflylx;
    }

    /**
     * @param xzSflylx the xzSflylx to set
     */
    public void setXzSflylx(String xzSflylx) {
        this.xzSflylx = xzSflylx;
    }
    
    /**
     * @return the xzYxbcdw
     */
    public String getXzYxbcdw() {
        return this.xzYxbcdw;
    }

    /**
     * @param xzYxbcdw the xzYxbcdw to set
     */
    public void setXzYxbcdw(String xzYxbcdw) {
        this.xzYxbcdw = xzYxbcdw;
    }
    
    /**
     * @return the xzBjbcdw
     */
    public String getXzBjbcdw() {
        return this.xzBjbcdw;
    }

    /**
     * @param xzBjbcdw the xzBjbcdw to set
     */
    public void setXzBjbcdw(String xzBjbcdw) {
        this.xzBjbcdw = xzBjbcdw;
    }
    
    /**
     * @return the xzZhdw
     */
    public String getXzZhdw() {
        return this.xzZhdw;
    }

    /**
     * @param xzZhdw the xzZhdw to set
     */
    public void setXzZhdw(String xzZhdw) {
        this.xzZhdw = xzZhdw;
    }
    
    /**
     * @return the xzZhdwxz
     */
    public String getXzZhdwxz() {
        return this.xzZhdwxz;
    }

    /**
     * @param xzZhdwxz the xzZhdwxz to set
     */
    public void setXzZhdwxz(String xzZhdwxz) {
        this.xzZhdwxz = xzZhdwxz;
    }
    
    /**
     * @return the xzTstzwpms
     */
    public String getXzTstzwpms() {
        return this.xzTstzwpms;
    }

    /**
     * @param xzTstzwpms the xzTstzwpms to set
     */
    public void setXzTstzwpms(String xzTstzwpms) {
        this.xzTstzwpms = xzTstzwpms;
    }
    
    /**
     * @return the xzLxdh
     */
    public String getXzLxdh() {
        return this.xzLxdh;
    }

    /**
     * @param xzLxdh the xzLxdh to set
     */
    public void setXzLxdh(String xzLxdh) {
        this.xzLxdh = xzLxdh;
    }
    
    /**
     * @return the xzXxzk
     */
    public String getXzXxzk() {
        return this.xzXxzk;
    }

    /**
     * @param xzXxzk the xzXxzk to set
     */
    public void setXzXxzk(String xzXxzk) {
        this.xzXxzk = xzXxzk;
    }
    
    /**
     * @return the xzZxd
     */
    public String getXzZxd() {
        return this.xzZxd;
    }

    /**
     * @param xzZxd the xzZxd to set
     */
    public void setXzZxd(String xzZxd) {
        this.xzZxd = xzZxd;
    }
    
    /**
     * @return the xzZxdxz
     */
    public String getXzZxdxz() {
        return this.xzZxdxz;
    }

    /**
     * @param xzZxdxz the xzZxdxz to set
     */
    public void setXzZxdxz(String xzZxdxz) {
        this.xzZxdxz = xzZxdxz;
    }
    
    /**
     * @return the xzSfrq
     */
    public String getXzSfrq() {
        return this.xzSfrq;
    }

    /**
     * @param xzSfrq the xzSfrq to set
     */
    public void setXzSfrq(String xzSfrq) {
        this.xzSfrq = xzSfrq;
    }
    
    /**
     * @return the xzSfly
     */
    public String getXzSfly() {
        return this.xzSfly;
    }

    /**
     * @param xzSfly the xzSfly to set
     */
    public void setXzSfly(String xzSfly) {
        this.xzSfly = xzSfly;
    }
    
    /**
     * @return the xzJbqkjsxbx
     */
    public String getXzJbqkjsxbx() {
        return this.xzJbqkjsxbx;
    }

    /**
     * @param xzJbqkjsxbx the xzJbqkjsxbx to set
     */
    public void setXzJbqkjsxbx(String xzJbqkjsxbx) {
        this.xzJbqkjsxbx = xzJbqkjsxbx;
    }
    
    /**
     * @return the xzGlcs
     */
    public String getXzGlcs() {
        return this.xzGlcs;
    }

    /**
     * @param xzGlcs the xzGlcs to set
     */
    public void setXzGlcs(String xzGlcs) {
        this.xzGlcs = xzGlcs;
    }
    
    /**
     * @return the xzJgxzcy
     */
    public String getXzJgxzcy() {
        return this.xzJgxzcy;
    }

    /**
     * @param xzJgxzcy the xzJgxzcy to set
     */
    public void setXzJgxzcy(String xzJgxzcy) {
        this.xzJgxzcy = xzJgxzcy;
    }
    
    /**
     * @return the xzBgxj
     */
    public String getXzBgxj() {
        return this.xzBgxj;
    }

    /**
     * @param xzBgxj the xzBgxj to set
     */
    public void setXzBgxj(String xzBgxj) {
        this.xzBgxj = xzBgxj;
    }
    
    /**
     * @return the xzCfjsrq
     */
    public String getXzCfjsrq() {
        return this.xzCfjsrq;
    }

    /**
     * @param xzCfjsrq the xzCfjsrq to set
     */
    public void setXzCfjsrq(String xzCfjsrq) {
        this.xzCfjsrq = xzCfjsrq;
    }
    
    /**
     * @return the xzYpxq
     */
    public String getXzYpxq() {
        return this.xzYpxq;
    }

    /**
     * @param xzYpxq the xzYpxq to set
     */
    public void setXzYpxq(String xzYpxq) {
        this.xzYpxq = xzYpxq;
    }
    
    /**
     * @return the xzYztz
     */
    public String getXzYztz() {
        return this.xzYztz;
    }

    /**
     * @param xzYztz the xzYztz to set
     */
    public void setXzYztz(String xzYztz) {
        this.xzYztz = xzYztz;
    }
    
    /**
     * @return the xzZhyj
     */
    public String getXzZhyj() {
        return this.xzZhyj;
    }

    /**
     * @param xzZhyj the xzZhyj to set
     */
    public void setXzZhyj(String xzZhyj) {
        this.xzZhyj = xzZhyj;
    }
    
    /**
     * @return the xzJzddlb
     */
    public String getXzJzddlb() {
        return this.xzJzddlb;
    }

    /**
     * @param xzJzddlb the xzJzddlb to set
     */
    public void setXzJzddlb(String xzJzddlb) {
        this.xzJzddlb = xzJzddlb;
    }
    
    /**
     * @return the xzFwcsdh
     */
    public String getXzFwcsdh() {
        return this.xzFwcsdh;
    }

    /**
     * @param xzFwcsdh the xzFwcsdh to set
     */
    public void setXzFwcsdh(String xzFwcsdh) {
        this.xzFwcsdh = xzFwcsdh;
    }
    
    /**
     * @return the xzFwcsdz
     */
    public String getXzFwcsdz() {
        return this.xzFwcsdz;
    }

    /**
     * @param xzFwcsdz the xzFwcsdz to set
     */
    public void setXzFwcsdz(String xzFwcsdz) {
        this.xzFwcsdz = xzFwcsdz;
    }
    
    /**
     * @return the xzSfllsf
     */
    public String getXzSfllsf() {
        return this.xzSfllsf;
    }

    /**
     * @param xzSfllsf the xzSfllsf to set
     */
    public void setXzSfllsf(String xzSfllsf) {
        this.xzSfllsf = xzSfllsf;
    }
    
    /**
     * @return the xzSfyqk
     */
    public String getXzSfyqk() {
        return this.xzSfyqk;
    }

    /**
     * @param xzSfyqk the xzSfyqk to set
     */
    public void setXzSfyqk(String xzSfyqk) {
        this.xzSfyqk = xzSfyqk;
    }
    
    /**
     * @return the xzYwjsbs
     */
    public String getXzYwjsbs() {
        return this.xzYwjsbs;
    }

    /**
     * @param xzYwjsbs the xzYwjsbs to set
     */
    public void setXzYwjsbs(String xzYwjsbs) {
        this.xzYwjsbs = xzYwjsbs;
    }
    
    /**
     * @return the xzSftsrq
     */
    public String getXzSftsrq() {
        return this.xzSftsrq;
    }

    /**
     * @param xzSftsrq the xzSftsrq to set
     */
    public void setXzSftsrq(String xzSftsrq) {
        this.xzSftsrq = xzSftsrq;
    }
    
    /**
     * @return the xzGfbh
     */
    public String getXzGfbh() {
        return this.xzGfbh;
    }

    /**
     * @param xzGfbh the xzGfbh to set
     */
    public void setXzGfbh(String xzGfbh) {
        this.xzGfbh = xzGfbh;
    }
    
    /**
     * @return the xzLcbh
     */
    public String getXzLcbh() {
        return this.xzLcbh;
    }

    /**
     * @param xzLcbh the xzLcbh to set
     */
    public void setXzLcbh(String xzLcbh) {
        this.xzLcbh = xzLcbh;
    }
    
    /**
     * @return the xzQx
     */
    public String getXzQx() {
        return this.xzQx;
    }

    /**
     * @param xzQx the xzQx to set
     */
    public void setXzQx(String xzQx) {
        this.xzQx = xzQx;
    }
    
    /**
     * @return the xzZjbh
     */
    public String getXzZjbh() {
        return this.xzZjbh;
    }

    /**
     * @param xzZjbh the xzZjbh to set
     */
    public void setXzZjbh(String xzZjbh) {
        this.xzZjbh = xzZjbh;
    }
    
    /**
     * @return the xzCjdw
     */
    public String getXzCjdw() {
        return this.xzCjdw;
    }

    /**
     * @param xzCjdw the xzCjdw to set
     */
    public void setXzCjdw(String xzCjdw) {
        this.xzCjdw = xzCjdw;
    }
    
    /**
     * @return the xzCjsj
     */
    public String getXzCjsj() {
        return this.xzCjsj;
    }

    /**
     * @param xzCjsj the xzCjsj to set
     */
    public void setXzCjsj(String xzCjsj) {
        this.xzCjsj = xzCjsj;
    }
    
    /**
     * @return the xzSfsfbm
     */
    public String getXzSfsfbm() {
        return this.xzSfsfbm;
    }

    /**
     * @param xzSfsfbm the xzSfsfbm to set
     */
    public void setXzSfsfbm(String xzSfsfbm) {
        this.xzSfsfbm = xzSfsfbm;
    }
    
    /**
     * @return the xzSfbmlx
     */
    public String getXzSfbmlx() {
        return this.xzSfbmlx;
    }

    /**
     * @param xzSfbmlx the xzSfbmlx to set
     */
    public void setXzSfbmlx(String xzSfbmlx) {
        this.xzSfbmlx = xzSfbmlx;
    }
    
    /**
     * @return the xzSfbmbz
     */
    public String getXzSfbmbz() {
        return this.xzSfbmbz;
    }

    /**
     * @param xzSfbmbz the xzSfbmbz to set
     */
    public void setXzSfbmbz(String xzSfbmbz) {
        this.xzSfbmbz = xzSfbmbz;
    }
    
    /**
     * @return the xzZhdwdh
     */
    public String getXzZhdwdh() {
        return this.xzZhdwdh;
    }

    /**
     * @param xzZhdwdh the xzZhdwdh to set
     */
    public void setXzZhdwdh(String xzZhdwdh) {
        this.xzZhdwdh = xzZhdwdh;
    }
    
    /**
     * @return the xzZhddfl
     */
    public String getXzZhddfl() {
        return this.xzZhddfl;
    }

    /**
     * @param xzZhddfl the xzZhddfl to set
     */
    public void setXzZhddfl(String xzZhddfl) {
        this.xzZhddfl = xzZhddfl;
    }
    
    /**
     * @return the cxbs
     */
    public String getCxbs() {
        return this.cxbs;
    }

    /**
     * @param cxbs the cxbs to set
     */
    public void setCxbs(String cxbs) {
        this.cxbs = cxbs;
    }
    
    /**
     * @return the dascz
     */
    public String getDascz() {
        return this.dascz;
    }

    /**
     * @param dascz the dascz to set
     */
    public void setDascz(String dascz) {
        this.dascz = dascz;
    }
    
    /**
     * @return the daxsly
     */
    public String getDaxsly() {
        return this.daxsly;
    }

    /**
     * @param daxsly the daxsly to set
     */
    public void setDaxsly(String daxsly) {
        this.daxsly = daxsly;
    }
    
    /**
     * @return the daxs
     */
    public String getDaxs() {
        return this.daxs;
    }

    /**
     * @param daxs the daxs to set
     */
    public void setDaxs(String daxs) {
        this.daxs = daxs;
    }
    
    /**
     * @return the dajyaq
     */
    public String getDajyaq() {
        return this.dajyaq;
    }

    /**
     * @param dajyaq the dajyaq to set
     */
    public void setDajyaq(String dajyaq) {
        this.dajyaq = dajyaq;
    }
    
    /**
     * @return the daphgzqk
     */
    public String getDaphgzqk() {
        return this.daphgzqk;
    }

    /**
     * @param daphgzqk the daphgzqk to set
     */
    public void setDaphgzqk(String daphgzqk) {
        this.daphgzqk = daphgzqk;
    }
    
    /**
     * @return the dajsr
     */
    public String getDajsr() {
        return this.dajsr;
    }

    /**
     * @param dajsr the dajsr to set
     */
    public void setDajsr(String dajsr) {
        this.dajsr = dajsr;
    }
    
    /**
     * @return the dacjr
     */
    public String getDacjr() {
        return this.dacjr;
    }

    /**
     * @param dacjr the dacjr to set
     */
    public void setDacjr(String dacjr) {
        this.dacjr = dacjr;
    }
    
    /**
     * @return the dacjdw
     */
    public String getDacjdw() {
        return this.dacjdw;
    }

    /**
     * @param dacjdw the dacjdw to set
     */
    public void setDacjdw(String dacjdw) {
        this.dacjdw = dacjdw;
    }
    
    /**
     * @return the dacjrq
     */
    public String getDacjrq() {
        return this.dacjrq;
    }

    /**
     * @param dacjrq the dacjrq to set
     */
    public void setDacjrq(String dacjrq) {
        this.dacjrq = dacjrq;
    }
    
    /**
     * @return the zjbqjg
     */
    public String getZjbqjg() {
        return this.zjbqjg;
    }

    /**
     * @param zjbqjg the zjbqjg to set
     */
    public void setZjbqjg(String zjbqjg) {
        this.zjbqjg = zjbqjg;
    }
    
    /**
     * @return the zjflyj
     */
    public String getZjflyj() {
        return this.zjflyj;
    }

    /**
     * @param zjflyj the zjflyj to set
     */
    public void setZjflyj(String zjflyj) {
        this.zjflyj = zjflyj;
    }
    
    /**
     * @return the lxfs
     */
    public String getLxfs() {
        return this.lxfs;
    }

    /**
     * @param lxfs the lxfs to set
     */
    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }
    
    /**
     * @return the zm
     */
    public String getZm() {
        return this.zm;
    }

    /**
     * @param zm the zm to set
     */
    public void setZm(String zm) {
        this.zm = zm;
    }
    
    /**
     * @return the zjnr
     */
    public String getZjnr() {
        return this.zjnr;
    }

    /**
     * @param zjnr the zjnr to set
     */
    public void setZjnr(String zjnr) {
        this.zjnr = zjnr;
    }
    
    /**
     * @return the cfyj
     */
    public String getCfyj() {
        return this.cfyj;
    }

    /**
     * @param cfyj the cfyj to set
     */
    public void setCfyj(String cfyj) {
        this.cfyj = cfyj;
    }
    
    /**
     * @return the zxfs
     */
    public String getZxfs() {
        return this.zxfs;
    }

    /**
     * @param zxfs the zxfs to set
     */
    public void setZxfs(String zxfs) {
        this.zxfs = zxfs;
    }
    
    /**
     * @return the xzTz
     */
    public Double getXzTz() {
        return this.xzTz;
    }

    /**
     * @param xzTz the xzTz to set
     */
    public void setXzTz(Double xzTz) {
        this.xzTz = xzTz;
    }
    
    /**
     * @return the bghcs
     */
    public String getBghcs() {
        return this.bghcs;
    }

    /**
     * @param bghcs the bghcs to set
     */
    public void setBghcs(String bghcs) {
        this.bghcs = bghcs;
    }
    
    /**
     * @return the sfhbzx
     */
    public String getSfhbzx() {
        return this.sfhbzx;
    }

    /**
     * @param sfhbzx the sfhbzx to set
     */
    public void setSfhbzx(String sfhbzx) {
        this.sfhbzx = sfhbzx;
    }
    
    /**
     * @return the hbajbh
     */
    public String getHbajbh() {
        return this.hbajbh;
    }

    /**
     * @param hbajbh the hbajbh to set
     */
    public void setHbajbh(String hbajbh) {
        this.hbajbh = hbajbh;
    }
    
    /**
     * @return the ssjg
     */
    public String getSsjg() {
        return this.ssjg;
    }

    /**
     * @param ssjg the ssjg to set
     */
    public void setSsjg(String ssjg) {
        this.ssjg = ssjg;
    }
    
    /**
     * @return the fyjg
     */
    public String getFyjg() {
        return this.fyjg;
    }

    /**
     * @param fyjg the fyjg to set
     */
    public void setFyjg(String fyjg) {
        this.fyjg = fyjg;
    }
    
    /**
     * @return the xzSfgwyjry
     */
    public String getXzSfgwyjry() {
        return this.xzSfgwyjry;
    }

    /**
     * @param xzSfgwyjry the xzSfgwyjry to set
     */
    public void setXzSfgwyjry(String xzSfgwyjry) {
        this.xzSfgwyjry = xzSfgwyjry;
    }
    
    /**
     * @return the jdSfjhgk
     */
    public String getJdSfjhgk() {
        return this.jdSfjhgk;
    }

    /**
     * @param jdSfjhgk the jdSfjhgk to set
     */
    public void setJdSfjhgk(String jdSfjhgk) {
        this.jdSfjhgk = jdSfjhgk;
    }
    
    /**
     * @return the hbzxcd
     */
    public String getHbzxcd() {
        return this.hbzxcd;
    }

    /**
     * @param hbzxcd the hbzxcd to set
     */
    public void setHbzxcd(String hbzxcd) {
        this.hbzxcd = hbzxcd;
    }
    
    /**
     * @return the hbzxsplx
     */
    public String getHbzxsplx() {
        return this.hbzxsplx;
    }

    /**
     * @param hbzxsplx the hbzxsplx to set
     */
    public void setHbzxsplx(String hbzxsplx) {
        this.hbzxsplx = hbzxsplx;
    }
    
    /**
     * @return the hbzxcflb
     */
    public String getHbzxcflb() {
        return this.hbzxcflb;
    }

    /**
     * @param hbzxcflb the hbzxcflb to set
     */
    public void setHbzxcflb(String hbzxcflb) {
        this.hbzxcflb = hbzxcflb;
    }
    
    /**
     * @return the hbzxcfje
     */
    public Integer getHbzxcfje() {
        return this.hbzxcfje;
    }

    /**
     * @param hbzxcfje the hbzxcfje to set
     */
    public void setHbzxcfje(Integer hbzxcfje) {
        this.hbzxcfje = hbzxcfje;
    }
    
    /**
     * @return the hbzxcfqx
     */
    public String getHbzxcfqx() {
        return this.hbzxcfqx;
    }

    /**
     * @param hbzxcfqx the hbzxcfqx to set
     */
    public void setHbzxcfqx(String hbzxcfqx) {
        this.hbzxcfqx = hbzxcfqx;
    }
    
    /**
     * @return the hbzxqssj
     */
    public String getHbzxqssj() {
        return this.hbzxqssj;
    }

    /**
     * @param hbzxqssj the hbzxqssj to set
     */
    public void setHbzxqssj(String hbzxqssj) {
        this.hbzxqssj = hbzxqssj;
    }
    
    /**
     * @return the hbzxzzsj
     */
    public String getHbzxzzsj() {
        return this.hbzxzzsj;
    }

    /**
     * @param hbzxzzsj the hbzxzzsj to set
     */
    public void setHbzxzzsj(String hbzxzzsj) {
        this.hbzxzzsj = hbzxzzsj;
    }
    
    /**
     * @return the hbzxlxfs
     */
    public String getHbzxlxfs() {
        return this.hbzxlxfs;
    }

    /**
     * @param hbzxlxfs the hbzxlxfs to set
     */
    public void setHbzxlxfs(String hbzxlxfs) {
        this.hbzxlxfs = hbzxlxfs;
    }
    
    /**
     * @return the cflby
     */
    public String getCflby() {
        return this.cflby;
    }

    /**
     * @param cflby the cflby to set
     */
    public void setCflby(String cflby) {
        this.cflby = cflby;
    }
    
    /**
     * @return the cfqky
     */
    public String getCfqky() {
        return this.cfqky;
    }

    /**
     * @param cfqky the cfqky to set
     */
    public void setCfqky(String cfqky) {
        this.cfqky = cfqky;
    }
    
    /**
     * @return the hbzxcflby
     */
    public String getHbzxcflby() {
        return this.hbzxcflby;
    }

    /**
     * @param hbzxcflby the hbzxcflby to set
     */
    public void setHbzxcflby(String hbzxcflby) {
        this.hbzxcflby = hbzxcflby;
    }
    
    /**
     * @return the hbzxcfqky
     */
    public String getHbzxcfqky() {
        return this.hbzxcfqky;
    }

    /**
     * @param hbzxcfqky the hbzxcfqky to set
     */
    public void setHbzxcfqky(String hbzxcfqky) {
        this.hbzxcfqky = hbzxcfqky;
    }
    
    /**
     * @return the wbZcbs
     */
    public String getWbZcbs() {
        return this.wbZcbs;
    }

    /**
     * @param wbZcbs the wbZcbs to set
     */
    public void setWbZcbs(String wbZcbs) {
        this.wbZcbs = wbZcbs;
    }
    
    /**
     * @return the hbzxssjg
     */
    public String getHbzxssjg() {
        return this.hbzxssjg;
    }

    /**
     * @param hbzxssjg the hbzxssjg to set
     */
    public void setHbzxssjg(String hbzxssjg) {
        this.hbzxssjg = hbzxssjg;
    }
    
    /**
     * @return the hbzxfyjg
     */
    public String getHbzxfyjg() {
        return this.hbzxfyjg;
    }

    /**
     * @param hbzxfyjg the hbzxfyjg to set
     */
    public void setHbzxfyjg(String hbzxfyjg) {
        this.hbzxfyjg = hbzxfyjg;
    }
    
    /**
     * @return the edZxfs
     */
    public String getEdZxfs() {
        return this.edZxfs;
    }

    /**
     * @param edZxfs the edZxfs to set
     */
    public void setEdZxfs(String edZxfs) {
        this.edZxfs = edZxfs;
    }
    
    /**
     * @return the edZxsj
     */
    public String getEdZxsj() {
        return this.edZxsj;
    }

    /**
     * @param edZxsj the edZxsj to set
     */
    public void setEdZxsj(String edZxsj) {
        this.edZxsj = edZxsj;
    }
    
    /**
     * @return the edZxdd
     */
    public String getEdZxdd() {
        return this.edZxdd;
    }

    /**
     * @param edZxdd the edZxdd to set
     */
    public void setEdZxdd(String edZxdd) {
        this.edZxdd = edZxdd;
    }
    
    /**
     * @return the khjyzgqk
     */
    public String getKhjyzgqk() {
        return this.khjyzgqk;
    }

    /**
     * @param khjyzgqk the khjyzgqk to set
     */
    public void setKhjyzgqk(String khjyzgqk) {
        this.khjyzgqk = khjyzgqk;
    }
    
    /**
     * @return the sdShr
     */
    public String getSdShr() {
        return this.sdShr;
    }

    /**
     * @param sdShr the sdShr to set
     */
    public void setSdShr(String sdShr) {
        this.sdShr = sdShr;
    }
    
    /**
     * @return the sdShjg
     */
    public String getSdShjg() {
        return this.sdShjg;
    }

    /**
     * @param sdShjg the sdShjg to set
     */
    public void setSdShjg(String sdShjg) {
        this.sdShjg = sdShjg;
    }
    
    /**
     * @return the sdLgrq
     */
    public String getSdLgrq() {
        return this.sdLgrq;
    }

    /**
     * @param sdLgrq the sdLgrq to set
     */
    public void setSdLgrq(String sdLgrq) {
        this.sdLgrq = sdLgrq;
    }
    
    /**
     * @return the sdLgdwxz
     */
    public String getSdLgdwxz() {
        return this.sdLgdwxz;
    }

    /**
     * @param sdLgdwxz the sdLgdwxz to set
     */
    public void setSdLgdwxz(String sdLgdwxz) {
        this.sdLgdwxz = sdLgdwxz;
    }
    
    /**
     * @return the sdGxxz
     */
    public String getSdGxxz() {
        return this.sdGxxz;
    }

    /**
     * @param sdGxxz the sdGxxz to set
     */
    public void setSdGxxz(String sdGxxz) {
        this.sdGxxz = sdGxxz;
    }
    
    /**
     * @return the sdGxsq
     */
    public String getSdGxsq() {
        return this.sdGxsq;
    }

    /**
     * @param sdGxsq the sdGxsq to set
     */
    public void setSdGxsq(String sdGxsq) {
        this.sdGxsq = sdGxsq;
    }
    
    /**
     * @return the sdBjmj
     */
    public String getSdBjmj() {
        return this.sdBjmj;
    }

    /**
     * @param sdBjmj the sdBjmj to set
     */
    public void setSdBjmj(String sdBjmj) {
        this.sdBjmj = sdBjmj;
    }
    
    /**
     * @return the hdzs
     */
    public Integer getHdzs() {
        return this.hdzs;
    }

    /**
     * @param hdzs the hdzs to set
     */
    public void setHdzs(Integer hdzs) {
        this.hdzs = hdzs;
    }
    
    /**
     * @return the txlzs
     */
    public Integer getTxlzs() {
        return this.txlzs;
    }

    /**
     * @param txlzs the txlzs to set
     */
    public void setTxlzs(Integer txlzs) {
        this.txlzs = txlzs;
    }
    
    /**
     * @return the bgjyqxyy
     */
    public String getBgjyqxyy() {
        return this.bgjyqxyy;
    }

    /**
     * @param bgjyqxyy the bgjyqxyy to set
     */
    public void setBgjyqxyy(String bgjyqxyy) {
        this.bgjyqxyy = bgjyqxyy;
    }
    
    /**
     * @return the sfxdjc
     */
    public String getSfxdjc() {
        return this.sfxdjc;
    }

    /**
     * @param sfxdjc the sfxdjc to set
     */
    public void setSfxdjc(String sfxdjc) {
        this.sfxdjc = sfxdjc;
    }
    
    /**
     * @return the sfxd
     */
    public String getSfxd() {
        return this.sfxd;
    }

    /**
     * @param sfxd the sfxd to set
     */
    public void setSfxd(String sfxd) {
        this.sfxd = sfxd;
    }
    
    /**
     * @return the dpjcjg
     */
    public String getDpjcjg() {
        return this.dpjcjg;
    }

    /**
     * @param dpjcjg the dpjcjg to set
     */
    public void setDpjcjg(String dpjcjg) {
        this.dpjcjg = dpjcjg;
    }
    
    /**
     * @return the wffzzj
     */
    public String getWffzzj() {
        return this.wffzzj;
    }

    /**
     * @param wffzzj the wffzzj to set
     */
    public void setWffzzj(String wffzzj) {
        this.wffzzj = wffzzj;
    }
    
    /**
     * @return the wfxwmc
     */
    public String getWfxwmc() {
        return this.wfxwmc;
    }

    /**
     * @param wfxwmc the wfxwmc to set
     */
    public void setWfxwmc(String wfxwmc) {
        this.wfxwmc = wfxwmc;
    }
    
    /**
     * @return the sfhc
     */
    public String getSfhc() {
        return this.sfhc;
    }

    /**
     * @param sfhc the sfhc to set
     */
    public void setSfhc(String sfhc) {
        this.sfhc = sfhc;
    }
    
    /**
     * @return the ryjs
     */
    public String getRyjs() {
        return this.ryjs;
    }

    /**
     * @param ryjs the ryjs to set
     */
    public void setRyjs(String ryjs) {
        this.ryjs = ryjs;
    }
    
    /**
     * @return the rqgzxx
     */
    public String getRqgzxx() {
        return this.rqgzxx;
    }

    /**
     * @param rqgzxx the rqgzxx to set
     */
    public void setRqgzxx(String rqgzxx) {
        this.rqgzxx = rqgzxx;
    }
    
    /**
     * @return the rqgzsx
     */
    public String getRqgzsx() {
        return this.rqgzsx;
    }

    /**
     * @param rqgzsx the rqgzsx to set
     */
    public void setRqgzsx(String rqgzsx) {
        this.rqgzsx = rqgzsx;
    }
    
    /**
     * @return the jwgjdq
     */
    public String getJwgjdq() {
        return this.jwgjdq;
    }

    /**
     * @param jwgjdq the jwgjdq to set
     */
    public void setJwgjdq(String jwgjdq) {
        this.jwgjdq = jwgjdq;
    }
    
    /**
     * @return the jwdzxz
     */
    public String getJwdzxz() {
        return this.jwdzxz;
    }

    /**
     * @param jwdzxz the jwdzxz to set
     */
    public void setJwdzxz(String jwdzxz) {
        this.jwdzxz = jwdzxz;
    }
    
    /**
     * @return the tzxx
     */
    public Integer getTzxx() {
        return this.tzxx;
    }

    /**
     * @param tzxx the tzxx to set
     */
    public void setTzxx(Integer tzxx) {
        this.tzxx = tzxx;
    }
    
    /**
     * @return the tzsx
     */
    public Integer getTzsx() {
        return this.tzsx;
    }

    /**
     * @param tzsx the tzsx to set
     */
    public void setTzsx(Integer tzsx) {
        this.tzsx = tzsx;
    }
    
    /**
     * @return the zcxx
     */
    public Integer getZcxx() {
        return this.zcxx;
    }

    /**
     * @param zcxx the zcxx to set
     */
    public void setZcxx(Integer zcxx) {
        this.zcxx = zcxx;
    }
    
    /**
     * @return the zcsx
     */
    public Integer getZcsx() {
        return this.zcsx;
    }

    /**
     * @param zcsx the zcsx to set
     */
    public void setZcsx(Integer zcsx) {
        this.zcsx = zcsx;
    }
    
    /**
     * @return the tmtzms
     */
    public String getTmtzms() {
        return this.tmtzms;
    }

    /**
     * @param tmtzms the tmtzms to set
     */
    public void setTmtzms(String tmtzms) {
        this.tmtzms = tmtzms;
    }
    
    /**
     * @return the tbbjms
     */
    public String getTbbjms() {
        return this.tbbjms;
    }

    /**
     * @param tbbjms the tbbjms to set
     */
    public void setTbbjms(String tbbjms) {
        this.tbbjms = tbbjms;
    }
    
    /**
     * @return the ryqttzjyqk
     */
    public String getRyqttzjyqk() {
        return this.ryqttzjyqk;
    }

    /**
     * @param ryqttzjyqk the ryqttzjyqk to set
     */
    public void setRyqttzjyqk(String ryqttzjyqk) {
        this.ryqttzjyqk = ryqttzjyqk;
    }
    
    /**
     * @return the zylbbcms
     */
    public String getZylbbcms() {
        return this.zylbbcms;
    }

    /**
     * @param zylbbcms the zylbbcms to set
     */
    public void setZylbbcms(String zylbbcms) {
        this.zylbbcms = zylbbcms;
    }
    
    /**
     * @return the rysfbcms
     */
    public String getRysfbcms() {
        return this.rysfbcms;
    }

    /**
     * @param rysfbcms the rysfbcms to set
     */
    public void setRysfbcms(String rysfbcms) {
        this.rysfbcms = rysfbcms;
    }
    
    /**
     * @return the tszc
     */
    public String getTszc() {
        return this.tszc;
    }

    /**
     * @param tszc the tszc to set
     */
    public void setTszc(String tszc) {
        this.tszc = tszc;
    }
    
    /**
     * @return the dmbcms
     */
    public String getDmbcms() {
        return this.dmbcms;
    }

    /**
     * @param dmbcms the dmbcms to set
     */
    public void setDmbcms(String dmbcms) {
        this.dmbcms = dmbcms;
    }
    
    /**
     * @return the grahjhdtdjyqk
     */
    public String getGrahjhdtdjyqk() {
        return this.grahjhdtdjyqk;
    }

    /**
     * @param grahjhdtdjyqk the grahjhdtdjyqk to set
     */
    public void setGrahjhdtdjyqk(String grahjhdtdjyqk) {
        this.grahjhdtdjyqk = grahjhdtdjyqk;
    }
    
    /**
     * @return the jnwqx
     */
    public String getJnwqx() {
        return this.jnwqx;
    }

    /**
     * @param jnwqx the jnwqx to set
     */
    public void setJnwqx(String jnwqx) {
        this.jnwqx = jnwqx;
    }
    
    /**
     * @return the rqxjyqk
     */
    public String getRqxjyqk() {
        return this.rqxjyqk;
    }

    /**
     * @param rqxjyqk the rqxjyqk to set
     */
    public void setRqxjyqk(String rqxjyqk) {
        this.rqxjyqk = rqxjyqk;
    }
    
    /**
     * @return the tpfxjyqk
     */
    public String getTpfxjyqk() {
        return this.tpfxjyqk;
    }

    /**
     * @param tpfxjyqk the tpfxjyqk to set
     */
    public void setTpfxjyqk(String tpfxjyqk) {
        this.tpfxjyqk = tpfxjyqk;
    }
    
    /**
     * @return the sfyxds
     */
    public String getSfyxds() {
        return this.sfyxds;
    }

    /**
     * @param sfyxds the sfyxds to set
     */
    public void setSfyxds(String sfyxds) {
        this.sfyxds = sfyxds;
    }
    
    /**
     * @return the sfhy
     */
    public String getSfhy() {
        return this.sfhy;
    }

    /**
     * @param sfhy the sfhy to set
     */
    public void setSfhy(String sfhy) {
        this.sfhy = sfhy;
    }
    
    /**
     * @return the sfzdjbhz
     */
    public String getSfzdjbhz() {
        return this.sfzdjbhz;
    }

    /**
     * @param sfzdjbhz the sfzdjbhz to set
     */
    public void setSfzdjbhz(String sfzdjbhz) {
        this.sfzdjbhz = sfzdjbhz;
    }
    
    /**
     * @return the xyyjjyqk
     */
    public String getXyyjjyqk() {
        return this.xyyjjyqk;
    }

    /**
     * @param xyyjjyqk the xyyjjyqk to set
     */
    public void setXyyjjyqk(String xyyjjyqk) {
        this.xyyjjyqk = xyyjjyqk;
    }
    
    /**
     * @return the sfszry
     */
    public String getSfszry() {
        return this.sfszry;
    }

    /**
     * @param sfszry the sfszry to set
     */
    public void setSfszry(String sfszry) {
        this.sfszry = sfszry;
    }
    
    /**
     * @return the szjyqk
     */
    public String getSzjyqk() {
        return this.szjyqk;
    }

    /**
     * @param szjyqk the szjyqk to set
     */
    public void setSzjyqk(String szjyqk) {
        this.szjyqk = szjyqk;
    }
    
    /**
     * @return the zwjyqk
     */
    public String getZwjyqk() {
        return this.zwjyqk;
    }

    /**
     * @param zwjyqk the zwjyqk to set
     */
    public void setZwjyqk(String zwjyqk) {
        this.zwjyqk = zwjyqk;
    }
    
    /**
     * @return the szddxzqh
     */
    public String getSzddxzqh() {
        return this.szddxzqh;
    }

    /**
     * @param szddxzqh the szddxzqh to set
     */
    public void setSzddxzqh(String szddxzqh) {
        this.szddxzqh = szddxzqh;
    }
    
    /**
     * @return the szdddzxz
     */
    public String getSzdddzxz() {
        return this.szdddzxz;
    }

    /**
     * @param szdddzxz the szdddzxz to set
     */
    public void setSzdddzxz(String szdddzxz) {
        this.szdddzxz = szdddzxz;
    }
    
    /**
     * @return the rdfzsspdbs
     */
    public String getRdfzsspdbs() {
        return this.rdfzsspdbs;
    }

    /**
     * @param rdfzsspdbs the rdfzsspdbs to set
     */
    public void setRdfzsspdbs(String rdfzsspdbs) {
        this.rdfzsspdbs = rdfzsspdbs;
    }
    
    /**
     * @return the zcxwyjms
     */
    public String getZcxwyjms() {
        return this.zcxwyjms;
    }

    /**
     * @param zcxwyjms the zcxwyjms to set
     */
    public void setZcxwyjms(String zcxwyjms) {
        this.zcxwyjms = zcxwyjms;
    }
    
    /**
     * @return the ssxdwp
     */
    public String getSsxdwp() {
        return this.ssxdwp;
    }

    /**
     * @param ssxdwp the ssxdwp to set
     */
    public void setSsxdwp(String ssxdwp) {
        this.ssxdwp = ssxdwp;
    }
    
    /**
     * @return the dasj
     */
    public String getDasj() {
        return this.dasj;
    }

    /**
     * @param dasj the dasj to set
     */
    public void setDasj(String dasj) {
        this.dasj = dasj;
    }
    
    /**
     * @return the swbh
     */
    public String getSwbh() {
        return this.swbh;
    }

    /**
     * @param swbh the swbh to set
     */
    public void setSwbh(String swbh) {
        this.swbh = swbh;
    }
    
    /**
     * @return the sissjbh
     */
    public String getSissjbh() {
        return this.sissjbh;
    }

    /**
     * @param sissjbh the sissjbh to set
     */
    public void setSissjbh(String sissjbh) {
        this.sissjbh = sissjbh;
    }
    
    /**
     * @return the gtfzfzxyrdwzy
     */
    public String getGtfzfzxyrdwzy() {
        return this.gtfzfzxyrdwzy;
    }

    /**
     * @param gtfzfzxyrdwzy the gtfzfzxyrdwzy to set
     */
    public void setGtfzfzxyrdwzy(String gtfzfzxyrdwzy) {
        this.gtfzfzxyrdwzy = gtfzfzxyrdwzy;
    }
    
    /**
     * @return the sfbmyy
     */
    public String getSfbmyy() {
        return this.sfbmyy;
    }

    /**
     * @param sfbmyy the sfbmyy to set
     */
    public void setSfbmyy(String sfbmyy) {
        this.sfbmyy = sfbmyy;
    }
    
    /**
     * @return the rysfbsh
     */
    public String getRysfbsh() {
        return this.rysfbsh;
    }

    /**
     * @param rysfbsh the rysfbsh to set
     */
    public void setRysfbsh(String rysfbsh) {
        this.rysfbsh = rysfbsh;
    }
    
    /**
     * @return the sdwlsfxx
     */
    public String getSdwlsfxx() {
        return this.sdwlsfxx;
    }

    /**
     * @param sdwlsfxx the sdwlsfxx to set
     */
    public void setSdwlsfxx(String sdwlsfxx) {
        this.sdwlsfxx = sdwlsfxx;
    }
    
    /**
     * @return the sdflwsbh
     */
    public String getSdflwsbh() {
        return this.sdflwsbh;
    }

    /**
     * @param sdflwsbh the sdflwsbh to set
     */
    public void setSdflwsbh(String sdflwsbh) {
        this.sdflwsbh = sdflwsbh;
    }
    
    /**
     * @return the sdxzbm
     */
    public String getSdxzbm() {
        return this.sdxzbm;
    }

    /**
     * @param sdxzbm the sdxzbm to set
     */
    public void setSdxzbm(String sdxzbm) {
        this.sdxzbm = sdxzbm;
    }
    
    /**
     * @return the sdxzdq
     */
    public String getSdxzdq() {
        return this.sdxzdq;
    }

    /**
     * @param sdxzdq the sdxzdq to set
     */
    public void setSdxzdq(String sdxzdq) {
        this.sdxzdq = sdxzdq;
    }
    
    /**
     * @return the sdxzdw
     */
    public String getSdxzdw() {
        return this.sdxzdw;
    }

    /**
     * @param sdxzdw the sdxzdw to set
     */
    public void setSdxzdw(String sdxzdw) {
        this.sdxzdw = sdxzdw;
    }
    
    /**
     * @return the sdqtzjjhm
     */
    public String getSdqtzjjhm() {
        return this.sdqtzjjhm;
    }

    /**
     * @param sdqtzjjhm the sdqtzjjhm to set
     */
    public void setSdqtzjjhm(String sdqtzjjhm) {
        this.sdqtzjjhm = sdqtzjjhm;
    }
    
    /**
     * @return the sdztlx
     */
    public String getSdztlx() {
        return this.sdztlx;
    }

    /**
     * @param sdztlx the sdztlx to set
     */
    public void setSdztlx(String sdztlx) {
        this.sdztlx = sdztlx;
    }
    
    /**
     * @return the sdchlx
     */
    public String getSdchlx() {
        return this.sdchlx;
    }

    /**
     * @param sdchlx the sdchlx to set
     */
    public void setSdchlx(String sdchlx) {
        this.sdchlx = sdchlx;
    }
    
    /**
     * @return the sdsftp
     */
    public String getSdsftp() {
        return this.sdsftp;
    }

    /**
     * @param sdsftp the sdsftp to set
     */
    public void setSdsftp(String sdsftp) {
        this.sdsftp = sdsftp;
    }
    
    /**
     * @return the sdchdd
     */
    public String getSdchdd() {
        return this.sdchdd;
    }

    /**
     * @param sdchdd the sdchdd to set
     */
    public void setSdchdd(String sdchdd) {
        this.sdchdd = sdchdd;
    }
    
    /**
     * @return the sdchdw
     */
    public String getSdchdw() {
        return this.sdchdw;
    }

    /**
     * @param sdchdw the sdchdw to set
     */
    public void setSdchdw(String sdchdw) {
        this.sdchdw = sdchdw;
    }
    
    /**
     * @return the sdlad
     */
    public String getSdlad() {
        return this.sdlad;
    }

    /**
     * @param sdlad the sdlad to set
     */
    public void setSdlad(String sdlad) {
        this.sdlad = sdlad;
    }
    
    /**
     * @return the zwcjsj
     */
    public String getZwcjsj() {
        return this.zwcjsj;
    }

    /**
     * @param zwcjsj the zwcjsj to set
     */
    public void setZwcjsj(String zwcjsj) {
        this.zwcjsj = zwcjsj;
    }
    
    /**
     * @return the lyxdfs
     */
    public String getLyxdfs() {
        return this.lyxdfs;
    }

    /**
     * @param lyxdfs the lyxdfs to set
     */
    public void setLyxdfs(String lyxdfs) {
        this.lyxdfs = lyxdfs;
    }
    
    /**
     * @return the xsfs
     */
    public String getXsfs() {
        return this.xsfs;
    }

    /**
     * @param xsfs the xsfs to set
     */
    public void setXsfs(String xsfs) {
        this.xsfs = xsfs;
    }
    
    /**
     * @return the xsgj
     */
    public String getXsgj() {
        return this.xsgj;
    }

    /**
     * @param xsgj the xsgj to set
     */
    public void setXsgj(String xsgj) {
        this.xsgj = xsgj;
    }
    
    /**
     * @return the xzfwbshxq
     */
    public String getXzfwbshxq() {
        return this.xzfwbshxq;
    }

    /**
     * @param xzfwbshxq the xzfwbshxq to set
     */
    public void setXzfwbshxq(String xzfwbshxq) {
        this.xzfwbshxq = xzfwbshxq;
    }
    
    /**
     * @return the xzsfmqbs
     */
    public String getXzsfmqbs() {
        return this.xzsfmqbs;
    }

    /**
     * @param xzsfmqbs the xzsfmqbs to set
     */
    public void setXzsfmqbs(String xzsfmqbs) {
        this.xzsfmqbs = xzsfmqbs;
    }
    
    /**
     * @return the jsxm
     */
    public String getJsxm() {
        return this.jsxm;
    }

    /**
     * @param jsxm the jsxm to set
     */
    public void setJsxm(String jsxm) {
        this.jsxm = jsxm;
    }
    
    /**
     * @return the jslxdh
     */
    public String getJslxdh() {
        return this.jslxdh;
    }

    /**
     * @param jslxdh the jslxdh to set
     */
    public void setJslxdh(String jslxdh) {
        this.jslxdh = jslxdh;
    }
    
    /**
     * @return the wftzyy
     */
    public String getWftzyy() {
        return this.wftzyy;
    }

    /**
     * @param wftzyy the wftzyy to set
     */
    public void setWftzyy(String wftzyy) {
        this.wftzyy = wftzyy;
    }
    
    /**
     * @return the jsdzssxq
     */
    public String getJsdzssxq() {
        return this.jsdzssxq;
    }

    /**
     * @param jsdzssxq the jsdzssxq to set
     */
    public void setJsdzssxq(String jsdzssxq) {
        this.jsdzssxq = jsdzssxq;
    }
    
    /**
     * @return the jszzxz
     */
    public String getJszzxz() {
        return this.jszzxz;
    }

    /**
     * @param jszzxz the jszzxz to set
     */
    public void setJszzxz(String jszzxz) {
        this.jszzxz = jszzxz;
    }
    
    /**
     * @return the rjsj
     */
    public String getRjsj() {
        return this.rjsj;
    }

    /**
     * @param rjsj the rjsj to set
     */
    public void setRjsj(String rjsj) {
        this.rjsj = rjsj;
    }
    
    /**
     * @return the rjka
     */
    public String getRjka() {
        return this.rjka;
    }

    /**
     * @param rjka the rjka to set
     */
    public void setRjka(String rjka) {
        this.rjka = rjka;
    }
    
    /**
     * @return the ddsj
     */
    public String getDdsj() {
        return this.ddsj;
    }

    /**
     * @param ddsj the ddsj to set
     */
    public void setDdsj(String ddsj) {
        this.ddsj = ddsj;
    }
    
    /**
     * @return the wtzhbs
     */
    public String getWtzhbs() {
        return this.wtzhbs;
    }

    /**
     * @param wtzhbs the wtzhbs to set
     */
    public void setWtzhbs(String wtzhbs) {
        this.wtzhbs = wtzhbs;
    }
    
    /**
     * @return the dsbs
     */
    public String getDsbs() {
        return this.dsbs;
    }

    /**
     * @param dsbs the dsbs to set
     */
    public void setDsbs(String dsbs) {
        this.dsbs = dsbs;
    }
    
    /**
     * @return the scrhjksj
     */
    public String getScrhjksj() {
        return this.scrhjksj;
    }

    /**
     * @param scrhjksj the scrhjksj to set
     */
    public void setScrhjksj(String scrhjksj) {
        this.scrhjksj = scrhjksj;
    }
    
    /**
     * @return the hjkxgsj
     */
    public String getHjkxgsj() {
        return this.hjkxgsj;
    }

    /**
     * @param hjkxgsj the hjkxgsj to set
     */
    public void setHjkxgsj(String hjkxgsj) {
        this.hjkxgsj = hjkxgsj;
    }
    
	/**
     * 覆盖父类toString方法
     */    
    @Override
    public String toString() {
        return "DqKEntity ["
        	+"xyrbh:"+xyrbh
        	+",ajbh:"+ajbh
        	+",rybh:"+rybh
        	+",gmsfhm:"+gmsfhm
        	+",xm:"+xm
        	+",xmpy:"+xmpy
        	+",cym:"+cym
        	+",cympy:"+cympy
        	+",bmch:"+bmch
        	+",bmchpy:"+bmchpy
        	+",xb:"+xb
        	+",csrq:"+csrq
        	+",mz:"+mz
        	+",nlxx:"+nlxx
        	+",nlsx:"+nlsx
        	+",gjdq:"+gjdq
        	+",jggjdq:"+jggjdq
        	+",jgssxq:"+jgssxq
        	+",jgxz:"+jgxz
        	+",hjdzssxq:"+hjdzssxq
        	+",hjdzxz:"+hjdzxz
        	+",zzbh:"+zzbh
        	+",xzqh:"+xzqh
        	+",zzxz:"+zzxz
        	+",whcd:"+whcd
        	+",hyzk:"+hyzk
        	+",zy:"+zy
        	+",zylb:"+zylb
        	+",fwcs:"+fwcs
        	+",lxdh:"+lxdh
        	+",sgxx:"+sgxx
        	+",sgsx:"+sgsx
        	+",xx:"+xx
        	+",ky:"+ky
        	+",lx:"+lx
        	+",tx:"+tx
        	+",qttz:"+qttz
        	+",tstz:"+tstz
        	+",tbtz:"+tbtz
        	+",zc:"+zc
        	+",sf:"+sf
        	+",tssf:"+tssf
        	+",sfjwry:"+sfjwry
        	+",sflc:"+sflc
        	+",sflf:"+sflf
        	+",sfgf:"+sfgf
        	+",zlyy:"+zlyy
        	+",jkzk:"+jkzk
        	+",xgtd:"+xgtd
        	+",bajs:"+bajs
        	+",zatd:"+zatd
        	+",saqk:"+saqk
        	+",cmsfrq:"+cmsfrq
        	+",zayy:"+zayy
        	+",kyyj:"+kyyj
        	+",xszk:"+xszk
        	+",zhrq:"+zhrq
        	+",zhfs:"+zhfs
        	+",zhdq:"+zhdq
        	+",zhdy:"+zhdy
        	+",zhdd:"+zhdd
        	+",zhr:"+zhr
        	+",zhdw:"+zhdw
        	+",wffzjl:"+wffzjl
        	+",wffzss:"+wffzss
        	+",ywx:"+ywx
        	+",ywm:"+ywm
        	+",zjzl:"+zjzl
        	+",zjhm:"+zjhm
        	+",qzzl:"+qzzl
        	+",tlyxq:"+tlyxq
        	+",xyrsx:"+xyrsx
        	+",zwbh:"+zwbh
        	+",dnabh:"+dnabh
        	+",bjkbh:"+bjkbh
        	+",xyrbs:"+xyrbs
        	+",bscly:"+bscly
        	+",bfly:"+bfly
        	+",dqzt:"+dqzt
        	+",bmjb:"+bmjb
        	+",swrq:"+swrq
        	+",ajmc:"+ajmc
        	+",ajlb:"+ajlb
        	+",clfs:"+clfs
        	+",cflx:"+cflx
        	+",cfrq:"+cfrq
        	+",cfqk:"+cfqk
        	+",cfdw:"+cfdw
        	+",bz:"+bz
        	+",djdw:"+djdw
        	+",djr:"+djr
        	+",djrq:"+djrq
        	+",czdw:"+czdw
        	+",czr:"+czr
        	+",czsj:"+czsj
        	+",czbs:"+czbs
        	+",xzcflb:"+xzcflb
        	+",xzcfje:"+xzcfje
        	+",xzcfqx:"+xzcfqx
        	+",xzcfcd:"+xzcfcd
        	+",xzsplx:"+xzsplx
        	+",jlx:"+jlx
        	+",xyrjdjg:"+xyrjdjg
        	+",xyrjdqx:"+xyrjdqx
        	+",xyrqssj:"+xyrqssj
        	+",xyrzzsj:"+xyrzzsj
        	+",bzrxm:"+bzrxm
        	+",jdXh:"+jdXh
        	+",jdSdryxh:"+jdSdryxh
        	+",jdSdrybh:"+jdSdrybh
        	+",jdAjxh:"+jdAjxh
        	+",jdSdlx:"+jdSdlx
        	+",jdHdqy:"+jdHdqy
        	+",jdCzqk:"+jdCzqk
        	+",jdCzrq:"+jdCzrq
        	+",jdYhkfkyh:"+jdYhkfkyh
        	+",jdYhkh:"+jdYhkh
        	+",jdYhzh:"+jdYhzh
        	+",jdCph:"+jdCph
        	+",jdSfxd:"+jdSfxd
        	+",jdXsdpzl:"+jdXsdpzl
        	+",jdZsdpzl:"+jdZsdpzl
        	+",jdFxcs:"+jdFxcs
        	+",jdZtrybh:"+jdZtrybh
        	+",jdSwztrq:"+jdSwztrq
        	+",jdTjjb:"+jdTjjb
        	+",jdZhxsly:"+jdZhxsly
        	+",jdZhjg:"+jdZhjg
        	+",jdSphzxqk:"+jdSphzxqk
        	+",jdYjdq:"+jdYjdq
        	+",jdJhzazzy:"+jdJhzazzy
        	+",jdTsrq:"+jdTsrq
        	+",jdGwyjry:"+jdGwyjry
        	+",xzQtky:"+xzQtky
        	+",xzQtsf:"+xzQtsf
        	+",xzLxr:"+xzLxr
        	+",xzLxrdh:"+xzLxrdh
        	+",xzSfayzw:"+xzSfayzw
        	+",xzSftqzy:"+xzSftqzy
        	+",xzSftqxy:"+xzSftqxy
        	+",xzSfbjcj:"+xzSfbjcj
        	+",xzSfxzcj:"+xzSfxzcj
        	+",xzSfcxy:"+xzSfcxy
        	+",xzXybcdw:"+xzXybcdw
        	+",xzSflylx:"+xzSflylx
        	+",xzYxbcdw:"+xzYxbcdw
        	+",xzBjbcdw:"+xzBjbcdw
        	+",xzZhdw:"+xzZhdw
        	+",xzZhdwxz:"+xzZhdwxz
        	+",xzTstzwpms:"+xzTstzwpms
        	+",xzLxdh:"+xzLxdh
        	+",xzXxzk:"+xzXxzk
        	+",xzZxd:"+xzZxd
        	+",xzZxdxz:"+xzZxdxz
        	+",xzSfrq:"+xzSfrq
        	+",xzSfly:"+xzSfly
        	+",xzJbqkjsxbx:"+xzJbqkjsxbx
        	+",xzGlcs:"+xzGlcs
        	+",xzJgxzcy:"+xzJgxzcy
        	+",xzBgxj:"+xzBgxj
        	+",xzCfjsrq:"+xzCfjsrq
        	+",xzYpxq:"+xzYpxq
        	+",xzYztz:"+xzYztz
        	+",xzZhyj:"+xzZhyj
        	+",xzJzddlb:"+xzJzddlb
        	+",xzFwcsdh:"+xzFwcsdh
        	+",xzFwcsdz:"+xzFwcsdz
        	+",xzSfllsf:"+xzSfllsf
        	+",xzSfyqk:"+xzSfyqk
        	+",xzYwjsbs:"+xzYwjsbs
        	+",xzSftsrq:"+xzSftsrq
        	+",xzGfbh:"+xzGfbh
        	+",xzLcbh:"+xzLcbh
        	+",xzQx:"+xzQx
        	+",xzZjbh:"+xzZjbh
        	+",xzCjdw:"+xzCjdw
        	+",xzCjsj:"+xzCjsj
        	+",xzSfsfbm:"+xzSfsfbm
        	+",xzSfbmlx:"+xzSfbmlx
        	+",xzSfbmbz:"+xzSfbmbz
        	+",xzZhdwdh:"+xzZhdwdh
        	+",xzZhddfl:"+xzZhddfl
        	+",cxbs:"+cxbs
        	+",dascz:"+dascz
        	+",daxsly:"+daxsly
        	+",daxs:"+daxs
        	+",dajyaq:"+dajyaq
        	+",daphgzqk:"+daphgzqk
        	+",dajsr:"+dajsr
        	+",dacjr:"+dacjr
        	+",dacjdw:"+dacjdw
        	+",dacjrq:"+dacjrq
        	+",zjbqjg:"+zjbqjg
        	+",zjflyj:"+zjflyj
        	+",lxfs:"+lxfs
        	+",zm:"+zm
        	+",zjnr:"+zjnr
        	+",cfyj:"+cfyj
        	+",zxfs:"+zxfs
        	+",xzTz:"+xzTz
        	+",bghcs:"+bghcs
        	+",sfhbzx:"+sfhbzx
        	+",hbajbh:"+hbajbh
        	+",ssjg:"+ssjg
        	+",fyjg:"+fyjg
        	+",xzSfgwyjry:"+xzSfgwyjry
        	+",jdSfjhgk:"+jdSfjhgk
        	+",hbzxcd:"+hbzxcd
        	+",hbzxsplx:"+hbzxsplx
        	+",hbzxcflb:"+hbzxcflb
        	+",hbzxcfje:"+hbzxcfje
        	+",hbzxcfqx:"+hbzxcfqx
        	+",hbzxqssj:"+hbzxqssj
        	+",hbzxzzsj:"+hbzxzzsj
        	+",hbzxlxfs:"+hbzxlxfs
        	+",cflby:"+cflby
        	+",cfqky:"+cfqky
        	+",hbzxcflby:"+hbzxcflby
        	+",hbzxcfqky:"+hbzxcfqky
        	+",wbZcbs:"+wbZcbs
        	+",hbzxssjg:"+hbzxssjg
        	+",hbzxfyjg:"+hbzxfyjg
        	+",edZxfs:"+edZxfs
        	+",edZxsj:"+edZxsj
        	+",edZxdd:"+edZxdd
        	+",khjyzgqk:"+khjyzgqk
        	+",sdShr:"+sdShr
        	+",sdShjg:"+sdShjg
        	+",sdLgrq:"+sdLgrq
        	+",sdLgdwxz:"+sdLgdwxz
        	+",sdGxxz:"+sdGxxz
        	+",sdGxsq:"+sdGxsq
        	+",sdBjmj:"+sdBjmj
        	+",hdzs:"+hdzs
        	+",txlzs:"+txlzs
        	+",bgjyqxyy:"+bgjyqxyy
        	+",sfxdjc:"+sfxdjc
        	+",sfxd:"+sfxd
        	+",dpjcjg:"+dpjcjg
        	+",wffzzj:"+wffzzj
        	+",wfxwmc:"+wfxwmc
        	+",sfhc:"+sfhc
        	+",ryjs:"+ryjs
        	+",rqgzxx:"+rqgzxx
        	+",rqgzsx:"+rqgzsx
        	+",jwgjdq:"+jwgjdq
        	+",jwdzxz:"+jwdzxz
        	+",tzxx:"+tzxx
        	+",tzsx:"+tzsx
        	+",zcxx:"+zcxx
        	+",zcsx:"+zcsx
        	+",tmtzms:"+tmtzms
        	+",tbbjms:"+tbbjms
        	+",ryqttzjyqk:"+ryqttzjyqk
        	+",zylbbcms:"+zylbbcms
        	+",rysfbcms:"+rysfbcms
        	+",tszc:"+tszc
        	+",dmbcms:"+dmbcms
        	+",grahjhdtdjyqk:"+grahjhdtdjyqk
        	+",jnwqx:"+jnwqx
        	+",rqxjyqk:"+rqxjyqk
        	+",tpfxjyqk:"+tpfxjyqk
        	+",sfyxds:"+sfyxds
        	+",sfhy:"+sfhy
        	+",sfzdjbhz:"+sfzdjbhz
        	+",xyyjjyqk:"+xyyjjyqk
        	+",sfszry:"+sfszry
        	+",szjyqk:"+szjyqk
        	+",zwjyqk:"+zwjyqk
        	+",szddxzqh:"+szddxzqh
        	+",szdddzxz:"+szdddzxz
        	+",rdfzsspdbs:"+rdfzsspdbs
        	+",zcxwyjms:"+zcxwyjms
        	+",ssxdwp:"+ssxdwp
        	+",dasj:"+dasj
        	+",swbh:"+swbh
        	+",sissjbh:"+sissjbh
        	+",gtfzfzxyrdwzy:"+gtfzfzxyrdwzy
        	+",sfbmyy:"+sfbmyy
        	+",rysfbsh:"+rysfbsh
        	+",sdwlsfxx:"+sdwlsfxx
        	+",sdflwsbh:"+sdflwsbh
        	+",sdxzbm:"+sdxzbm
        	+",sdxzdq:"+sdxzdq
        	+",sdxzdw:"+sdxzdw
        	+",sdqtzjjhm:"+sdqtzjjhm
        	+",sdztlx:"+sdztlx
        	+",sdchlx:"+sdchlx
        	+",sdsftp:"+sdsftp
        	+",sdchdd:"+sdchdd
        	+",sdchdw:"+sdchdw
        	+",sdlad:"+sdlad
        	+",zwcjsj:"+zwcjsj
        	+",lyxdfs:"+lyxdfs
        	+",xsfs:"+xsfs
        	+",xsgj:"+xsgj
        	+",xzfwbshxq:"+xzfwbshxq
        	+",xzsfmqbs:"+xzsfmqbs
        	+",jsxm:"+jsxm
        	+",jslxdh:"+jslxdh
        	+",wftzyy:"+wftzyy
        	+",jsdzssxq:"+jsdzssxq
        	+",jszzxz:"+jszzxz
        	+",rjsj:"+rjsj
        	+",rjka:"+rjka
        	+",ddsj:"+ddsj
        	+",wtzhbs:"+wtzhbs
        	+",dsbs:"+dsbs
        	+",scrhjksj:"+scrhjksj
        	+",hjkxgsj:"+hjkxgsj
        +"]";
    }
    

}