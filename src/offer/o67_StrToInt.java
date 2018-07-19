package offer;

/**
 * 题目描述：
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 *
 * 输入描述：输入一个字符串,包括数字字母符号,可以为空
 * 输出描述：如果是合法的数值表达则返回该数字，否则返回0
 *
 * 注意几点：
 * 1、功能测试：输入的字符串表示正数、负数和0
 * 2、边界值测试：int型范围为 -2147483648 ~ 2147483647
 * 3、特殊输入测试：输入null值或空字符串
 */
public class o67_StrToInt {
    public int StrToInt(String str) {
        if(str == null || str.equals(""))
            return 0;
        int num = 0;
        char firstChar = str.charAt(0);
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) < 48 || str.charAt(i) > 58){
                if(i != 0)
                    return 0;
                else if(str.charAt(i) == '+' || str.charAt(i) == '-')
                    continue;
                }
        }

        if(firstChar == '-') {
            for (int i = str.length() - 1; i > 0; i--) {
                num -= Math.pow(10, str.length() - 1 - i) * (str.charAt(i) - '0');
            }
        }
        else if(firstChar == '+'){
            for (int i = str.length() - 1; i > 0; i--) {
                num += Math.pow(10, str.length() - 1 - i) * (str.charAt(i) - '0');
            }
        }
        else if(firstChar >= 48 && firstChar <= 57) {
            for (int i = str.length() - 1; i >= 0; i--) {
                num += Math.pow(10, str.length() - 1 - i) * (str.charAt(i) - '0');
            }
        }

        return num;
    }
}
