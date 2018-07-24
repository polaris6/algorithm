package offer;

/**
 * 题目描述：
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S="abcXYZdef"，要求输出循环左移3位后的结果，
 * 即“XYZdefabc”
 */
public class o58_2_LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.equals(""))
            return "";
        return str.substring(n, str.length()) + str.substring(0, n);
    }
}
