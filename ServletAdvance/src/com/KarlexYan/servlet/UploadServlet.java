package com.KarlexYan.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.UUID;

@WebServlet(urlPatterns = "/UploadServlet")
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 解决中文乱码
        resp.setContentType("text/html;charset=utf-8");
        // 解析request请求
        ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());

        PrintWriter writer = resp.getWriter();
        try {
            // 解析后得到所有的表单对象
            List<FileItem> fileItems = servletFileUpload.parseRequest(req);
            // 遍历表单对象
            for (FileItem fileItem : fileItems) {
                // 判断是否是普通字段
                if (fileItem.isFormField()) {
                    // 如果是普通字段，展示普通字段及其对应的值
                    String fieldName = fileItem.getFieldName();
                    if ("name".equals(fieldName)) {
                        // 获取name对应的值，使用utf-8编码
                        String value = fileItem.getString("utf-8");
                        // 向浏览器页面展示上传者信息
                        writer.println("上传者：" + value + "<br/>");
                    }
                } else {
                    // 如果是文件，读取出来，保存到服务器端

                    // 获取上次的文件名
                    String getName = fileItem.getName();
                    // 截取获得文件名
                    String localFileName = getName.substring(getName.indexOf("\\") + 1);
                    writer.println("文件名为：" + localFileName + "<br/>");
                    // 创建保存的路径
                    String serverFileName = UUID.randomUUID() + "-" + localFileName;
                    // 获取服务端存储路径
                    String filePath = req.getServletContext().getRealPath("\\upload\\" + serverFileName);
                    // 创建服务器文件夹
                    File mkdir = new File(req.getServletContext().getRealPath("\\upload"));
                    mkdir.mkdir();
                    // 创建文件
                    File file = new File(filePath);
                    file.createNewFile();
                    // 读取并保存到服务端路径
                    BufferedInputStream bis = new BufferedInputStream(fileItem.getInputStream());
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = bis.read(buffer)) != -1) {
                        bos.write(buffer, 0, len);
                    }
                    // 释放资源
                    bos.close();
                    bis.close();

                    // 提示上传成功
                    writer.println("文件上传成功" + "<hr/>");
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
