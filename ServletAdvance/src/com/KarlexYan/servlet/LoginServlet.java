package com.KarlexYan.servlet;

import com.KarlexYan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// 获取前端参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 验证
        if ("karlexyan".equals(username) && "123".equals(password)) {
            // 成功，用户信息封装成User对象并且存入session域
            User user = new User(username, password);
            req.getSession().setAttribute("user", user);
            // 将用户信息存入cookie，并设计cookie有效时间
            String autologin = req.getParameter("autologin");
            if (autologin != null) {
                // 用户已经设定了自动登录的功能,把用户信息和时间存入cookie
                Cookie cookie = new Cookie("autologin", username + "-" + password);
                cookie.setMaxAge(Integer.parseInt(autologin));
                cookie.setPath(req.getContextPath());
                resp.addCookie(cookie);
            }
            // 重定向到index.jsp 去展示用户信息
            resp.sendRedirect(req.getContextPath() + "/index.jsp");
        } else {
            // 失败，转发到login.jsp 重新登录，并且提示错误信息
            req.setAttribute("errorMsg", "用户名或密码错误！");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }

    }
}
