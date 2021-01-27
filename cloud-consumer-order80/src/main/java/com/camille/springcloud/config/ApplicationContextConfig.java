/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @FileName: ApplicationContextConfig.java
 * @Description: ApplicationContextConfig.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 10:09
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        // 容器中注入 restTemplate
        // @LoadBalanced赋予restTemplate负载均衡能力
        return new RestTemplate();
    }


}
