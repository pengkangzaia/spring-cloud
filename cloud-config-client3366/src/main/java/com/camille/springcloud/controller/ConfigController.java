/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.camille.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: ConfigController.java
 * @Description: ConfigController.java类说明
 * @Author: kang.peng
 * @Date: 2021/1/31 11:24
 */
@RestController
@RefreshScope  // 实现动态刷新功能，同时还需要向客户端发送一个POST请求，来刷新配置 “http://localhost:3355/actuator/refresh”
public class ConfigController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "服务端口" + serverPort + "\t 配置信息" + configInfo;
    }


}
