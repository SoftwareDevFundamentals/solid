package org.example.srp.bad;

import java.util.Map;

public class OrderReport {

    public String getOrderReportFormatted(final String startDate, final String endDate) {
        Map<String, String> orders = queryDBForOrders(startDate, endDate);
        return formatToHTML(orders);
    }

    private Map<String, String> queryDBForOrders(final String startDate, final String endDate) {
        String ordersQuery = String.format("SELECT * FROM reports WHERE createdDate BETWEEN %s and %s",
                startDate, endDate);
        return DatabaseClient.executeQuery(ordersQuery);
    }

    private String formatToHTML(final Map<String, String> orders) {
        // Implementation logic to format all order reports should be here.
        return String.format("<h1>Orders: %s<h1>", orders.toString());
    }
}
