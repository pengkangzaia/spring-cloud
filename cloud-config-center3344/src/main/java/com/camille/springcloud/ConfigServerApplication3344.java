/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @FileName: ConfigServerApplication3344.java
 * @Description: ConfigServerApplication3344.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/31 10:23
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class, args);
    }

}
