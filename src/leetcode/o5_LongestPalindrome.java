package leetcode;

/**
 * 题目描述：最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串
 * 例如：输入："babad"，输出："bab"，"aba"也是有效答案
 */
public class o5_LongestPalindrome {
    private int start, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2)
            return s;
        for(int i = 0;i < len - 1;i++) {
            extendPalindrome(s, i, i);          // aba这种情况，从b开始往左右扩展
            extendPalindrome(s, i, i+1);     // abba这种情况
        }
        return s.substring(start, start + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {       // k-1 -(j + 1) + 1 = k - j -1
            start = j + 1;
            maxLen = k - j - 1;
        }
    }
}
