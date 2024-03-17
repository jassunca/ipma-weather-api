package com.github.ipmaweatherapi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * DistrictDailyForecast - This class represents the set of data that is returned by the API, in response to a GET
 * request for the 5-day weather forecast for a given location.
 * @author João Assunção
 */
public class DistrictDailyForecast {

    private String local; //location to which the forecast refers
    private String dataUpdate; //TODO Refactor the date of the last data update to a functional Date class
    private List<DistrictDailyForecastData> data; //list of the daily weather forecasts

    //constructors

    public DistrictDailyForecast() {
        this.data = new ArrayList<>();
    }

    //getters and setters

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(String dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    public List<DistrictDailyForecastData> getData() {
        return data;
    }

    public void setData(List<DistrictDailyForecastData> data) {
        this.data = data;
    }
}
