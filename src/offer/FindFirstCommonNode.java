package offer;

/**
 * 题目描述：输入两个链表，找出它们的第一个公共结点。（单向链表）
 * 思路：遍历两个链表得到它们的长度a和b，长度差为h，长链表先走h个距离，然后比较pHead1 == pHead2，如果不等，两个链表
 * 各走一步接着比较，一直到相同为止，否则返回null。
 */
public class FindFirstCommonNode{
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null)
            return null;
        int high = 0;
        int low = 0;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(p1.next != null) {
            high++;
            p1 = p1.next;
        }
        while(p2.next != null) {
            low++;
            p2 = p2.next;
        }
        if(high>=low){
            for(int i=0;i<high-low;i++)
                pHead1 = pHead1.next;
            while(pHead1 != pHead2){
                    pHead1 = pHead1.next;
                    pHead2 = pHead2.next;
            }
        }
        else if(high<low){
            for(int i=0;i<low-high;i++)
                pHead2 = pHead2.next;
            while(pHead1 != pHead2){
                    pHead1 = pHead1.next;
                    pHead2 = pHead2.next;
            }
        }
        return pHead1;
    }
}
