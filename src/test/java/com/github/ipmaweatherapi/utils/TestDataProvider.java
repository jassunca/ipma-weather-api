package com.github.ipmaweatherapi.utils;

import com.github.ipmaweatherapi.model.ipmainfo.*;

import java.util.ArrayList;

public class TestDataProvider {

    public static IPMAInfoClassWindSpeedData createIPMAInfoClassWindSpeedDataId1() {
        return new IPMAInfoClassWindSpeedData("Weak", "Fraco", "1");
    }

    public static IPMAInfoClassWindSpeedData createIPMAInfoClassWindSpeedDataId2() {
        return new IPMAInfoClassWindSpeedData("Moderate", "Moderado", "2");
    }

    public static IPMAInfoClassWindSpeed createIPMAInfoClassWindSpeed() {
        IPMAInfoClassWindSpeed testData = new IPMAInfoClassWindSpeed("IPMA", "PT", new ArrayList<>());
        testData.getData().add(createIPMAInfoClassWindSpeedDataId1());
        testData.getData().add(createIPMAInfoClassWindSpeedDataId2());
        return testData;
    }

    public static IPMAInfoWeatherTypeData createIPMAInfoWeatherTypeDataId1() {
        return new IPMAInfoWeatherTypeData("Clear sky", "Céu limpo", 1L);
    }

    public static IPMAInfoWeatherTypeData createIPMAInfoWeatherTypeDataId2() {
        return new IPMAInfoWeatherTypeData("Partly cloudy", "Céu pouco nublado", 2L);
    }

    public static IPMAInfoWeatherType createIPMAInfoWeatherType() {
        IPMAInfoWeatherType testData = new IPMAInfoWeatherType("IPMA", "PT", new ArrayList<>());
        testData.getData().add(createIPMAInfoWeatherTypeDataId1());
        testData.getData().add(createIPMAInfoWeatherTypeDataId2());
        return testData;
    }

    public static IPMAInfoDistrictsIslandsData createIMPAInfoDistrictsIslandsDataId1() {
        return new IPMAInfoDistrictsIslandsData(1L, "1", 1L, 1L, "40.0001", 1L, "Lisboa", "-8.11324");
    }

    public static IPMAInfoDistrictsIslands createIPMAInfoDistrictsIslands() {
        IPMAInfoDistrictsIslands testData = new IPMAInfoDistrictsIslands("IPMA", "PT", new ArrayList<>());
        testData.getData().add(createIMPAInfoDistrictsIslandsDataId1());
        return testData;
    }

    public static IPMAInfoDistrictDailyForecastData createIPMAInfoDistrictDailyForecastDataDay1(){
        return new IPMAInfoDistrictDailyForecastData("24.0", "14.1", "21.6", "SW", 2L, 2L, "-8.0001", "23/03/2021", 1L, "40.44656");
    }

    public static IPMAInfoDistrictDailyForecastData createIPMAInfoDistrictDailyForecastDataDay2(){
        return new IPMAInfoDistrictDailyForecastData("0.0", "17.3", "22.9", "S", 1L, 1L, "-8.0001", "24/03/2021", 1L, "40.44656");
    }

    public static IPMAInfoDistrictDailyForecastData createIPMAInfoDistrictDailyForecastDataInvalidPrecipitaProb(){
        return new IPMAInfoDistrictDailyForecastData("Invalid Value", "14.1", "21.6", "SW", 2L, 2L, "-8.0001", "23/03/2021", 1L, "40.44656");
    }

    public static IPMAInfoDistrictDailyForecastData createIPMAInfoDistrictDailyForecastDataInvalidTMin(){
        return new IPMAInfoDistrictDailyForecastData("24.0", "Invalid Value", "21.6", "SW", 2L, 2L, "-8.0001", "23/03/2021", 1L, "40.44656");
    }

    public static IPMAInfoDistrictDailyForecastData createIPMAInfoDistrictDailyForecastDataInvalidTMax(){
        return new IPMAInfoDistrictDailyForecastData("24.0", "14.1", "Invalid Value", "SW", 2L, 2L, "-8.0001", "23/03/2021", 1L, "40.44656");
    }

    public static IPMAInfoDistrictDailyForecast createIPMAInfoDistrictDailyForecast() {
        IPMAInfoDistrictDailyForecast testData = new IPMAInfoDistrictDailyForecast("IPMA", "PT", new ArrayList<>(), "1", "23/03/2021");
        testData.getData().add(createIPMAInfoDistrictDailyForecastDataDay1());
        testData.getData().add(createIPMAInfoDistrictDailyForecastDataDay2());
        return testData;
    }
}
