package com.damai.servicelock;

/**
 * @program: 抢票
 * @description: 分布式锁 锁类型
 * @author: newmax
 **/
public enum LockType {
    /**
     * 可重入锁
     */
    Reentrant,
    /**
     * 公平锁
     */
    Fair,
    /**
     * 读锁
     */
    Read,
    /**
     * 写锁
     */
    Write;

    LockType() {
    }

}
