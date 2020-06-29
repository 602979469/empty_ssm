package com.dulao;

import com.dulao.dao.IUserDao;
import com.dulao.pojo.User;
import com.dulao.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
public class Test1 {
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IUserService userService;

    @Test
    public void test1(){
        User dulao = userDao.checkLogin("dulao", "123456");
        System.out.println(dulao.toString());
        User user = new User("dulao","123456");
        boolean b = userService.checkLogin(user);
        System.out.println(b);
    }
}
