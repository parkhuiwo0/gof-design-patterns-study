package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String hello() {
        return "hello";
    }
}
