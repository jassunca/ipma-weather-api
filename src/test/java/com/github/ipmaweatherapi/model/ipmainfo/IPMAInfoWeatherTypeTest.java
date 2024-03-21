package com.github.ipmaweatherapi.model.ipmainfo;

import com.github.ipmaweatherapi.utils.TestDataProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
/*The TestInstance annotation is added, so we set a single test lifecycle to this class, allowing us to use a
 non-static BeforeAll method to initialize the necessary data. (by default, it's one test lifecycle per method)*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IPMAInfoWeatherTypeTest {

    private IPMAInfoWeatherType ipmaInfoWeatherType;

    @BeforeAll
    public void populateIPMAInfoWeatherType() {
        ipmaInfoWeatherType = TestDataProvider.createIPMAInfoWeatherType();
    }

    @Test
    public void testThatExistentWeatherTypeIDReturnsCorrectENDescription() {
        Long id = 1L;
        String expected = "Clear sky";
        String result = ipmaInfoWeatherType.getDescFromIdEN(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatNonexistentWeatherTypeIDReturnsENDescriptionNotFound() {
        Long id = 56L;
        String expected = "N/A";
        String result = ipmaInfoWeatherType.getDescFromIdEN(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatExistentWeatherTypeIDReturnsCorrectPTDescription() {
        Long id = 2L;
        String expected = "Céu pouco nublado";
        String result = ipmaInfoWeatherType.getDescFromIdPT(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatNonexistentWeatherTypeIDReturnsPTDescriptionNotFound() {
        Long id = 47L;
        String expected = "N/D";
        String result = ipmaInfoWeatherType.getDescFromIdPT(id);

        assertThat(result).isEqualTo(expected);
    }
}
