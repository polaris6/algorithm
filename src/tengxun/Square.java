package tengxun;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int m = 0;
        while(m++ < t){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] x = s1.split("\\s+");
            String[] y = s2.split("\\s+");
            int[] x1 = new int[x.length];
            int[] y1 = new int[y.length];
            for(int i=0;i<4;i++){
                x1[i] = Integer.parseInt(x[i]);
                y1[i] = Integer.parseInt(y[i]);
            }
            if((Math.pow((x1[3]-x1[0]),2)+Math.pow((y1[3]-y1[0]),2) == Math.pow((x1[2]-x1[1]),2)+Math.pow((y1[2]-y1[1]),2))
                    && (x1[2]-x1[0])==(y1[3]-y1[2]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
