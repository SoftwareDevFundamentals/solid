package org.example.isp.bad;

import java.util.Map;

public class RestApiRequest implements IRequest {

    private final Map<String, String> headers;
    private final Map<String, String> params;
    private final String body;

    public RestApiRequest(final Map<String, String> headers, final Map<String, String> params, final String body) {
        this.headers = headers;
        this.params = params;
        this.body = body;
    }

    @Override
    public void sendByHttps() {
        // Send request by HTTP.
    }

    @Override
    public void sendBySmtp() {
        throw new UnsupportedOperationException("REST API requests cannot be send by SMTP.");
    }
}
