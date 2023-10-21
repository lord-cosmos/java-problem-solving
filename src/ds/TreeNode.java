package ds;

import java.lang.Math;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Trees {
  public static void main(String[] args) {
    String abc = "Welcome to Chegg";
    String xyz = new String(abc);
    if (abc == xyz)
      System.out.println((abc == xyz) + " " + abc.equals(xyz));
    else
      System.out.println((abc == xyz) + " " + abc.equals(xyz));
  }
}