package leetcode;

/**
 * 题目描述：预测赢家
 * 给定一个表示分数的非负整数数组，玩家1从数组任意一端拿一个分数，随后玩家2继续从剩余数组任一端拿取分数....直至拿完，
 * 分数总和最多的玩家获胜，判断玩家1能否获胜
 * 注：如果最终两个玩家的分数相等，那么玩家1仍为赢家；1 <= 给定数组长度 <= 20
 *
 * 输入：{0,0,7,6,5,6,1}  输出：false，玩家2只要拿到6和7就赢了
 *
 * 思路：分为两种情况，数组长度为偶数的情况和长度为奇数的情况
 * 1、长度偶数，此时玩家1必赢。方法：判断数组中偶数位置的和与奇数位置的和哪个大，如果偶数位置大，则玩家1从头取，如果
 * 奇数大，则从尾取。
 * 2、长度奇数，
 */
public class o486_PredictTheWinner{
    public boolean predictTheWinner(int[] nums){
        if(nums.length % 2 == 0)
            return true;

        return true;
    }
}
