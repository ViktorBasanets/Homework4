package TestsForHomework1;

import Homework1.RestoreArray;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class RestoreArrayTest {

    RestoreArray restoreArray;

    @Before
    public void init() {
        int[] inputArray = {1, 2, -1, 4, 7, 6, -2, 4};
        restoreArray = new RestoreArray(inputArray);
    }

    @Test
    public void testRestoreArrayWithPositiveScenario() {
        restoreArray.restoreArray();
        int expectedResult = 3;
        int actualResult = restoreArray.get(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRestoreArrayWithNegativeScenario() {
        restoreArray.set(3, -4);
        restoreArray.restoreArray();
        int expectedResult = -1;
        int actualResult = restoreArray.get(2);
        assertEquals(expectedResult, actualResult);
    }
}
