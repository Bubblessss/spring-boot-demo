package com.zh.springbootelasticsearch.service;

import com.zh.springbootelasticsearch.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author zhanghang
 * @date 2019/6/18
 */
public interface ProductService {

    Product getProduct();

    List<Product> listProduct();

    List<Product> findByFieldMatch(String filed, String value);

    Page<Product> findByFieldMatch(String filed, String value, Pageable pageable);

    List<Product> findByValue(String value);

    Page<Product> findByValue(String value, Pageable pageable);

}
