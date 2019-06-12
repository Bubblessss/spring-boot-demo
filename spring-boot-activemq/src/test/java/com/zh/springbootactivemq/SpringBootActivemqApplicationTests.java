package com.zh.springbootactivemq;

import com.zh.springbootactivemq.model.User;
import com.zh.springbootactivemq.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootActivemqApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void sendString2QueueTest() throws JMSException {
        this.productService.sendQueueMsg("Hello World 2019");
    }

    @Test
    public void sendUser2QueueTest() throws JMSException {
        this.productService.sendQueueMsg(new User(1,"张三",27));
    }

    @Test
    public void sendString2TopicTest() throws JMSException {
        this.productService.sendTopicMsg("Hello World 2019");
    }

    @Test
    public void sendUser2TopicTest() throws JMSException {
        this.productService.sendTopicMsg(new User(2,"李四",21));
    }

}
