package com.sgf.user.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by yuers on 2018/9/26.
 */
public class Filter01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Hello Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("aaaaaaaaa");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("bye Filter!~~");
    }
}
