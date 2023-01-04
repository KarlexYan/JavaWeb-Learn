package com.KarlexYan.servlet;

import com.KarlexYan.entity.Cake;
import com.KarlexYan.entity.CakeDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决中文乱码
        resp.setContentType("text/html;charset=utf-8");

        // 通过id查看是否有该商品
        String id = req.getParameter("id");
        // 没有，重定向到蛋糕展示列表
        Cake cake = CakeDB.getCakeById(id);
        if (cake == null) {
            resp.sendRedirect("ListCakeServlet");
            return;
        }
        // 有，加入到购物车
        // 从Session域中获取购物车
        HttpSession session = req.getSession();
        // 购物车，就是一个list集合
        List<Cake> cart = (List) session.getAttribute("cart");

        // cart是否存在
        // 不存在，创建购物车
        if (cart == null) {
            cart = new ArrayList<Cake>();
            // 存在session域中
            session.setAttribute("cart", cart);
        }
        // 无论存在与否，都要往购物车中，添加要购买的蛋糕
        cart.add(cake);
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        // 设置30分钟cookie，目的和session域中存储对象时间一致
        cookie.setMaxAge(60 * 30);
        cookie.setPath("/");
        resp.addCookie(cookie);

        // 重定向到购物车页面
        resp.sendRedirect("CartServlet");
    }
}
