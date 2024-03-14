package ru.kirillnev.leetcodejava.t0930;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numSubarraysWithSum() {
        Solution solution = new Solution();

        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int expected = 4;
        int actual = solution.numSubarraysWithSum(nums, goal);
        assertEquals(expected, actual);

        nums = new int[]{0,0,0,0,0};
        goal = 0;
        expected = 15;
        actual = solution.numSubarraysWithSum(nums, goal);
        assertEquals(expected, actual);

    }
}