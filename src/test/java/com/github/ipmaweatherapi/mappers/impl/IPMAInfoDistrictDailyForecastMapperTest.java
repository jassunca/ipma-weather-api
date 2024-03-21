package com.github.ipmaweatherapi.mappers.impl;

import com.github.ipmaweatherapi.model.DistrictDailyForecast;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoClassWindSpeed;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictDailyForecast;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictsIslands;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoWeatherType;
import com.github.ipmaweatherapi.utils.TestDataProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
/*The TestInstance annotation is added, so we set a single test lifecycle to this class, allowing us to use a
 non-static BeforeAll method to initialize the necessary data. (by default, it's one test lifecycle per method)*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IPMAInfoDistrictDailyForecastMapperTest {

    private IPMAInfoDistrictDailyForecastMapper ipmaInfoDistrictDailyForecastMapper;
    private IPMAInfoDistrictDailyForecast ipmaInfoDistrictDailyForecast;

    @BeforeAll
    public void populateRequiredData() {
        IPMAInfoClassWindSpeed ipmaInfoClassWindSpeed = TestDataProvider.createIPMAInfoClassWindSpeed();
        IPMAInfoWeatherType ipmaInfoWeatherType = TestDataProvider.createIPMAInfoWeatherType();
        IPMAInfoDistrictDailyForecastDataMapper ipmaInfoDistrictDailyForecastDataMapper = new IPMAInfoDistrictDailyForecastDataMapper(ipmaInfoClassWindSpeed, ipmaInfoWeatherType);
        IPMAInfoDistrictsIslands ipmaInfoDistrictsIslands = TestDataProvider.createIPMAInfoDistrictsIslands();
        ipmaInfoDistrictDailyForecastMapper = new IPMAInfoDistrictDailyForecastMapper(ipmaInfoDistrictDailyForecastDataMapper, ipmaInfoDistrictsIslands);
        ipmaInfoDistrictDailyForecast = TestDataProvider.createIPMAInfoDistrictDailyForecast();
    }

    @Test
    public void testThatIPMAInfoDistrictDailyForecastMapperReturnsCorrectDataMapping() {
        String expectedLocal = "Lisboa";
        String expectedDataUpdate = "23/03/2021";
        int expectedDataCount = 2;

        DistrictDailyForecast result = ipmaInfoDistrictDailyForecastMapper.mapTo(ipmaInfoDistrictDailyForecast);

        assertThat(result.getLocal()).isEqualTo(expectedLocal);
        assertThat(result.getDataUpdate()).isEqualTo(expectedDataUpdate);
        assertThat(result.getData()).hasSize(expectedDataCount);

    }
}
