package leetcode;

/**
 * 题目描述：最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
 * 说明：每次只能向下或者向右移动一步
 * 例如：输入 [
 *            [1,3,1],
 *            [1,5,1],
 *            [4,2,1]
 *            ]
 *       输出：7，路径 1→3→1→1→1 的总和最小
 */
public class o64_MinPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for(int i = 0;i < row;i++){
            for(int j = 0;j < column;j++){
                if(i == 0 && j == 0)
                    continue;
                else if(i == 0)         //第一行行边界，只能由左边一格向右走
                    grid[i][j] += grid[i][j - 1];
                else if(j == 0)         //第一列列边界，只能由上边一格向下走
                    grid[i][j] += grid[i - 1][j];
                else
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row - 1][column - 1];
    }
}
