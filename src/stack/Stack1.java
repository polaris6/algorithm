package stack;
/*
java代码实现栈
 */
public class Stack1 {
    private int maxSize;    //栈的大小
    private int top;        //栈顶
    private char[] arr;     //栈中的元素

    public Stack1(int size){
        maxSize = size;
        top = -1;
        arr = new char[maxSize];
    }

    public void push(char value){     //压入数据
        arr[++top] = value;
    }
    public char pop(){                 //弹出数据
        return arr[top--];
    }

    public char peek(){               //访问栈顶元素
        return arr[top];
    }

    public boolean isFull(){          //判断栈是否满了
        return maxSize-1 == top;
    }
    public boolean isEmpty(){         //判断栈是否为空
        return top == -1;
    }
}
