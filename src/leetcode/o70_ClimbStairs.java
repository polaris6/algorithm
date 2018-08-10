package leetcode;

/**
 * 题目描述：爬楼梯
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶，每次你可以爬 1 或 2 个台阶，你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注：dp超时
 */
public class o70_ClimbStairs {
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2)
            return n;
        int[] nums = new int[n];
        nums[0] = 1;        //返回的是nums[n - 1]，所以从0开始
        nums[1] = 2;
        for(int i = 2;i < n;i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n - 1];
    }
}
