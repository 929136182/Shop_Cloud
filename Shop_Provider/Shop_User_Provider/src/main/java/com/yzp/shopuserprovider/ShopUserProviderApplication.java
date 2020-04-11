package com.yzp.shopuserprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yzp.mapper")
public class ShopUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserProviderApplication.class, args);
    }

}
