package pinduoduo;

import java.util.Scanner;

/**
 * 1234  1,234  12,34  123,4  1.2,3.4  1.2,34  1,2.34  123,4
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        int sum = 0;
        if(str.charAt(0) != '0'){
            if(str.charAt(1) != '0' && str.charAt(length - 1) != '0')
                sum = sum + 2;
            else if(str.charAt(1) == '0' || str.charAt(length - 1) == '0')
                sum = sum + 1;
            if(str.charAt(length - 2) != '0')
                sum = sum + 2;
            else
                sum = sum + 1;
            if(str.length() == 4){
                if(str.charAt(2) != 0)
                    sum = 8;
                else
                    sum = 6;
            }
            if(str.length() > 4) {
                for (int i = 2; i < str.length() - 1; i++) {
                    if (str.charAt(length - 2) != '0') {
                        if (str.charAt(i) != '0' && str.charAt(i - 1) != '0')
                            sum = sum + 4;
                        else if (str.charAt(i) != '0' || str.charAt(i - 1) != '0')
                            sum = sum + 3;
                        else
                            sum = sum + 2;
                    }else{
                        if (str.charAt(i) != '0' && str.charAt(i - 1) != '0')
                            sum = sum + 3;
                        else if (str.charAt(i) != '0' || str.charAt(i - 1) != '0')
                            sum = sum + 2;
                        else
                            sum = sum + 1;
                    }
                }
            }
        }else{
            sum = 2;
        }
        System.out.println(sum);
    }
}
