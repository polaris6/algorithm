package offer;

/**
 * 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class o10_3_JumpFloorII {
    public int jumpFloorII(int target) {
        int sum = 0;
        if(target==0 || target==1)
            sum = 1;
        else
            for(int i = target-1;i>=0;i--)
                sum += jumpFloorII(i);
        return sum;
    }
}
