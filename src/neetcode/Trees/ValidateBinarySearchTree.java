package neetcode.Trees;

// public class ValidateBinarySearchTree {
//   public boolean isValidBST(TreeNode root) {
//     if (root == null)
//       return false;

//     if (bst(root)) {
//       return isValidBST(root.left) && isValidBST(root.right);
//     }

//     return false;
//   }

//   public boolean bst(TreeNode node) {

//     // the below code is incorrect algorithm.
//     if (node.left == null && node.right == null) {
//       return true;
//     }

//     if (node.left == null && node.right.val > node.val) {
//       return true;
//     }
//     if (node.left.val < node.val && node.right == null) {
//       return true;
//     }

//     if (node.val > node.left.val && node.val < node.right.val) {
//       return true;
//     }
//     return false;
//   }
// }

// all the nodes in the right subtree should be greater than root.
// all the nodes in the left subtree should be lesser than root.

// The above algorithm only consider current node and its left and right nodes.
// it is wrong,

public class ValidateBinarySearchTree {
  public boolean isValidBST(TreeNode root) {
    if (root == null)
      return true;
    return dfs(root, null, null);
  }

  private boolean dfs(TreeNode root, Integer min, Integer max) {
    if (root == null)
      return true;

    if ((min != null && root.val <= min) || max != null && root.val >= max) {
      return false;
    }

    return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);
  }
}