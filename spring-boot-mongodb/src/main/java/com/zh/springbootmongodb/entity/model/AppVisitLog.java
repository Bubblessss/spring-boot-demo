package com.zh.springbootmongodb.entity.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author zhanghang
 * @date 2019/6/14
 */
@Data
public class AppVisitLog {

    @Field("_id")
    private String id;

    private String uuid;

    private Integer userId;

    private String ipAddress;

    private String userAgent;

    private String requestUrl;

    private String requestClazz;

    private String requestMethod;

    private String requestParam;

    private Date requestTime;

    private Date responseTime;

    private Long costTime;

    private Integer status;

    private String responseContent;
}
