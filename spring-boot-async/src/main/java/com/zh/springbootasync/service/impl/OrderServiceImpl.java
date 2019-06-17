package com.zh.springbootasync.service.impl;

import com.zh.springbootasync.service.MsgService;
import com.zh.springbootasync.service.OrderService;
import com.zh.springbootasync.utils.SpringContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author zhanghang
 * @date 2019/6/17
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MsgService msgService;

    @Override
    public void createOrder() {
        this.msgService.sendMsg();
        SpringContext.getBean(OrderService.class).sendEmail();
        this.saveOrder();
    }

    @Async
    @Override
    public void sendEmail() {
        try {
            TimeUnit.SECONDS.sleep(5);
            log.info("============email发送成功=============");
        } catch (InterruptedException e) {
            log.error(e.getMessage(),e);
        }
    }

    public void saveOrder() {
        log.info("============订单创建成功=============");
    }

}
