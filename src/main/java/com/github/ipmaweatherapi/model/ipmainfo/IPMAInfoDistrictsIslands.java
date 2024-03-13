package com.github.ipmaweatherapi.model.ipmainfo;

import java.util.List;

/**
 * IPMAInfoDistrictsIslands - This class stores the list of regions for which there is weather forecast data publicly
 * available, which follows the format fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/distrits-islands.json">...</a>
 * @author João Assunção
 */
public class IPMAInfoDistrictsIslands {

    private String owner;
    private String country;
    private List<IPMAInfoDistrictsIslandsData> data;

    //constructors

    public IPMAInfoDistrictsIslands(){}

    public IPMAInfoDistrictsIslands(String owner, String country, List<IPMAInfoDistrictsIslandsData> data) {
        this.owner = owner;
        this.country = country;
        this.data = data;
    }

    //getters and setters

    public String getOwner() { return owner; }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<IPMAInfoDistrictsIslandsData> getData() {
        return data;
    }

    public void setData(List<IPMAInfoDistrictsIslandsData> data) {
        this.data = data;
    }

    /**
     * Fetches and returns the designation of a region, given its id, or 'N/A' when th id is not found.
     * @param globalIdLocal A numeric value containing the id of the region to find.
     * @return The designation of the region corresponding to the supplied id, or 'N/A' if it's not found.
     */
    public String getNameById(Long globalIdLocal) {
        for (IPMAInfoDistrictsIslandsData d :data) {
            if (d.getGlobalIdLocal().equals(globalIdLocal))
                return d.getLocal();
        }
        return "N/A";
    }
}