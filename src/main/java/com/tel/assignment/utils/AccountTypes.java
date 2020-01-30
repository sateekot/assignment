package com.tel.assignment.utils;

/**
 * @date 30-01-2020
 * Enum holding account types.
 */
public enum AccountTypes {
    PERSONAL ("personal"),
    BUSINESS ("business");

    private String value;

    AccountTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
