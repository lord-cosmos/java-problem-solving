package neetcode.twoPointer;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int res = 0;
    int l, r;
    l = 0;
    r = height.length - 1;

    while (l < r) {
      int area = (r - l) * (Math.min(height[l], height[r]));
      res = Math.max(area, res);
      if (height[l] > height[r])
        r--;
      else
        l++;
    }
    return res;

  }

  public static void main(String[] args) {
    ContainerWithMostWater x = new ContainerWithMostWater();
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(x.maxArea(height));
  }
}
