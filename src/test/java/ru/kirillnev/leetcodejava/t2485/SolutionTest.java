package ru.kirillnev.leetcodejava.t2485;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pivotInteger() {
        Solution solution = new Solution();
        int actual = solution.pivotInteger(8);
        assertEquals(6, actual);

        actual = solution.pivotInteger(1);
        assertEquals(1, actual);

        actual = solution.pivotInteger(4);
        assertEquals(-1, actual, "It can be proved that no such integer exist.");
    }
}