package connectivity;

// Eager appraoch

// Defects : 
// 1. Union operation is too expensive. 
// 2. Trees are flat, but too expensive to keep them flat. 

// Our datastructure

public class QuickFindUF {
  private int[] id;

  // 1. Initilaisation
  // constrcutor to intialise our array;
  public QuickFindUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  // 2. connected
  // method to find if two objects are connected
  public boolean isConnected(int p, int q) {
    return id[p] == id[q];
  }

  // 3. union operation
  // To merge the objects into the same connected component
  public void union(int p, int q) { 
    int pid = id[p];
    int qid = id[q];

    for (int i = 0; i < id.length; i++) {
      if (id[i] == id[p])
        id[p] = id[q];
    }
  }

}
