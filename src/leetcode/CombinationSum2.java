package leetcode;

import java.util.Arrays;

/**
 * 题目描述：给定候选号码数组 (C) 和目标总和数 (T)，找出 C 中候选号码总和为 T 的所有组合,C 中的每个数字只能在组合中
 * 使用一次。
 * 例如：给定候选数组 {10, 1, 2, 7, 6, 1, 5} 和目标总和数 8
 * 可行的组合是 [1, 7], [1, 2, 5], [2, 6], [1, 1, 6]，共有4 种
 */
public class CombinationSum2 {
    public int combinationSum2(int[] candidates, int target) { ;
        Arrays.sort(candidates); // need sort to make this work.
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
            if (i > start && candi[i] == candi[i - 1]) //remove duplicates.这一步是为了去重，因为候选数组排序过了
                continue;
            sum += combination(candi, target - candi[i], i + 1);
        }
        return sum;
    }
}
