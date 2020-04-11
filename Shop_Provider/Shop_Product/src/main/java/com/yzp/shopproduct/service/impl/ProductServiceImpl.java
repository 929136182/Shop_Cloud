package com.yzp.shopproduct.service.impl;

import com.yzp.entity.TProduct;
import com.yzp.mapper.TProductDescMapper;
import com.yzp.mapper.TProductMapper;
import com.yzp.model.IBaseDao;
import com.yzp.model.IBaseServiceImpl;
import com.yzp.shopproduct.dto.ProductDto;
import com.yzp.shopproduct.dto.UpProductDto;
import com.yzp.shopproduct.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl extends IBaseServiceImpl<TProduct> implements IProductService {
    @Autowired
    private TProductMapper productMapper;
    @Autowired
    private TProductDescMapper productDescMapper;
    @Override
    public IBaseDao<TProduct> getIbaseDao() {
        return productMapper;
    }

    @Override
    public Long save(ProductDto dto) {
        return null;
    }

    @Override
    public UpProductDto selectById(Long id) {
        return null;
    }

    @Override
    public Integer upDateById(UpProductDto dto) {
        return null;
    }
}
