package com.KarlexYan.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象创建");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象消亡");
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("ServletRequest的创建");
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequest的消亡");
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HttpSession的创建");
    }
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HttpSession的消亡");
    }
}
