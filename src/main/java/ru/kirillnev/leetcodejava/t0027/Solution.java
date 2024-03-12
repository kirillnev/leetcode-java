/*
27. Remove Element
https://leetcode.com/problems/remove-element/

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

package ru.kirillnev.leetcodejava.t0027;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int shift = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                shift++;
            } else {
                nums[i - shift] = nums[i];
                k++;
            }
        }
        return k;
    }
}
