package neetcode.dp;


//  Problem Link : https://leetcode.com/problems/climbing-stairs/description/

/**
 * A class that represents above problem.
 */
public class ClimbStairs1 {
  /**
   * Number of ways to reach step N from step 0, if you can take either 1 or 2 steps at each time.
   *
   * @param n final step to reach
   * @return int number of ways to reach n
   */
  public int getCountSteps1or2(int n) {
    int a = 1;
    int b = 1;

    for (int i = 2; i <= n; i++) {
      int c = a + b;
      a = b;
      b = c;

    }
    return b;
  }

  /**
   * Number of ways to reach step N from step 0, if you can take either 1 or 2 or 3 steps at each time.
   *
   * @param n final step to reach
   * @return int number of ways to reach n
   */
  public int getCountSteps1or2or3(int n) {
    int a = 1;
    int b = 1;
    int c = 2;

    for (int i = 3; i <= n; i++) {
      int d = a + b + c;
      a = b;
      b = c;
      c = d;

    }
    return c;
  }


}
