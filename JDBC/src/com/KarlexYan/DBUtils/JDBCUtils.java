package com.KarlexYan.DBUtils;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    // 建立数据库连接
    public static Connection getConnection() throws Exception {
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/dbcp.properties"));
        // 获取连接池对象
        BasicDataSource dataSource = BasicDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        return dataSource.getConnection();
    }

    // 关闭数据库连接，释放资源
    public static void release(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            conn = null;
        }
    }

    public static void release(ResultSet rs, Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(stmt, conn);
    }
}
