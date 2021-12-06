package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.decorator.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {
    public static void main(String[] args) throws IOException {

        /**
         * 가변 인자를 받아서, 리스트로 변환해준다.
         */
        List<String> list = Arrays.asList("a", "b", "c");

        /**
         * list가 adptee
         * enumberation이 adapter
         * Enumeration이 Target Interface
         */
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> list2 = Collections.list(enumeration);


        // IO
        /**
         * 문자열 input.txt
         * is
         * isr
         *
         * -> 일종의 어댑터 패턴이라고 생각할 수 있다.
         */
        try (InputStream is = new FileInputStream("input.txt")) {
            /**
             * 이렇게 감싸고 부가기능이 추가되는 LowLevel에 가까워지는
             * 같은 API이지만, 어댑터 패턴으로 볼 수도 있고, 데코레이터로 볼 수도 있다.
             */
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
