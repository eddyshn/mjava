package com.example.inject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectApplicationTests {

    @Autowired
    Book book;

    @Test
    void contextLoads() {
        System.out.println(book.toString());
    }

}
