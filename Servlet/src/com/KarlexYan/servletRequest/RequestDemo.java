package com.KarlexYan.servletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求地址
        StringBuffer requestURL = req.getRequestURL();
        // 获取虚拟路径
        String contextPath = req.getContextPath();
        // 获取本地端口号
        int localPort = req.getLocalPort();
        // 获取提交方法
        String method = req.getMethod();
        // 获取服务器名称
        String serverName = req.getServerName();
        // 获取服务器端口
        int serverPort = req.getServerPort();
        // 获取Servlet路径
        String servletPath = req.getServletPath();

        System.out.println("requestURL=" + requestURL);
        System.out.println("contextPath=" + contextPath);
        System.out.println("localPort=" + localPort);
        System.out.println("method=" + method);
        System.out.println("serverName=" + serverName);
        System.out.println("serverPort=" + serverPort);
        System.out.println("servletPath=" + servletPath);
        System.out.println("=====================");
        // 获取客户端的IP地址
        String remoteAddr = req.getRemoteAddr();
        // 获取Web服务器上接受当前请求网络连接的IP地址
        String localAddr = req.getLocalAddr();
        System.out.println("remoteAddr=" + remoteAddr);
        System.out.println("localAddr=" + localAddr);
    }
}
