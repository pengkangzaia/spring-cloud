package com.camille.springcloud.service.impl;

import com.camille.springcloud.dao.PaymentDao;
import com.camille.springcloud.entities.Payment;
import com.camille.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @FileName: PaymentServiceImpl.java
 * @Description: PaymentServiceImpl.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:52
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
