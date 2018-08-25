package sort;

public class Sort {
    public void quickSort(int[] arr, int left, int right){
        if(left < right){
            dealPivot(arr, left, right);
            int i = left;
            int j = right - 1;
            int pivot = right - 1;
            while(true) {
                while (arr[++i] < arr[pivot]) {
                }
                while (j > left && arr[--j] > arr[pivot]) {
                }
                if (i < j)
                    swap(arr, i, j);
                else
                    break;
            }
            if(i < right)
                swap(arr, i, pivot);
            quickSort(arr, left, i-1);
            quickSort(arr, i+1,right);
        }
    }
    public void dealPivot(int[] arr, int left, int right){
        int mid = (left + right)/2;
        if(arr[left] > arr[mid])
            swap(arr, left, mid);
        if(arr[left] > arr[right])
            swap(arr, left, right);
        if(arr[mid] > arr[right])
            swap(arr, mid, right);
        swap(arr, mid, right-1);
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}