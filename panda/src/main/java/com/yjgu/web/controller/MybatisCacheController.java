package com.yjgu.web.controller;

import com.yjgu.web.entity.User;
import com.yjgu.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatisCache")
public class MybatisCacheController {

    @Autowired
    private UserService userService;

    @RequestMapping("l1")
    @Transactional(rollbackFor = Throwable.class)
    public void l1Cache() {
        // mybatis一级缓存只能在Transactional中有效
        User userg = new User();
        userg.setName("yjgu");
        userService.selectAge(userg);
        userService.selectAge(userg);
    }

    @RequestMapping("l2")
    public void l2Cache() {
        User userg = new User();
        userg.setName("yjgu");
        userg.setAge(16);
        userService.selectAge(userg);
//        userService.updateAge(userg);
        userService.selectAge(userg);
    }
}
