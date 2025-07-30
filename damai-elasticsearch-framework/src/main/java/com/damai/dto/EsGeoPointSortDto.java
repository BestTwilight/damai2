package com.damai.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: 抢票
 * @description: elasticsearch GeoPoint定位
 * @author: newmax
 **/
@Data
public class EsGeoPointSortDto {
    /**
     * 字段名
     * */
    private String paramName;
    /**
     * 纬度值
     * */
    private BigDecimal latitude;
    /**
     * 经度值
     * */
    private BigDecimal longitude;
    
    
}
