package com.github.ipmaweatherapi.mappers.impl;

import com.github.ipmaweatherapi.mappers.Mapper;
import com.github.ipmaweatherapi.model.DistrictDailyForecast;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictDailyForecast;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictsIslands;

/**
 * {@inheritDoc}
 */
public class IPMAInfoDistrictDailyForecastMapper implements Mapper<IPMAInfoDistrictDailyForecast, DistrictDailyForecast> {

    private final IPMAInfoDistrictDailyForecastDataMapper ipmaInfoDistrictDailyForecastDataMapper;
    private final IPMAInfoDistrictsIslands ipmaInfoDistrictsIslands;

    //constructors

    public IPMAInfoDistrictDailyForecastMapper
            (IPMAInfoDistrictDailyForecastDataMapper ipmaInfoDistrictDailyForecastDataMapper, IPMAInfoDistrictsIslands ipmaInfoDistrictsIslands) {
        this.ipmaInfoDistrictDailyForecastDataMapper = ipmaInfoDistrictDailyForecastDataMapper;
        this.ipmaInfoDistrictsIslands = ipmaInfoDistrictsIslands;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DistrictDailyForecast mapTo(IPMAInfoDistrictDailyForecast o) {
        DistrictDailyForecast result = new DistrictDailyForecast();

        Long id = Long.valueOf(o.getGlobalIdLocal());

        result.setLocal(ipmaInfoDistrictsIslands.getNameById(id));

        result.setDataUpdate(o.getDataUpdate());

        for (int i = 0; i < o.getData().size(); i++)
            result.getData().add(ipmaInfoDistrictDailyForecastDataMapper.mapTo(o.getData().get(i)));

        return result;
    }
}