/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @FileName: ConfigClientApplication3355.java
 * @Description: ConfigClientApplication3355.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/31 11:18
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }

}
