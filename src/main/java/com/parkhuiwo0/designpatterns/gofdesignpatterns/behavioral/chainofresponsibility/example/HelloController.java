package com.parkhuiwo0.designpatterns.gofdesignpatterns.behavioral.chainofresponsibility.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
