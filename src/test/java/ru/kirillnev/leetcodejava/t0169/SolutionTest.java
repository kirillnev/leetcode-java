package ru.kirillnev.leetcodejava.t0169;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Object[][] dateProvider(){
        return new Object[][]{
                new Object[]{new int[]{5}, 5},
                new Object[]{new int[]{3,2,3}, 3},
                new Object[]{new int[]{2,2,1,1,1,2,2}, 2},
                new Object[]{new int[]{2,2,1,1,1,1,2,1,2}, 1},
        };
    }


    @ParameterizedTest
    @MethodSource("dateProvider")
    void testMajorityElement(int[] nums, int expectedRes) {
        Solution solution = new Solution();

        int res = solution.majorityElement(nums);

        assertEquals(expectedRes, res);
    }
}
