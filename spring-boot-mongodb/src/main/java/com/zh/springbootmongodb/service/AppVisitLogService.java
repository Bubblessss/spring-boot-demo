package com.zh.springbootmongodb.service;

import java.util.Date;

/**
 * @author zhanghang
 * @date 2019/6/14
 */
public interface AppVisitLogService {

    void save(String uuid, String ipAddress, String userAgent, String requestUrl, String requestClazz, String requestMethod, String requestParam, Date requestTime);

    void save(String uuid, Integer userId, String ipAddress, String userAgent, String requestUrl, String requestClazz, String requestMethod, String requestParam, Date requestTime,Integer status);

    void save(String uuid, Date responseTime, Long costTime, String responseContent,Integer status);
}
