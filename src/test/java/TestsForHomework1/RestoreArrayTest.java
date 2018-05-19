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
        restoreArray = new RestoreArray();
    }

    @Test
    public void testRestoreArrayWithPositiveScenario() {
        int[] inputArray = {1, 2, -1, 4, 7, 6, -2, 4};
        int[] outputArray = {1, 2, 3, 4, 7, 6, 5, 4};

        restoreArray.setArray(inputArray);
        restoreArray.restoreArray();

        String expectedResult = Arrays.toString(outputArray);
        String actualResult = restoreArray.toString();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRestoreArrayWithNegativeScenario() {
        int[] inputArray = {1, 2, -1, -4, 7, 6, -2, 4};

        restoreArray.setArray(inputArray);
        restoreArray.restoreArray();

        String expectedResult = Arrays.toString(inputArray);
        String actualResult = restoreArray.toString();

        assertEquals(expectedResult, actualResult);
    }
}
