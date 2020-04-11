package com.yzp.shopproduct.service;


import com.yzp.entity.TProduct;
import com.yzp.model.IBaseService;
import com.yzp.shopproduct.dto.ProductDto;
import com.yzp.shopproduct.dto.UpProductDto;

public interface IProductService extends IBaseService<TProduct> {

    Long save(ProductDto dto);

    UpProductDto selectById(Long id);

    Integer upDateById(UpProductDto dto);
}
