package com.KarlexYan.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    // Druid连接池
    public static void main(String[] args) throws Exception {

        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/druid.properties"));

        // 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 获取数据库连接 Connection
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        // 获取当前路径
        System.out.println(System.getProperty("user.dir"));

    }

}
