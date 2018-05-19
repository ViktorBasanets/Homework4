package TestsForHomework3;

import Homework3.UnixPath;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class UnixPathTest {

    UnixPath unixPath;

    @Before
    public void init() {
        char[] inputPath = "/a///..//////home/./c/".toCharArray();
        unixPath = new UnixPath(inputPath);
    }

    @Test
    public void testRightPathPositiveScenario() {
        String expectedResult = Arrays.toString("/home/c".toCharArray());
        String actualResult = Arrays.toString(unixPath.rightPath());

        assertEquals(expectedResult, actualResult);
    }
}
