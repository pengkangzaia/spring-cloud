/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.controller;

import com.camille.springcloud.service.MessageProvider;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: SendMessageController.java
 * @Description: SendMessageController.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/31 15:54
 */
@RestController
public class SendMessageController {

    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("/send")
    public String sendMessage() {
        String ans = messageProvider.send();
        return ans;
    }


}
