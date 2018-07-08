package fiveeight;
/**
 * 给一个数组A，例如[1,1,1,1,1]，和一个值S，例如3，只能用 + 和 - 对A中的元素进行运算，运算顺序和A中的元素顺序一样，求
 * 运算结果是S的次数。要求用递归做
 * 例如1+1+1+1-1=3,1+1+1-1+1=3,1+1-1+1+1=3,1-1+1+1+1=3 共有4 种
 */

import java.util.Stack;

public class addremove {
    public static int get_Num(int[] arr,int num){
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>0;i--)
            stack.push(arr[i]);
        stack.push(arr[0]);
        if(!stack.empty())
            num -= stack.pop();
        int sum = getNum(stack,num);
        return sum;
    }
    public static int getNum(Stack<Integer> stack,int num){
        int sum = 0;
        int number = 0;
        if(!stack.empty())
            number = stack.pop();
        if(Math.abs(num) == Math.abs(number) && stack.empty())
            return 1;
        if(number != 0)
            sum += getNum(stack,sum-number) + getNum(stack,sum+number);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 6;
        System.out.println(get_Num(arr,sum));
    }
}
