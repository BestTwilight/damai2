package com.damai;

import com.damai.config.DaMaiCommonAutoConfig;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @program: 抢票
 * @description: 监控服务启动
 * @author: newmax
 **/
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication(exclude = DaMaiCommonAutoConfig.class)
public class AdminApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled","false");
        SpringApplication.run(AdminApplication.class, args);
    }

}
