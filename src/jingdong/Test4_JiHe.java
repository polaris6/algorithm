package jingdong;

import java.util.Scanner;
import java.util.TreeSet;

public class Test4_JiHe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n = s1.charAt(0) -48;
        int m = s1.charAt(2) -48;
        String [] numbers_Of_A = sc.nextLine().split("\\s++");
        String [] numbers_Of_B = sc.nextLine().split("\\s++");
        TreeSet<Integer> ts = new TreeSet<>();
        for(String s:numbers_Of_A)
            ts.add(Integer.parseInt(s));
        for(String s:numbers_Of_B)
            ts.add(Integer.parseInt(s));
        System.out.print(ts.first());
        ts.remove(ts.first());
        for(Integer i:ts)
            System.out.print(" "+i);
    }
}
