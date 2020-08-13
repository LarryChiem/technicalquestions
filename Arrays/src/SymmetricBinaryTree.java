//import javax.swing.tree.TreeNode;
//10.2 TEST IF A BINARY TREE IS SYMMETRIC
//        A binary tree is symmetric if you can draw a vertical line through the root and then
//        the left subtree is the mirror image of the right subtree. The concept of a symmetric
//        binary tree is illustrated in Figure 10.3 on the facing page.
//        Write a program that checks whether a binary tree is symmetric.
//        Hint: The definition of symmetry is recursive.
public class SymmetricBinaryTree extends TreeNode{
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }

    public boolean checkSymmetric(TreeNode subtree0, TreeNode subtree1) {
        if (subtree0 == null && subtree1 == null) {
            return true;
        } else if (subtree0 != null && subtree1 != null) {
            return subtree0.val == subtree1.val
                    && checkSymmetric(subtree0.left, subtree1.right)
                    && checkSymmetric(subtree0.right, subtree1.left);
        }
        // One subtree is empty, the other is not
        return false;

    }
}
//Solution: We can test if a tree is symmetric by computing its mirror image and seeing
//        if the mirror image is equal to the original tree. Computing the mirror image of a tree
//        is as simple as swapping the left and right subtrees, and recursively continuing. The
//        time and space complexity are both 0(n), where n is the number of nodes in the tree.