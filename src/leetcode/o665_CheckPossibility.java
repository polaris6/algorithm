package leetcode;

/**
 * 题目描述：非递减数列
 * 最多改变1个元素的情况下，数组能否变成一个非递减数列（满足array[i] <= array[i + 1]）
 * 例如：[-1,4,2,3] 把4变为2可以，[-1,4,2,1]不行
 */
public class o665_CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;
        int numOfIncrease = 0;      //数组后一个数比前一个数小这种情况出现的次数，如果出现不止一次，肯定错
        boolean flag = false;
        for(int i = 1;i < nums.length && numOfIncrease <= 1;i++){
            if(nums[i] < nums[i - 1]){
                numOfIncrease++;
                if(i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];              //[-1,4,2,3]这种情况
                else                                    //[3,4,2,5]这种情况
                    nums[i] = nums[i - 1];
            }
        }
        if(numOfIncrease <= 1)
            flag = true;
        return flag;
    }
}
