package com.camille.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @FileName: Payment.java
 * @Description: Payment.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:36
 */
@Data
public class Payment implements Serializable {

    private Long id;
    private String serial;


}
