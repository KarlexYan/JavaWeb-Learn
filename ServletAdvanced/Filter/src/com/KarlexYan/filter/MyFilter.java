package com.KarlexYan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MyFilter", urlPatterns = "/myServlet")
public class MyFilter implements Filter {
    // 初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法执行...");
    }

    // 实际执行过滤操作的
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("Hello Filter!");
        System.out.println("doFilter方法执行...");
    }

    // 销毁
    @Override
    public void destroy() {
        System.out.println("destroy方法执行...");
    }
}
