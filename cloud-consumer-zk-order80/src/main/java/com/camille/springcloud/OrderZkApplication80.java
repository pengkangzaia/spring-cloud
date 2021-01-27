package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @FileName: OrderZkApplication80.java
 * @Description: OrderZkApplication80.java类说明
 * @Author: camille
 * @Date: 2021/1/27 23:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication80.class, args);
    }


}
