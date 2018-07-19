package offer;

/**
 * 题目描述：
 * 不用加减乘除做加法，要求在函数体内不得使用+、-、*、/四则运算符号。
 *
 * 解题思路：
 * 用位运算
 */
public class o65_Add {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int temp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }
}
