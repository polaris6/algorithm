package leetcode;

/**
 * 题目描述：最大子序和
 * 给定一个整数数组nums，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * 例如：输入：[-2,1,-3,4,-1,2,1,-5,4]，输出6，为[4,-1,2,1]
 */
public class o53_MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];     //dp[i]代表以nums[i]结尾的连续子数组的最大和
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < length; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
