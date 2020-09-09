import java.util.HashMap;
import java.util.Map;

public class BuildTree {
    public TreeNode buildTreePreorderInorder(int[] preorder, int[] inorder) {
        Map<Integer, Integer> nodeToInorderIdx = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            nodeToInorderIdx.put(inorder[i], i);
        }
        return binaryTreeFromPreorderInorderHelper(
                preorder, 0, preorder.length, 0, inorder.length, nodeToInorderIdx);
    }

    // Builds the subtree with preorder.subList(preorderStart, preorderEnd) and
    // inorder.subList(inorderStart, inorderEnd)
    private static TreeNode binaryTreeFromPreorderInorderHelper(int[] preorder, int preorderStart, int preorderEnd,
                                                                int inorderStart, int inorderEnd,
                                                                Map<Integer, Integer> nodeToInorderIdx) {
        if (preorderEnd <= preorderStart || inorderEnd <= inorderStart) {
            return null;
        }
        int rootInorderIdx = nodeToInorderIdx.get(preorder[preorderStart]);
        int leftSubtreeSize = rootInorderIdx - inorderStart;

        return new TreeNode(
                preorder[preorderStart],
                // Recursively builds the left subtree.
                binaryTreeFromPreorderInorderHelper(preorder, preorderStart + 1, preorderStart + 1 + leftSubtreeSize,
                        inorderStart, rootInorderIdx, nodeToInorderIdx),
                // Recursively builds the right subtree
                binaryTreeFromPreorderInorderHelper(preorder, preorderStart + 1 + leftSubtreeSize, preorderEnd,
                        rootInorderIdx + 1, inorderEnd, nodeToInorderIdx)
        );

    }
}
