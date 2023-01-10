package com.KarlexYan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// 过滤器设置dispatcherTypes = DispatcherType.FORWARD，如果通过RequestDispatcher对象的forward()方法访问目标资源，那么过滤器将被调用
@WebFilter(filterName = "ForwardFilter", urlPatterns = "/first.jsp", dispatcherTypes = DispatcherType.FORWARD)
public class ForwardFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法执行...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter方法执行...");
        servletResponse.getWriter().write("ForwardFilterTest");
    }
    @Override
    public void destroy() {
        System.out.println("destroy方法执行...");
    }
}
