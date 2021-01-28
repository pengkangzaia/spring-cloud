/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service;

import com.camille.springcloud.entities.Payment;
import com.camille.springcloud.result.ApiResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @FileName: PaymentFeignService.java
 * @Description: PaymentFeignService.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 10:41
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public ApiResult<Payment> getPaymentById(@PathVariable("id") Long id);




}
