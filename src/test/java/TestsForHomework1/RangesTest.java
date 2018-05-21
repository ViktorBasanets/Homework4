package TestsForHomework1;

import Homework1.Ranges;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class RangesTest {

    Ranges ranges;

    @Before
    public void init() {
        int[] inputArray = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};
        ranges = new Ranges(inputArray);
    }

    @Test
    public void testRankWithPositiveScenario() {
        String expectedResult = "[1 3][5][8 10][13 16]";
        String actualResult = ranges.rank();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRankWithNegativeScenario() {
        ranges.set(8, 12);
        String expectedResult = null;
        String actualResult = ranges.rank();

        assertEquals(expectedResult, actualResult);
    }
}
