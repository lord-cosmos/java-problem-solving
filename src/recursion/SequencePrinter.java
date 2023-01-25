package recursion;

// Hypothesis - Induction - Base condition Method.

public class SequencePrinter {
  public void print1ToN(int n) {
    // 1, 2, 3, 4, 5,...., n

    if (n == 1) {
      System.out.println(1);
      return;
    }

    print1ToN(n - 1);
    System.out.println(n);
  }

  public void printNto1(int n) {
    // n , n-1, ....., 2,1

    if (n == 1) {
      System.out.println(1);
      return;
    }

    System.out.println(n);
    printNto1(n - 1);
  }

  public static void main(String[] args) {
    SequencePrinter N = new SequencePrinter();
    N.printNto1(7);
  }
}
