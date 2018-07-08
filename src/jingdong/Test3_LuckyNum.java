package jingdong;

import java.util.Scanner;

/*小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知道，在日常生活中我们最常用的是十进制数，
而在计算机中，二进制数也很常用。现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。
f(x)表示把x这个数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位
上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，
他把这种数称为幸运数，现在他想知道，小于等于n的幸运数有多少个？*/
public class Test3_LuckyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++) {
            int num_Of_Ten = i;
            int num_Of_Two = i;
            int f = 0;
            int g = 0;
            while (true) {
                f += num_Of_Ten % 10;
                num_Of_Ten = num_Of_Ten / 10;
                if (num_Of_Ten == 0)
                    break;
            }
            while (true) {
                g += num_Of_Two % 2;
                num_Of_Two = num_Of_Two / 2;
                if (num_Of_Two == 0)
                    break;
            }
            if (f == g)
                sum++;
        }
        System.out.println(sum -1);
    }
}
