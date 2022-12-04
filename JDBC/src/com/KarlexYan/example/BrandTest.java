package com.KarlexYan.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class BrandTest {
    // 品牌数据的增删改查操作

    @Test
    // 查询品牌全部数据
    public void testSelectAll() throws Exception {
//        Properties prop = new Properties();
//        prop.load(new FileInputStream("JDBC/src/druid.properties"));
//
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
//
//        Connection conn = dataSource.getConnection();
//        System.out.println(conn);
        System.out.println(System.getProperty("user.dir"));
    }
}
