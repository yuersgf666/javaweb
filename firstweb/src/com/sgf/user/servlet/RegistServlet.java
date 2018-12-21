package com.sgf.user.servlet;

import com.sgf.user.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by yuers on 2018/9/20.
 */

public class RegistServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        User user = new User();
        try {
            BeanUtils.populate(user,req.getParameterMap());
        } catch (Exception e) {
            String loginCode = req.getParameter("registCode");
            String repassword = req.getParameter("repassword");

            if(user.getUsername() == null || user.getUsername().trim().isEmpty()) {
                req.setAttribute("msg", "用户名不能为空!");
                req.setAttribute("user", user);
                req.getRequestDispatcher("/regist.jsp").forward(req, resp);
                return;
            }
            if(user.getPassword() == null || user.getPassword().trim().isEmpty()) {
                req.setAttribute("msg", "密码不能为空!");
                e.printStackTrace();
            }
        }
        String uname = req.getParameter("uname");
        String code = req.getParameter("code");
        String sessionVCode = (String) req.getSession().getAttribute("vCode");
        System.out.println("========="+sessionVCode);
        if(code.equalsIgnoreCase(sessionVCode)){
            resp.getWriter().print(uname + ", 恭喜！注册成功！");
        }else {
            resp.getWriter().print("验证码错误！");
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
