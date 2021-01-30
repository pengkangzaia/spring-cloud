/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @FileName: HystrixDashboardApplication9001.java
 * @Description: HystrixDashboardApplication9001.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/30 20:22
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9001.class, args);
    }

}
