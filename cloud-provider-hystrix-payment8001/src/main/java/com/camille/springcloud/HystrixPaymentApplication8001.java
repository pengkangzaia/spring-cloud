/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @FileName: HystrixPaymentApplication8001.java
 * @Description: HystrixPaymentApplication8001.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 14:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixPaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentApplication8001.class, args);
    }


}
