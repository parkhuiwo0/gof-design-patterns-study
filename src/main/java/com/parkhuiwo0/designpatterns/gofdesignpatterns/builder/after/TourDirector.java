package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.before.TourPlan;

import java.time.LocalDate;

/**
 * 무언가 객체 생성이 반복적으로 되고 있다면, Client가 Director를 통해서 가져오도록
 * 만들 수 있다.
 */
public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan travelTour() {
        return tourPlanBuilder.title("여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 11, 29))
                .whereToStay("호텔")
                .addPlan(0, "체크인")
                .addPlan(0, "밥먹기")
                .getPlan();

    }

    public TourPlan longBeachTour() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 12, 30))
                .getPlan();
    }
}
