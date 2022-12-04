package com.KarlexYan.example;

import com.KarlexYan.pojo.Brand;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

public class BrandTest {
    // 品牌数据的增删改查操作

    @Test
    // 查询品牌全部数据
    public void testSelectAll() throws Exception {
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        // 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        // 获取数据库连接
        Connection conn = dataSource.getConnection();
        // 定义sql
        String sql = "SELECT * FROM tb_brand;";
        // 预编译
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        // 执行
        ResultSet resultSet = preparedStatement.executeQuery();

        // 创建列表，存放查询数据
        ArrayList<Brand> list = new ArrayList<>();
        // 创建brand对象，封装数据
        Brand b = new Brand();
        while (resultSet.next()) {
            b.setId(resultSet.getInt("id"));
            b.setBrandName(resultSet.getString("brand_name"));
            b.setCompanyName(resultSet.getString("company_name"));
            b.setOrdered(resultSet.getInt("ordered"));
            b.setDescription(resultSet.getString("description"));
            b.setStatus(resultSet.getInt("status"));

            list.add(b);
        }
        // 遍历
        for (Brand brand : list) {
            System.out.println(brand);
        }
        // 释放资源
        resultSet.close();
        preparedStatement.close();
        conn.close();

    }

    @Test
    // 添加数据
    public void testAdd() throws Exception {
        // 接受提交的参数
        String brandName = "苹果";
        String companyName = "苹果科技有限公司";
        int ordered = 50;
        String description = "臭鱼烂虾";
        int status = 1;

        // 连接数据库
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();

        // 定义SQL语句，预编译
        String sql = "insert into tb_brand(brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // 设置参数
        preparedStatement.setString(1, brandName);
        preparedStatement.setString(2, companyName);
        preparedStatement.setInt(3, ordered);
        preparedStatement.setString(4, description);
        preparedStatement.setInt(5, status);

        // 执行sql
        int count = preparedStatement.executeUpdate();
        System.out.println(count > 0 ? "执行成功" : "执行失败");

        // 释放资源
        preparedStatement.close();
        conn.close();

    }

    @Test
    // 修改数据
    public void testUpdate() throws Exception {
        // 接受提交的参数
        String brandName = "苹果";
        String companyName = "苹果科技有限公司";
        int ordered = 250;
        String description = "你的下一台电脑何必是电脑捏？";
        int status = 1;
        int id = 4;

        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();

        String sql = "update tb_brand " +
                "set brand_name = ?," +
                "company_name=?," +
                "ordered=?," +
                "description=?," +
                "status=1=? " +
                "where id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        // 设置参数
        preparedStatement.setString(1, brandName);
        preparedStatement.setString(2, companyName);
        preparedStatement.setInt(3, ordered);
        preparedStatement.setString(4, description);
        preparedStatement.setInt(5, status);
        preparedStatement.setInt(6, id);

        int count = preparedStatement.executeUpdate();

        System.out.println(count > 0 ? "修改成功" : "修改失败");

        preparedStatement.close();
        conn.close();
    }
}

