package com.shopbee.common.exception;

import jakarta.ws.rs.core.Response;

public class ConflictResourceException extends BusinessException {
    public ConflictResourceException(String code, String message) {
        super(Response.Status.CONFLICT.getStatusCode(), code, message);
    }
}
