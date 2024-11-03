package org.book;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.book.config.MainConfiguration;
import org.book.mapper.TestMapper;
import org.book.service.TestService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//       TestService service = context.getBean(TestService.class);
        System.out.println(context.getBean("lbwnb"));

    }
}
