package com.yzp.shopuserconsumer.controller;

import com.yzp.dto.TUserDto;
import com.yzp.model.pojo.ResultBean;
import com.yzp.shopuserconsumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("api/shop/user/login")
    public ResultBean login(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password){
        return userService.Login(username,password);
    }

    @RequestMapping("api/shop/user/register")
    public ResultBean register(@RequestBody TUserDto userDto){

     return userService.register(userDto);

    }
}
