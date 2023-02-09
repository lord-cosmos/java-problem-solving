package neetcode.Trees;

import java.util.*;

import javax.management.Query;

import neetcode.Trees.TreeNode;

public class LevelOrder {
  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null)
      return result;
    q.add(root);
    while (!q.isEmpty()) {
      int len = q.size();

      List<Integer> level = new ArrayList<>();
      for (int i = 0; i < len; i++) {
        TreeNode curr = q.poll();
        level.add(curr.val);
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
      result.add(level);
    }
    return result;
  }
}
