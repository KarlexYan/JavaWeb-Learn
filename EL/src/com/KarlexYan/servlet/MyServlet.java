package com.KarlexYan.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // request域存值
        req.setAttribute("username", "karlexyan");
        req.setAttribute("password", "123");


        req.getRequestDispatcher("/myJSP.jsp").forward(req, resp);
    }
}
