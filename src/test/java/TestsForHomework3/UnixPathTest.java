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
        unixPath.setPath("/....".toCharArray());
        unixPath.rightPath();
        char expectedResult = '.';
        char actualResult = unixPath.get(1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRightPathNegativeScenario() {
        unixPath.setPath("/a///..//////home/./c/".toCharArray());
        unixPath.rightPath();
        char expectedResult = 'e';
        char actualResult = unixPath.get(4);
        assertEquals(expectedResult, actualResult);
    }
}
