package com.example.inject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InjectApplication {

    public static void main(String[] args) {
         SpringApplication.run(InjectApplication.class, args);
//        new SpringApplicationBuilder(InjectApplication.class)
//                .properties("spring.config.name:book")
//                .build()
//                .run(args);
    }

}
