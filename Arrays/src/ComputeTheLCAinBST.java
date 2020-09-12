/* 15.4 COMPUTE THE LCA IN A BST
Since a BST is a specialized binary tree, the notion of lowest common ancestor, as
expressed in Problem 10.4 on Page 157, holdsfor BSTs too.
In general, computing the LCA of two nodesin a BST is no easier than computing
theLCA in a binary tree,since structurally a binary tree can be viewed as a BST where
all the keys are equal. However, when the keys are distinct, it is possible to improve
on the LCA algorithmsfor binary trees.
Design an algorithm that takes asinput a BST and two nodes, and returns the LCA
of the two nodes. For example, for the BST in Figure 15.1 on Page 255, and nodes C
and G, your algorithm should return B. Assume all keys are distinct. Nodes do not
have references to their parents.
Hint: Take advantage of the BST property.*/
public class ComputeTheLCAinBST {
    /* Since we descend one level with each iteration, the time complexity is0(h), where h
is the height of the tree.*/
    public static TreeNode findLCA(TreeNode tree,
                                            TreeNode s,
                                            TreeNode b) {
       TreeNode p = tree;
       while (p.val < s.val || p.val > b.val) { //assume the LCA is between s and b
           //keep searching since p is outside of [s, b]
          while (p.val < s.val) {
              p = p.right; // the LCAmust be in p's right child
          }

          while (p.val > b.val) {
              p = p.left; //The LCA must be in p's left child
          }
       }
       return p;
    }
}
