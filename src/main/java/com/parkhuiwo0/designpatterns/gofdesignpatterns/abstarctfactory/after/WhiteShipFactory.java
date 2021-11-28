package com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after.Ship;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after.WhiteShip;

/*
클라이언트 코드에 해당하는 부분
 */
public class WhiteShipFactory {

    private ShipPartsFactory shipPartsFactory;

    /**
     * 어떤 제품군을 만들어주는 팩토리를 생성자에 넣어주냐에 따라서, 각기 다른 제품군을 만들어 낼 수 있다.
     * @param shipPartsFactory
     */
    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }


}
