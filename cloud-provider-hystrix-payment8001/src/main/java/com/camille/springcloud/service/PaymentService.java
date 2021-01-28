/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service;

/**
 * @FileName: PaymentService.java
 * @Description: PaymentService.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/28 15:12
 */
public interface PaymentService {

    String paymentInfoOk(Integer id);

    String paymentInfoTimeout(Integer id);


}
