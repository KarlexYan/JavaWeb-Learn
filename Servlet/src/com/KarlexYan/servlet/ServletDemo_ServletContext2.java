package com.KarlexYan.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletContext2")
public class ServletDemo_ServletContext2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取ServletContext对象
        ServletContext servletContext = this.getServletContext();


        // 获取共享的域属性值
        String name = (String) servletContext.getAttribute("name");


        // 移除域属性值
        servletContext.removeAttribute("name");

        resp.getWriter().write("name:" + name);
    }
}
