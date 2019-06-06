package com.zh.springbootredisson.service;

/**
 * @author zhanghang
 * @date 2019/6/6
 */
public interface OrderService {
    String book();

    String bookWithLock();
}
