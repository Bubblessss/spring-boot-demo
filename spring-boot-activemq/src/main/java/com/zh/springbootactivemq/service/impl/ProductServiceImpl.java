package com.zh.springbootactivemq.service.impl;

import com.zh.springbootactivemq.model.User;
import com.zh.springbootactivemq.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Topic;


/**
 * @author zhanghang
 * @date 2019/6/11
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private Queue queueString;

    @Autowired
    private Queue queueUser;

    @Autowired
    private Topic topicString;

    @Autowired
    private Topic topicUser;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Override
    public void sendQueueMsg(String msg) throws JMSException {
        log.info("product发送信息:{}到{}",msg,this.queueString.getQueueName());
        this.jmsMessagingTemplate.convertAndSend(this.queueString,msg);
    }

    @Override
    public void sendQueueMsg(User user) throws JMSException {
        log.info("product发送信息:{}到{}",user.toString(),this.queueUser.getQueueName());
        this.jmsMessagingTemplate.convertAndSend(this.queueUser,user);
    }

    @Override
    public void sendTopicMsg(String msg) throws JMSException {
        log.info("product发送信息:{}到{}",msg,this.topicString.getTopicName());
        this.jmsMessagingTemplate.convertAndSend(this.topicString,msg);
    }

    @Override
    public void sendTopicMsg(User user) throws JMSException {
        log.info("product发送信息:{}到{}",user.toString(),this.topicUser.getTopicName());
        this.jmsMessagingTemplate.convertAndSend(this.topicUser,user);
    }
}
