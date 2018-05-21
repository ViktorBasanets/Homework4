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
        unixPath = new UnixPath();
    }

    @Test
    public void testRightPathPositiveScenario() {
        char[] outputPath = "/home/c".toCharArray();
        unixPath.setPath("/home/c".toCharArray());

        String expectedResult = Arrays.toString(outputPath);
        String actualResult = Arrays.toString(unixPath.rightPath());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRightPathNegativeScenario() {
        char[] inputPath = "/a///..//////home/./c/".toCharArray();
        char[] outputPath = "/home/c".toCharArray();
        unixPath.setPath(inputPath);

        String expectedResult = Arrays.toString(outputPath);
        String actualResult = Arrays.toString(unixPath.rightPath());

        assertEquals(expectedResult, actualResult);
    }
}
