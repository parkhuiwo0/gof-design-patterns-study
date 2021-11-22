package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**
         * String.class 는 Singleton이 아니다.
         * Spring이 Singleton Scope로 Bean으로 등록해서 관리한다.
         */
        String hello = ac.getBean("hello", String.class);
        String hello1 = ac.getBean("hello", String.class);
        System.out.println(hello == hello1);

    }
}
