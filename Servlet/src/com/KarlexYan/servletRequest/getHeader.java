package com.KarlexYan.servletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/getHeader")
public class getHeader extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根据指定的name获取请求头的值
//        String accept = req.getHeader("Accept");


        // 当请求头的key有多个指定的name时，可以获取
//        Enumeration<String> accept = req.getHeaders("Accept");
//        while (accept.hasMoreElements()){
//            String value = accept.nextElement();
//            System.out.println("Accipt"+value);
//        }

        // 获取所有请求头的kv值
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            // 获取键
            String name = headerNames.nextElement();
            // 获取值
            String value = req.getHeader(name);
            System.out.println(name + " = " + value);
        }
    }
}
