package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

import java.io.Serializable;

public class SettingsD implements Serializable {

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

    /**
     * 역직렬화를 통한 싱글톤이 꺠지는 현상을 방지하기 위해
     */
    protected Object readResolve() {
        return getInstance();
    }
}
