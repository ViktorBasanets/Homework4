package TestsForHomework2;

import Homework2.FrequencyOfChar;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class FrequencyOfCharTest {

    FrequencyOfChar frequencyOfChar;

    @Before
    public void init() {
        char[] inputString = "aaa156aadfsdaeraaaawq".toCharArray();
        frequencyOfChar = new FrequencyOfChar(inputString);
    }

    @Test
    public void testCharFrequencyWithPositiveScenario() {
        int expectedResult = 10;
        int actualResult = frequencyOfChar.charFrequency('a');
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCharFrequencyWithNegativeScenario() {
        int expectedResult = 0;
        int actualResult = frequencyOfChar.charFrequency('b');
        assertEquals(expectedResult, actualResult);
    }
}
