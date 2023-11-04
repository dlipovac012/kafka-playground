package controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SuiteDisplayName("API testing")
@SelectPackages("controllers")
public class ApiTest {

    @Test
    @DisplayName("healthcheck")
    void healthcheck() throws Exception {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create("http://localhost:8080/healthcheck"))
                .header("accept", "text/plain")
                .build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();


        assertThat(response).isEqualTo("ok");
    }
}
