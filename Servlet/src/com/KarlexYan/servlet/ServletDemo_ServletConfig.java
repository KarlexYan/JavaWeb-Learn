package com.KarlexYan.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/servletConfig",
        /*向servletConfig里设置初始信息*/
        initParams = {@WebInitParam(name = "encoding", value = "utf-8")})

public class ServletDemo_ServletConfig extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * ServletConfig
         *   随着 Servlet实例的创建而创建
         *   通过 init(ServletConfig config) 当成参数传递给Servlet
         *   封装Servlet的配置信息
         * */
        // 获取ServletConfig对象
        ServletConfig servletConfig = this.getServletConfig();
        // 获取Servlet的名字
        String servletName = servletConfig.getServletName();  //com.KarlexYan.servlet.ServletDemo_ServletConfig
        // 获取Servlet的上下文信息
        ServletContext servletContext = servletConfig.getServletContext();  //org.apache.catalina.core.ApplicationContextFacade@3a97f82d
        // 获取ServletConfig设置的初始信息
        String encoding = servletConfig.getInitParameter("encoding");  //utf-8
        // 打印
        resp.getWriter().write("servletName:" + servletName + "\nservletContext:" + servletContext + "\nencoding:" + encoding);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
