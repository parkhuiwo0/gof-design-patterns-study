package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.bridge._01_before;

public class 정복자아리 implements Champion {
    @Override
    public void move() {
        System.out.println("정복자 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("정복자 아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("정복자 아리 W");

    }

    @Override
    public void skillE() {
        System.out.println("정복자 아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("정복자 아리 R");
    }

    @Override
    public String getName() {
        return null;
    }
}
