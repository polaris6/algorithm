package offer;

/**
 * 题目描述：连续子数组的最大和
 * 输入一个整数数组，数组中有正数也有负数，求所有子数组的和的最大值
 */
public class o42_FindGreatestSumOfSubArray {
    public int findGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0)
            return 0;
        int[] maxSum = new int[array.length];   //maxSum[i]代表以array[i]结尾的子数组的最大和
        maxSum[0] = array[0];
        int max = array[0];
        for(int i = 1;i < array.length;i++){
            maxSum[i] = maxSum[i-1] > 0 ? maxSum[i-1] + array[i] : array[i];//判断maxSum[i-1]是否大于0，是则加，否则不加
            max = Math.max(maxSum[i], max);
        }
        return max;
    }
}
