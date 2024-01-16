package org.example.isp.bad;

import java.util.Map;

public class SoapApiRequest implements IRequest {

    private final Map<String, String> headers;
    private final String content;

    public SoapApiRequest(final Map<String, String> headers, final String body) {
        this.headers = headers;
        this.content = body;
    }

    @Override
    public void sendByHttps() {
        // Send Soap message using HTTPS.
    }

    @Override
    public void sendBySmtp() {
        // Send Soap message using SMTP.
    }
}
