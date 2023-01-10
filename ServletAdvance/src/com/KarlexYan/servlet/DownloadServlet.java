package com.KarlexYan.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

// 实现文件的下载
@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置如何处理文件，默认直接在浏览器页面显示，设置为下载附件的形式
        resp.addHeader("Content-Disposition", "attachment;filename=" + req.getParameter("fileName"));
        // 读取文件数据
        FileInputStream fis = new FileInputStream("D:\\Coding\\java-web-learn\\ServletAdvance\\web\\img\\wallpaper.jpg");
        // 构建输出流
        ServletOutputStream sos = resp.getOutputStream();
        // 输入信息写出去
        IOUtils.copy(fis, sos);

    }
}
