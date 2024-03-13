package ru.kirillnev.leetcodejava.t0189;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Object[][] dataProvider() {
        return new Object[][]{
                new Object[]{new int[]{1,2,3,4,5,6,7}, 3, new int[]{5,6,7,1,2,3,4}},
                new Object[]{new int[]{-1,-100,3,99}, 2, new int[]{3,99,-1,-100}},
        };
    }
    @ParameterizedTest
    @MethodSource("dataProvider")
    void rotate(int[] nums, int k, int[] expectedNums) {
        Solution solution = new Solution();

        solution.rotate(nums, k);
        assertArrayEquals(expectedNums, nums);
    }
}