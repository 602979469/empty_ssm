package com.dulao.utils;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        if (uri.contains("login")) {
            return true;
        }
        //获取session
        HttpSession session = request.getSession();
        if(session.getAttribute("username")!=null)
            return true;
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("login_msg", "您还没有登录，请先登录！");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        return false;
    }
}
