package offer;

/**
 * 题目描述：输入一个整数，输出该数二进制表示中1的个数，其中负数用补码表示。
 */
public class o15_NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            count++;            //如果n不为0，则n的二进制中至少包括1个1
            n = n & (n - 1);    //分两种情况：n的二进制末尾是1，做与运算末尾变成0；末尾是0，做与运算最右边的1会变成0
        }
        return count;
    }
}
