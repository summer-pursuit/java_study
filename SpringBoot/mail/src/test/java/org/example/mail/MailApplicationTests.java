package org.example.mail;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class MailApplicationTests {
    @Resource
    JavaMailSender sender;

    @Test
    void contextLoads() {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("【电子科技大学教务处】关于近期学校对您的处分决定");
        //设置邮件内容
        message.setText("XXX同学您好，经监控和教务巡查发现，您近期存在旷课、迟到、早退、上课刷抖音行为，" +
                "现已通知相关辅导员，请手写5000字书面检讨，并在2022年4月1日17点前交到辅导员办公室。");
        //设置邮件发送给谁，可以多个，这里就发给你的QQ邮箱
        message.setTo("2975307701@qq.com");
        //邮件发送者，这里要与配置文件中的保持一致
        message.setFrom("13687616857@163.com");
        //OK，万事俱备只欠发送
        sender.send(message);

    }

}
