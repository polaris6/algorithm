package souhu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 一定要灵活使用HashMap这种键值对的集合
 *
 * 题目描述：会员成长值公式为：会员成长值= 每天成长值+ 任务成长值。输入一组数组，第一行是n，表示接下来有n行数据输入，
 * 从第二行开始，如果第一个是1，则该行有4个数据，第一个1表示每日成长规则，第二个数字表示开始日，第三个数字表示截止日，
 * 第四个数字表示每日成长值。如果第一个数字是2，则该行总共有3个数字，第二个数字表示某一天做任务，第三个数字表示
 * 任务成长值。两种形式，每日成长和任务成长分别有时间重叠，则以成长值最大值为准。
 * 输入示例：
 * 3
 * 1 1 5 10
 * 2 3 4
 * 1 4 6 -5
 * 输出：49
 *
 * 我用的数组，结果没写出来，一定要学会用HashMap这种数据结构
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hmp1 = new HashMap<>();
        HashMap<Integer,Integer> hmp2 = new HashMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int flag = sc.nextInt();
            if(flag == 1){
                int begin = sc.nextInt();
                int end = sc.nextInt();
                int value = sc.nextInt();
                for(int j=begin;j<=end;j++){
                    if(hmp1.containsKey(j))
                        hmp1.put(j,Math.max(value,hmp1.get(j)));
                    else
                        hmp1.put(j,value);
                }
            }
            if(flag == 2){
                int day = sc.nextInt();
                int value = sc.nextInt();
                if(hmp2.containsKey(day))
                    hmp2.put(day,Math.max(value,hmp2.get(day)));
                else
                    hmp2.put(day,value);
            }
        }
        Object[] values1 = hmp1.values().toArray();
        Object[] values2 = hmp2.values().toArray();
        int sum = 0;
        for(Object o:values1)
            sum += (int)o;
        for(Object o:values2) {
            sum += (int) o;
        }
        System.out.println(sum);
    }
}
