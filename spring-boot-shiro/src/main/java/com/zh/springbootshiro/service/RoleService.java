package com.zh.springbootshiro.service;

import java.util.Set;

/**
 * @author zhanghang
 * @date 2019/6/25
 */
public interface RoleService {

    Set<String> findByUserId(Integer userId);

}
