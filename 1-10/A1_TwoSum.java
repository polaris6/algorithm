import java.util.HashMap;
import java.util.Map;

/**
 * 题号：1
 * 题目：两数之和
 * 难度：简单
 * 描述：给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标
 *      可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 * 示例：
 *  输入：nums = [2,7,11,15], target = 9
 *  输出：[0,1]
 *
 *  输入：nums = [3,2,4], target = 6
 *  输出：[1,2]
 *
 *  输入：nums = [3,3], target = 6
 *  输出：[0,1]
 */
public class A1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numWithIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numWithIndex.containsKey(target - nums[i])) {
                return new int[]{i, numWithIndex.get(target - nums[i])};
            }
            numWithIndex.put(nums[i], i);
        }
        return new int[0];
    }
}
