package neetcode.Trees;

import ds.TreeNode;

// Own code (author code can be found below this.)

public class MaximumPathSumBinaryTree {
  int[] res;

  int maxPathSum(TreeNode node) {
    res[0] = node.val;
    dfs(node);
    return res[0];

  }

  int dfs(TreeNode root) {

    // Base case, return 0 as it will be max sum value when null node.
    if (root == null) {
      return 0;
    }

    // do induction,
    int leftMax = dfs(root.left);
    int rightMax = dfs(root.right);

    leftMax = Integer.max(leftMax, 0);
    rightMax = Integer.max(rightMax, 0);

    res[0] = Integer.max(res[0], root.val + leftMax + rightMax);

    return root.val + Integer.max(leftMax, rightMax);

  }
}

// Other Learnings :

// 1. we cannot store null value of class variable to an int[] array.
// 2. So, use Integer.MIN_VALUE instead of taking the root node's value as
// initial result.

class Solution {

  public int maxPathSum(TreeNode root) {
    int[] res = { Integer.MIN_VALUE };
    maxPathSum(root, res);
    return res[0];
  }

  public int maxPathSum(TreeNode root, int[] res) {
    if (root == null)
      return 0;

    int left = Math.max(0, maxPathSum(root.left, res));
    int right = Math.max(0, maxPathSum(root.right, res));
    res[0] = Math.max(res[0], root.val + left + right);

    return root.val + Math.max(left, right);
  }
}
