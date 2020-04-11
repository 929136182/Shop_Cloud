package com.yzp.shopuserconsumer.service;

import com.github.pagehelper.PageInfo;
import com.yzp.dto.TUserDto;
import com.yzp.entity.TProduct;
import com.yzp.model.pojo.ResultBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "user-provider")
public interface IUserService {
    @RequestMapping("/shop/user/login")
    ResultBean Login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password);

    @RequestMapping("/shop/user/register")
    ResultBean register(@RequestBody TUserDto userDto);
}
