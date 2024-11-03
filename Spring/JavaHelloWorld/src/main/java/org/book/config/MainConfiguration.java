package org.book.config;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScans ({
    @ComponentScan("org.book.entity"),
        @ComponentScan("org.book.listener")
})
@EnableAsync
@EnableScheduling
@Configuration
@EnableAspectJAutoProxy
public class MainConfiguration {

}
