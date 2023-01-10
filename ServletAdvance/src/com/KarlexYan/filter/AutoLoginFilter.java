package com.KarlexYan.filter;

import com.KarlexYan.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class AutoLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 获取cookie信息
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Cookie[] cookies = request.getCookies();
        // 遍历cookie，查找autologin
        String flag = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("autologin".equals(cookie.getName())) {
                    flag = cookie.getValue();
                    break;
                }
            }
        }

        if (flag != null) {
            // 有，解析用户信息，封装成User对象，放行
            String[] split = flag.split("-");
            String username = split[0];
            String password = split[1];
            if ("karlexyan".equals(username) && "123".equals(password)) {
                User user = new User(username, password);
                request.getSession().setAttribute("user", user);
            }
        }

        // 没有，也放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
