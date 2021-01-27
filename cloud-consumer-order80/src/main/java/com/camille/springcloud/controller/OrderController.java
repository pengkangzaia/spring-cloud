/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.controller;

import com.camille.springcloud.entities.Payment;
import com.camille.springcloud.result.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @FileName: OrderController.java
 * @Description: OrderController.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 10:06
 */
@Slf4j
@RestController
public class OrderController {

    // 服务调用
    // restTemplate: 提供了访问restful http接口的方法

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/add")
    public ApiResult<Integer> addPayment(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, ApiResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ApiResult getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "payment/get/" + id, ApiResult.class);
    }

}
