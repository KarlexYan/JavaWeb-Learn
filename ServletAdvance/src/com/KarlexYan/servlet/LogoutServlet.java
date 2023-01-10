package com.KarlexYan.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 从session域中移除user对象
        HttpSession session = req.getSession();
        session.removeAttribute("user");
        // 移除cookie
        Cookie cookie = new Cookie("autologin", "");
        cookie.setMaxAge(0);
        cookie.setPath(req.getContextPath());
        resp.addCookie(cookie);
        // 重定向到index.jsp页面
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
