package com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.example;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
