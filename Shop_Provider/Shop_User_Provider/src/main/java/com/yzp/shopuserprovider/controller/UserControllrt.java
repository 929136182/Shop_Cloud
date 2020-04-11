package com.yzp.shopuserprovider.controller;

import com.yzp.dto.TUserDto;
import com.yzp.entity.TUser;
import com.yzp.model.pojo.ResultBean;
import com.yzp.shopuserprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControllrt {

    @Autowired
    private IUserService userService;

    @RequestMapping("/shop/user/login")
    public ResultBean login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        TUser user = userService.selectByUsername(username);
        if (user == null){
            return ResultBean.errResult("用户名或密码错误");
        }
        if (!user.getPassword().equals(password)){
            return ResultBean.errResult("用户名密码错误");
        }
        return ResultBean.successResult("登陆成功");
    }
    /*1:注册成功
    * 2.注册失败
    * 3.用户名存在*/
    @RequestMapping("/shop/user/register")
    public Integer register(@RequestBody TUserDto userDto){
        TUser tUser = userService.selectByUsername(userDto.getUsername());
        if (tUser == null){
            Integer register = userService.register(userDto);
            if (register > 0){
                return 1;
            }
            return 2;
        }
        return 3;
    }
}
