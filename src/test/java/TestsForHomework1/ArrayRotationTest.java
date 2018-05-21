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
        int[] inputArray = {5, 6, 1, 2, 6};
        arrayRotation = new ArrayRotation(inputArray);
    }

    @Test
    public void testRotationArrayWithPositiveScenario() {
        arrayRotation.rotate(2);
        int expectedResult = 1;
        int actualResult = arrayRotation.get(0);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRotationArrayWithNegativeScenario() {
        arrayRotation.rotate(-2);
        int expectedResult = 5;
        int actualResult = arrayRotation.get(0);
        assertEquals(expectedResult, actualResult);
    }
}
