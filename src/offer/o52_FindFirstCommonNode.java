package offer;

/**
 * 题目描述：输入两个链表，找出它们的第一个公共结点。（单向链表）
 * 思路：遍历两个链表得到它们的长度a和b，长度差为h，长链表先走h个距离，然后比较pHead1 == pHead2，如果不等，两个链表
 * 各走一步接着比较，一直到相同为止，否则返回null。
 * 优化：解法如下，其实不用先遍历两个链表
 */
public class o52_FindFirstCommonNode {
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null)
            return null;
        ListNode a = pHead1;
        ListNode b = pHead2;
        while(a != b){
            a = a == null? pHead2 : a.next;
            b = b == null? pHead1 : b.next;
        }
        return a;
    }
}
