package com.atguigu.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faye
 * @Description init SpringBoot
 * @create 2024-07-01
 */
@RestController
@SpringBootApplication
public class MainApplication {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args){
        SpringApplication.run(MainApplication.class, args);
    }
}
