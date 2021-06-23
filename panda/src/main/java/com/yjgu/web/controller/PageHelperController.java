package com.yjgu.web.controller;

import com.github.pagehelper.PageInfo;
import com.yjgu.web.dao.UserDao;
import com.yjgu.web.entity.User;
import com.yjgu.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagehelper")
public class PageHelperController {

    @Autowired
    private UserService userService;

    @RequestMapping("/pageF")
    public List<User> selectUserByPageF(){
        return userService.findAllUserByPageF(1,5);
    }

    @RequestMapping("/pageS")
    public PageInfo<User> selectUserByPageS(){
        return userService.findAllUserByPageS(2,5);
    }
}
