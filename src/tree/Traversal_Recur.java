package tree;

/**
 * 用递归的方式实现二叉树的前序、中序和后序遍历，recursion递归
 */
public class Traversal_Recur {
    //前序递归遍历，根左右
    public void preOrderRecur(TreeNode root){
        if(root == null)
            return;         //return;用于void函数的返回，不返回任何值，但是可以在此处结束该函数
        System.out.print(root.value + " ");
        preOrderRecur(root.left);
        preOrderRecur(root.right);
    }

    //中序递归遍历，左根右
    public void inOrderRecur(TreeNode root){
        if(root == null)
            return;
        inOrderRecur(root.left);
        System.out.print(root.value + " ");
        inOrderRecur(root.right);
    }

    //后序递归遍历，左右根
    public void postOrderRecur(TreeNode root){
        if(root == null)
            return;
        postOrderRecur(root.left);
        postOrderRecur(root.right);
        System.out.print(root.value + " ");
    }
}
