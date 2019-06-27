package com.zh.springbootshiro.service;

import java.util.Set;

/**
 * @author zhanghang
 * @date 2019/6/25
 */
public interface PermService {

    Set<String> findByUserId(Integer userId);

}
