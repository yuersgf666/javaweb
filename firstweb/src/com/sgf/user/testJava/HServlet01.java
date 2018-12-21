package com.sgf.user.testJava;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by yuers on 2018/9/14.
 */
public class HServlet01 extends HttpServlet {

   /* @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }*/

    protected void doPost(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       ServletContext servletContext = this.getServletContext();
       Integer count = (Integer) servletContext.getAttribute("count");
       if(count==null){
           count =1;
       }else {
           count++;
       }
       resp.setContentType("text/html;charset=utf-8");
       resp.getWriter().print(count);
       servletContext.setAttribute("count",count);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        doPost(req,res);
    }
}
