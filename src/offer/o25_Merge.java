package offer;

/**
 * 题目描述：
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点依然是递增排序的
 *
 * 思路：
 * 用递归做，每次递归取出此时所有剩余节点中的最小节点，并与前一个节点做连接
 */
public class o25_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list2.next, list1);
            return list2;
        }
    }
}
