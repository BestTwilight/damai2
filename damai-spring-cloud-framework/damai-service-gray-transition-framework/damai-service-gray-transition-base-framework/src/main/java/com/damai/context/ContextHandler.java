package com.damai.context;

/**
 * @program: 抢票 
 * @description: 上下文获取抽象
 * @author: newmax
 **/
public interface ContextHandler {
    
    /***
     * 从request请求头获取值
     * @param name 值的名
     * @return 具体值
     * 
     */
    String getValueFromHeader(String name);
}