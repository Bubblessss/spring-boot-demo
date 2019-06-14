package com.zh.springbootmongodb.base.aop.annotation;

import java.lang.annotation.*;

/**
 * @author zhanghang
 * @date 2019/6/3
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AppLog {
}
