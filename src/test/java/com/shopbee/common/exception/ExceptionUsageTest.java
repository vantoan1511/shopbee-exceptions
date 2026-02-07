package com.shopbee.common.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionUsageTest {

    @Test
    void demonstrateExceptions() {
        assertThrows(BusinessException.class, () -> {
            throw new BusinessException("INVALID_DATA", "The provided data is invalid.");
        });
    }
}
