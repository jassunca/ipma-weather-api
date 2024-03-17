package com.github.ipmaweatherapi.model;

/**
 * DistrictDailyForecastData - This class represents a data entry for a weather forecast at a given location and day,
 * part of result that is returned by the API.
 * @author João Assunção
 */
public class DistrictDailyForecastData {

    private String forecastDate;
    private double tMin;
    private double tMax;
    private String predWindDir;
    private double precipitaProb;
    private String weatherType;
    private String classWindSpeed;

    //constructors

    public DistrictDailyForecastData() {}

    //getters and setters

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public double gettMin() {
        return tMin;
    }

    public void settMin(double tMin) {
        this.tMin = tMin;
    }

    public double gettMax() {
        return tMax;
    }

    public void settMax(double tMax) {
        this.tMax = tMax;
    }

    public String getPredWindDir() {
        return predWindDir;
    }

    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    public double getPrecipitaProb() {
        return precipitaProb;
    }

    public void setPrecipitaProb(double precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(String classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }
}
