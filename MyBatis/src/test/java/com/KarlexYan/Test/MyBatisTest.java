package com.KarlexYan.Test;

import com.KarlexYan.mapper.BrandMapper;
import com.KarlexYan.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    // 查询
    public void testSelectAll() throws IOException {
        // 加载mybatis的核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取UserMapper接口的代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();

        for (Brand brand : brands) {
            System.out.println(brand);
        }

        sqlSession.close();
    }
}
