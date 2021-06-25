package com.yjgu.web.controller;

import com.yjgu.web.entity.Account;
import com.yjgu.web.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account")
    @Transactional(rollbackFor = Throwable.class)
    public String account() {
        Account account = new Account();
        account.setName("yjgu");
        account.setAmount(100);
        accountService.updateAmount(account);
        try{
            int i = 1/0;
        }
        catch (Exception e){
            e.printStackTrace();
        }


        Account accountA = new Account();
        accountA.setName("chen");
        accountA.setAmount(1000);
        accountService.updateAmount(accountA);
        return "success";
    }


}
