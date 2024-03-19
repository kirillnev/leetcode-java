package ru.kirillnev.leetcodejava.t0122;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Object[][] dataProvider(){
        return new Object[][]{
                {new int[]{7,1,5,3,6,4}, 7},
                {new int[]{1,2,3,4,5}, 4},
                {new int[]{7,6,4,3,1}, 0},
        };
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void maxProfit(int[] prices, int expectedRes) {
        Solution solution = new Solution();
        int actualRes = solution.maxProfit(prices);

        assertEquals(expectedRes, actualRes);
    }
}