package com.acme.orders.dto;

import java.math.BigDecimal;

public record LineItemResponse(String sku, String name, int quantity, BigDecimal unitPrice, BigDecimal lineTotal) {
}
