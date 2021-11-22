package com.parkhuiwo0.designpatterns.gofdesignpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonApp {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
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

        /**
         * Thread Safe하게 여러 스레드가 들어오더라도, 같은 인스턴스를 리턴하게 된다.
         */
        SettingsB settingsB = SettingsB.getInstance();
        SettingsB settingsB1 = SettingsB.getInstance();

        // 두 객체 인스턴스는 다르기 때문에, false라는 결과가 나올 것이다.
        System.out.println(settingsB != settingsB1);

        /**
         * Synchronized의 단점을 보완하기 위해, Double Checked Locking 기법을 이용
         */
        SettingsC settingsC = SettingsC.getInstance();
        SettingsC settingsC1 = SettingsC.getInstance();

        // 두 객체 인스턴스는 다르기 때문에, false라는 결과가 나올 것이다.
        System.out.println(settingsC != settingsC1);

        /**
         * inner class 를 이용하여, 싱글톤을 구현
         */
        SettingsD settingsD = SettingsD.getInstance();
        SettingsD settingsD1 = SettingsD.getInstance();

        System.out.println(settingsD != settingsD1);

        /**
         * Java의 Reflection을 이용하여 Singleton을 깨트릴 수 있다.
         */
        Constructor<SettingsD> constructor = SettingsD.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingsD settingsD2 = constructor.newInstance();

        System.out.println(settingsD != settingsD2);

        /**
         * 직렬화와 역직렬화를 통해 Singleton을 깨트릴 수 있다.
         */
        SettingsD settingsD3 = SettingsD.getInstance();
        SettingsD settingsD4 = null;
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settingsD.obj"))) {
            output.writeObject(settingsD3);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settingsD.obj"))) {
            settingsD4 = (SettingsD) input.readObject();
        }

        System.out.println(settingsD3 != settingsD4);

        /**
         * Enum도 싱글톤을 구현하는 방법 중 하나이다. 미리 만들어두기 때문에, 상황을 잘 고려하여야 한다.
         * Enum은 Enum이라는 클래스를 상속받고 있고, Serializable을 구현하고 있기 때문에
         * 직렬화/역직렬화에도 안전하다.
         */
        SettingsE settingsE = SettingsE.INSTANCE;
        SettingsE settingsE1 = null;
        Constructor<?>[] constructors = SettingsE.class.getDeclaredConstructors();
        for (Constructor<?> constructor1 : constructors) {
            constructor1.setAccessible(true);
//            settingsE1 = (SettingsE) constructor1.newInstance("INSTANCE"); // Exception 발생!
        }

        System.out.println(settingsE != settingsE1);

        SettingsE settingsE2 = SettingsE.INSTANCE;
        SettingsE settingsE3 = null;
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settingsE.obj"))) {
            output.writeObject(settingsE2);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settingsE.obj"))) {
            settingsE3 = (SettingsE) input.readObject();
        }

        System.out.println(settingsE2 != settingsE3);

    }
}
