package wangyi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Piece_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int temp = arr[0];
        int piece = 1;
        DecimalFormat df = new DecimalFormat("#.00");
        for(int i=1;i<arr.length;i++){
            if(arr[i] != temp){
                temp = arr[i];
                piece++;
            }
        }
        System.out.println(df.format((float)arr.length/(float)piece));
    }
}
