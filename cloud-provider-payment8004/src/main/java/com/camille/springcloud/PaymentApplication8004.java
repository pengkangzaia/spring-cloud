/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @FileName: PaymentApplication8004.java
 * @Description: PaymentApplication8004.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 19:42
 */
@SpringBootApplication
@EnableDiscoveryClient // 用于向使用consul或者zookeeper作为注册中心的注册服务
public class PaymentApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8004.class, args);
    }

}
