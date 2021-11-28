package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
