package com.KarlexYan;

import com.KarlexYan.mapper.UserMapper;
import com.KarlexYan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MapperAgent {
    // MyBatis Mapper代理开发
    public static void main(String[] args) throws IOException {
        // 加载mybatis的核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行SQL语句
//        List<User> users = sqlSession.selectList("mybatis.selectAll");

        // 获取UserMapper接口的代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        // 打印
        System.out.println(users);

        // 释放资源
        sqlSession.close();
    }
}
