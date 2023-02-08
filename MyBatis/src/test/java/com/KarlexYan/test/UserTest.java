package com.KarlexYan.test;

import com.KarlexYan.mapper.UserMapper;
import com.KarlexYan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserTest {
    @Test
    public void testSelectById() throws IOException {
        int id = 1;

        // 加载mybatis
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 执行语句
        User user = mapper.selectById(id);

        System.out.println(user.toString());
    }
}
