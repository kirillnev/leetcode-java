package ru.kirillnev.leetcodejava.t0055;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canJump() {
        Solution solution = new Solution();

        int[] nums = {2,3,1,1,4};
        boolean actualRes = solution.canJump(nums);
        assertTrue(actualRes);

        nums = new int[]{3,2,1,0,4};
        actualRes = solution.canJump(nums);
        assertFalse(actualRes);
    }
}