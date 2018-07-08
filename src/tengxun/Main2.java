package tengxun;
/*
有长度为A的歌曲X首，长度为B的歌曲Y首，求能组成总长度为K的歌曲数
输入：5
      2 3 3 3
输出：9
 */
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int X = sc.nextInt();
        int B = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=X;i++){
            for(int j=0;j<=Y;j++){
                if(i*A + j*B == K)
                    sum += C(i,X)*C(j,Y);
            }
        }
        System.out.println(sum);
    }

    public static int C(int m,int n){   //这是组合数
        return factorial(n)/(factorial(n-m)*factorial(m));
    }
    public static int factorial(int n){   //这是阶乘
        int sum = 1;
        if(n>1)
            for(int i=1;i<=n;i++){
                sum *= i;
            }
        return sum;
    }
}
