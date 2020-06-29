package com.dulao.service.Impl;

import com.dulao.dao.IUserDao;
import com.dulao.pojo.User;
import com.dulao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public boolean checkLogin(User user) {
        User checkUser = userDao.checkLogin(user.getUsername(),user.getPassword());
        if (checkUser==null)
            return false;
        return true;
    }
}
