package com.yjgu.web.dao;

import com.yjgu.web.entity.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao {

    int deleteByPrimaryKey(String name);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}