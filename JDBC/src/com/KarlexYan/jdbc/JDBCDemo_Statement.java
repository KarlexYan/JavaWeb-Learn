package com.KarlexYan.jdbc;

import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_Statement {
    // JDBC API 详解：Statement

    // 执行DML语句
    @Test
    public void testDML() throws SQLException {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";
        Statement statement = DriverManager.getConnection(url, username, password).createStatement();

        String sql = "update t_organization set o_entered = 85 where id = '671cf';";

        int result = statement.executeUpdate(sql);

        System.out.println(result > 0 ? "修改成功" : "修改失败");

        statement.close();
    }

    @Test

    public void testDDL() throws SQLException {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";
        Statement statement = DriverManager.getConnection(url, username, password).createStatement();

        String sql = "create database db1";

        int result = statement.executeUpdate(sql);

        // DDL 语句返回也可能为0
        System.out.println(result > 0 ? "修改成功" : "修改失败");

        statement.close();
    }
}
