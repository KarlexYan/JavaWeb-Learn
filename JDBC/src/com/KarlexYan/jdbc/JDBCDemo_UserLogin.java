package com.KarlexYan.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo_UserLogin {
    // 演示登录
    @Test
    public void testLogin() throws SQLException {
        // 连接数据库
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";

        Connection connection = DriverManager.getConnection(url, username, password);

        // 接受账户和密码
        String user = "zhangsan";
        String pwd = "123";
        // 查询
        String sql = "select * from tb_user where username = '" + user + "' and password = '" + pwd + "';";
//        System.out.println(sql);
        ResultSet resultSet = connection.createStatement().executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }

        // 释放资源
        resultSet.close();
        connection.close();
    }


    // 演示SQL注入
    @Test
    public void testLoginInject() throws SQLException {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";

        Connection connection = DriverManager.getConnection(url, username, password);

        String user = "zhangsan";
        // SQL 万能注入语句
        String pwd = "' or '1' = '1";

        String sql = "select * from tb_user where username = '" + user + "' and password = '" + pwd + "';";
        ResultSet resultSet = connection.createStatement().executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }

        // 释放资源
        resultSet.close();
        connection.close();
    }
}
