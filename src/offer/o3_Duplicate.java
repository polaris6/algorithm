package offer;

/**
 * 题目描述：
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个
 * 数字重复几次。
 * 请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 *
 * 返回描述：
 * duplication[0]为返回值
 * boolean用于判断输入是否合法，以及是否有重复值
 */
public class o3_Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        if(numbers == null)
            return flag;
        int[] newNumbers = new int[length];
        for(int num : numbers)
            newNumbers[num]++;
        for(int num : numbers){
            if(newNumbers[num] > 1){
                duplication[0] = num;
                flag = true;
                break;
            }
        }
        return flag;
    }
}
