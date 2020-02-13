package com.simplon.voyageaplusieurs.Controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DestinationControllerIntegration {
    @Autowired
    private TestRestTemplate restTemplate;

    //get Destination list
    @Test
    public void getDestination() {
        // When retrieving destinations from /api
        List<?> destination = this.restTemplate.getForObject("/api", List.class);
        // Then a non null list should be returned
        assertThat(destination).isNotNull();
    }
}
