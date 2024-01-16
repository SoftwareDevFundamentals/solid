package org.example.srp.correct;

import java.util.Map;

public class OrderHtmlFormatter {
    public String formatToHTML(final Map<String, String> orders) {
        // Implementation logic to format all order reports should be here.
        return String.format("<h1>Orders: %s<h1>", orders.toString());
    }
}
