package org.book.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestLinstener implements ApplicationListener <TestEvent>{

    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println("监听到自定义事件！");
    }
}
