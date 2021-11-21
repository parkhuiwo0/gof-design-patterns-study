package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class SettingsC {

    // Java 1.5 이상 버전부터 동작하는 Double Checked Locking 기법
    private static volatile SettingsC instance;

    private SettingsC() {}

    /**
     * Double Checked Locking을 통해서 Thread Safety를 보장한다.
     * 스레드가 If 문 안에 여러 동시에 일어나는 경우, 그때를 대비해서만 synchronized를 통해 처리하기 때문에 훨씬 성능에 유리하다.
     * 인스턴스를 필요한 시점에 만들 수 있다.
     */
    public static SettingsC getInstance() {
        if (instance == null) {
            synchronized (SettingsC.class) {
                if (instance == null) {
                    instance = new SettingsC();
                }
            }
        }

        return instance;
    }
}
