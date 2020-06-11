package com.zhixin.rd.rkjc.web.common;

public class CommonUtil  {

    public static boolean isStringEmpty(String str) {
    	if(str==null || "".equals(str.trim())){
            return true;
        }
        return false;
    }

    public static boolean isStringNotEmpty(String str) {
        if(str!=null && !"".equals(str.trim())){
            return true;
        }
        return false;
    }
    
    public static boolean isInteger(Object obj){
        try {
            Integer.parseInt(obj.toString());
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isInteger("1"));;
    }
}
