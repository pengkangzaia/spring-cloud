/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @FileName: OrderOpenFeignApplication80.java
 * @Description: OrderOpenFeignApplication80.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 10:39
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication80.class, args);
    }

}
