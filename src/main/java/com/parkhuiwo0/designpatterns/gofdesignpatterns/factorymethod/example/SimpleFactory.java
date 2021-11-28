package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.example;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after.BlackShip;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after.WhiteShip;

/**
 * Simple Factory Method Pattern
 */
public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
