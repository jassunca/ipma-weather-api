package com.github.ipmaweatherapi.model.ipmainfo;

/**
 * IPMAInfoDistrictDailyForecastData - This class stores the information about the weather forecast for a given day and
 * location. It follows the format fetched from the public IPMA API, available at
 * https://api.ipma.pt/open-data/forecast/meteorology/cities/daily/{globalIdLocal}.json, with globalIdLocal being the
 * location id that can be retrieved from IPMA's districts and islands endpoint. For example,
 * <a href="https://api.ipma.pt/open-data/forecast/meteorology/cities/daily/1110600.json">...</a>
 * returns the weather forecast for Lisbon, with each instance of this object being mapped to each of the elements in the
 * 'data' list.
 * @author João Assunção
 */
public class IPMAInfoDistrictDailyForecastData {

    private String precipitaProb; //probability of rain
    private String tMin; //lowest temperature
    private String tMax; //highest temperature
    private String predWindDir; //wind direction
    private Long idWeatherType; //id for the forecast's weather type
    /*id for the wind speed class. IPMA sends this one in numeric format, while the id in the wind speed class data list
    * is sent as a text string.*/
    private Long classWindSpeed;
    private String longitude;
    private String forecastDate; //the date to which this forecast refers to
    private Long classPrecInt; //id for the rain intensity
    private String latitude;

    public IPMAInfoDistrictDailyForecastData() {}

    public IPMAInfoDistrictDailyForecastData(
            String precipitaProb, String tMin, String tMax, String predWindDir, Long idWeatherType, Long classWindSpeed,
            String longitude, String forecastDate, Long classPrecInt, String latitude) {
        this.precipitaProb = precipitaProb;
        this.tMin = tMin;
        this.tMax = tMax;
        this.predWindDir = predWindDir;
        this.idWeatherType = idWeatherType;
        this.classWindSpeed = classWindSpeed;
        this.longitude = longitude;
        this.forecastDate = forecastDate;
        this.classPrecInt = classPrecInt;
        this.latitude = latitude;
    }

    public String getPrecipitaProb() {
        return precipitaProb;
    }

    public void setPrecipitaProb(String precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    public String gettMin() {
        return tMin;
    }

    public void settMin(String tMin) {
        this.tMin = tMin;
    }

    public String gettMax() {
        return tMax;
    }

    public void settMax(String tMax) {
        this.tMax = tMax;
    }

    public String getPredWindDir() {
        return predWindDir;
    }

    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    public Long getIdWeatherType() {
        return idWeatherType;
    }

    public void setIdWeatherType(Long idWeatherType) {
        this.idWeatherType = idWeatherType;
    }

    public Long getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(Long classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public Long getClassPrecInt() {
        return classPrecInt;
    }

    public void setClassPrecInt(Long classPrecInt) {
        this.classPrecInt = classPrecInt;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
