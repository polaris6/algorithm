package leetcode;

/**
 * 题目描述：使用最小花费爬楼梯
 * 第i个阶梯对应着一个非负数的体力花费值cost[i](索引从0开始)，每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以
 * 选择继续爬一个阶梯或者爬两个阶梯，求到达楼层顶部的最低花费。在开始时，可以选择从索引为0或1的元素作为初始阶梯。
 * 输入：cost = [10, 15, 20]，输出：15   输入：cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]，输出：6
 */
public class o746_MinCostClimbingStairs{
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for(int i = 2;i < n;i++)
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        return Math.min(cost[n-1], cost[n-2]);
    }
}
