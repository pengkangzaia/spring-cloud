/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @FileName: FeignHystrixOrderApplication80.java
 * @Description: FeignHystrixOrderApplication80.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/29 13:59
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrixOrderApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixOrderApplication80.class, args);
    }


}
