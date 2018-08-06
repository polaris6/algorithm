package pinduoduo;

import java.util.Scanner;

/**
 * abcdefghijklmnop   k = 4
 * abcde   k + 1
   p   f
   o   g
   n   h
   mlkji   k + 1
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = str.length() / 4;
        System.out.println(str.substring(0, k + 1));
        for(int i = 0;i < k - 1;i++) {
            System.out.print(str.charAt(4 * k - i - 1));
            for(int j = 0;j < k - 1;j++)
                System.out.print(" ");
            System.out.println(str.charAt(k + i + 1));
        }
        StringBuffer s = new StringBuffer(str.substring(2 * k, 3 * k + 1));
        System.out.println(s.reverse());
    }
}
