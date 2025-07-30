package com.damai.constant;

/**
 * @program: 抢票
 * @description: 业务类型
 * @author: newmax
 **/
public class LockInfoType {
    
    /***
     * 防重复执行幂等
     */
    public static final String REPEAT_EXECUTE_LIMIT = "repeat_execute_limit";
    
    /***
     * 分布式锁
     */
    public static final String SERVICE_LOCK = "service_lock";
    
}
