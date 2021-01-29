/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.controller;

import com.camille.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: PaymentHystrixController.java
 * @Description: PaymentHystrixController.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/29 14:04
 */
@RestController
@Slf4j
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;


    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoOk(id);
        return result;
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoTimeout(id);
        return result;
    }

}
