package com.tel.assignment.exception;

/**
 * @date 30-01-2020
 * BusinessServiceException handles all business related exceptions.
 */
public class BusinessServiceException extends Exception {

    public BusinessServiceException(String errorMessage) {
        super(errorMessage);
    }
}
