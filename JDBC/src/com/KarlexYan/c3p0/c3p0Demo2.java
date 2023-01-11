package com.KarlexYan.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class c3p0Demo2 {
    public static DataSource ds = null;

    public static void main(String[] args) throws SQLException {
        // 读取文件，默认调用的是<default-config>里的，如果填了值则调用对应<named-config>的连接池
        ComboPooledDataSource cpds = new ComboPooledDataSource("karlexyan");

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
