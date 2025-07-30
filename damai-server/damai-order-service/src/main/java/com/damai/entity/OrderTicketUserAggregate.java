package com.damai.entity;

import lombok.Data;

/**
 * @program: 抢票
 * @description: 购票人订单聚合统计 实体
 * @author: newmax
 **/
@Data
public class OrderTicketUserAggregate {
    
    private Long orderNumber;
    
    private Integer orderTicketUserCount;
}
