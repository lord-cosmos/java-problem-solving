package hackerrank_yt;

import java.util.*;

import ds.TreeNode;

public class LevelOrder {

  //
  public static List<List<Integer>> printLevelOrder(TreeNode node) {
    List<List<Integer>> result = new ArrayList<>();
    if (node == null) {
      return result;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.add(node);


    while (!q.isEmpty()) {
      List<Integer> l = new ArrayList<>();

      int size = q.size();
      // deque a node
      // process it as needed
      // add it a list for current level
      // enque its children


      // for current level, add needed nodes.
      for (int i = 0; i < size; i++) {
        TreeNode n = q.poll();
        l.add(n.val);

        if (n.left != null) {
          q.add(n.left);
        }
        if (n.right != null) {
          q.add(n.right);
        }

      }
      result.add(l);
      //
    }
    return result;

  }


  public int heightOfTree(TreeNode node) {
    if (node == null) {
      return 0;
    } else {
      int leftHeight = heightOfTree(node.left);
      int rightHeight = heightOfTree(node.right);
      return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    List<List<Integer>> l = LevelOrder.printLevelOrder(root);
    for (List<Integer> i : l) {
      System.out.println(i.toString());
    }
  }
}
