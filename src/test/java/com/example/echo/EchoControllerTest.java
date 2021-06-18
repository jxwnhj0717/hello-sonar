package com.example.echo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EchoControllerTest {

    @Autowired
    private EchoController controller;

    @Test
    public void echo() {
        String msg = UUID.randomUUID().toString();
        String ret = controller.echo(msg);
        assertThat(ret).isEqualTo("reply " + msg);
    }
}
