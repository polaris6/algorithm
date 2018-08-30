package offer;

/**
 * 题目描述：
 * 如果一个链表包含环，找出环的入口节点，否则输出null
 *              __________________
 *             |                 |
 * 1 —> 2 —> 3 —> 4 —> 5 —> 6
 *
 * 思路：
 * 1、先确定链表是否有环，设置两个指针，都从头节点开始走，一个指针走一步，另一个走两步，如果能相遇就是有环（类似操场套圈）
 * 2、找到环的入口，需先求环的长度，上一步两个指针相遇的地方一定是在环中，一个指针继续走，当再回到这个节点时走的步数就是
 * 环的长度length；之后设置两个新指针，一个从头节点开始先走length步，然后两指针每次一步同时走直到相遇，这个相遇的节点
 * 就是环的入口
 *
 * 改进思路：
 * 第2步不用求环的长度，因为快指针走两步慢指针走一步，设相遇的时候慢指针走了X，则快指针走了2X，因为此时套圈了，所以
 * 2X - X = length，即两指针现在相遇的位置正好距头节点距离为length，所以让其中一个指针回到头节点，然后两指针每次一步
 * 同时走直到相遇，这个相遇的节点就是环的入口
 */
public class o23_EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode head) {
        ListNode first = head, second = head;
        boolean flag = false;
        while(first.next != null){
            first = first.next.next;
            second = second.next;
            if(first == second) {
                flag = true;
                break;
            }
        }
        if(!flag)
            return null;
        first = head;
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}
