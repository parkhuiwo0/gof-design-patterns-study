package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    /**
     * 메서드 체이닝을 통해 또 다른 메서드를 호출 하도록
     */
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    /**
     * 인스턴스를 리턴할 때까지 체이닝한다.
     * 이 메소드를 호출할 때, 추가적으로 데이터를 검증할 수 있다.
     * 값이 세팅되어있지는 않은지 등등
     */
    TourPlan getPlan();
}
