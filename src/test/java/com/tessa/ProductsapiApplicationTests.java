package com.tessa;

import com.tessa.springweb.entities.Production;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;

@SpringBootTest
class ProductsapiApplicationTests {

    @Test
    void testGetProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Production production = restTemplate.getForObject("http://localhost:8080/api/products/1", Production.class);
    }

}
