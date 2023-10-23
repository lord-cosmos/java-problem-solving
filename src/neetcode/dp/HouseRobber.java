package neetcode.dp;

//  Problem Link : https://leetcode.com/problems/house-robber/description/

/**
 * A class which represents the above problem.
 */
public class HouseRobber {
  public static int rob(int[] nums) {
    int rob1 = 0;
    int rob2 = 0;
    for (int n : nums) {
      int temp = Math.max(rob1 + n, rob2);
      rob1 = rob2;
      rob2 = temp;
    }
    return rob2;
  }
}
