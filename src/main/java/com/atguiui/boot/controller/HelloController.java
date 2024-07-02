package com.atguiui.boot.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author faye
 * @Description
 * @create 2-24-07-02
 */
@RestController
public class HelloController {
    @GetMapping("haha")
    public String hello(Model model) {
        model.addAttribute("name", "Spring Boot 3");
        return "Hello";
    }
}
