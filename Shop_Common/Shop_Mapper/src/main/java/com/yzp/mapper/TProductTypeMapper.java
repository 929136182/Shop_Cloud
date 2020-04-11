package com.yzp.mapper;

import com.yzp.entity.TProductType;
import com.yzp.model.IBaseDao;

public interface TProductTypeMapper extends IBaseDao<TProductType> {
    int deleteByPrimaryKey(Long id);

    int insert(TProductType record);

    int insertSelective(TProductType record);

    TProductType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TProductType record);

    int updateByPrimaryKey(TProductType record);
}