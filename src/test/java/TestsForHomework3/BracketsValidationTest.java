package TestsForHomework3;

import Homework3.BracketsValidation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BracketsValidationTest {

    BracketsValidation bracketsValidation;

    @Before
    public void init() {
        bracketsValidation = new BracketsValidation();
    }

    @Test
    public void testValidatorWithPositiveScenario() {

        bracketsValidation.setString("()[({(())})]".toCharArray());
        String expectedResult = "is correct";
        String actualResult = bracketsValidation.validator();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidatorWithNegativeScenario() {

        bracketsValidation.setString("([)]".toCharArray());
        String expectedResult = "isn't correct";
        String actualResult = bracketsValidation.validator();

        assertEquals(expectedResult, actualResult);
    }
}
