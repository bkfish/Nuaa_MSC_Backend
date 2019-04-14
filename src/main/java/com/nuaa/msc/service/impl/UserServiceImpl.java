package com.nuaa.msc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nuaa.msc.bean.Dao.InsertUserDao;
import com.nuaa.msc.bean.Dao.LoginDao;
import com.nuaa.msc.bean.User;
import com.nuaa.msc.mapper.UserMapper;
import com.nuaa.msc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object listAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.listAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    @Override
    public int insert(InsertUserDao insertUserDao) {
        return userMapper.insert(insertUserDao);
    }


    @Override
    public int remove(Integer userId) {
        return userMapper.remove(userId);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public String login(LoginDao loginDao) {
        return userMapper.login(loginDao);
    }



}

