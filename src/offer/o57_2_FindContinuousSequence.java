package offer;

import java.util.ArrayList;

/**
 * 题目描述：
 * 输入一个正数s，打印出所有和为s的连续正数序列（至少含有两个数）。
 * 例如：输入15，打印出3个连续序列，1-5、4-6、7-8
 *
 * 输出描述：
 * 输出所有和为S的连续正数序列，序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 *
 * 思路：
 * 用两个数small和big分别表示序列的最小值和最大值，如果(big-small+1)*(big+small) == 2*sum，则这个序列满足，然后small和
 * big分别加1，如果小于2*sum，则big加1，否则small加1
 */
public class o57_2_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        int small = 1;
        int big = 2;
        while(small <= sum/2){
            int curSum = (big-small+1)*(big+small);
            if(curSum == 2*sum){
                ArrayList<Integer> list2 = new ArrayList<>();
                for(int i = small;i <= big;i++)
                    list2.add(i);
                list1.add(list2);
                small++;
                big++;
            }
            else if(curSum < 2*sum)
                big++;
            else
                small++;
        }
        return list1;
    }
}