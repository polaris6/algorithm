package offer;

import java.util.Scanner;

/**
 * 青蛙跳台阶问题，一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * PS：这个题，其实是和斐波那契数列一个性质，但是那个题栈内存溢出了，可能这个题测试用例比较小一些。有两种方法：
 * 自顶向下是用递归，但是可能内存溢出；自底向上是用迭代，适用于这种题。做的时候还是先用递归看看，如果不可以再用迭代。
 */
public class o10_2_JumpFloor {
    public static int jumpFloor(int target) {
        int sum = 0;
        if(target == 0 || target==1)
            sum = 1;
        if(target > 1)
            sum = jumpFloor(target-1) + jumpFloor(target-2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jumpFloor(n));
    }
}
