package TestsForHomework2;

import Homework2.ReverseSubstring;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ReverseSubstringTest {

    ReverseSubstring reversedSubstring;

    @Before
    public void init() {
        char[] inputArray = "abcdefg".toCharArray();;
        reversedSubstring = new ReverseSubstring(inputArray);
    }

    @Test
    public void testReverseSubstringWithPositiveScenario() {
        char[] outputArray = "abedcfg".toCharArray();
        reversedSubstring.reverse(2, 4);

        String expectedResult = Arrays.toString(outputArray);
        String actualResult = Arrays.toString(reversedSubstring.getArray());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseSubstringWithNegativeScenario() {
        char[] outputArray = "abcdefg".toCharArray();;
        reversedSubstring.reverse(-1, 7);

        String expectedResult = Arrays.toString(outputArray);
        String actualResult = Arrays.toString(reversedSubstring.getArray());

        assertEquals(expectedResult, actualResult);
    }
}
