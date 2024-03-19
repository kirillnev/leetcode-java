/*
621. Task Scheduler
https://leetcode.com/problems/task-scheduler/

You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: identical tasks must be separated by at least n intervals due to cooling time.
Return the minimum number of intervals required to complete all tasks.
*/

package ru.kirillnev.leetcodejava.t0621;

import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> taskCounts = new HashMap<>();
        for (char task : tasks) {
            taskCounts.put(task, taskCounts.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(taskCounts.values());

        int cycles = 0;
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < n + 1; i++) {
                if (!queue.isEmpty()) {
                    temp.add(queue.poll());
                }
            }

            for (int freq : temp) {
                if (--freq > 0) {
                    queue.add(freq);
                }
            }

            cycles += queue.isEmpty() ? temp.size() : n + 1;
        }

        return cycles;
    }
}