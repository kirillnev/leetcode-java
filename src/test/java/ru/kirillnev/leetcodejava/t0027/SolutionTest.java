package ru.kirillnev.leetcodejava.t0027;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

public class SolutionTest {
    private static Object[][] dataProvider() {
        return new Object[][]{
                {new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2}},
                {new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4}}
        };
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testRemoveElement(int[] nums, int val, int expectedK, int[] expectedNums) {

        Solution solution = new Solution();

        int k = solution.removeElement(nums, val);

        assertEquals(expectedK, k, "k is incorrect");

        int[] actualNums = Arrays.copyOf(nums, k);

        assertArrayEquals(actualNums, expectedNums,
                () -> "The result array after removal is incorrect\n"
                        + "Expected: " + Arrays.toString(expectedNums) + "\n"
                        + "Actual:   " + Arrays.toString(actualNums));
    }
}