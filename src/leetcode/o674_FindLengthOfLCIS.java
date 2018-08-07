package leetcode;

/**
 * 题目描述：最长连续递增序列
 * 给定一个未经排序的整数数组，找到最长且连续的的递增序列。
 * 例如：输入：[1,3,5,4,7] 输出：3，最长连续递增序列为[1,3,5]
 */
public class o674_FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int index = 0;
        int max = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] > nums[i - 1])
                max = Math.max(max, i + 1 - index);
            else
                index = i;
        }
        return max;
    }
}
