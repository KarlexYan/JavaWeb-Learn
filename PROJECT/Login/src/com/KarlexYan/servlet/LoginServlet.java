package com.KarlexYan.servlet;

import com.KarlexYan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();

        // 获取前端参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("karlexyan".equals(username) && "123".equals(password)) {
            // 登录成功，将user对象存入session域中
            HttpSession session = req.getSession();
            session.setAttribute("user", new User(username, password));
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            cookie.setMaxAge(60 * 30);
            cookie.setPath("/");
            resp.addCookie(cookie);
            resp.sendRedirect("/Login/IndexServlet");
        } else {
            // 登录失败
            writer.write("用户名或密码错误！");
            String url = "/Login/IndexServlet";
            writer.write("<a href='" + url + "'>返回</a>");
        }
    }

}
