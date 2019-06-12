package com.zh.springbootactivemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author zhanghang
 * @date 2019/6/11
 */
@Configuration
@EnableJms
public class ActivemqConfig {

    @Bean
    public JmsListenerContainerFactory<?> queueListenerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setPubSubDomain(false);
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }

    @Bean
    public JmsListenerContainerFactory<?> topicListenerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setPubSubDomain(true);
        factory.setConcurrency("1");
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }

    @Bean
    public Queue queueString(){
        return new ActiveMQQueue("queue_string_test");
    }

    @Bean
    public Queue queueUser(){
        return new ActiveMQQueue("queue_user_test");
    }

    @Bean
    public Topic topicString(){
        return new ActiveMQTopic("topic_string_test");
    }

    @Bean
    public Topic topicUser(){
        return new ActiveMQTopic("topic_user_test");
    }

    @Bean
    public Topic delayTopicString(){
        return new ActiveMQTopic("topic_delay_string_test");
    }
}
