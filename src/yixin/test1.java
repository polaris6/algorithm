package yixin;

import java.util.TreeSet;

//0-n之间的自然数，少了其中一个，怎么找到少的那个（没说顺序，可能是无序的）
public class test1 {
    public static void main(String[] args) {
        int[] array = {3,7,1,9,11,13,2,0,4,6,10,12,5,14};
        int n = 14;
        System.out.println(find_Miss_Num_By_Sum(array, n));
        System.out.println(find_Miss_Number_By_XOR(array,n));
        System.out.println(find_Miss_Num_By_Sort(array, n));
        TreeSet<String> ts = new TreeSet<>();
        ts.iterator();
    }
    //①：求和，可能会造成内存溢出
    public static int find_Miss_Num_By_Sum(int []a, int n){
        int sum = 0;
        for (int i : a)
            sum += i;
        return n*(n+1)/2 - sum;
    }
    /*②：
    使用亦或方法，任何数异或自己都等于0，任何数异或0都等于他自己
    Y＝1^2^3...^N，然后遍历数列每次异或当前的数字，最后剩下的就是要求的数字
    类似于先所有数加一起，然后逐个减
     */
    public static int find_Miss_Number_By_XOR(int []a, int n){
        int result = 0;
        for(int i = 0;i<=n;i++)
            result = result ^ i;
        for(int i = 0;i<a.length;i++)
            result = result ^ a[i];
        return result;
    }
    //③：因为数组是无序的，先将a[i]移动到b[a[i]]，使得数组有序，然后找出空着的位置
    public static int find_Miss_Num_By_Sort(int []a, int n) {
        int result = 0;
        int []b = new int[a.length + 1];
        for (int i=0;i<a.length;i++)
            b[a[i]] = a[i];
        for (int i=0;i<b.length;i++){
            if (b[i] == 0 && i!= 0){
                result = i;
                break;
            }
        }
        return result;
    }

}
