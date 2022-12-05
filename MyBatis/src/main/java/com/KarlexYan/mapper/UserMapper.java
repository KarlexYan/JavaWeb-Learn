package com.KarlexYan.mapper;

import com.KarlexYan.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}
