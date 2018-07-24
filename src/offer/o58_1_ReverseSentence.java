package offer;

/**
 * 题目描述：
 * 输入一个英文句子，翻转句子中单词的顺序，单词内字符的顺序不变，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student." ，输出"student. a am I"
 */
public class o58_1_ReverseSentence {
    public String ReverseSentence(String str) {
        if(str == null || str.equals(""))
            return "";
        String output = "";
        String[] words = str.split("\\s+");
        if(words.length == 0)
            return str;
        for(int i = words.length - 1; i >= 0; i--)
            output += words[i] + " ";
        return output.substring(0,output.length() - 1);
    }
}
