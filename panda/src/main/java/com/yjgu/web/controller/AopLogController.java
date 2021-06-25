package com.yjgu.web.controller;

import com.yjgu.web.annotation.SystemControllerLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AopLogController {

    @RequestMapping("/aop")
    @SystemControllerLog(description = "测试aop")
    public String aop(){
        System.out.println("进入了controller");
        return "Hello, AOP";
    }
}
