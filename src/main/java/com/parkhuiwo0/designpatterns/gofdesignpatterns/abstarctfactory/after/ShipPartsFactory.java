package com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.after;

/**
 * Abstract Factory
 * 제품군을 제공하는 역할을 여기에 위임을 하면서, SRP를 지켰다고 볼 수 있지만,
 * 여기서 여러가지 제품을 만들기 때문에 SRP를 위반한 것이 아닌가?에 대한 의견이 있다.
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
