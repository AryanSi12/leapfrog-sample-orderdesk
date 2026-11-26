package com.acme.orders.dto;

import java.util.Map;

public record ApiError(int status, String message, Map<String, String> fields) {
}
