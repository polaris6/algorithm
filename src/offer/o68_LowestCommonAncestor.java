package offer;

/**
 * 题目描述：二叉树中两个节点的最低公共祖先
 * 给定一个二叉树，找到该树中两个指定节点的最近公共祖先。
 *
 * 思路：用递归做，后序遍历，假设遍历到的当前节点为cur
 * 1、如果cur为null，或者p或q，直接返回cur
 * 2、否则，如果left和right都不为空，说明左子树上发现过p或q，右子树上发现过q或p，p和q在向上的过程中首次在cur相遇，返回cur
 * 3、否则，left和right有一个为空，另一个非空，则直接返回非空的那个节点
 */
public class o68_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)
            return root;
        return left != null ? left : right;
    }
}
