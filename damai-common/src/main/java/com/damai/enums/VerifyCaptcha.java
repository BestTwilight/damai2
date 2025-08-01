package com.damai.enums;

/**
 * @program: 抢票
 * @description: 是否需要校验验证码
 * @author: newmax
 **/
public enum VerifyCaptcha {
    /**
     * 是否需要校验验证码
     * */
    NO(0,"no","不需要"),
    
    YES(1,"yes","需要"),
    
    ;

    private Integer code;
    
    private String value;

    private String msg;

    VerifyCaptcha(Integer code, String value, String msg) {
        this.code = code;
        this.value = value;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public static String getMsg(Integer code) {
        for (VerifyCaptcha re : VerifyCaptcha.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static VerifyCaptcha getRc(Integer code) {
        for (VerifyCaptcha re : VerifyCaptcha.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
