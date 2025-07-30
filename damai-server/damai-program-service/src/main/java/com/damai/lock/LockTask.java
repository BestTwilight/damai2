package com.damai.lock;

/**
 * @program: 抢票
 * @description: 锁的任务
 * @author: newmax
 **/
@FunctionalInterface
public interface LockTask<V> {
    /**
     * 执行锁的任务
     * @return 结果
     */
    V execute();
}