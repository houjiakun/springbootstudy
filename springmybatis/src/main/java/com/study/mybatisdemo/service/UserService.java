package com.study.mybatisdemo.service;

import com.example.mybatisdemo.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    User selectByPrimaryKey(int userId);

}
