package org.example;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        int[] maxValueCount = {0, 0};

        for (int i = 1; i < nums.length; i++) {
            int localMax = 0;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j]){
                    localMax = Math.max(localMax, dp[j]);
                }
            }
            dp[i] = localMax + 1;
            if(dp[i] > maxValueCount[0]){
                maxValueCount[0] = dp[i];
                maxValueCount[1] = 1;
            }if(dp[i] == maxValueCount[0]){
                maxValueCount[1]++;
            }
        }

        return maxValueCount[1];
    }
}