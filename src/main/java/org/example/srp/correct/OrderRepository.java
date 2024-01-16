package org.example.srp.correct;

import org.example.srp.bad.DatabaseClient;

import java.util.Map;

public class OrderRepository {

    public Map<String, String> getOrdersFromDB(final String startDate, final String endDate) {
        String ordersQuery = String.format("SELECT * FROM reports WHERE createdDate BETWEEN %s and %s",
                startDate, endDate);
        return DatabaseClient.executeQuery(ordersQuery);
    }
}
