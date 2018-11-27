package com.study.mybatisdemo.controller;

import com.study.mybatisdemo.model.User;
import com.study.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    protected UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
    @ResponseBody
    @RequestMapping(value = "/selectByPrimaryKey/{userId}", produces = {"application/json;charset=UTF-8"})
    public Object selectByPrimaryKey(@PathVariable("userId") int userId){
        User user = userService.selectByPrimaryKey(userId);
        return user.getPassword();
    }


}
