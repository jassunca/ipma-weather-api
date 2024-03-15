package com.github.ipmaweatherapi.model.ipmainfo;

import java.util.List;

/**
 * IPMAInfoDistrictDailyForecast - This class stores the 5-day weather forecast for a given location.
 * It follows the format fetched from the public IPMA API, available at
 * https://api.ipma.pt/open-data/forecast/meteorology/cities/daily/{globalIdLocal}.json, with globalIdLocal being the
 * location id that can be retrieved from IPMA's districts and islands endpoint. For example,
 * <a href="https://api.ipma.pt/open-data/forecast/meteorology/cities/daily/1110600.json">...</a>
 * returns the 5-day weather forecast for Lisbon.
 * @author João Assunção
 */
public class IPMAInfoDistrictDailyForecast {

    private String owner;
    private String country;
    private List<IPMAInfoDistrictDailyForecastData> data; //the list of forecasts for this local
    private String globalIdLocal; //id of the location
    private String dataUpdate; //date and time when this data was last updated

    public IPMAInfoDistrictDailyForecast() {}

    public IPMAInfoDistrictDailyForecast(String owner, String country, List<IPMAInfoDistrictDailyForecastData> data, String globalIdLocal, String dataUpdate) {
        this.owner = owner;
        this.country = country;
        this.data = data;
        this.globalIdLocal = globalIdLocal;
        this.dataUpdate = dataUpdate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<IPMAInfoDistrictDailyForecastData> getData() {
        return data;
    }

    public void setData(List<IPMAInfoDistrictDailyForecastData> data) {
        this.data = data;
    }

    public String getGlobalIdLocal() {
        return globalIdLocal;
    }

    public void setGlobalIdLocal(String globalIdLocal) {
        this.globalIdLocal = globalIdLocal;
    }

    public String getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(String dataUpdate) {
        this.dataUpdate = dataUpdate;
    }
}
