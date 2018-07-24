package offer;

import java.util.Stack;
/**
 * 题目描述：
 * 定义栈的数据结构，在该类型中实现一个能够找到栈的最小元素的min函数。在该栈中，调用min、push及pop的时间复杂度都是o(1)
 *
 * 思路：
 * 引入一个辅助栈，用于保存每次压栈操作时栈中的最小元素，这样辅助栈的栈顶一直都是最小元素。当弹栈时，同时弹出辅助栈的
 * 栈顶元素
 */
public class o30_StackWithMin {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> assistStack = new Stack<>();
    int minNum;

    public void push(int node) {
        if(stack.empty())
            minNum = node;
        else
            minNum = minNum > node ? node : minNum;
        stack.push(node);
        assistStack.push(minNum);
    }

    public void pop() {
        stack.pop();
        assistStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return assistStack.peek();
    }
}
