package com.KarlexYan.jdbc;

import org.junit.Test;

import java.sql.*;

public class JDBCDemo_PreparedStatement {
    // 防止SQL注入
    @Test
    public void fixSqlInject() throws SQLException {
        // 连接数据库
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        // 设置查询语句，参数值使用?占位符替代
        String sql = "select * from tb_user where username = ? and password = ?";

        // 通过 Connection 对象获取，并传入对应的sql语句
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // 设置查询语句的参数
        // preparedStatement对象: setXXX(参数1,参数2)
        // 参数1：?的位置编号，从1开始
        // 参数2：?的值
        preparedStatement.setString(1, "zhangsan");
        preparedStatement.setString(2, " ' or '1' = '1");

        // 执行语句，不需要再传入sql
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();
        preparedStatement.close();
        conn.close();
    }
}
