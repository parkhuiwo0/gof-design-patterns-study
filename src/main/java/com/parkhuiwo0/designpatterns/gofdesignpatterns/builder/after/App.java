package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        /**
            생성자를 장황하게 쓰지 않고도, 간단한 빌더를 통해서 만들 수 있다.
         */
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 11, 29))
                .whereToStay("호텔")
                .addPlan(0, "체크인")
                .addPlan(0, "밥먹기")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 12, 30))
                .getPlan();


    }
}
