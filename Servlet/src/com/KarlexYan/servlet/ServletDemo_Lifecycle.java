package com.KarlexYan.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*继承GenericServlet*/
@WebServlet("/lifecycle")
public class ServletDemo_Lifecycle extends GenericServlet {
    /*在启动服务时会显示在控制台*/
    @Override
    public void init() throws ServletException {
        System.out.println("init method is called");
    }

    /*在首次启动服务时会显示在控制台，跳转一次调用一次*/
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method is called");
    }

    /*在关闭服务器时会调用此方法*/
    @Override
    public void destroy() {
        System.out.println("destroy method is called");
    }
}
