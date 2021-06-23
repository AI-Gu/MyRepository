package com.yjgu.web.dao;

import com.yjgu.web.entity.User;
import com.yjgu.web.entity.UserKey;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryUserInfo();
}