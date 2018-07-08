package offer;

import java.util.Stack;

/**
 * 题目描述：
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2 就不可能是该压栈序列的
 * 弹出序列。（注意：这两个序列的长度是相等的）。
 *
 * 写出来了，但是特么写的跟shi一样，下面是大神的写法
 *
 * 解题思路：建立一个辅助栈，遍历压栈序列，先将第一个放入栈中，这里是1，然后判断栈顶元素是不是弹出序列的第一个元素，
 * 这里是4，很显然1≠4，所以我们继续压栈，直到相等以后开始出栈，出栈一个元素，则将弹出序列向后移动一位，直到不相等，
 * 这样循环等压栈序列遍历完成，如果辅助栈还不为空，说明弹出序列不是该栈的弹出序列。
 * 举例：
 * 入栈1,2,3,4,5
 * 出栈4,5,3,2,1
 * 首先1入辅助栈，此时栈顶1≠4，继续入栈2
 * 此时栈顶2≠4，继续入栈3
 * 此时栈顶3≠4，继续入栈4
 * 此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3
 * 此时栈顶3≠5，继续入栈5
 * 此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3
 * 依次执行，最后辅助栈为空。如果不为空说明弹出序列不是该栈的弹出顺序。
 */

public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if(pushA.length==0 || popA.length==0)
            return false;
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
