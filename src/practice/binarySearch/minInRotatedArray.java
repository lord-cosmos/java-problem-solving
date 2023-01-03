package practice.binarySearch;

import java.lang.Math;

public class minInRotatedArray {
  public int findMin(int[] nums) {
    int l = 0, h = nums.length - 1, m;
    int res = nums[0];

    // if our search range is entirely sorted then, first element will be lowest in
    // that search range

    while (l <= h) {

      if (nums[l] < nums[h]) {
        // so, we check current first el with the previous lowest res value.
        res = Math.min(nums[l], res);
        break;
      }

      m = (l + h) / 2;
      // we find, mid and compute min of both current res and current mid

      res = Math.min(res, nums[m]);

      // if we are in left portion of array, then obviously the lowest value can be in
      // right of MID
      // due to rotation concept.

      if (nums[l] <= nums[m])
        l = m + 1;
      else
        // if we are in right portion of array, and lowest value is not found then we
        // search in left part of
        // MID;

        h = m - 1;
    }
    return res;
  }
}
