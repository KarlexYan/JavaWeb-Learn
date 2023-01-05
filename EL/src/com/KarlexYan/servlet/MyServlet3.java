package com.KarlexYan.servlet;

import com.KarlexYan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

// Web域相关对象使用
@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //在request域中存值
        req.setAttribute("userName", "zhangsan");
        // 在session域中存值
        req.getSession().setAttribute("userName", "wangwu");
        // 在application域中存值
        req.getServletContext().setAttribute("userName", "zhaoliu");

        req.getRequestDispatcher("/scope.jsp").forward(req, resp);
    }
}
