/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @FileName: PaymentController.java
 * @Description: PaymentController.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/27 19:44
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/zk")
    public String zkRegisterTest() {
        return "spring cloud with zookeeper:" + serverPort + " " + UUID.randomUUID().toString();
    }


}
