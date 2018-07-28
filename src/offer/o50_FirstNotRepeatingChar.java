package offer;

import java.util.HashMap;

/**
 * 题目描述：
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符，并返回它的位置，
 * 如果没有则返回 -1（需要区分大小写）
 */
public class o50_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.get(c) != null)
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        for(int i = 0;i < str.length();i++){
            if(map.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
