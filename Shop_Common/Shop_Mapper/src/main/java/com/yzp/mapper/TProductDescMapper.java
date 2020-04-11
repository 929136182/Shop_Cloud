package com.yzp.mapper;


import com.yzp.entity.TProductDesc;
import com.yzp.model.IBaseDao;

public interface TProductDescMapper extends IBaseDao<TProductDesc> {
    TProductDesc selectById(Long productId);
    Integer upDateById(TProductDesc productDesc);
}