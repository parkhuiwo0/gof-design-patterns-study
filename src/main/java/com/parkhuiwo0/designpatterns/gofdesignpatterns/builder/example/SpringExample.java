package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.example;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("hue-dev.site")
                .path("/")
                .build().encode();

        System.out.println(uriComponents);

    }
}
