package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.flyweight.after;

public class Character {

  private char value;

  private String color;

  private Font font;

  Character(char value, String color, Font font) {
    this.value = value;
    this.color = color;
    this.font = font;
  }
}
