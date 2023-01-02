package com.KarlexYan.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/lastLoginServlet")
public class lastLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * 首次登录：提示 欢迎您首次访问 记录当前时间，保存在cookie里
         * 下一次(n次)登录：提示欢迎回来，你上次访问的时间是：xxx
         * */

        // 设置编码格式，方便中文显示
        resp.setContentType("text/html;charset=utf-8");

        // 获取所有cookie
        Cookie[] cookies = req.getCookies();
        PrintWriter writer = resp.getWriter();


        // 判断是否为首次登录
        boolean flag = true;

        // 遍历所有cookie
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            // 如果有自定义字段名"lastTime" 不是首次登录
            if ("lastTime".equals(name)) {
                writer.write("欢迎回来，您上次访问时间是：<br>");
                String value = cookie.getValue(); // 得到的是一个毫秒数字符串
                // 转成毫秒数
                long l = Long.parseLong(value);
                // 获取上次登录日期对象
                Date date = new Date(l);
                // 转换成方便阅读的字符串格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                // 通过提起转换对象转成想要的日期格式
                String format = sdf.format(date);
                // 浏览器输出
                writer.write(format);
                // 进入if，则不是首次访问
                flag = false;
            }
        }
        // 首次访问
        if (flag) {

            writer.write("欢迎访问");
        }

        // 保存当前登录时间
        Cookie cookie = new Cookie("lastTime", System.currentTimeMillis() + "");
        // 设置有效时间(7天)
        cookie.setMaxAge(60 * 60 * 24 * 7);
        // 响应在客户端
        resp.addCookie(cookie);
    }
}
