package sort;

import java.util.HashMap;

public class Sort {
    public static int[] sort(int[] arr1,int[] arr2) {
        int[] temp = new int[arr1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<=arr1.length &&j<=arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            }
            else if(arr1[i] > arr2[j]) {
                j++;
            }else{
                i++;
                j++;
            }
        }
        return temp;
    }
}

