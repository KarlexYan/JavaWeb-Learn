package com.KarlexYan.mapper;

import com.KarlexYan.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    // 在Mapper接口中定义方法，方法名就是SQL映射文件中sql语句的id，并保持参数类型和返回值类型一致
    List<User> selectAll();

    // 根据id获取用户user对象
    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}
