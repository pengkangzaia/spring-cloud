/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service.impl;

import com.camille.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

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


}
