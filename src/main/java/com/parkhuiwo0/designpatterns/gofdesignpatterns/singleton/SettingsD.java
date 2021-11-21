package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class SettingsD {

    private SettingsD() {}

    private static class SettingsHolder {
        private static final SettingsD INSTANCE = new SettingsD();
    }

    /**
     * 멀티 스레드 환경에서도 안전하며
     * getInstance()가 호출될 때, SettingsHolder가 로딩되고 그 떄 만들기 때문에 Lazy Loading도 지원이 된다.
     */
    public static SettingsD getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
