package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faye
 * @Description
 * @create 2024-07-01
 */
//@Controller
//@ResponseBody
@RestController
public class HelloControler {

    @GetMapping("hello")
    public String hello(){
        return "Halo, Spring Boot 3!";
    }

}
