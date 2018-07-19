package offer;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 我的做法是 Math.pow(base,exponent);但是手撕算法的时候不能这样写
 */

import java.util.Scanner;

public class o16_Power {
    public static double Power(double base, int exponent){
        return Math.pow(base,exponent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        int exponent = sc.nextInt();
        System.out.println(Power(base,exponent));
    }
}
