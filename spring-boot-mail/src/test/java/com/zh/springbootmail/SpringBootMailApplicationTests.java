package com.zh.springbootmail;

import com.zh.springbootmail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMailApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void simpleMailTest() {
        String to = "xxxxxxxxxxx@qq.com";
        String subject = "测试邮件1";
        String text = "Hello World";
        this.mailService.sendEmail(to,subject,text);
    }

    @Test
    public void fileMailTest() {
        String to = "xxxxxxxxxxx@qq.com";
        String subject = "测试邮件2";
        String text = "Hello World 2019";
        String filePath = "D:\\工作\\资料\\资料\\详版报告样本.txt";
        this.mailService.sendEmailWithFile(to,subject,text,filePath);
    }
}
