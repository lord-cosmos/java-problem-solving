package practice.twoPointer;

class pairSum {
  public static boolean pairSumISEqual(int[] arr, int target) {
    int point_1 = 0;
    int point_2 = arr.length - 1;

    while (point_2 > point_1) {
      if (arr[point_1] + arr[point_2] == target) {
        return true;
      } else if (arr[point_1] + arr[point_2] < target) {
        point_1 += 1;
      } else {
        point_2 += 1;
      }
    }
    return false;
  }
}