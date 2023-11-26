package dev.dalibor.kafka_playground.integration_tests.controllers.healthcheck;

import dev.dalibor.kafka_playground.integration_tests.utilities.HttpClientFactory;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.auth.CredentialsProvider;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.cookie.CookieStore;
import org.apache.hc.client5.http.cookie.StandardCookieSpec;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.apache.hc.core5.http.message.StatusLine;
import org.apache.hc.core5.net.URIBuilder;
import org.junit.jupiter.api.*;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuiteDisplayName("API testing")
@SelectPackages("dev.dalibor.kafka_playground.controllers")
public class HealthcheckTest {

    private CloseableHttpClient httpClient;

    @BeforeAll()
    public void initClient() {
        httpClient = HttpClientFactory.createHttpClient();
    }

    @Test
    @Timeout(1)
    @DisplayName("it should check /healthcheck endpoint. Expected success and message \"ok\"")
    void healthcheck() {
        var healthcheckResponse = requestHealthcheck();

        assertThat(healthcheckResponse).isEqualTo("ok");
    }

    private String requestHealthcheck() {
        try {
            var url = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost")
                    .setPort(8080)
                    .setPath("/healthcheck");

            CookieStore cookieStore = new BasicCookieStore();
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            HttpClientContext clientContext = HttpClientContext.create();
            clientContext.setCookieStore(cookieStore);
            clientContext.setCredentialsProvider(credentialsProvider);
            clientContext.setRequestConfig(RequestConfig.custom()
                    .setCookieSpec(StandardCookieSpec.STRICT)
                    .build());

            ClassicHttpRequest request = ClassicRequestBuilder.get(url.build()).build();

            return httpClient.execute(request, classicHttpResponse -> {
                if (classicHttpResponse.getCode() >= 300) {
                    throw new ClientProtocolException(new StatusLine(classicHttpResponse).toString());
                }
                final HttpEntity responseEntity = classicHttpResponse.getEntity();
                if (responseEntity == null) {
                    return null;
                }

                return EntityUtils.toString(responseEntity);
            });
        } catch (IOException io_e) {
            // TODO: Add stack tracing
            return null;
        } catch (URISyntaxException uri_e) {
            // TODO: Add stack tracking
            return null;
        }
    }
}
