package jingdong;

import java.util.Scanner;

/*
计算机中经常用不同的进制表示一个数，如十进制数123表达为16进制时只包含两位数7、11（B），
用八进制表示为三位数1、7、3，按不同进制表达时，各个位数的和也不同，如上述例子中十六进制和八进制中各位数的和
分别是18和11,。 小B感兴趣的是，一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少？
 */
public class Test2_JinZhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A = sc.nextInt();
            int sum = 0;
            for(int i=2;i<A;i++){
                int num = A;
                while(true){
                    sum += num % i;
                    num = num / i;
                    if(num == 0)
                        break;
                }
            }
            int B = A-2;
            for(int i=sum/2;i>0;i--){
                if(sum%i==0 && B%i ==0){
                    sum = sum/i;
                    B = B/i;
                    break;
                }
            }
            System.out.println(sum+"/"+B);
        }
    }
}
