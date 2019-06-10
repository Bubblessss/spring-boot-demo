package com.zh.springbootmultidatasource.model.test2;

import lombok.Data;
import lombok.ToString;

/**
 * @author zhanghang
 * @date 2019/6/6
 */
@Data
@ToString
public class Stock {
    private Integer id;

    private Integer productId;

    private Integer count;

}