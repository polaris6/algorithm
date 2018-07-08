package wangyi;

import java.util.Scanner;

public class Rearrangement_Of_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int amount = 0;
        while(amount++<t){
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] nums = s.split("\\s+");
            int[] A = new int[n];
            int  multiplier_Of_4 = 0;
            int odd = 0;
            for(int i=0;i<n;i++){
                A[i] = Integer.parseInt(nums[i]);
                if(A[i] % 4 ==0)
                    multiplier_Of_4++;
                if(A[i] % 2 !=0)
                  odd++;
            }
            if(multiplier_Of_4>=odd)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
