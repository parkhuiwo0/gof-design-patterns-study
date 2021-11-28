package com.parkhuiwo0.designpatterns.gofdesignpatterns.factorymethod.example;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
    public static void main(String[] args) {

        /*
        Java에서 찾아보는 Simple Factory Pattern
         */
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
