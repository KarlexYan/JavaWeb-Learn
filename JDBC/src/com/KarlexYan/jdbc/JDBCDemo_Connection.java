package com.KarlexYan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo_Connection {
    // JDBC API 详解：Connection
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";

        Connection connection = DriverManager.getConnection(url, username, password);


        String sql1 = "update t_organization set o_entered = 85 where id = '671cf';";
        String sql2 = "update t_organization set o_entered = 90 where id = '8IiQ';";

        Statement statement = connection.createStatement();

        try {
            // 关闭自动提交事务
            connection.setAutoCommit(false);

            int result1 = statement.executeUpdate(sql1);
            System.out.println(result1);

            int result2 = statement.executeUpdate(sql2);
            System.out.println(result2);

            // 提交事务
            connection.commit();
        } catch (Exception e) {
            // 回滚事务
            connection.rollback();

            e.printStackTrace();
        }

        statement.close();
        connection.close();
    }
}
