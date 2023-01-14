package com.KarlexYan.servlet;

import com.KarlexYan.domain.Book;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/JSONServlet")
public class JSONServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建List集合
        ArrayList<Book> list = new ArrayList<>();
        // 创建书的对象，并放到集合里
        list.add(new Book("围城", 25.0, "钱钟书"));
        list.add(new Book("嫌疑人X的献身", 45.0, "东野圭吾"));
        // 创建一个JSONArray对象
        JSONArray jsonArray = JSONArray.fromObject(list);
        // 将json的数据刷新到前台
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.print(jsonArray);
        writer.flush();
        // 释放资源
        writer.close();
    }
}
