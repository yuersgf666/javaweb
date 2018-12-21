package com.sgf.user.testJava;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by yuers on 2018/9/19.
 */
public class BServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie cookie = new Cookie("lasttime",new Date().toString());
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);

        Cookie[] cookies = req.getCookies();
        String s = "您是首次访问本站！";
        if(cookies!=null){
            for (Cookie c : cookies){
                if ("lasttime".equals(c.getName())){
                    s = "您上次的访问时间是：" + c.getValue();
                }
            }
        }
        resp.getWriter().print(s);
       /* if(cookies!=null){
            for(Cookie cookie : cookies){
                if("id".equals(cookie.getName())){
                    cookie.setMaxAge(3600);
                    resp.getWriter().print("您的ID是：" + cookie.getValue());
                }
            }
        }*/
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
