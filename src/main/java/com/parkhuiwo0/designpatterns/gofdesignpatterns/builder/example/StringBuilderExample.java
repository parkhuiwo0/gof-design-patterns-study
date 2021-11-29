package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.example;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("parkhuiwo0").append("hue").toString();
        System.out.println(result);
    }
}
