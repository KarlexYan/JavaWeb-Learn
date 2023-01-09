package com.KarlexYan.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MyFilter2", urlPatterns = "/myServlet")
public class MyFilter2 implements Filter {
    // 初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法执行...");
    }

    // 实际执行过滤操作的
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().write("Hello Filter02 --before");

        // 执行完方法体后，放行资源
        filterChain.doFilter(servletRequest, servletResponse);

        // 执行完毕目标资源后，进行回应
        servletResponse.getWriter().write("Hello Filter02 --after");
    }

    // 销毁
    @Override
    public void destroy() {
        System.out.println("destroy方法执行...");
    }
}
