package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
    }
}
