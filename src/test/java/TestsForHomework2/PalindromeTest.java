package TestsForHomework2;

import Homework2.Palindrome;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void init() {
        palindrome = new Palindrome();
    }

    @Test
    public void testPalindromeDetectorWithPositiveScenario() {
        palindrome.setString("madam");

        String expectedResult = "is palindrome";
        String actualResult = palindrome.palindromeDetector();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPalindromeDetectorWithNegativeScenario() {
        palindrome.setString("mademoiselle");

        String expectedResult = "isn't palindrome";
        String actualResult = palindrome.palindromeDetector();

        assertEquals(expectedResult, actualResult);
    }
}
