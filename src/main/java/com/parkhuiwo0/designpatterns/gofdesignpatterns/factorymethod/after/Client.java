package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {

        Ship ship = new WhiteShipFactory().orderShip("Whiteship", "parkhuiwo0@gmail.com");

        System.out.println(ship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "parkhuiwo0@gmail.com");

        System.out.println(blackship);
    }

}
