package com.zh.springbootactivemq.service;

import com.zh.springbootactivemq.model.User;

import javax.jms.JMSException;

/**
 * @author zhanghang
 * @date 2019/6/11
 */
public interface ProductService {

    void sendQueueMsg(String msg) throws JMSException;

    void sendQueueMsg(User user) throws JMSException;

    void sendTopicMsg(String msg) throws JMSException;

    void sendTopicMsg(User user) throws JMSException;
}
