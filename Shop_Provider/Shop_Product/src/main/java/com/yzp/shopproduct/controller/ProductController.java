package com.yzp.shopproduct.controller;


import com.github.pagehelper.PageInfo;
import com.yzp.entity.TProduct;
import com.yzp.shopproduct.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/shop/product/getAll")
    @ResponseBody
    public List<TProduct> getAll(){
        return productService.list();
    }

    @GetMapping("/shop/product/page/{pageNum}/{pageSize}")
    @ResponseBody
    public PageInfo<TProduct> listByPage(@PathVariable(required = false,value = "pageNum") Integer pageNum, @PathVariable(required = false,value = "pageSize") Integer pageSize){
        PageInfo<TProduct> pageInfo = productService.getPageInfo(pageNum, pageSize);
        return pageInfo;
    }
}
