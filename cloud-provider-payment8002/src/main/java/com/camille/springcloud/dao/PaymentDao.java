package com.camille.springcloud.dao;

import com.camille.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @FileName: PaymentDao.java
 * @Description: PaymentDao.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:39
 */
@Mapper
public interface PaymentDao {

    int addPayment(Payment payment);

    Payment getPaymentById(@Param("id") Long id);


}
