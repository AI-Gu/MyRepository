package com.yjgu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    int count = 0 ;

    @RequestMapping("/")
    public String hello() {
        count = count+1;
        System.out.println(count);
        return "Hello, SpringBoot With Docker";
    }
}
