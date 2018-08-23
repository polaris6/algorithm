package offer;

import java.util.ArrayList;

/**
 * 题目描述：
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 * 用堆排序
 */
public class o40_GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || input.length < k)
            return list;
        for(int i = input.length/2 -1;i >= 0;i--)
            adjustHeap(input, i, input.length);
        for(int j = input.length - 1;j > input.length - 1 - k;j--){
            adjustHeap(input, 0, j);
            swap(input, 0, j);
            list.add(input[j]);
        }
        return list;
    }

    public void adjustHeap(int[] input, int i, int length){
        int temp = input[i];
        for(int k = 2 * i + 1;k < length;k = k * 2){
            if(k + 1 < length && input[k] > input[k + 1])
                k++;
            if(temp > input[k]){
                input[i] = input[k];
                i = k;
            }else
                break;
        }
        input[i] = temp;
    }
    public void swap(int[] input, int a,int b){
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}
