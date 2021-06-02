package com.eddy.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// the same as applicationContext
@Configuration
public class JavaConfig {

    // the same as <bean> in xml
    @Bean
    SayHello sayHello() {
        return  new SayHello();
    }

    @Bean("hell2")
    SayHello sayHello2() {
        return  new SayHello();
    }
}
