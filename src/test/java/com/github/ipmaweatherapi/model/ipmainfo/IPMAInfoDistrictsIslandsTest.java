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
public class IPMAInfoDistrictsIslandsTest {

    IPMAInfoDistrictsIslands ipmaInfoDistrictsIslands;

    @BeforeAll
    public void populateIPMAInfoDistrictsIslands() {

        ipmaInfoDistrictsIslands = new IPMAInfoDistrictsIslands("IPMA", "PT", new ArrayList<>());
        ipmaInfoDistrictsIslands.getData().add(new IPMAInfoDistrictsIslandsData(1L, "1", 1L, 1L, "40.0001", 1L, "Lisboa", "-8.11324"));
    }

    @Test
    public void testThatExistentDistrictIDReturnsCorrectDistrictName() {
        String expected = "Lisboa";
        String result = ipmaInfoDistrictsIslands.getNameById(1L);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testThatNonexistentDistrictIDReturnsDistrictNameNotFound() {
        String expected = "N/A";
        String result = ipmaInfoDistrictsIslands.getNameById(99L);

        assertThat(result).isEqualTo(expected);
    }
}
