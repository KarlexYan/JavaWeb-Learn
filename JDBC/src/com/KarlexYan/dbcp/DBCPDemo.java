package com.KarlexYan.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DBCPDemo {
    public static DataSource ds = null;

    static {
        // 获取DBCP连接池实现对象
        BasicDataSource bds = new BasicDataSource();
        // 设置数据库需要的配置信息
//        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/test");
        bds.setUsername("root");
        bds.setPassword("123456");
        // 设置连接池的初始连接参数
        bds.setInitialSize(5);
        // 赋值
        ds = bds;
    }

    public static void main(String[] args) throws SQLException {
        // 获取连接对象
        Connection conn = ds.getConnection();
        // 获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        // 打印数据库连接信息
        System.out.println(metaData.getURL());
        System.out.println(metaData.getUserName());
        System.out.println(metaData.getDriverName());
    }
}
