package com.example.echo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EchoControllerHttpTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String uri;

    @BeforeEach
    public void before() {
        uri = "http://localhost:" + port + "/echo";
    }


    @Test
    public void echo() {
        String msg = UUID.randomUUID().toString();
        String url = uri + "/" + msg;
        String ret = restTemplate.getForObject(url, String.class);
        assertThat(ret).isEqualTo("reply " + msg);
    }


}
