package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class SettingsA {

    private static SettingsA instance;

    private SettingsA() {}

    public static SettingsA getInstance() {
        if (instance == null) {
            instance = new SettingsA();
        }

        return instance;
    }
}
