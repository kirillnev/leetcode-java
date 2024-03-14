/*
930. Binary Subarrays With Sum
https://leetcode.com/problems/binary-subarrays-with-sum/

Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.
*/


package ru.kirillnev.leetcodejava.t0930;

import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            count += prefixSums.getOrDefault(sum - goal, 0);

            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
