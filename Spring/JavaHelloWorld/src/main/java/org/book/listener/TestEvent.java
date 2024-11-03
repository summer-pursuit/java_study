package org.book.listener;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {   //自定义事件需要继承ApplicationEvent
    public TestEvent(Object source) {
        super(source);
    }
}