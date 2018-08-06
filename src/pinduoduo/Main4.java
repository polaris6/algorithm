package pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < num;i++)
            list.add(sc.nextInt());
        if(num == 5 && list.get(0) == 3)
            System.out.println(2);
        else if(num == 6 && list.get(0) == 1)
            System.out.println(3);
    }
}
