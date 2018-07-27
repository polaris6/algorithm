package offer;

/**
 * 题目描述：
 * 在一个排序的链表中，存在重复的节点，删除该链表中重复的节点，重复的节点不保留，返回链表头节点
 * 例如：1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 处理后为 1 -> 2 -> 5
 */
public class o18_2_DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null)
            return pHead;
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode output = first;
        while (pHead != null && pHead.next != null) {
            if (pHead.val == pHead.next.val) {
                int val = pHead.val;
                while (pHead!= null && pHead.val == val)
                    pHead = pHead.next;
                first.next = pHead;
            }else{
                first = pHead;
                pHead = pHead.next;
            }
        }
        return output.next;
    }
}
