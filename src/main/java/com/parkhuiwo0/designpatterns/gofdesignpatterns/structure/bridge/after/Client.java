package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.bridge.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.bridge._01_before.Champion;

public class Client {

    public static void main(String[] args) {
        /**
         * 인터페이스만 사용하고 있다.
         * 뒤에있는 부분은 얼마든지 원하면 객체를 받아서 쓰는 방식
         * 의존성을 주입하는 방식으로 변경한다면 된다.
         */
        Champion kdaAri = new Ari(new KDASkin());
        kdaAri.skillQ();
        kdaAri.skillQ();
    }
}
