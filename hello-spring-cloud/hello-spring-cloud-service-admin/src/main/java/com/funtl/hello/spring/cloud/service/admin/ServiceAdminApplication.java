package com.funtl.hello.spring.cloud.service.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务的提供者
 */
@SpringBootApplication  //开启spring-boot服务
@EnableEurekaClient   //服务端注册客户端
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);

    }
}
