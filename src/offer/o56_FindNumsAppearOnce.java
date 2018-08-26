package offer;
/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * num1,num2分别为长度为1的数组，传出参数
 * 将num1[0],num2[0]设置为返回结果
 * 我的做法过了，更好的做法是用亦或
 */

import java.util.TreeSet;

public class o56_FindNumsAppearOnce {
    public void findNumsAppearOnce(int[] array, int[] num1, int[] num2){
        int max = 0;
        for(int i : array){
            if(i > max)
                max = i;
        }
        int[] nums = new int[max+1];
        for(int i=0;i<array.length;i++)
            nums[array[i]]++;

        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0;i<array.length;i++){
            if(nums[array[i]] == 1)
                ts.add(array[i]);
        }
        num1[0] = ts.first();
        num2[0] = ts.last();
    }
}
