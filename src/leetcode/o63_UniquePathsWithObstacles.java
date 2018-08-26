package leetcode;

/**
 * 题目描述：不同路径
 * 一个机器人位于一个m x n网格的左上角，每次只能向右或向下移动一步，考虑路径中有障碍物，障碍物和空位置分别用1和0来表示，
 * 求共有多少条路径
 * 输入：[0,0,0],
 *       [0,1,0],
 *       [0,0,0]
 * 输出：2
 */
public class o63_UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0)
            return 0;
        int column = obstacleGrid[0].length;     //列数
        int[] dp = new int[column];
        dp[0] = 1;
        for(int[] row : obstacleGrid){
            for(int j = 0;j < column;j++){
                if(row[j] == 1)
                    dp[j] = 0;
                else if(j > 0)
                    dp[j] += dp[j - 1];     //到达一个新网格的路径，等于这个新的网格上面网格的路径 + 左面网格的路径
            }
        }
        return dp[column - 1];
    }
}
