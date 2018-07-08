package stack;

import java.util.Stack;

/*
编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
思路：栈的特点是先进后出，队列的特点是先进先出，用两个栈正好能把顺序反过来实现队列的操作
大师版：stackPush作为压入栈，stackPop作为弹出栈。入队时，将元素压入stackPush。出队时，判断stackPop是否为空，
如果不为空，则直接弹出；如果为空，则将stackPush的元素倒入stackPop，弹出栈顶元素。
 */
public class TwoStacksQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStacksQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void add(int value) {
        stackPush.push(value);
    }

    public int poll(){
        if(stackPop.empty() && stackPush.empty())
            throw new RuntimeException("Queue is empty");
        else if(stackPop.empty()){
            while(!stackPush.empty())
                stackPop.push(stackPush.pop());
        }
        return stackPop.pop();
    }

    private int peek(){
        if(stackPop.empty() && stackPush.empty())
            throw new RuntimeException("Queue is empty");
        else if(stackPop.empty()){
            while(!stackPush.empty())
                stackPop.push(stackPush.pop());
        }
        return stackPop.peek();
    }
}
