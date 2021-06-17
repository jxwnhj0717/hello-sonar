package com.example.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("echo")
public class EchoController {

    @GetMapping("/{msg}")
    public String hello(@PathVariable("msg") String msg) {
        return "reply " + msg;
    }
}
