package com.zhixin.rd.rkjc.web.common;

/**
 * Created by 19703 on 2017/8/11.
 */
public enum  Wffzqk_TableNamesEnum {
    表1("1","wffzqk_1"),
    表2("2","wffzqk_2"),
    表3("3","wffzqk_3"),
    表5("5","wffzqk_5"),
    表6("6","wffzqk_6"),
    表7("7","wffzqk_7"),
    表8("8","wffzqk_8"),
    表999("999","wffzqk_999"),
    表4("4","wffzqk_4"),
    表4101("4101","wffzqk_4101"),
    表4102("4102","wffzqk_4102"),
    表4103("4103","wffzqk_4103"),
    表4104("4104","wffzqk_4104"),
    表4105("4105","wffzqk_4105"),
    表4106("4106","wffzqk_4106"),
    表4107("4107","wffzqk_4107"),
    表4108("4108","wffzqk_4108"),
    表4109("4109","wffzqk_4109"),
    表4110("4110","wffzqk_4110"),
    表4111("4111","wffzqk_4111"),
    表4112("4112","wffzqk_4112"),
    表4113("4113","wffzqk_4113"),
    表4114("4114","wffzqk_4114"),
    表4115("4115","wffzqk_4115"),
    表4116("4116","wffzqk_4116"),
    表4117("4117","wffzqk_4117");

    // 成员变量
    private String key;
    private String value;

    // 构造方法
    private Wffzqk_TableNamesEnum(String key, String value) {
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
        for (Wffzqk_TableNamesEnum c : Wffzqk_TableNamesEnum.values()) {
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
