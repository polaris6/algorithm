package leetcode;

/**
 * 题目描述：不同路径
 * 一个机器人位于一个m x n网格的左上角，每次只能向右或向下移动一步，共有多少条路径
 * 输入：m = 3，n = 2  输出3；  输入：m = 7，n = 3  输出28
 */
public class o62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] pathNums = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 || j == 0)
                    pathNums[i][j] = 1;
                else
                    pathNums[i][j] = pathNums[i - 1][j] + pathNums[i][j - 1];
            }
        }
        return pathNums[m - 1][n - 1];
    }
}
