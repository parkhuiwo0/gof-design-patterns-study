package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class SettingsB {

    private static SettingsB instance;
    private static final SettingsB INSTANCE = new SettingsB();

    /**
     * 만약 객체를 초기에 만드는 비용이 비싸지 않다면 미리 만들어놓고 synchronized를 쓰지 않아도 된다.
     * 미리 만드는 과정이 오래 걸리고, 메모리를 많이 사용한다면 단점이 될 수도 있다.
     * ex) 만약 만들었는데 쓰질 않는다.
     */
    public static SettingsB getInstanceByEagerInitialize() {
        return INSTANCE;
    }

    private SettingsB() {}

    /**
     * getInstance()를 호출할 때마다 동기화하는 작업 때문에 성능에 약간의 불이득이 생길 가능성이 있다.
     */
    public static synchronized SettingsB getInstance() {
        if (instance == null) {
            instance = new SettingsB();
        }

        return instance;
    }
}