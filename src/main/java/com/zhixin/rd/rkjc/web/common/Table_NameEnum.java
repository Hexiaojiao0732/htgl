package com.zhixin.rd.rkjc.web.common;

/**
 * Created by 19703 on 2017/8/11.
 */
public enum  Table_NameEnum {
    吸毒人员("HJK_ZNB_21_JD.B_XDRY","吸毒人员"),
    驾驶员基本信息表("HJK_ZNB_17_JG.DRIVINGLICENSE","驾驶员"),
    国保重点案件("HJK_ZNB_01_GB.TBL_E_CASE","国保重点案件"),
    国保重点组织("HJK_ZNB_01_GB.TBL_E_ORG","国保重点组织"),
    国保重点人员("HJK_ZNB_01_GB.TBL_E_PEOPLE","国保重点人员"),
    新警综案件基本信息表("HJK_NEW_JZPT.AJ_JBXX","新警综案件基本"),
    新警综案件嫌疑人信息表("HJK_NEW_JZPT.AJ_XYRXX","新警综案件嫌疑人"),
    老警综案件基本信息表("HJK_ZNB_22_JZPT.JZPT_AJJBXXB","老警综案件"),
    老警综案件嫌疑人信息表("HJK_ZNB_22_JZPT.JZPT_AJXYRCLXX","老警综案件嫌疑人"),
    全国在逃人员基本信息表("HJK_ZNB_05_XZ.QG_ZTRY_JBXX","全国在逃人员"),
    全国在逃撤销人员基本信息表("HJK_ZNB_05_XZ.QG_CXRY_JBXX","全国在逃撤销人员"),
    司法厅强制戒毒人员("HJK_WBSJ.SFT_SFQZJDSZCRYMD","司法厅强制戒毒人员"),
    司法厅刑满释放人员("HJK_WBSJ.SFT_XMSFRY","司法厅刑满释放人员"),
    交通违章信息表("HJK_ZNB_17_JG.VIO_VIOLATION","交通违章");

    // 成员变量
    private String key;
    private String value;

    // 构造方法
    private Table_NameEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // 覆盖方法
    @Override
    public String toString() {
        return this.key + "_" + this.value;
    }

    // 普通方法
    public static String getValue(String key) {
        for (Table_NameEnum c : Table_NameEnum.values()) {
            if (c.getKey().equals(key)) {
                return c.getValue();
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
