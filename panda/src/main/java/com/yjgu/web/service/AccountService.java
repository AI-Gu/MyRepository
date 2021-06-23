package com.yjgu.web.service;

import com.yjgu.web.dao.AccountDao;
import com.yjgu.web.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public int updateAmount(Account account) {
        return accountDao.updateByPrimaryKey(account);
    }
}
