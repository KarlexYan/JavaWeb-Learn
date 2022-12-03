package com.KarlexYan.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo_DriverManage {
    // JDBC API 详解：DriverManage
    public static void main(String[] args) throws SQLException {
        // 如果连接的是本机数据库，且端口为3306，则可以简写
        // useSSL=false 禁用安全连接方式，解决警告提示
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "123456";

        int result = DriverManager
                .getConnection(url, username, password)
                .createStatement()
                .executeUpdate("update t_organization set o_entered = 85 where id = '671cf';");

        System.out.println(result);

    }
}
