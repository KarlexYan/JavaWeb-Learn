package com.KarlexYan.dbcp;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Properties;

public class DBCPDemo2 {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/dbcp.properties"));

        // 获取连接池对象
        BasicDataSource ds = BasicDataSourceFactory.createDataSource(prop);

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
