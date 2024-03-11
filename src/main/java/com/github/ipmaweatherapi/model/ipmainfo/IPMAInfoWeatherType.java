package com.github.ipmaweatherapi.model.ipmainfo;

import java.util.List;

/**
 * IPMAInfoWeatherType - This class stores the list of classifications of weather types, which follows
 * the format for weather types fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/weather-type-classe.json">...</a>
 * @author João Assunção
 */
public class IPMAInfoWeatherType {

    private String owner;
    private String country;
    private List<IPMAInfoWeatherTypeData> data; /* List that contains the list of weather types */

    //constructors

    public IPMAInfoWeatherType() {}

    public IPMAInfoWeatherType(String owner, String country, List<IPMAInfoWeatherTypeData> data) {
        this.owner = owner;
        this.country = country;
        this.data = data;
    }

    //getters and setters

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

    public List<IPMAInfoWeatherTypeData> getData() {
        return data;
    }

    public void setData(List<IPMAInfoWeatherTypeData> data) {
        this.data = data;
    }

    /**
     * Fetches and returns the English description of the weather type on its data array, that matches
     * the id supplied. If the id is not found, it returns 'N/A'
     * @param id A numeric value containing the id to fetch on the weather type data array
     * @return The English description of the matching weather type, or 'N/A' if not found
     */
    public String getDescFromIdEN(Long id) {
        for (IPMAInfoWeatherTypeData d : data) {
            if (d.getIdWeatherType().equals(id))
                return d.getDescWeatherTypeEN();
        }
        return "N/A";
    }

    /**
     * Fetches and returns the Portuguese description of the weather type on its data array, that matches
     * the id supplied. If the id is not found, it returns 'N/D'
     * @param id A numeric value containing the id to fetch on the weather type data array
     * @return The Portuguese description of the matching weather type, or 'N/D' if not found
     */
    public String getDescFromIdPT(Long id) {
        for (IPMAInfoWeatherTypeData d : data) {
            if (d.getIdWeatherType().equals(id))
                return d.getDescWeatherTypePT();
        }
        return "N/D";
    }
}

