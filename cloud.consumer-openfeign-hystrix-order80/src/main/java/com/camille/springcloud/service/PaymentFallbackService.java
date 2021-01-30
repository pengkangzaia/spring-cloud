package com.camille.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @FileName: PaymentFallbackService.java
 * @Description: PaymentFallbackService.java类说明
 * @Author: admin
 * @Date: 2021/1/30 19:09
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "在@FeignClient注解上添加fallback属性之后，如果出现远程服务不可用的情况，会调fallback属性对应的类的方法";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "在@FeignClient注解上添加fallback属性之后，如果出现远程服务不可用的情况，会调fallback属性对应的类的方法";
    }
}
