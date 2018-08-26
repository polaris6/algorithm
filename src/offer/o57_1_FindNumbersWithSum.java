package offer;

import java.util.ArrayList;
/**
 * 题目描述：
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 *
 * 输出描述：输出两个数，小的先输出。
 */
public class o57_1_FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        if(array == null || array.length == 0)
            return null;
        int left = 0;
        int right = array.length - 1;
        ArrayList<Integer> output = new ArrayList<>();

        while(left <= right){
            if(array[left] + array[right] == sum){
                output.add(array[left]);
                output.add(array[right]);
                break;
            }
            if(array[left] + array[right] > sum)
                right--;
            if(array[left] + array[right] < sum)
                left++;
        }
        return output;
    }
}
