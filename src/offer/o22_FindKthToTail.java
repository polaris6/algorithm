package offer;

/**
 * 题目描述：
 * 输入一个链表，输出该链表中倒数第k个结点。链表从1开始计数，即链表的尾节点是倒数第1个节点。例如一个链表有6个节点，从
 * 头节点开始它们的值依次为1、2、3、4、5、6，那么倒数第3个节点是值为4的节点
 *
 * 思路：
 * 设置两个指针，第一个指针从头节点开始先走k-1步，第二个指针在头节点保持不动；第一个指针到第k步的时候第二个指针开始走，
 * 这样两个指针的间隔为k-1步，当第一个指针到达链表的尾节点时，第二个指针正好指向倒数第k个节点
 *
 * 注意：
 * 1、head为null
 * 2、链表长度小于k
 * 3、k = 0
 */
public class o22_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0)
            return null;
        ListNode first = head, second = head;
        int index = 1;
        while(first.next != null){
            first = first.next;
            index++;
            if(index > k){
                second = second.next;
            }
        }
        return index < k ? null : second;
    }
}