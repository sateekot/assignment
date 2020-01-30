package com.tel.assignment.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @date 30-01-2020
 */

@SpringBootTest
public class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void test1GreetingService() {
        String account = "personal";
        Integer id = 123;

        String response = greetingService.getGreeting(account,id,"");
        String expected = "Hi, userId 123";
        assertEquals(expected, response);

    }

    @Test
    public void test2GreetingService() {
        String account ="business";
        String type = "small";
        String response = greetingService.getGreeting(account,0,type);
        assertNull(response);
    }

    @Test
    public void test3GreetingService() {
        String account = "business";
        String type ="big";
        String response = greetingService.getGreeting(account, 0, type);
        String expected = "Welcome, business user!";
        assertEquals(expected, response);
    }

}
