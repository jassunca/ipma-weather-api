package com.github.ipmaweatherapi.mappers.impl;

import com.github.ipmaweatherapi.mappers.Mapper;
import com.github.ipmaweatherapi.model.DistrictDailyForecastData;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoClassWindSpeed;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictDailyForecastData;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoWeatherType;

/**
 * {@inheritDoc}
 */
public class IPMAInfoDistrictDailyForecastDataMapper
        implements Mapper<IPMAInfoDistrictDailyForecastData, DistrictDailyForecastData> {

    private final IPMAInfoClassWindSpeed ipmaInfoClassWindSpeed;
    private final IPMAInfoWeatherType ipmaInfoWeatherType;

    //constructors

    public IPMAInfoDistrictDailyForecastDataMapper
            (IPMAInfoClassWindSpeed ipmaInfoClassWindSpeed, IPMAInfoWeatherType ipmaInfoWeatherType) {
        this.ipmaInfoClassWindSpeed = ipmaInfoClassWindSpeed;
        this.ipmaInfoWeatherType = ipmaInfoWeatherType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrictDailyForecastData mapTo(IPMAInfoDistrictDailyForecastData o) {

        DistrictDailyForecastData result = new DistrictDailyForecastData();

        result.setForecastDate(o.getForecastDate());
        try {
            result.settMin(Double.parseDouble(o.gettMin()));
        } catch(NumberFormatException e) {
            result.settMin(-99);
        }
        try {
            result.settMax(Double.parseDouble(o.gettMax()));
        } catch(NumberFormatException e) {
            result.settMax(-99);
        }
        try {
            result.setPrecipitaProb(Double.parseDouble(o.getPrecipitaProb()));
        } catch(NumberFormatException e) {
            result.setPrecipitaProb(-99);
        }

        result.setPredWindDir(o.getPredWindDir());

        result.setClassWindSpeed(ipmaInfoClassWindSpeed.getDescFromIdPT(String.valueOf(o.getClassWindSpeed())));

        result.setWeatherType(ipmaInfoWeatherType.getDescFromIdPT(o.getIdWeatherType()));

        return result;
    }
}