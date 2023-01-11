package com.KarlexYan.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class c3p0Demo {
    public static DataSource ds = null;

    public static void main(String[] args) throws PropertyVetoException, SQLException {
        // 拿到c3p0的实现类
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        // 设置数据源参数
        cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        cpds.setUser("root");
        cpds.setPassword("123456");
        cpds.setInitialPoolSize(5);
        cpds.setMaxPoolSize(15);
        // 获取连接池对象
        ds = cpds;
        // 获取数据库连接
        Connection conn = ds.getConnection();
        // 获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        // 打印数据库连接信息
        System.out.println(metaData.getDriverName());
        System.out.println(metaData.getUserName());
        System.out.println(metaData.getURL());
    }
}
