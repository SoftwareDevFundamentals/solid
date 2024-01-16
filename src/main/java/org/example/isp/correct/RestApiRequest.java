package org.example.isp.correct;

import java.util.Map;

public class RestApiRequest implements IHttpRequest {

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
}
