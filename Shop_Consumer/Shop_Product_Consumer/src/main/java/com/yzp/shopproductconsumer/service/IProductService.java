package com.yzp.shopproductconsumer.service;


import com.github.pagehelper.PageInfo;
import com.yzp.entity.TProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "product-provider")
public interface IProductService {
    @GetMapping("/shop/product/getAll")
    List<TProduct> getAll();

    @GetMapping("/shop/product/page/{pageNum}/{pageSize}")
    PageInfo<TProduct> listByPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize);
}
