package com.damai.balance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: 抢票
 * @description: 负载均衡服务过滤接口
 * @author: newmax
 **/
public interface FilterLoadBalance {
    
    /**
     * 服务过滤操作
     * @param servers 服务列表
     * */
    void selectServer(List<ServiceInstance> servers);
}
