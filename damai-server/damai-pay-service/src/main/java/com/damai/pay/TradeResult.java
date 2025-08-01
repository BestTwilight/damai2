package com.damai.pay;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: 抢票
 * @description: 支付状态查询 实体
 * @author: newmax
 **/
@Data
public class TradeResult {
    
    private boolean success;
    
    private Integer payBillStatus;
    
    private String outTradeNo;
    
    private BigDecimal totalAmount;
}
