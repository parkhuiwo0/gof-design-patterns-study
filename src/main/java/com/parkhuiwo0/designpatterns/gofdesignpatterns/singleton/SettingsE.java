package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

/**
 * Enum을 통해 싱글톤을 보장한다.
 * Enum은 미리 만들어준다는 단점이 있다.
 */
public enum SettingsE {

    INSTANCE;

    private Integer number;

    SettingsE() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
