package offer;

/**
 * 题目描述：二叉搜索树的第k小节点
 * 给定一棵二叉搜索树，找出其中第k小的节点
 *
 * 思路：如果按照中序遍历的顺序遍历一棵二叉搜索树，则遍历序列的数值是递增排序的。所以只需用中序遍历遍历一次就行。
 */
public class o54_KthNode {

    int index = 0;          //记录当前访问了的节点个数，不能放方法里面

    public TreeNode kthNode(TreeNode root, int k){
        if(root != null){
            TreeNode left = kthNode(root.left, k);
            if(left != null)
                return left;
            index++;
            if(index == k)
                return root;
            TreeNode right = kthNode(root.right, k);
            if(right != null)
                return right;
        }
        return null;
    }
}
