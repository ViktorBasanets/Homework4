package TestsForHomework1;

import Homework1.ArrayRotation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ArrayRotationTest {

    ArrayRotation arrayRotation;

    @Before
    public void init() {
        arrayRotation = new ArrayRotation();
    }

    @Test
    public void testRotationArrayWithPositiveScenario() {
        int[] inputArray = new int[] {5, 6, 1, 2, 6};
        int[] outputArray = new int[]{1, 2, 6, 5, 6};

        arrayRotation.setArray(inputArray);
        arrayRotation.rotate(2);

        String expectedResult = Arrays.toString(outputArray);
        String actualResult = arrayRotation.toString();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRotationArrayWithNegativeScenario() {
        int[] inputArray = new int[] {5, 6, 1, 2, 6};

        arrayRotation.setArray(inputArray);
        arrayRotation.rotate(-2);

        String expectedResult = Arrays.toString(inputArray);
        String actualResult = arrayRotation.toString();

        assertEquals(expectedResult, actualResult);
    }
}
