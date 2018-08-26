package offer;

/**
 * 题目描述：股票的最大利润
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。如果你最多只允许完成一笔交易（即买入和卖出一支股票），
 * 计算你所能获取的最大利润。注意你不能在买入股票前卖出股票。
 *
 * 例如：输入: [7,1,5,3,6,4]，输出: 5，价格为1的时候买入，6的时候卖出
 *       输入: [7,6,4,3,1]，输出: 0，这种情况没有交易发生
 */
public class o63_MaxProfit {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int maxProfit = 0;
        int minNum = prices[0];
        for(int i = 1;i < prices.length;i++){
            maxProfit = Math.max(prices[i] - minNum, maxProfit);
            minNum = Math.min(prices[i], minNum);
        }
        return maxProfit;
    }
}
