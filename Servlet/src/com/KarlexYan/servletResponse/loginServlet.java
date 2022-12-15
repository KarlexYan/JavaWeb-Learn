package com.KarlexYan.servletResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 懒得连数据库了现造数据
        if ("KarlexYan".equals(username) && "123".equals(password)) {
            // 输入正确重定向到success.html
            resp.sendRedirect("/ServletDemo/success.html");
        } else {
            // 输入错误重定向到fail.html
            resp.sendRedirect("/ServletDemo/fail.html");
        }
    }
}
