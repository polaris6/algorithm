package offer;

/**
 * 题目描述：
 * 输入一棵二叉树的根节点，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度
 * 为树的深度。
 */
public class o55_TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
