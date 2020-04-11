package com.yzp.mapper;

import com.yzp.dto.TUserDto;
import com.yzp.entity.TUser;
import com.yzp.model.IBaseDao;


public interface TUserMapper extends IBaseDao<TUser> {


    TUser selectByUserName(String username);

    Integer register(TUserDto userDto);


}