package com.github.ipmaweatherapi.model.ipmainfo;

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
public class IPMAInfoClassWindSpeedTest {

    private IPMAInfoClassWindSpeed ipmaInfoClassWindSpeed;

    @BeforeAll
    public void populateIPMAInfoClassWindSpeed() {
        ipmaInfoClassWindSpeed = new IPMAInfoClassWindSpeed("IPMA", "PT", new ArrayList<>());
        ipmaInfoClassWindSpeed.getData().add(new IPMAInfoClassWindSpeedData("Weak", "Fraco", "1"));
        ipmaInfoClassWindSpeed.getData().add(new IPMAInfoClassWindSpeedData("Moderate", "Moderado", "2"));
        ipmaInfoClassWindSpeed.getData().add(new IPMAInfoClassWindSpeedData("Strong", "Forte", "3"));
        ipmaInfoClassWindSpeed.getData().add(new IPMAInfoClassWindSpeedData("Very Strong", "Muito Forte", "4"));
    }

    @Test
    public void testThatExistentWindClassIDReturnsCorrectENDescription() {
        String id = "1";
        String expected = "Weak";
        String result = ipmaInfoClassWindSpeed.getDescFromIdEN(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatNonexistentWindClassIDReturnsENDescriptionNotFound() {
        String id = "6";
        String expected = "N/A";
        String result = ipmaInfoClassWindSpeed.getDescFromIdEN(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatExistentWindClassIDReturnsCorrectPTDescription() {
        String id = "4";
        String expected = "Muito Forte";
        String result = ipmaInfoClassWindSpeed.getDescFromIdPT(id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatNonexistentWindClassIDReturnsPTDescriptionNotFound() {
        String id = "8";
        String expected = "N/D";
        String result = ipmaInfoClassWindSpeed.getDescFromIdPT(id);

        assertThat(result).isEqualTo(expected);
    }
}
