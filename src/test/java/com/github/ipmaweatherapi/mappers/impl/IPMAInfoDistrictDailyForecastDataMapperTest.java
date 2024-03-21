package com.github.ipmaweatherapi.mappers.impl;

import com.github.ipmaweatherapi.model.DistrictDailyForecastData;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoClassWindSpeed;
import com.github.ipmaweatherapi.model.ipmainfo.IPMAInfoDistrictDailyForecastData;
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
public class IPMAInfoDistrictDailyForecastDataMapperTest {

    private IPMAInfoDistrictDailyForecastDataMapper ipmaInfoDistrictDailyForecastDataMapper;
    private IPMAInfoDistrictDailyForecastData ipmaInfoDistrictDailyForecastData;

    @BeforeAll
    public void populateRequiredInputData() {
        IPMAInfoClassWindSpeed ipmaInfoClassWindSpeed = TestDataProvider.createIPMAInfoClassWindSpeed();
        IPMAInfoWeatherType ipmaInfoWeatherType = TestDataProvider.createIPMAInfoWeatherType();
        ipmaInfoDistrictDailyForecastDataMapper = new IPMAInfoDistrictDailyForecastDataMapper(ipmaInfoClassWindSpeed, ipmaInfoWeatherType);
    }

    @Test
    public void testThatIPMAInfoDistrictDailyForecastDataMapperReturnsCorrectDataMapping() {
        ipmaInfoDistrictDailyForecastData = TestDataProvider.createIPMAInfoDistrictDailyForecastDataDay1();
        double expectedPrecipitaProb = 24.0;
        double expectedTMin = 14.1;
        double expectedTMax = 21.6;
        String expectedPredWindDir = "SW";
        String expectedWeatherType = "Céu pouco nublado";
        String expectedClassWindSpeed = "Moderado";
        String expectedForecastDate = "23/03/2021";

        DistrictDailyForecastData result = ipmaInfoDistrictDailyForecastDataMapper.mapTo(ipmaInfoDistrictDailyForecastData);

        assertThat(result.getPrecipitaProb()).isEqualTo(expectedPrecipitaProb);
        assertThat(result.gettMin()).isEqualTo(expectedTMin);
        assertThat(result.gettMax()).isEqualTo(expectedTMax);
        assertThat(result.getPredWindDir()).isEqualTo(expectedPredWindDir);
        assertThat(result.getWeatherType()).isEqualTo(expectedWeatherType);
        assertThat(result.getClassWindSpeed()).isEqualTo(expectedClassWindSpeed);
        assertThat(result.getForecastDate()).isEqualTo(expectedForecastDate);

    }

    @Test
    public void testThatIPMAInfoDistrictDailyForecastDataMapperReturnsCorrectDefaultForInvalidPrecipitaPro() {

        ipmaInfoDistrictDailyForecastData = TestDataProvider.createIPMAInfoDistrictDailyForecastDataInvalidPrecipitaProb();
        double expectedPrecipitaProb = -99;

        DistrictDailyForecastData result = ipmaInfoDistrictDailyForecastDataMapper.mapTo(ipmaInfoDistrictDailyForecastData);

        assertThat(result.getPrecipitaProb()).isEqualTo(expectedPrecipitaProb);

    }

    @Test
    public void testThatIPMAInfoDistrictDailyForecastDataMapperReturnsCorrectDefaultForInvalidTMin() {

        ipmaInfoDistrictDailyForecastData = TestDataProvider.createIPMAInfoDistrictDailyForecastDataInvalidTMin();
        double expectedTMin = -99;

        DistrictDailyForecastData result = ipmaInfoDistrictDailyForecastDataMapper.mapTo(ipmaInfoDistrictDailyForecastData);

        assertThat(result.gettMin()).isEqualTo(expectedTMin);

    }

    @Test
    public void testThatIPMAInfoDistrictDailyForecastDataMapperReturnsCorrectDefaultForInvalidTMax() {

        ipmaInfoDistrictDailyForecastData = TestDataProvider.createIPMAInfoDistrictDailyForecastDataInvalidTMax();
        double expectedTMax = -99;

        DistrictDailyForecastData result = ipmaInfoDistrictDailyForecastDataMapper.mapTo(ipmaInfoDistrictDailyForecastData);

        assertThat(result.gettMax()).isEqualTo(expectedTMax);

    }

}
