package com.nuaa.msc.service;


import com.nuaa.msc.bean.Dao.InsertUserDao;
import com.nuaa.msc.bean.Dao.LoginDao;
import com.nuaa.msc.bean.User;

public interface UserService {
    Object listAll(int page, int size);

    int insert(InsertUserDao insertUserDao);

    int remove(Integer userId);

    int update(User user);

    String login(LoginDao loginDao);

    User findUserById(Integer id);
}

