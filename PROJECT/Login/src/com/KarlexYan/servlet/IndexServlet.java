package com.KarlexYan.servlet;

import com.KarlexYan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决中文乱码
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        // 验证用户是否登录
        HttpSession session = req.getSession();
        // 用户对象放入到session域中，通过取出的user对象是否为空判断是否已经登录
        User user = (User) session.getAttribute("user");
        if (user == null) {
            // 没有登录，提示登录 login.html
            String url = "/Login/login.html";
            writer.write("还未登录，请先<a href='" + url + "'>登录</a>");

        } else {
            // 登录，提示登录成功，提示欢迎信息
            writer.write("欢迎" + user.getUsername() + "登录成功！");
            writer.write("<a href='/Login/LogoutServlet'>退出登录</a>");
        }


    }
}
