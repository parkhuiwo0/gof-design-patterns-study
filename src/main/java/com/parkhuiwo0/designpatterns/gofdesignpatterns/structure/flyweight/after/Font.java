package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.flyweight.after;

public final class Font {

  final String family;

  final int size;

  Font(String family, int size) {
    this.family = family;
    this.size = size;
  }

  String getFamily() {
    return family;
  }

  int getSize() {
    return size;
  }
}
