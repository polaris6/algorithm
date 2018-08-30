package sort;

public class MergeSort{
    public void mergeSort(int[] arr,int low,int high ){
        int mid = (low + high)/2;
        if(low < high){
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while(i <= mid)
            temp[k++] = arr[i++];
        while(j <= high)
            temp[k++] = arr[j++];
        for(int x = 0; x < temp.length; x++)
            arr[x + low] = temp[x];
    }
}
