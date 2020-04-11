package com.yzp.shopuserprovider.service.impl;

import com.yzp.dto.TUserDto;
import com.yzp.entity.TUser;
import com.yzp.mapper.TUserMapper;
import com.yzp.model.IBaseDao;
import com.yzp.model.IBaseServiceImpl;
import com.yzp.shopuserprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends IBaseServiceImpl<TUser> implements IUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public IBaseDao<TUser> getIbaseDao() {
        return userMapper;
    }

    @Override
    public TUser selectByUsername(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public Integer register(TUserDto userDto) {
        return userMapper.register(userDto);
    }
}
