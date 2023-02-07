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

// 代理开发
public class MapperAgent {
    public static void main(String[] args) throws IOException {
        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象，执行SQL语句
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取UserMapper接口的代理对象，并执行语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        // 遍历
        for (User user : users) {
            System.out.println(user.toString());
        }

        // 释放资源
        sqlSession.close();

    }
}
