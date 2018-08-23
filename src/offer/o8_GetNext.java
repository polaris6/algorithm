package offer;

/**
 * 题目描述：二叉树的下一个节点
 * 给定一个二叉树和其中的一个结点，请找出中序遍历序列的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含
 * 指向父结点的指针。
 */
public class o8_GetNext {
    public TreeLinkNode getNext(TreeLinkNode pNode) {
        if(pNode == null)
            return null;
        if(pNode.right != null){            //如果有右子树，找右子树的最左节点
            pNode = pNode.right;
            while(pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        while(pNode.next != null){          //如果没有右子树，就从父节点往上找，直到找到其父节点的左子节点等于本身
            if(pNode.next.left == pNode)
                return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }
}
