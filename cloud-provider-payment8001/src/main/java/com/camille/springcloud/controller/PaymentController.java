package com.camille.springcloud.controller;

import com.camille.springcloud.entities.Payment;
import com.camille.springcloud.result.ApiResult;
import com.camille.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @FileName: PaymentController.java
 * @Description: PaymentController.java类说明
 * @Author: camille
 * @Date: 2021/1/26 23:56
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {


    /**
     * @RestController注解， 相当于@Controller+@ResponseBody两个注解的结合，
     * 返回json数据不需要在方法前面加@ResponseBody注解了，
     * 但使用@RestController这个注解，就不能返回jsp,html页面，
     * 视图解析器无法解析jsp,html页面
     * @ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，
     * 一般在异步获取数据时使用【也就是AJAX】，在使用 @RequestMapping后，返回值通常解析为跳转路径，
     * 但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。
     * 比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP 请求正文插入方法中，
     * 使用适合的 HttpMessageConverter 将请求体写入某个对象。
     */
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/get/{id}")
    public ApiResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        if (result != null) {
            return new ApiResult(200, "查询成功，查询服务提供者为" + serverPort, result);
        }
        return new ApiResult(500, "查询失败,查询id为：" + id);
    }

    @PostMapping(value = "/add")
    public ApiResult<Integer> addPayment(@RequestBody Payment payment) {
        int result = paymentService.addPayment(payment);
        if (result > 0) {
            return new ApiResult<>(200, "添加成功, 服务提供者为" + serverPort, result);
        }
        return new ApiResult<>(500, "添加失败");
    }

    @GetMapping(value = "/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                System.out.println(instance.getHost() + " " + instance.getPort());
            }
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + " " + instance.getPort() + " " + instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/lb")
    public String getPaymentLb() {
        return serverPort;
    }


}
