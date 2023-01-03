package practice.binarySearch;

public class SearchInRotatedArray {
  public static int search(int[] nums, int target) {
    int low = 0, high = nums.length - 1, mid;
    while (low <= high) {
      mid = (low + high) / 2;

      if (mid == target)
        return mid;

      // I have find if the mid lies in left portion or right portion. but how?

      // if we are in left portion the mid value is always greater than low value and
      // same for right portion.
      // wait, how it can guarantee? because after rotation, the low value is greater
      // than all the values of right portion.
      // due to rotation.
      // 4 5 6 1 2 3 -> 4 is always greater than 1 2 3(right portion)

      // let's say if these are the elements 4 5 6 0 1 2 3 ->mid value= 0 low value =
      // 4 high value = 3
      // low value > mid value that means the mid is not in the portion of 4, that
      // means not in left portion.

      // imagine like this. pls follow the image in current package.

      if (nums[low] <= nums[mid])
      // now, i know if mid is in left portion

      {

        // more checking, validating with extremes low and mid with target, to jump to
        // next portion(right)
        if (nums[low] > target || nums[mid] < target) {
          low = mid + 1;
        } else
        // ok, now the target is in left portion only, so, ignore right portion and move
        // high to left.
        {
          high = mid - 1;
        }
      }

      // if the mid is in right portion
      else {
        if (nums[high] < target || nums[mid] > target)
          high = mid - 1;
        else
          low = mid + 1;
      }

    }
    return -1;
  }
}
