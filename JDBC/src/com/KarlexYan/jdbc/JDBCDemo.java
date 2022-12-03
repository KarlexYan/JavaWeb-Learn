package com.KarlexYan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    // JDBC快速入门
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        // MYSQL5 之后的驱动包，可以省去注册驱动的步骤
        // 自动加载 META-INF/services/java.sql.Driver 文件中的驱动类
//        Class.forName("com.mysql.jdbc.Driver");

        // 获取连接对象
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 定义SQL
        String sql = "update t_organization set o_entered = 85 where id = '671cf';";
        // 获取执行sql的对象
        Statement stmt = conn.createStatement();


        // 执行sql
        int result = stmt.executeUpdate(sql);  // 受影响的行数

        // 处理结果
        System.out.println(result);

        // 释放资源
        stmt.close();
        conn.close();
    }
}
