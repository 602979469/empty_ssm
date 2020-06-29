package com.dulao.controller;

import com.dulao.pojo.User;
import com.dulao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public String CheckLogin(HttpServletRequest request, User user, Model model) {
        if (userService.checkLogin(user)) {
            request.getSession().setAttribute("username",user.getUsername());
            return "success";
        }
        else
            model.addAttribute("login_error","用户名或者密码错误");
        return "index";
    }
}
