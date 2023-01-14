package com.KarlexYan.DBUtils;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 连接数据库
            String url = "jdbc:mysql:///test?useSSL=false&useServerPrepStmts=true&serverTimezone=GMT%2B8";
            String username = "root";
            String password = "123456";
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean contains(String user, String pwd) {
        PreparedStatement prepStmt = null;
        ResultSet resultSet = null;
        Connection conn = null;
        try {
            conn = getConnection();
            // 定义sql
            String sql = "select * from user where name = ? and password = ?";
            // 预编译
            prepStmt = conn.prepareStatement(sql);
            prepStmt.setString(1, user);
            prepStmt.setString(2, pwd);

            // 执行语句
            resultSet = prepStmt.executeQuery();

            if (resultSet.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet searchTitle(String sql) {
        PreparedStatement prepStmt = null;
        ResultSet resultSet = null;
        Connection conn = null;

        try {
            conn = getConnection();
//            String sql = "select title from info";
            prepStmt = conn.prepareStatement(sql);
            resultSet = prepStmt.executeQuery();

            return resultSet;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
