package com.sgf.user.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yuers on 2018/9/26.
 */
public class IPFilter implements Filter {

    private ServletContext servletContext;

    public void init(FilterConfig filterConfig) throws ServletException {
        servletContext = filterConfig.getServletContext();
        Map<String,Integer> ipCountMap = Collections.synchronizedMap(new LinkedHashMap<String, Integer>());
        servletContext.setAttribute("ipCountMap", ipCountMap);
    }

   @SuppressWarnings("unchecked")
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       HttpServletRequest req = (HttpServletRequest) servletRequest;
       String ip = req.getRemoteAddr();
       Map<String, Integer> ipCountMap = (Map<String, Integer>) servletContext.getAttribute("ipCountMap");
       Integer count = ipCountMap.get(ip);
       if (count == null) {
           count = 1;
		} else {
           count += 1;
       }
       ipCountMap.put(ip, count);
       servletContext.setAttribute("ipCountMap", ipCountMap);
       filterChain.doFilter(servletRequest, servletResponse);
    }


    public void destroy() {

    }
}
