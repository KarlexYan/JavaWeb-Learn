package com.KarlexYan.servlet;

import com.KarlexYan.entity.Cake;
import com.KarlexYan.entity.CakeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;


// 展示蛋糕列表
@WebServlet("/ListCakeServlet")
public class ListCakeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决中文乱码
        resp.setContentType("text/html;charset=utf-8");

        // 展示数据
        Collection<Cake> cakes = CakeDB.getAll();
        // 遍历所有蛋糕，并输出在页面
        PrintWriter writer = resp.getWriter();
        writer.write("所有的蛋糕：<br>");
        for (Cake cake : cakes) {
            String url = "PurchaseServlet?id=" + cake.getId();
            writer.write(cake.getName() + "<a href='" + url + "'>点击购买</a><br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
