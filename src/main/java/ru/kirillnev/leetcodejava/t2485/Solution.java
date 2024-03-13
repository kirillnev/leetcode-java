/*
2485. Find the Pivot Integer
https://leetcode.com/problems/find-the-pivot-integer/

Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
*/

package ru.kirillnev.leetcodejava.t2485;

class Solution {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int sumBefore = 0;
        int sumAfter = 0;
        int sumTotal = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            sumBefore += i;
            sumAfter = sumTotal + i - sumBefore;
            if (sumAfter == sumBefore) {
                return i;
            }
        }
        return -1;
    }
}
