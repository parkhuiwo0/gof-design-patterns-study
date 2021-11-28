package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        Ship ship = new WhiteShipFactory().orderShip("Whiteship", "parkhuiwo0@gmail.com");
        System.out.println(ship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "parkhuiwo0@gmail.com");
        System.out.println(blackship);

        client.print(new WhiteShipFactory(), "whiteship", "parkhuiwo0@gmail.com");
        client.print(new WhiteShipFactory(), "blackship", "parkhuiwo0@gmail.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
