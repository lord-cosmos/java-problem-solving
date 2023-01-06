package practice.ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
  public int[] productExceptSelf(int[] nums) {

    int length = nums.length;
    int[] res = new int[length];
    Arrays.fill(res, 1);

    int prefix = 1;

    for (int i = 0; i < nums.length; i++) {
      res[i] = prefix;
      prefix = prefix * nums[i];
    }

    int postfix = 1;
    for (int i = length - 1; i > -1; i--) {
      res[i] *= postfix;
      postfix = postfix * nums[i];
    }
    return res;

  }
}
