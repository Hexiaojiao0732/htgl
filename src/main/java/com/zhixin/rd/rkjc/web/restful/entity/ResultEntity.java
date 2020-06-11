package com.zhixin.rd.rkjc.web.restful.entity;

public class ResultEntity implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String message;

    private String jsonString;

    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "message='" + message + '\'' +
                ", jsonString='" + jsonString + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

}
