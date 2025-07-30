package com.damai.mq.callback;

/**
 * @program: 抢票 
 * @description: 用于执行成功的情况
 * @author: newmax
 **/
@FunctionalInterface
public interface SuccessCallback<T> {
    
    /**
     * 执行逻辑
     * @param result 执行成功的结果当做参数传递
     * */
    void onSuccess(T result);

}
