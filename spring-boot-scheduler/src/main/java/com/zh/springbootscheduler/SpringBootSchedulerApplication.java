package com.zh.springbootscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedulerApplication.class, args);
    }

}
