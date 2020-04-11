package com.yzp.shopuserprovider.service;

import com.yzp.dto.TUserDto;
import com.yzp.entity.TProduct;
import com.yzp.entity.TUser;
import com.yzp.model.IBaseService;


public interface IUserService extends IBaseService<TUser> {
    TUser selectByUsername(String username);
    Integer register(TUserDto userDto);
}
