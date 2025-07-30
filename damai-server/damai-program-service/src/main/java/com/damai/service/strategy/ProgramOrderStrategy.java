package com.damai.service.strategy;

import com.damai.dto.ProgramOrderCreateDto;

/**
 * @program: 抢票
 * @description: 节目订单策略
 * @author: newmax
 **/
public interface ProgramOrderStrategy {
    
    /**
     * 创建订单
     * @param programOrderCreateDto 订单参数
     * @return 订单编号
     * */
    String createOrder(ProgramOrderCreateDto programOrderCreateDto);
}
