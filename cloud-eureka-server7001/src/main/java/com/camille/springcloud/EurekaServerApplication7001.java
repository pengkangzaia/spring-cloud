/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @FileName: EurekaServerApplication7001.java
 * @Description: EurekaServerApplication7001.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 14:07
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7001.class, args);
    }

}
