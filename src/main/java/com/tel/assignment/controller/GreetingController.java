package com.tel.assignment.controller;

import com.tel.assignment.exception.BusinessServiceException;
import com.tel.assignment.service.GreetingService;
import com.tel.assignment.utils.AccountTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 30-01-2020
 * GreetingController component is rest endpoint which exposes apis.
 */
@RestController
public class GreetingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path = "/greeting", method = RequestMethod.GET)
    public String getGreeting(@RequestParam(required = true) String account, @RequestParam(required = false) Integer id, @RequestParam(required = false) String type) throws BusinessServiceException {
        LOGGER.info("Request received with input values account={}, id={} and type={}",account,id,type);
        String response = greetingService.getGreeting(account, id, type);
        if(response == null) {
            throw new BusinessServiceException("The path is not yet implemented.");
        }
        return response;
    }
}
