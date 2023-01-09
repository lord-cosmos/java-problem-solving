package practice.ArraysAndHashing;

// O(n) TC and O(2n) for SC

public class TrappingRainWater {

  // solution 1;
  public int trap(int[] heights) {
    int length = heights.length;
    int[] maxLeft = new int[length];
    int[] maxRight = new int[length];

    for (int i = 0; i < length; i++) {
      if (i == 0)
        maxLeft[0] = 0;
      else {
        maxLeft[i] = Math.max(heights[i - 1], maxLeft[i - 1]);
      }
    }

    for (int i = length - 1; i >= 0; i--) {
      if (i == length - 1)
        maxRight[length - 1] = 0;
      else
        maxRight[i] = Math.max(heights[i + 1], maxRight[i + 1]);

    }

    int waterTrapped = 0;

    for (int i = 0; i < length; i++) {
      int mini = Math.min(maxLeft[i], maxRight[i]);
      int diff = mini - heights[i];
      if (diff >= 0) {
        waterTrapped += (diff);
      }
    }

    return waterTrapped;

  }

  // solution 2 : 
  // using two pointer - if intial left max is less than initial
  // rightMax, it implies, left max is less than all after rightMax's.
  // so, we directly check if leftMax < rightMax, if so, use leftMax as base and
  // subtract the height of current element and you get water trap by that
  // element.
  // same with rightMax;
  public int trapWater(int[] heights) {
    if (heights.length == 0)
      return 0;
    int l = 0, r = heights.length - 1;
    int leftMax = heights[l], rightMax = heights[r];
    int res = 0;

    while (l < r) {
      if (leftMax < rightMax) {
        l += 1;
        leftMax = Math.max(leftMax, heights[l]);
        res += (leftMax - heights[l]);
      } else {
        r -= 1;
        rightMax = Math.max(rightMax, heights[r]);
        res += (rightMax - heights[r]);
      }
    }
    return res;

  }

  public static void main(String[] args) {
    TrappingRainWater r = new TrappingRainWater();
    int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.println(r.trap(nums));
  }

}
