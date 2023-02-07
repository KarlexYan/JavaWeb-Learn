package com.KarlexYan;

import com.KarlexYan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
 *   Mybatis 快速入门代码
 * */
public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象，执行SQL语句
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.selectAll");

        // 遍历
        for (User user : users) {
            System.out.println(user.toString());
        }

        // 释放资源
        sqlSession.close();
    }
}
