package com.damai.mq.callback;

/**
 * @program: 抢票 
 * @description: 用于执行失败的情况
 * @author: newmax
 **/
@FunctionalInterface
public interface FailureCallback {
    
    /**
     * 执行逻辑
     * @param ex 执行失败的异常当做参数传递
     * */
    void onFailure(Throwable ex);

}