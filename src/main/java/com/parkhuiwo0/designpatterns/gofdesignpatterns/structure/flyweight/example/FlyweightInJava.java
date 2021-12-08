package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.flyweight.example;

public class FlyweightInJava {

  public static void main(String[] args) {
    Integer integer = Integer.valueOf(10);
    Integer integer2 = Integer.valueOf(10);
    Integer integer3 = Integer.valueOf(10000);
    Integer integer4 = Integer.valueOf(10000);

    System.out.println(integer == integer2); // true
    System.out.println(integer3 == integer4); // false
  }
}
