package neetcode.dp;

// Problem Link : https://leetcode.com/problems/house-robber-ii/

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * A class which represents the above problem.
 */
public class HouseRobberII {
  public int robII(int[] nums) {
    int length = nums.length;
    if (length == 1) return nums[0];
    int m1 = HouseRobber.rob(Arrays.copyOfRange(nums, 0, length - 1));
    int m2 = HouseRobber.rob(Arrays.copyOfRange(nums, 1, length));
    return Math.max(m1, m2);
  }
}
