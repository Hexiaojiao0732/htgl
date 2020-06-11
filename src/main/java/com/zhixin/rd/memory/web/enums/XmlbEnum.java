package com.zhixin.rd.memory.web.enums;


public enum XmlbEnum {
	MJWX(1,"民间文学"),
	CTYY(2,"传统音乐"),
	CTWD(3,"传统舞蹈"),
	CTXJ(4,"传统戏剧"),
	QY(5,"曲艺"),
	CTTY(6,"传统体育"),
	CTMS(7,"传统美术"),
	CTJJ(8,"传统技艺"),
	CTYIYAO(9,"传统医药"),
	MS(10,"民俗");
  
    private int status;
    private String name;

    XmlbEnum(int status, String name){
        this.status = status;
        this.name = name;
    }

    public static String getNameByStatus(int status){
        for (XmlbEnum commonStatusEnum : XmlbEnum.values()) {
            if (commonStatusEnum.status == status) {
                return commonStatusEnum.name;
            }
        }
        return "";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
