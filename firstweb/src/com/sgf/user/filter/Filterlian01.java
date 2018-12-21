package com.sgf.user.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yuers on 2018/9/26.
 */
public class Filterlian01 extends HttpFilter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Hello Filter 11111111");
    }

    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter1 start...");
        filterChain.doFilter(request, response);//放行，执行目标资源
        System.out.println("filter1 end...");
    }

    @Override
    public void destroy() {

    }
}
