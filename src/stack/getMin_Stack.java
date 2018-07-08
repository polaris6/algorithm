package stack;
/*
实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
要求：1、pop、push、getMin操作的时间复杂度都是O(1)。
      2、设计的栈类型可以使用现成的栈结构。
思路：我们使用两个栈，一个栈用来保存当前栈中的元素，功能就是普通的栈，记为stackData；另一个栈用来保存每一步的最小值，
      记为stackMin。
 */
import java.util.Stack;

public class getMin_Stack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public getMin_Stack(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int value){
        stackData.push(value);
        if(stackMin.isEmpty())
            stackMin.push(value);
        else if(value <= getMin())
            stackMin.push(value);
    }
    public int pop(){
        if(stackData.isEmpty())
            throw new RuntimeException("Your stack is empty");
        int value = stackData.pop();
        if(value == getMin()){
            stackMin.pop();
        }
        return value;
    }
    public int getMin(){
        if(stackMin.isEmpty())
            throw new RuntimeException("Your stack is empty");
        return stackMin.pop();
    }
}
