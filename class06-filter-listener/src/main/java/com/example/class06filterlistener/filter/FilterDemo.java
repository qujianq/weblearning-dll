package com.example.class06filterlistener.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public  void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("初始化");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
