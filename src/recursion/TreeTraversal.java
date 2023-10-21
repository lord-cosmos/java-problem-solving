package recursion;

class Node {
  int item;
  Node left, right;

  public Node(int key) {
    item = key;
    left = right = null;
  }
}

public class TreeTraversal {
  // root of Tree
  Node root;

  TreeTraversal() {
    root = null;
  }

  void preorder(Node node) {
    if (node == null)
      return;

    // traverse the root node
    System.out.print(node.item + "->");
    // traverse the left child
    preorder(node.left);
    // traverse the right child
    preorder(node.right);
  }

  void postorder(Node node) {
    if (node == null) {
      return;
    }
    // traverse the left child
    postorder(node.left);
    // traverse the right child
    postorder(node.right);
    // traverse the root node
    System.out.print(node.item + "-->");
  }

  void inorder(Node node) {
    if (node == null) {
      return;
    }

    // traverse the left child
    inorder(node.left);
    // traverse the root node
    System.out.print(node.item + "->");
    // traverse the right node
    inorder(node.right);
  }

  public static void main(String[] args) {
    // create object of tree
    TreeTraversal tree = new TreeTraversal();

    // create nodes of the tree
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    // preorder tree traversal
    System.out.println("\nPreorder traversal ");
    tree.preorder(tree.root);

    // postorder tree traversal
    System.out.println("\nPostorder traversal ");
    tree.postorder(tree.root);

    // inorder tree traversal
    System.out.println("\nInorder traversal ");
    tree.inorder(tree.root);
  }
}

//CP
//PDP theory + labs + assignements
//DBMS homeworks + exam
//CloudX