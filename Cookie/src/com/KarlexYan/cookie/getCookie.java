package com.KarlexYan.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/cookieDemo2")
public class getCookie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取所有cookie
        /*
         * username=zhangsan; JSESSIONID=5AF9207A7BB6B045C97D16BBA9E043C6
         * */
        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            // 获取每一个cookie的name
            String name = cookie.getName();
            if ("username".equals(name)) {
                // 获取username所对应的value
                String value = cookie.getValue();
                // 在浏览器展示
                resp.getWriter().write("username:" + value);
            }
        }

    }
}
