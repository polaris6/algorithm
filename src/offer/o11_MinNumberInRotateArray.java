package offer;

/**
 * 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。NOTE：给出的所有元素都大于0，
 * 若数组大小为0，请返回0。
 *
 * 常规思路：数组第一个元素设为min，遍历数组，遇到第一个比min小的元素，这个就是最小值，break。
 *
 * offer思路：用二分查找的思想，给两个指针，一个指向头一个指向尾。先判断中间元素，如果中间元素位于前面的递增子数组，那么
 * 它应该大于等于头位置，此时把第一个指针指向中间位置......
 */
public class o11_MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(array[mid] > array[high])
                low = mid+1;
            else if(array[mid] == array[high])
                high = high-1;
            else
                high = mid;
        }
        return array[low];
    }
}
