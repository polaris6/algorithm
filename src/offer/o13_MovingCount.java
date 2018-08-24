package offer;

/**
 * 题目描述：机器人在方格中移动，不能进入行坐标和列坐标的数位之和大于k的格子，求机器人能到达多少个格子
 * 地上有一个m行和n列的方格，一个机器人从坐标0,0的格子开始移动，每次只能向左、右、上、下四个方向移动一格，但是不能进入
 * 行坐标和列坐标的数位之和大于k的格子。例如当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18，但是它不能进入方格
 * （35,38），因为3+5+3+8 = 19，请问该机器人能够达到多少个格子？
 *
 * 思路：用回溯法
 * 把该方格看做是一个m*n的矩阵，在这个矩阵中，除边界上的格子外其他格子都有四个相邻的格子。首先给定每个格子一个flag值，
 * flag为true表示已经进入过。机器人从坐标（0,0）开始移动，当它准备进入坐标为(i,j)的格子时，通过检查坐标的数位和来判断
 * 是否能进入。如果能进入，再接着判断它能否进入四个相邻的格子(i,j-1)、(i-1,j)、(i+1,j)、(i,j+1)
 */
public class o13_MovingCount {
    public int movingCount(int threshold, int rows, int cols){
        boolean[][] flag = new boolean[rows][cols];
        return countSteps(threshold, rows, cols, 0, 0, flag);
    }
    private int countSteps(int threshold, int rows, int cols, int i, int j, boolean[][] flag){
        if(i < 0 || i >= rows || j < 0 || j >= cols || flag[i][j] || bitSum(i) + bitSum(j) > threshold)
            return 0;
        flag[i][j] = true;
        return countSteps(threshold, rows, cols, i - 1, j, flag)
                + countSteps(threshold, rows, cols, i + 1, j, flag)
                + countSteps(threshold, rows, cols, i, j - 1, flag)
                + countSteps(threshold, rows, cols, i, j + 1, flag)
                + 1;
    }
    private int bitSum(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
