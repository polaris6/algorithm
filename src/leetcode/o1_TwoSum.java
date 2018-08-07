package leetcode;

import java.util.HashMap;

/**
 * 题目描述：两数之和
 * 给一个整型数组和目标值，如果数组中存在两数的和等于目标值，则返回两数的下标（假设只有唯一的两个数满足，并且
 * 不能使用同一个数两次，注意数组不一定是排序的！！！）
 *
 * Example：
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 思路：
 * 用HashMap，数组中的数做key，数的下标做value
 */
public class o1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
