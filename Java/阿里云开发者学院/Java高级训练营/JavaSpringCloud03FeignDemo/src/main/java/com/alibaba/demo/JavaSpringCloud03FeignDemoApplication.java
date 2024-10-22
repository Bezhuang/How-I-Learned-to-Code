package com.alibaba.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class JavaSpringCloud03FeignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringCloud03FeignDemoApplication.class, args);
    }

}
