public class ComputeTheLCAinBST {
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
