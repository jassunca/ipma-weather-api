package com.github.ipmaweatherapi.model.ipmainfo;

import java.util.List;

/**
 * IPMAInfoClassWindSpeed - This class stores the list of classifications of wind speed, which follows
 * the format for wind speeds fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/wind-speed-daily-classe.json">...</a>
 * @author João Assunção
 */
public class IPMAInfoClassWindSpeed {

    private String owner;
    private String country;
    private List<IPMAInfoClassWindSpeedData> data; /* List that contains the list of wind speed classes */

    //Constructors

    public IPMAInfoClassWindSpeed() {}

    public IPMAInfoClassWindSpeed(String owner, String country, List<IPMAInfoClassWindSpeedData> data) {
        this.owner = owner;
        this.country = country;
        this.data = data;
    }

    //Getters and setters

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

    public List<IPMAInfoClassWindSpeedData> getData() {
        return data;
    }

    public void setData(List<IPMAInfoClassWindSpeedData> data) {
        this.data = data;
    }

    //Class logic methods

    /**
     * Fetches and returns the English description of the wind speed class on its data array, that matches
     * the id supplied. If the id is not found, it returns 'N/A'
     * @param id A string containing the id to fetch on the wind speed class data array
     * @return The English description of the matching wind speed class, or 'N/A' if not found
     */
    public String getDescFromIdEN(String id) {
        for (IPMAInfoClassWindSpeedData d : data) {
            if (d.getClassWindSpeed().equals(id))
                return d.getDescClassWindSpeedDailyEN();
        }
        return "N/A";
    }

    /**
     * Fetches and returns the Portuguese description of the wind speed class on its data array, that matches
     * the id supplied. If the id is not found, it returns 'N/D'
     * @param id A string containing the id to fetch on the wind speed class data array
     * @return The Portuguese description of the matching wind speed class, or 'N/D' if not found
     */
    public String getDescFromIdPT(String id) {
        for (IPMAInfoClassWindSpeedData d : data) {
            if (d.getClassWindSpeed().equals(id))
                return d.getDescClassWindSpeedDailyPT();
        }
        return "N/D";
    }
}
