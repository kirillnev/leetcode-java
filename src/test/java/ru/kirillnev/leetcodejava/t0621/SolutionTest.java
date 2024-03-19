package ru.kirillnev.leetcodejava.t0621;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Object[][] dataProvider() {
        return new Object[][]{
                {new char[]{'A','A','A','B','B','B'}, 2, 8},
                {new char[]{'A','C','A','B','D','B'}, 1, 6},
                {new char[]{'A','A','A', 'B','B','B'}, 3, 10},
        };
    }

    
    @ParameterizedTest
    @MethodSource("dataProvider")
    void leastInterval(char[] tasks, int n, int expectedRes) {
        Solution solution = new Solution();
        int actualRes = solution.leastInterval(tasks, n);
        assertEquals(expectedRes, actualRes);
    }
}