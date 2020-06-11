package com.zhixin.rd.rkjc.web.common;

public class InterfaceCode {

    /**
     * 响应值 编码集
     */
    public static final String SUCCESS = "XY000";//成功返回码
    public static final String PARAM_INVALID = "XY001";//无效的参数
    public static final String TOKEN_INVALID = "XY002";//无效的Token
    public static final String TOKEN_OUT = "XY003";//Token已过期
    public static final String INTERFACE_ERROR = "XY004";//接口内部错误
    public static final String SQL_ERROR = "XY005";//数据库错误
    public static final String DATA_AUTHORITY_ERROR = "XY006";//数据权限不够
    public static final String IP_TOKEN_ERROR = "XY007";//IP与Token值不一致
    public static final String ALGORITHM_INVALID = "XY008";//无效的算法值
    public static final String PARAM_FORMATE = "XY009";//参数格式不一致
    public static final String PARAM_ERRORTABLE = "XY010";//无效表名
    /**
     * 算法值 编码集
     */
    public static final String DATE_FIRST = "SF001";//按时间优先

    public static boolean isAlgorithm(String algorithmValue){
        String[] algorithmArr = {DATE_FIRST};
        for(String tempAlgorith : algorithmArr){
            if(tempAlgorith.equals(algorithmValue)){
                return true;
            }
        }
        return false;
    }
}
