package com.camille.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @FileName: PaymentApplication8001.java
 * @Description: PaymentApplication8001.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:25
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class, args);
    }


}
