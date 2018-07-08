package wangyi;

import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder num1 = new StringBuilder();
        num1.append(n);
        String num2 = num1.reverse().toString();
        int m = Integer.parseInt(num2);
        System.out.println(n+m);
    }
}
