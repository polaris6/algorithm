package offer;

/**
 * 题目描述：输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 *
 * 我用的是最简单的递归方法，因为递归调用会有大量的重复计算，会报StackOverflowError，想想该怎么优化，没想出来==
 * 其实很好做，不用从后往前递归，直接从前往后一个一个算，时间复杂度为O(n)
 */
public class Fibonacci {
    public int fibonacci(int n) {
        int num = 0;
        int[] nums = {0,1};
        if(n==0 || n==1)
            return nums[n];
        else{
            for(int i=2;i<=n;i++){
                num = nums[0]+nums[1];
                nums[0] = nums[1];
                nums[1] = num;
            }
        }
        return num;
    }
}
