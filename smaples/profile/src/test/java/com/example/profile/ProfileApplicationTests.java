package com.example.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileApplicationTests {

    @Autowired
    Conf conf;

    @Test
    void contextLoads() {
        System.out.printf(conf.toString());
    }

}
