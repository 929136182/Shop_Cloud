package com.yzp.model;

import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IBaseService<T> {
    int deleteByPrimaryKey(Long id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKeyWithBLOBs(T record);

    int updateByPrimaryKey(T record);

    List<T> list();

    PageInfo<T> getPageInfo(Integer pageNum, Integer pageSize);
}
