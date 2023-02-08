package com.KarlexYan.test;

import com.KarlexYan.mapper.BrandMapper;
import com.KarlexYan.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandTest {
    @Test
    public void testSelectAll() throws IOException {
        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取BrandMapper接口代理对象，执行语句
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();

        // 遍历输出
        for (Brand brand : brands) {
            System.out.println(brand.toString());
        }

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {
        // 定义接收参数
        int id = 1;

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行方法
        Brand brands = mapper.selectById(id);

        // 遍历输出
        System.out.println(brands.toString());

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {
        // 定义接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        // 封装成Map集合
        Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行方法
//        List<Brand> brands = mapper.selectByCondition(status, companyName, brandName);
//        List<Brand> brands = mapper.selectByCondition(brand);
        List<Brand> brands = mapper.selectByCondition(map);

        for (Brand brand1 : brands) {
            System.out.println(brand1.toString());
        }

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByConditionSingle() throws IOException {
        // 定义接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        // 封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行方法
        List<Brand> brands = mapper.selectByConditionSingle(brand);


        for (Brand brand1 : brands) {
            System.out.println(brand1.toString());
        }

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        // 定义接收参数
        String brandName = "大米";
        String companyName = "大米科技有限公司";
        int ordered = 50;
        String description = "你瞅啥";
        int status = 1;

        // 封装对象
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        /*  MyBatis事务
         *       openSession() ：默认开启事物，进行增删改操作需要使用 sqlSession.commit 手动提交事务
         *       openSession(true) ：可以设置为自动提交事务（关闭事务）
         * */
        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行语句
        mapper.add(brand);

        // 提交事务
        sqlSession.commit();

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        // 定义接收参数
        String brandName = "大米";
        String companyName = "大米科技有限公司";
        int ordered = 150;
        String description = "你瞅啥?";
        int status = 1;
        int id = 7;

        // 封装对象
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);
        brand.setId(id);

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        /*  MyBatis事务
         *       openSession() ：默认开启事物，进行增删改操作需要使用 sqlSession.commit 手动提交事务
         *       openSession(true) ：可以设置为自动提交事务（关闭事务）
         * */
        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行语句
        int count = mapper.update(brand);
        System.out.println(count);

        // 提交事务
        sqlSession.commit();

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testDelete() throws IOException {
        // 定义接收参数
        int id = 7;

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行语句
        mapper.deleteById(id);

        // 提交事务
        sqlSession.commit();

        // 释放资源
        sqlSession.close();
    }

    @Test
    public void testDeleteArray() throws IOException {
        // 定义接收参数
        int[] ids = {8, 9, 10};

        // 加载mybatis核心配置文件，获取到SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 获取Mapper接口代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 执行语句
        mapper.deleteByIds(ids);

        // 提交事务
        sqlSession.commit();

        // 释放资源
        sqlSession.close();
    }
}
