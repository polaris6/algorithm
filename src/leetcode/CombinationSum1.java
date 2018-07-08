package leetcode;

import java.util.Arrays;

/**
 * 题目描述：给定候选号码数组 (C) 和目标总和数 (T)，找出 C 中候选号码总和为 T 的所有组合
 * 例如：给定候选数组 {10, 1, 2, 7, 6, 1, 5} 和目标总和数 8
 * 可行的组合是  [1, 7], [1, 7], [1, 2, 5], [1, 2, 5], [2, 6], [1, 1, 6]，共有6 种
 *
 * 网易的背包问题和美图的买家电问题就是类似题型，虽然家电价格一样但是种类或品牌不一样，所以是不同的选择
 */
public class CombinationSum1 {
    public int combinationSum1(int[] candidates, int target) {
        Arrays.sort(candidates);//可以不用排序
        int sum = combination(candidates, target, 0);
        return sum;
    }

    public int combination(int[] candi, int target, int start) {
        int sum = 0;
        if(target < 0)
            return 0;
        if(target == 0)
            return 1;
        for(int i = start; i < candi.length; i++) {
            sum += combination(candi, target - candi[i], i + 1);
        }
        return sum;
    }
}
