package connectivity;

// Lazy appraoch

// Defects : 
// 1. Trees can get tall. (which would mean the Find operation can also be expensive in cases)
// 2. Find operation is too expensive (could be N array accesses). 

// Our datastructure

public class QuickUnionUF {
  private int[] id;

  // set id of each object to itself.

  public QuickUnionUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++)
      id[i] = i;
  }

  // chase parent pointers until reach root.

  private int root(int i) {
    while (i != id[i]) {
      i = id[i]; // set i to its parent
    }
    return i;
  }

  // check if p and q have same root

  public boolean isConnected(int p, int q) {
    return root(p) == root(q);
  }

  // check root of p to point to root of q (depth of p and q array accesses)
  // this is other way of saying set parent of root of p to root of q.
  // parent of any element can be accessed from id[i]

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    id[i] = j;
  }

}