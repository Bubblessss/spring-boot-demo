package com.zh.springbootredis;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author zhanghang
 * @date 2019/5/29
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String sex;

    public User(){}

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
