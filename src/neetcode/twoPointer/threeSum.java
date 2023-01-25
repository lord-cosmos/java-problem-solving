package neetcode.twoPointer;

import java.util.*;

public class threeSum {

  public List<List<Integer>> findTriplets(int[] nums) {

    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      if (i > 0 && a == nums[i - 1]) {
        continue;
      }

      int l = i + 1;
      int r = nums.length - 1;
      while (l < r) {
        int threeSum = a + nums[l] + nums[r];

        if (threeSum > 0) {
          r -= 1;
        } else if (threeSum < 0) {
          l += 1;
        } else {
          List<Integer> ls = new ArrayList();
          ls.add(a);
          ls.add(nums[l]);
          ls.add(nums[r]);
          res.add(ls);

          l += 1;
          while (nums[l] == nums[l - 1] && l < r) {
            l += 1;
          }
        }
      }

    }
    return res;

  }

  public static void main(String[] args) {
    threeSum cl = new threeSum();
    int[] nums = { 0, 0, 0 };

    System.out.println(cl.findTriplets(nums).toString());

  }
}
