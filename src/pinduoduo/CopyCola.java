package pinduoduo;

import java.util.Scanner;

/**
 * 题目描述：
 * 喝了复制可乐的人会复制出一个自己来，现在Alice,Bob,Cathy,Dace四个人排队买复制可乐，买完的马上喝掉，然后他和他的副本
 * 会重新去队伍的最后面排队，问最后一个买到复制可乐的人叫什么名字？
 *
 * 输入可乐的数量，输出买最后一瓶可乐的人名。例如输入8，输出为Bob
 */
public class CopyCola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = {"Alice", "Bob", "Cathy", "Dave"};
        int currColaDrunk = 0;
        int copyPersonNumber = 1;
        while(true){
            int judge = 0;
            for(int i = 0; i < 4; i++){
                currColaDrunk += copyPersonNumber;
                if(currColaDrunk >= n){
                    System.out.println(names[i]);
                    judge = 1;
                    break;
                }
            }
            if(judge == 1){
                break;
            }
            copyPersonNumber *= 2;
        }
    }
}
