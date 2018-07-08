package offer;
/**
 * 题目描述：输入一个链表的头结点，从尾到头反过来打印链表每个节点的值。
 * 解题思路：遍历链表，最后一个节点的值第一个输出，典型的“后进先出”，所以引入一个辅助栈，遍历节点压栈，压完弹栈。
 */

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(!stack.empty())
            arrayList.add(stack.pop());
        return arrayList;
    }
}
