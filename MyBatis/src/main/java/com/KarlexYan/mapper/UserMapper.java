package com.KarlexYan.mapper;

import com.KarlexYan.pojo.User;

import java.util.List;

public interface UserMapper {
    // 在Mapper接口中定义方法，方法名就是SQL映射文件中sql语句的id，并保持参数类型和返回值类型一致
    List<User> selectAll();

    // 根据id获取用户user对象
    User selectById(int id);
}
