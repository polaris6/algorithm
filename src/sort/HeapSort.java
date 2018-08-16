package sort;

public class HeapSort {
    public void heapSort(int[] arr){
        //1.构建大顶堆
        for(int i = arr.length/2-1;i>=0;i--)
            //从最后一个非叶子结点从右至左，从下至上调整结构
            adjustHeap(arr,i,arr.length);
        //2.将根节点元素和末尾元素互换，调整堆结构
        for(int j = arr.length-1;j>0;j--){
            swap(arr, 0, j);        //将堆顶元素与末尾元素进行交换
            adjustHeap(arr, 0, j);   //重新对堆进行调整
        }
    }
    //调整大顶堆
    public void adjustHeap(int[] arr, int i,int length){
        int temp = arr[i];
        for(int k = 2*i+1;k<length;k = k*2+1){
            if(k+1<length && arr[k]<arr[k+1])
                k++;
            if(temp < arr[k]){
                arr[i] = arr[k];
                i = k;
            }else
                break;
        }
        arr[i] = temp;
    }
    //交换元素
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}