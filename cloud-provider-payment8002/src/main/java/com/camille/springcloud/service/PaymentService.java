package com.camille.springcloud.service;

import com.camille.springcloud.entities.Payment;

/**
 * @FileName: PaymentService.java
 * @Description: PaymentService.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:51
 */
public interface PaymentService {

    int addPayment(Payment payment);

    Payment getPaymentById(Long id);

}
