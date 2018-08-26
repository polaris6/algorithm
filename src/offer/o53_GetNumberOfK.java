package offer;

/**
 * 题目描述：
 * 统计一个数字在排序数组中出现的次数，例如{1,2,3,3,3,3,4,5}应该返回4
 *
 * 解题思路：
 * 因为传入的是整型数组，可以变一下，不是获得k的位置，而是获得 k+0.5 和 k-0.5 这两个数应该插入的位置，
 * 然后两位置相减即得次数
 */
public class o53_GetNumberOfK {
    public int getNumberOfK(int[] array, int k) {
        if(array == null || array.length == 0)
            return 0;
        return getIndex(array,k+0.5) - getIndex(array, k-0.5);
    }

    public int getIndex(int[] array, double num){
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(array[mid] < num)
                left = mid + 1;
            else if(array[mid] > num)
                right = mid - 1;
        }
        return left;
    }
}
