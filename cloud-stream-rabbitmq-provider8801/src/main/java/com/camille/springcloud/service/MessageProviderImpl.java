/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @FileName: MessageProviderImpl.java
 * @Description: MessageProviderImpl.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/31 15:47
 */
@EnableBinding(Source.class)
@Service
public class MessageProviderImpl implements MessageProvider {

    // 消息发送管道

    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        // 要发送的内容
        String serial = UUID.randomUUID().toString();
        Message<String> message = MessageBuilder.withPayload(serial).build();
        output.send(message);
        System.out.println(serial);
        return serial;
    }
}
