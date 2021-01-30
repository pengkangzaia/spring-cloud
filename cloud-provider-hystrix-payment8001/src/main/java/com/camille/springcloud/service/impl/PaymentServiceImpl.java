/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.camille.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @FileName: PaymentServiceImpl.java
 * @Description: PaymentServiceImpl.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 15:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求量达到这个值时
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), // 同时请求失败率达到这个值时，断路器打开
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000") // 断路器打开10000ms时，断路器从open状态转为half open状态
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能小于0");
        }
        String serial = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功，流水号为:" + serial;
    }

    @Override
    public String paymentInfoOk(Integer id) {
        // 正常访问
        String result = "线程池" + Thread.currentThread().getName() + " paymentInfo_ok:" + id;
        return result;
    }

    @Override
    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfoTimeout(Integer id) {
        // 调用时间超过设定时间引发错误
        int cost = 3;
        // int a = 10 / 0; 程序运行时出错会正常运行
        try {
            TimeUnit.SECONDS.sleep(cost);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "线程池" + Thread.currentThread().getName() + " paymentInfo_timeout:" + id + " 耗时" + cost + "秒";
        return result;
    }

    public String timeoutHandler(Integer id) {
        return "线程池" + Thread.currentThread().getName() + " 系统超时或运行报错，请稍后重试:" + id;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id) {
        return "id不能为负数，此方法为断路器的回调函数 id为" + id;
    }


}
