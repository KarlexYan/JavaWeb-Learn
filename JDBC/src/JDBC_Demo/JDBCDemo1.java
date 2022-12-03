package JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {
    // JDBC连接
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 获取连接对象
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "Karlex1238";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 定义SQL
        String sql = "show databases;";

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
