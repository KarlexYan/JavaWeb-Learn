package com.KarlexYan.example;

import com.KarlexYan.Dao.BaseDao;
import com.KarlexYan.pojo.User;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetTest1 {
    public static void testBeanHandler() throws SQLException {
        // 获取Dao
        BaseDao baseDao = new BaseDao();
        // 获取sql
        String sql = "select * from user where id = ?";
        // 执行sql
        User user = (User) baseDao.query(sql, new BeanHandler<>(User.class), 1);

        // 测试
        System.out.println("id为" + user.getId() + "的用户的名字为" + user.getName());
    }

    public static void main(String[] args) throws SQLException {
        testBeanHandler();
    }
}
