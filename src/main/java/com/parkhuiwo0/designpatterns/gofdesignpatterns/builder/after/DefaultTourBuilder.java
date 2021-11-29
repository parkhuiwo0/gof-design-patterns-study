package com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.before.DetailPlan;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.builder.before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    /**
     * 만약 Property가 많은 것이 싫다면?
     */

    private TourPlan tourPlan;

    @Override
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;

        /*
         이렇게 두고 아래 메소드에 프로퍼티 설정하지 말고
         this.tourPlan.setNights(nights);
         이런식으로 가져갈 수 있다. 그렇다면 중복으로 프로퍼티를 가져갈 필요가 없다.
         */
    }

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;

        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;

        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.startDate = localDate;

        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;

        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}
