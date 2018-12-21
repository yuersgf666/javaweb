package com.sgf.user.testJava;

import javax.servlet.*;
import java.io.IOException;


/**
 * Created by yuers on 2018/9/13.
 */
public class Servlet01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....开始执行");
        ServletContext sc = servletConfig.getServletContext();
        String a = (String) sc.getAttribute("aaa");
        System.out.println(a);
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("ServletConfig.....");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String uname = servletRequest.getParameter("uname");
        String pwd = servletRequest.getParameter("pwd");

    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo....");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy.......");
    }
}
