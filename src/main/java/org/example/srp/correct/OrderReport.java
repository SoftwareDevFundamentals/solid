package org.example.srp.correct;

import java.util.Map;

public class OrderReport {

    private OrderRepository orderRepository;
    private OrderHtmlFormatter orderFormatter;

    public OrderReport(OrderRepository repository, OrderHtmlFormatter orderFormatter) {
        this.orderRepository = repository;
        this.orderFormatter = orderFormatter;
    }

    public String getOrderReportFormatted(final String startDate, final String endDate) {
        Map<String, String> orders = orderRepository.getOrdersFromDB(startDate, endDate);
        return orderFormatter.formatToHTML(orders);
    }
}
