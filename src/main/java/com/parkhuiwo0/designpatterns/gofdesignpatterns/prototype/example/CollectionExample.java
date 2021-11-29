package com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        // 보통 인터페이스를 사용하기 때문에, 생성자를 통해서 사용하는 방식을 많이 사용한다.
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
