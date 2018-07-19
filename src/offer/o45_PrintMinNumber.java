package offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */

/**
我没想出来好的方法，渣渣
下面是别人的方法:
 * 解题思路：
 * 先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。关键就是制定排序规则。
 * 排序规则如下：
 * 若ab > ba 则 a > b，
 * 若ab < ba 则 a < b，
 * 若ab = ba 则 a = b；
 * 解释说明：
 * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
 */
public class o45_PrintMinNumber {
    public static String printMinNumber(int [] numbers) {
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++)
            str[i] = String.valueOf(numbers[i]);
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for(int i=0;i<len;i++)
            sb.append(str[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //先输入数组的长度n
        int[] nums = new int[n];
        for(int i = 0;i<n;i++)
            nums[i] = sc.nextInt();
        System.out.println(printMinNumber(nums).toString());
    }
}
