package com.KarlexYan.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionDemo1")
public class SessionDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取Session对象
        HttpSession session = req.getSession();

        // 调用session对象api方法
        // 获取与当前HttpSession对象关联的会话标识号
        String id = session.getId();
        // 获取当前HttpSession对象可空闲的以秒为单位的最长时间
        int maxInactiveInterval = session.getMaxInactiveInterval();
        // 获取Session创建的时间，毫秒表示形式
        long creationTime = session.getCreationTime();
        // 获取客户端最后一次发送与Session相关请求时间，毫秒表示形式
        long lastAccessedTime = session.getLastAccessedTime();
        // 获取当前Web应用程序的ServletContext对象
        ServletContext servletContext = session.getServletContext();
        // 获取当前Session是否为新创建的
        boolean aNew = session.isNew();

        PrintWriter writer = resp.getWriter();

        writer.write(" id=" + id);
        writer.write(" maxInactiveInterval=" + maxInactiveInterval);
        writer.write(" creationTime=" + creationTime);
        writer.write(" lastAccessedTime=" + lastAccessedTime);
        writer.write(" servletContext=" + servletContext);
        writer.write(" aNew=" + aNew);


    }
}
