package com.tel.assignment.utils;

/**
 * @date 30-01-2020
 * Enum holding types (small, big).
 */
public enum Types {
    SMALL ("small"),
    BIG ("big");

    private String value;

    Types(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
