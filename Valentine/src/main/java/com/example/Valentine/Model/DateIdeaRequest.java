package com.example.Valentine.Model;
import com.example.Valentine.Controller.DateIdeaController;
import com.example.Valentine.Model.DateIdeaRequest;

public class DateIdeaRequest {

    private int years;
    private int months;
    private String distanceType;

    public DateIdeaRequest() {
    }

    public DateIdeaRequest(int years, int months, String distanceType) {
        this.years = years;
        this.months = months;
        this.distanceType = distanceType;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public String getDistanceType() {
        return distanceType;
    }

    public void setDistanceType(String distanceType) {
        this.distanceType = distanceType;
    }
}
