package neetcode.twoPointer;

import java.util.Arrays;

// please check the twoSum.java

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
        point_2 -= 1;
      }
    }
    return false;
  }

  // public int[] twoSum(int[] arr, int target) {
  // int point_1 = 0;
  // int point_2 = arr.length - 1;
  // int[] res = new int[2];

  // while (point_2 > point_1) {
  // if (arr[point_1] + arr[point_2] == target) {
  // res[0] = arr[point_1];
  // res[1] = arr[point_2];
  // break;
  // } else if (arr[point_1] + arr[point_2] < target) {
  // point_1 += 1;
  // } else {
  // point_2 += 1;
  // }
  // }
  // return res;
  // }

  public static void main(String[] args) {
    pairSum p = new pairSum();
    int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    System.out.println(Arrays.toString(p.pairSumISEqual(intArray, 11)));
  }
}