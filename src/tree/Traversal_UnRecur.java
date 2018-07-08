package tree;

import java.util.Stack;

/**
 * 用非递归的方式实现二叉树的前序、中序和后序遍历
 * 用递归方法解决的问题都能用非递归的方法实现，可以用自己申请的数据结构来代替函数栈，可以实现相同的功能。
 */
public class Traversal_UnRecur {
    /**
     * 前序遍历具体过程如下：
     * 1、申请一个新的栈stack，然后将根节点root 压入stack中。
     * 2、从stack中弹出栈顶节点，然后打印这个节点的值，再将这个节点的右孩子（如果存在）先压入stack中，最后将这个节点的
     * 左孩子（如果存在）压入stack中。
     * 3、不断重复步骤2，直到stack为空。
     */
    public void preOrderUnRecur(Node root){
        if(root != null){
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.empty()){
                root = stack.pop();
                System.out.print(root.value + " ");
                if(root.right != null)
                    stack.push(root.right);
                if(root.left != null)
                    stack.push(root.left);
            }
        }
    }

    /**
     * 中序遍历具体过程如下：
     * 1、申请一个新的栈stack。
     * 2、先把root节点压入栈中，对以root节点为根的整棵子树来说，依次把左孩子压入栈中，即root = root.left; 重复步骤2
     * 直至root 为null。
     * 3、从stack中弹出栈顶节点，打印这个节点的值，并且让root = root.right;
     * 4、不断重复直至stack为空
     */
    public void inOrderUnRecur(Node root){
        if(root != null){
            Stack<Node> stack = new Stack<>();
            while(!stack.empty() || root != null){
                if(root != null){
                    stack.push(root);
                    root = root.left;
                }else {
                    root = stack.pop();
                    System.out.print(root.value + " ");
                    root = root.right;
                }
            }
        }
    }

    /**
     * 用两个栈实现后序遍历：
     * 1、申请一个栈s1，然后将根节点root压入s1。
     * 2、从s1弹出栈顶节点root ，将这个节点压入s2。
     * 3、将这个节点的左孩子和右孩子依次压入s1。
     * 4、不断重复步骤2和3，直至s1为空。
     * 5、从s2中依次弹出节点并打印。
     *
     * 左右根的反过程是根右左，使用前序遍历根左右（左右位置互换）的方法将节点弹出压入到s2中，则从s2中弹出节点并打印的
     * 顺序就是后序遍历的顺序。
     */
    public void postOrderUnRecur(Node root){
        if(root != null){
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            s1.push(root);
            while(!s1.empty()){
                root = s1.pop();
                s2.push(root);
                if(root.left != null)
                    s1.push(root.left);
                if(root.right != null)
                    s1.push(root.right);
            }
            while(!s2.empty())
                System.out.print(s2.pop().value + " ");
        }
    }
}
