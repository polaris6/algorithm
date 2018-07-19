package niuke;

/**
 * 二分查找
 */
public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        if(n <= 0 || A == null)
            return -1;
        int left = 0, right = n-1;
        while(left < right){
            int mid = (left + right)/2;
            if(val < A[mid]){
                right = mid - 1;
            }else if(val > A[mid])
                left = mid + 1;
            else
                right = mid;
        }
        if(val == A[left])
            return left;
        return -1;
    }
}
