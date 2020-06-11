package com.zhixin.rd.rkjc.web.entity;

public class YtPersonInfo {

    private String name;//姓名
    private String sfzh;//身份证号
    private Double similarity;//相似度

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }
}
