package com.chengxuk.bean;

public class VO {
    private String code ;
    private String msg ;
    private Object data ;

    public VO(String code, String msg) {
        this(code, msg, null) ;
    }

    public VO(String code, String msg, Object data) {
        this.code = code ;
        this.msg = msg ;
        this.data = data ;
    }

    public VO(ResponseEnum responseEnum) {
        this(responseEnum, null) ;
    }

    public VO(ResponseEnum responseEnum, Object data) {
        this(responseEnum.getCode(), responseEnum.getName(), data) ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
