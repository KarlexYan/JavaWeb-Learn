package com.KarlexYan.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/servletContext")
public class ServletDemo_ServletContext extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取ServletContext对象
        ServletContext servletContext = this.getServletContext();
//        // 获取配置的接口中的信息
//        String companyName = servletContext.getInitParameter("companyName");
//        String city = servletContext.getInitParameter("city");
//        // 打印
//        resp.getWriter().write("companyName:"+companyName+"\ncity:"+city);

        // 批量获取
        Enumeration<String> names = servletContext.getInitParameterNames();
        // 遍历获取打印
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = servletContext.getInitParameter(name);
            resp.getWriter().write(name + ":" + value + "\n");
        }
    }
}
