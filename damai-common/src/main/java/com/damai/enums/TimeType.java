package com.damai.enums;

/**
 * @program: 抢票
 * @description: 时间类型
 * @author: newmax
 **/
public enum TimeType {
    /**
     * 时间类型
     * */
    ALL(0,"全部"),
    TODAY(1,"今天"),
    TOMORROW(2,"明天"),
    WEEK(3,"本周内"),
    MONTH(4,"一个月内"),
    CALENDAR(5,"按日历"),
    ;

    private Integer code;

    private String msg;

    TimeType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }
    
    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }
    
    public static String getMsg(Integer code) {
        for (TimeType re : TimeType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static TimeType getRc(Integer code) {
        for (TimeType re : TimeType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }
}
