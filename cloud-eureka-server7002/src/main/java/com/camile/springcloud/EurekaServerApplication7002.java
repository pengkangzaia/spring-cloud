/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camile.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @FileName: EurekaServerApplication7002.java
 * @Description: EurekaServerApplication7002.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 15:57
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class, args);
    }

}
