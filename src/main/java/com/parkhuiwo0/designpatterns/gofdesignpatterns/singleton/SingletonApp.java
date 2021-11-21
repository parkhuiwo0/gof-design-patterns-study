package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        /**
         * 싱글톤 패턴을 구현하기 전, 두 객체인스턴스는 서로 다르다.
         */
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        // 두 객체 인스턴스는 다르기 때문에, true라는 결과가 나올 것이다.
        System.out.println(settings != settings1);

        /**
         * Singleton Pattern을 가장 쉽고 단순하게 구현하는 방법.
         * 1. 객체 인스턴스를 static 변수로 선언한다.
         * 2. 객체 인스턴스를 리턴하는 static getInsance()를 만든다.
         *
         * if 문을 진입하고 인스턴스를 만들기 전에 다른 thread가 새로 인스턴스를 생성할 수도 있다.
         * Multi-Thread 환경에서 Thread Safe를 보장하지 못한다.
         */
        SettingsA settingsA = SettingsA.getInstance();
        SettingsA settingsA1 = SettingsA.getInstance();

        // 두 객체 인스턴스는 다르기 때문에, false라는 결과가 나올 것이다.
        System.out.println(settingsA != settingsA1);

    }
}
