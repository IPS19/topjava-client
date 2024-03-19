package client;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

public class ClientTopjava {
    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<String> getMeals() {
        byte[] plainCreds = "user@yandex.ru:password".getBytes();
        String base64Creds = Base64.getEncoder().encodeToString(plainCreds);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Basic" + base64Creds);
        HttpEntity<Object> httpEntity = new HttpEntity<>(headers);

        return restTemplate.exchange("http://localhost:8080/topjava/api/admin/restaurants", HttpMethod.GET,
                httpEntity, String.class);
    }
}