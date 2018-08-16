package sort;

public class BinarySearch {
    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;
        while(left <= right){
            middle = (left + right)/2;
            if(arr[middle] == target)
                return middle;
            else if(arr[middle] > target)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
}
