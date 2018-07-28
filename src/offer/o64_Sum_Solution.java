package offer;

/**
 * 题目描述：
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * 思路：利用逻辑与的短路特性实现递归终止（前面的条件判假了，就不会再执行后面的条件了）
 * 当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
 * 当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
 */
public class o64_Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
