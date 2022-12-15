package com.KarlexYan.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebServlet("/servletContext4")
public class ServletDemo_ServletContext4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取ServletContext对象
        ServletContext servletContext = this.getServletContext();
        // 返回映射到资源文件的InputStream输入流对象
        InputStream is = servletContext.getResourceAsStream("WEB-INF/jjj.properties");
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(is);
        String company = prop.getProperty("Company");
        String address = prop.getProperty("Address");

        resp.getWriter().write("Company:" + company + "\nAddress:" + address);
    }
}
