package client;

import org.springframework.http.ResponseEntity;

public class Test {
    public static void main(String[] args) {
        ClientTopjava client = new ClientTopjava();
        ResponseEntity<String> response = client.getMeals();
        System.out.println("[YOUR ALL MEALS]");
        System.out.println(response.getBody()
        );
    }

}