package com.tel.assignment.service;

import com.tel.assignment.utils.AccountTypes;
import com.tel.assignment.utils.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @date 30-01-2020
 * GreetingService is a service component which contains the functional requirement of api.
 */
@Component
public class GreetingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingService.class);

    /**
     * Gets the greeting message based on input values.
     * @param account
     * @param id
     * @param type
     * @return greeting message
     */
    public String getGreeting(String account, Integer id, String type) {
        StringBuilder response = new StringBuilder();
        if(AccountTypes.PERSONAL.getValue().equals(account) && id == 123) {
            response.append("Hi, userId ").append(id);
        } else if(AccountTypes.BUSINESS.getValue().equals(account)) {
            if(Types.BIG.getValue().equals(type)) {
                response.append("Welcome, business user!");
            } else if(Types.SMALL.getValue().equals(type)) {
                return null;
            }
        }
        LOGGER.info("Greeting message from service is : {}", response.toString());
        return response.toString();
    }
}
