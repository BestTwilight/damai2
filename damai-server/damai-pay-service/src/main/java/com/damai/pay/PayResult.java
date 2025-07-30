package com.damai.pay;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: 抢票
 * @description: 支付结果
 * @author: newmax
 **/
@Data
@AllArgsConstructor
public class PayResult {
    
    private final boolean success;
    
    private final String body;
}
