package com.acme.orders.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public record DashboardStats(int orderCount, int openCount, BigDecimal revenue, BigDecimal averageOrder,
        Map<String, Integer> byStatus, List<String> topProducts) {
}
