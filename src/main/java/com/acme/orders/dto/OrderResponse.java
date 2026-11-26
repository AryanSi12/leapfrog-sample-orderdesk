package com.acme.orders.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderResponse(Long id, String number, String customer, String email, String tier, String status,
        List<LineItemResponse> items, int itemCount, BigDecimal subtotal, BigDecimal discount, BigDecimal total,
        String note, String createdAt, List<String> nextStatuses) {
}
