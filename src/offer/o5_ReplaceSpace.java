package offer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * 我的代码没通过
 * ①：我第一次做的错误：我的思路是按空格分割为String数组，然后在数组每两个元素中间+ %20，但是我忽略了字符串头和尾是
 * 空格的情况比如"helloworld "，应该输出"helloworld%20"，但是我的输出为"helloworld"。
 * ②：第二次做的错误：判断str的开头和末尾是不是空格，如果是，则在ss的前面或后面加上%20，但是：后面的%20一直加不上，
 * 我是通过str.substring(0,1)=="\\s"比较的，应该是nextLine()读入数据的问题，改用str.charAt(0)==" "就好了。
 * ③：下面是别人的方法，我还是想太多了，因为我的方法一直没通过，全用char型比较好。
 */

public class o5_ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if(str == null || str.length() == 0)
            return "";
        StringBuilder sbu = new StringBuilder();
        for(int i = 0;i<str.length();i++) {
            if (str.charAt(i) == ' '){
                sbu.append('%');
                sbu.append('2');
                sbu.append('0');
            }else
                sbu.append(str.charAt(i));
        }
        return sbu.toString();
    }
}
