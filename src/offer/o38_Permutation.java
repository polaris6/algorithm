package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题目描述：字符串的排列
 * 输入一个字符串，按字典序打印出该字符串中字符的所有排列。例如输入字符串abc，则打印出由字符a、b、c所能排列出来的所有
 * 字符串abc、acb、bac、bca、cab和cba。
 * 输入描述：
 * 输入一个字符串，长度不超过9(可能有字符重复)，字符只包括大小写字母。
 */
public class o38_Permutation {
    public ArrayList<String> permutation(String str) {
        List<String> res = new ArrayList<>();
        if(str != null && str.length() > 0){
            permutationHelper(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return (ArrayList)res;
    }

    public void permutationHelper(char[] cs, int i, List<String> list){
        if(i == cs.length - 1) {
            if (!list.contains(new String(cs)))
                list.add(new String(cs));
        }else{
            for(int j = i;j < cs.length;j++){
                swap(cs, i, j);
                permutationHelper(cs, i+1, list);
                swap(cs, i, j);
            }
        }
    }

    public void swap(char[] cs, int i, int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
