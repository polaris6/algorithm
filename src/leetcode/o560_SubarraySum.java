package leetcode;

import java.util.HashMap;

/**
 * 题目描述：和为k的子数组
 * 给定一个整数数组和一个整数k，需要找到该数组中和为k的连续的子数组的个数
 * 例如：输入：nums = [1,1,1] k = 2，输出：2，[1,1] 与 [1,1] 为两种不同的情况。
 *
 * 思路：
 * 关键是找到连续的子数组nums[i,j]，我们可以通过nums[0,j]的sum值减去nums[0,i-1]的sum值得到结果
 * 引入HashMap，key存累计的sum值，value存这个sum值出现的次数
 */
public class o560_SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            if(map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
