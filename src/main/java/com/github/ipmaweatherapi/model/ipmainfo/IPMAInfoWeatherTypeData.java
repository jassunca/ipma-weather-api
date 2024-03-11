package com.github.ipmaweatherapi.model.ipmainfo;

/**
 * IPMAInfoWeatherTypeData - This class stores information about a given type of weather, which follows the
 * format for wind speeds fetched from the public IPMA API, available at:
 * <a href="https://api.ipma.pt/open-data/weather-type-classe.json">...</a>
 * Regarding the weather type id, this value is received from the IPMA api in numeric format.
 * @author João Assunção
 */
public class IPMAInfoWeatherTypeData {

    private String descWeatherTypeEN; /*description of the weather type in English*/
    private String descWeatherTypePT; /*description of the weather type in Portuguese*/
    private Long idWeatherType; /*id of the weather type*/

    //constructors

    public IPMAInfoWeatherTypeData() {
    }

    public IPMAInfoWeatherTypeData(String descWeatherTypeEN, String descWeatherTypePT, Long idWeatherType) {
        this.descWeatherTypeEN = descWeatherTypeEN;
        this.descWeatherTypePT = descWeatherTypePT;
        this.idWeatherType = idWeatherType;
    }

    //getters and setters

    public String getDescWeatherTypeEN() {
        return descWeatherTypeEN;
    }

    public void setDescWeatherTypeEN(String descWeatherTypeEN) {
        this.descWeatherTypeEN = descWeatherTypeEN;
    }

    public String getDescWeatherTypePT() {
        return descWeatherTypePT;
    }

    public void setDescWeatherTypePT(String descWeatherTypePT) {
        this.descWeatherTypePT = descWeatherTypePT;
    }

    public Long getIdWeatherType() {
        return idWeatherType;
    }

    public void setIdWeatherType(Long idWeatherType) {
        this.idWeatherType = idWeatherType;
    }
}
