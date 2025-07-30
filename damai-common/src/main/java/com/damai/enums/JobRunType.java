package com.damai.enums;

/**
 * @program: 抢票
 * @description: job运行类型
 * @author: newmax
 **/
public enum JobRunType {
    /**
     * 同步执行
     * */
    SYNC_RUN,
    
    /**
     * 异步执行
     * */
    ASYNC_RUN;
    
    JobRunType() {
       
    }
    
}
