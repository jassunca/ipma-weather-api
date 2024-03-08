package com.github.ipmaweatherapi.model.ipmainfo;

/**
 * IPMAInfoClassWindSpeedData - This class stores information about a given wind speed classification,
 * which follows the format for wind speeds fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/wind-speed-daily-classe.json">...</a>
 * @author João Assunção
 */
public class IPMAInfoClassWindSpeedData {

    private String descClassWindSpeedDailyEN; /* description of the wind speed class in English */
    private String descClassWindSpeedDailyPT; /* description of the wind speed class in Portuguese */
    private String classWindSpeed; /* id of the wind speed class */

    //Constructors

    public IPMAInfoClassWindSpeedData() {}

    public IPMAInfoClassWindSpeedData(String descClassWindSpeedDailyEN, String descClassWindSpeedDailyPT, String classWindSpeed) {
        this.descClassWindSpeedDailyEN = descClassWindSpeedDailyEN;
        this.descClassWindSpeedDailyPT = descClassWindSpeedDailyPT;
        this.classWindSpeed = classWindSpeed;
    }

    //Getters and setters

    public String getDescClassWindSpeedDailyEN() {
        return descClassWindSpeedDailyEN;
    }

    public void setDescClassWindSpeedDailyEN(String descClassWindSpeedDailyEN) {
        this.descClassWindSpeedDailyEN = descClassWindSpeedDailyEN;
    }

    public String getDescClassWindSpeedDailyPT() {
        return descClassWindSpeedDailyPT;
    }

    public void setDescClassWindSpeedDailyPT(String descClassWindSpeedDailyPT) {
        this.descClassWindSpeedDailyPT = descClassWindSpeedDailyPT;
    }

    public String getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(String classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

}
