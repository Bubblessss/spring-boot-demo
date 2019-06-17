package com.zh.springbootasync;

import com.zh.springbootasync.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAsyncApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void contextLoads() throws InterruptedException {
        orderService.createOrder();
        TimeUnit.SECONDS.sleep(20);
    }

}
