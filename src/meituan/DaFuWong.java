package meituan;

import java.util.Scanner;

public class DaFuWong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(step_Number(n));
    }

    public static int step_Number(int n) {
        int sum = 0;
        if(n ==1)
            sum = 1;
        if(n >= 2){
            for(int i = n-1;i>0;i--){
                sum += step_Number(i);
            }
            sum++;
        }
        return sum;
    }
}

