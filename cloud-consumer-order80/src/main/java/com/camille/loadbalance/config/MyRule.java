/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.loadbalance.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @FileName: MyRule.java
 * @Description: MyRule.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 10:16
 */
@Configuration
public class MyRule {

    @Bean
    public IRule GetMyRule() {
        return new RandomRule();
    }

}
