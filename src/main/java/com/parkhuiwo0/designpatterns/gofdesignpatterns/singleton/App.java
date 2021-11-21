package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

public class App {

    public static void main(String[] args) {
        /**
         * 싱글톤 패턴을 구현하기 전, 두 객체인스턴스는 서로 다르다.
         */
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        // 두 객체 인스턴스는 다르기 때문에, false라는 결과가 나올 것이다.
        System.out.println(settings != settings1);


    }
}
