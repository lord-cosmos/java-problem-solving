package connectivity.improvements;

public class WeightedQuickUnionUF {
  private int[] id;
  private int[] sz;

  public WeightedQuickUnionUF(int N) {
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
      sz[i] = 1;
    }
  }

  private int root(int i) {
    while (i != id[i]) {

      // if below line is added then it becomes Path compression as we reduce the path
      // to find.
      //

      // id[i] = id[id[i]];

      i = id[i];
    }
    return i;
  }

  public boolean isConnected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    if (i == j)
      return;
    if (sz[i] < sz[j]) {
      id[i] = j;
      sz[j] += sz[i];
    } else {
      id[j] = i;
      sz[i] += sz[j];
    }
  }

  public static void main(String[] args) {
    WeightedQuickUnionUF uf = new WeightedQuickUnionUF(10);
    uf.union(4, 3);
    uf.union(3, 8);
    uf.union(6, 5);
    uf.union(9, 4);
    uf.union(2, 1);
    uf.union(5, 0);
    uf.union(7, 2);
    uf.union(6, 1);
    uf.union(7, 3);

    // 😂😂 every object is connected lol ..due to above union cmds

    System.out.println(uf.isConnected(5, 0));
    System.out.println(uf.isConnected(5, 3));
  }

}

// Running time
// - Find : Takes time proportional to depth of p and q
// - Union: takes constant time , given roots

// In weighted
// tree approach, depth
// of any
// node x
// is atmost
// log N base 2
// ;