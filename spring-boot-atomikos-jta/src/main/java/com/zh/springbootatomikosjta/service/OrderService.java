package com.zh.springbootatomikosjta.service;


import com.zh.springbootatomikosjta.model.test1.Order;

/**
 * @author zhanghang
 * @date 2019/6/6
 */
public interface OrderService {

    Order findByProductId(Integer productId);

    void save(Integer productId, Integer userId);
}
