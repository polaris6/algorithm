package leetcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        nums[0] = sc.nextInt();
        for(int i = 1;i < n;i++)
            nums[i] = nums[i - 1] + sc.nextInt();
        int m = sc.nextInt();
        int[] mNums = new int[m];
        for(int i = 0;i < m;i++)
            mNums[i] = sc.nextInt();
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(mNums[i] <= nums[j]){
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
