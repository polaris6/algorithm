package offer;

/**
 * 题目描述：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 思路：首先选取数组中右上角的数字。如果该数字等于要查找的数字，则查找过程结束；如果该数字大于要查找的数字，则删除这个
 * 数字所在的列；如果该数字小于要查找的数字，则删除这个数字所在的行。
 */
public class o4_Find {
    public boolean find(int target,int[][] array){
        if(array == null || array.length == 0)
            return false;
        int row = array.length;
        int column = array[0].length;
        int i = 0;
        int j = column-1;
        boolean flag = false;
        while(i<row && j>=0) {
            if(array[i][j] == target) {
                flag = true;
                break;
            }else if(array[i][j] > target)
                j--;     //删除最右边这一列
            else
                i++;     //删除最上边这一行
        }
        return flag;
    }
}
