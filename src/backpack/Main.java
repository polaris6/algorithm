package backpack;

import java.util.Scanner;
//1 4 5 6 7 8 10 11 12 14 18
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] num = s.split("\\s+");
        int[] nums = new int[num.length];
        for(int i = 0;i < nums.length;i++)
            nums[i] = Integer.parseInt(num[i]);
        int index = 0;
        int output = 0;
        int max = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i - 1] + 1) {
                if(i + 1 - index > max) {
                    max = i + 1 - index;
                    output = index;
                }
            }
            else
                index = i;
        }
        System.out.println("[" + nums[output] + ", " + max + "]");
    }
}
