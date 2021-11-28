package com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }
}
