package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.example;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("타이틀")
                .nights(2)
                .days(3)
                .build();
    }
}
