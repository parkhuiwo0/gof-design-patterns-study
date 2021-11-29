package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.example;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
//        Stream<String> names = stringStreamBuilder.add("huiwoo").add("parkhuiwo0").build();
        // Generic
        Stream<String> names = Stream.<String>builder().add("huiwoo").add("parkhuiwo0").build();
        names.forEach(System.out::println);
    }
}
