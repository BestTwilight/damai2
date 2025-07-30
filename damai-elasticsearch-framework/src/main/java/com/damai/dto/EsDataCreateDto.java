package com.damai.dto;

import lombok.Data;

/**
 * @program: 抢票
 * @description: elasticsearch数据参数
 * @author: newmax
 **/
@Data
public class EsDataCreateDto {
    
    /**
     * 字段名
     * */
    private String paramName;
    /**
     * 字段值
     * */
    private Object paramValue;
}
