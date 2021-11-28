package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
