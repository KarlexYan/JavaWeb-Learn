package com.KarlexYan.servlet;

import com.KarlexYan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

// EL方括号运算符使用
@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("zhangsan", 23));
        users.add(new User("lisi", 24));
        req.setAttribute("users", users);

        req.getRequestDispatcher("/myParameter.jsp").forward(req, resp);
    }
}
