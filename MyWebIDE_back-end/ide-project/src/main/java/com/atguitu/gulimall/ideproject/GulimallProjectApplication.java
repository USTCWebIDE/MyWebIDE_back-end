package com.atguitu.gulimall.ideproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;


//注册到注册中心（发现中心）
@EnableDiscoveryClient
//排除跟数据源有关的配置
@SpringBootApplication
//@SpringBootApplication
@EnableFeignClients
public class GulimallProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProjectApplication.class, args);
    }

}
