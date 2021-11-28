package com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.example;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after.Ship;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean의 구현체로 만들어서 빈으로 등록한다.
 * 추상적인 팩토리 인터페이스의 구현체가 된다.
 */
public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
