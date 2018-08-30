package leetcode;

import java.util.HashMap;

/**
 * 题目描述：无重复字符的最长子串
 * 给一个字符串，返回它的不包含重复字符的最长子串的长度，假设字符串只包含'a'-'z'的字符
 * 例如："arabcacfr"，最长子串是'rabc'和'acfr'，长度为4
 *
 * 思路：
 * 用一个HashMap做辅助，字符为key，这个字符最近一次出现的位置为value；head是当前不包含重复字符的子串的头指针
 * 每次执行到位置为i的字符时，先判断HashMap中有没有这个字符，如果有这个字符的话，分两种情况：
 * 1、HashMap中的这个重复字符出现在head到i的子串之前，此时不用管
 * 2、HashMap中的这个重复字符出现在head到i的子串中，此时让重复字符的后一个位置成为头指针head
 */
public class o3_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        if(s == null || s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0, head = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                head = Math.max(head, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - head + 1);
        }
        return max;
    }
}
