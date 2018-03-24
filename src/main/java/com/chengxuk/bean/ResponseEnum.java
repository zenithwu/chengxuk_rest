package com.chengxuk.bean;

public enum ResponseEnum {
    SUCCESS("0", "操作成功"),
    FAIL("1", "操作失败"),
    RELOGIN("1000", "重新登录") ,
    LOGIN_PARAM_ERROR("1001", "手机号或密码有误"),
    PARAM_ERROR("2000", "请求参数有误") ,
    EXCEPTION("9999", "系统异常，请稍后重试") ;

    private String code ;
    private String name ;

    ResponseEnum(String code, String name) {
        this.code = code ;
        this.name = name ;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}