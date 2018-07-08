package meituan;

import java.util.Scanner;

//给一些‘0’到‘9’的字符，这些字符不能组成的最小正整数是多少
public class Min_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int[] nums = new int[10];

        for(int i=0;i<arr.length;i++)
            nums[arr[i] - '0']++;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=1;i<10;i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        String result = new String();
        if(min==0 && minIndex!=0)
            System.out.println(minIndex);
        else{
            if(nums[0] < min){
                result += "1";
                for(int i=0;i<=nums[0];i++)
                    result +="0";
            }
            else{
                for(int i=0;i<=min;i++)
                    result += (char)(minIndex+'0');
            }
            System.out.println(result);
        }
    }
}
