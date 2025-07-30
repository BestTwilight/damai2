package com.damai.service;

import lombok.Data;

/**
 * @program: 抢票
 * @description: 接口请求记录 实体对象
 * @author: newmax
 **/
@Data
public class ApiRestrictData {

    private Long triggerResult;
    
    private Long triggerCallStat;
    
    private Long apiCount;
    
    private Long threshold;
    
    private Long messageIndex;
}
