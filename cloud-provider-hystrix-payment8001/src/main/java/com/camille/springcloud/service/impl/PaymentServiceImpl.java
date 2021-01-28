/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service.impl;

import com.camille.springcloud.service.PaymentService;
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
    public String paymentInfoTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = "线程池" + Thread.currentThread().getName() + " paymentInfo_timeout:" + id + " 耗时3秒";
        return result;
    }


}
