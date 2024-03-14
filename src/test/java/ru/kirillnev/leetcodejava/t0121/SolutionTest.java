package ru.kirillnev.leetcodejava.t0121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        Solution solution = new Solution();

        int actualMaxProfit = solution.maxProfit(new int[]{7,1,5,3,6,4});
        int expectedMaxProfit = 5;
        assertEquals(expectedMaxProfit, actualMaxProfit);

        actualMaxProfit = solution.maxProfit(new int[]{7,6,4,3,1});
        expectedMaxProfit = 0;
        assertEquals(expectedMaxProfit, actualMaxProfit);
    }
}