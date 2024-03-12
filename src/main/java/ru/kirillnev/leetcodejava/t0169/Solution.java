/*
169. Majority Element
https://leetcode.com/problems/majority-element/

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

package ru.kirillnev.leetcodejava.t0169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countNums = new HashMap<>();

        for (int num : nums) {
            int countValue = countNums.getOrDefault(num, 0) + 1;
            if (countValue > nums.length / 2.0) {
                return num;
            }
            countNums.put(num, countValue);
        }
        return 0;
    }
}
