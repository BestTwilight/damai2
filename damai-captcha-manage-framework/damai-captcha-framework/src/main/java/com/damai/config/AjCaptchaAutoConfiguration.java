package com.damai.config;

import com.damai.properties.AjCaptchaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: 抢票
 * @description: AjCaptchaAutoConfiguration
 * @author: newmax
 **/

@Configuration
@EnableConfigurationProperties(AjCaptchaProperties.class)
@ComponentScan("com.damai")
@Import({AjCaptchaServiceAutoConfiguration.class, AjCaptchaStorageAutoConfiguration.class})
public class AjCaptchaAutoConfiguration {
}
