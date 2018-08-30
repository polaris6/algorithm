package offer;

/**
 * 题目描述：
 * 输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 *
 * 思路：
 * a -> b -> .... -> h -> i -> j -> ...
 * a <- b <- .... <- h <- i    j <- ...
 * 假设节点 h 之前的指针都已经调整完毕，现在需要把节点 i 的指针指向 h，所以我们需要把 i 之前的 h 节点保存下来；
 * 现在我们把 i 节点的指针指向了 h，那么在 i 节点和 j 节点之间会出现断裂，所以需要事先保存 i 之后的节点 j；
 * 因此我们需要保存3个节点，当前节点、它的前一个节点、它的后一个节点
 */
public class o24_ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}