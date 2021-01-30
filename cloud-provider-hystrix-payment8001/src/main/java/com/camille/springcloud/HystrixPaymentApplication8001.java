/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletRegistration;

/**
 * @FileName: HystrixPaymentApplication8001.java
 * @Description: HystrixPaymentApplication8001.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 14:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
// 使断路器生效
@EnableCircuitBreaker
public class HystrixPaymentApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentApplication8001.class, args);
    }

    @Bean
    public ServletRegistrationBean getServelt() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }


}
