package com.yjgu.web.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yjgu.web.dao.UserDao;
import com.yjgu.web.entity.User;
import com.yjgu.web.entity.UserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int updateAge(User user) {
        return userDao.updateByPrimaryKey(user);
    }

    public User selectAge(User user){
        return userDao.selectByPrimaryKey(user);
    }

    public List<User> findAllUserByPageF(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> lists = userDao.queryUserInfo();
        return lists;
    }

    public PageInfo<User> findAllUserByPageS(int pageNum, int pageSize) {
        // TODO Auto-generated method stub
        PageHelper.startPage(pageNum, pageSize);
        List<User> lists = userDao.queryUserInfo();
        PageInfo<User> pageInfo = new PageInfo<User>(lists);
        return pageInfo;

    }
}
