package com.damai.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: 抢票
 * @description: 布隆过滤器 配置属性
 * @author: newmax
 **/
@Data
@ConfigurationProperties(prefix = BloomFilterProperties.PREFIX)
public class BloomFilterProperties {

    public static final String PREFIX = "bloom-filter";
    
    private String name;
    
    private Long expectedInsertions = 20000L;
    
    private Double falseProbability = 0.01D;
}
