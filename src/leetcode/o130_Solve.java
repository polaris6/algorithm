package leetcode;

/**
 * 题目描述：被围绕的区域
 * 给定一个二维的矩阵，包含 'X' 和 'O'，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充
 * 输入：
   X X X X
   X O O X
   X X O X
   X O X X
 * 输出：
   X X X X
   X X X X
   X X X X
   X O X X
 */
public class o130_Solve {
    public void solve(char[][] board) {
        if(board == null || board.length == 0)
            return;
        int row = board.length;
        int column = board[0].length;

    }
}
