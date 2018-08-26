package offer;

import java.util.ArrayList;

/**
 * 题目描述：顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 * 例如输入如下4*4矩阵：1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class o29_PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0)
            return list;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(true){
            for(int i = left;i <= right;i++)
                list.add(matrix[top][i]);    //打印最上边一行
            top++;
            if(left > right || top > bottom)
                break;

            for(int i = top;i <= bottom;i++)
                list.add(matrix[i][right]);  //打印最右边一列
            right--;
            if(left > right || top > bottom)
                break;

            for(int i = right;i >= left;i--)
                list.add(matrix[bottom][i]); //打印最下边一行
            bottom--;
            if(left > right || top > bottom)
                break;

            for(int i = bottom;i >= top;i--)
                list.add(matrix[i][left]);   //打印最左边一列
            left++;
            if(left > right || top > bottom)
                break;
        }
        return list;
    }
}
