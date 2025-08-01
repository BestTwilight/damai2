package com.damai.pro.limit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: 抢票 
 * @description: 线上限流工具配置
 * @author: newmax
 **/
@Configuration
public class RateLimiterConfig {
    
    @Bean
    public RateLimiterProperty rateLimiterProperty(){
        return new RateLimiterProperty();
    }
    
    @Bean
    public RateLimiter rateLimiter(RateLimiterProperty rateLimiterProperty){
        return new RateLimiter(rateLimiterProperty.getRatePermits());
    }
}
