package com.KarlexYan.servletRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 请求转发，与重定向不同，再转发后无须跳转网页，地址栏不会变化
@WebServlet("/getRequestDispatcher")
public class getRequestDispatcher extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取分发器对象，参数是被转发的路径
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/forward.html");
        // 实现转发
        requestDispatcher.forward(req, resp);
    }
}
