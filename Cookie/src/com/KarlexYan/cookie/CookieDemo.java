package com.KarlexYan.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie/cookieDemo1")
public class CookieDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建Cookie
        Cookie cookie = new Cookie("username", "zhangsan");

        // 设置cookie的有效存活时间（默认是-1,即只保存当前浏览器打开,单位是秒数 ）
        cookie.setMaxAge(15);

        // 如果想让某个Cookie对站点的所有目录下的访问路径都有效，应调用Cookie对象的setPath()方法将其Path属性设置为 "/"
        cookie.setPath("/");

        // 增加到响应对象中，并响应给客户端
        resp.addCookie(cookie);
    }
}
