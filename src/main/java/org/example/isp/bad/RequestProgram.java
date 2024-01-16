package org.example.isp.bad;

import java.util.HashMap;
import java.util.Map;

public final class RequestProgram {

    private RequestProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        Map<String, String> headers = new HashMap<>();
        Map<String, String> params = new HashMap<>();
        String bodyJson = "{\n" +
                "    \"Email\": \"user@email.com\",\n" +
                "    \"FullName\": \"Joe Blow\",\n" +
                "    \"Password\": \"pASswoRd\"\n" +
                "  }";
        RestApiRequest restApiRequest = new RestApiRequest(headers, params, bodyJson);
        restApiRequest.sendByHttps();
        restApiRequest.sendBySmtp();

        String bodyXml = "<UserObject>\n" +
                "  <Email>user@email.com</Email>\n" +
                "  <FullName>Joe Blow</FullName>\n" +
                "  <Password>pASswoRd</Password>\n" +
                "</UserObject>";
        SoapApiRequest soapApiRequest = new SoapApiRequest(headers, bodyXml);
        soapApiRequest.sendByHttps();
        soapApiRequest.sendBySmtp();
    }
}
