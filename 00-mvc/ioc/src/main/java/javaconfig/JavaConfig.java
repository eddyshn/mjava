package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这种方法一般用来加载第三方库

// the same as applicationContext.xml
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
