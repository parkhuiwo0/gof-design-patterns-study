package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.after.Anchor;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.abstarctfactory.after.Wheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public void setAnchor(Anchor anchor) {

    }

    public void setWheel(Wheel wheel) {

    }
}
