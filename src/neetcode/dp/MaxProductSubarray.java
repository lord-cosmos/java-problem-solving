package neetcode.dp;

public class MaxProductSubarray {

    // Nov 22, 2023, 12:21pm

    // You have to keep track of min and max in each subarray. Use those values to
    // determine next max,min when next number is considered.
    // when 0 is encountered, our max, min will become 0's and we will lose track.
    // to mitigate this, we can use 1 instead. so, that max, min will reset and
    // also, when new number is considered, we can correct values.

    // final :
    public int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int res = nums[0];
        int max = 1;
        int min = 1;

        for (int n : nums) {
            int tmp = max * n;
            max = Math.max(n, Math.max(tmp, min * n));
            min = Math.min(n, Math.min(tmp, min * n));
            res = Math.max(res, max);
        }
        return res;
    }

    // try : 3
    public int maxProduct3(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            int product = nums[i];
            while (j < nums.length && nums[j] > 0) {
                product = product * nums[j];
                res = res < product ? product : res;
                j += 1;
            }
            res = res < product ? product : res;
            i = j < nums.length ? j : i;

        }

        return res;
    }

    // try : 2
    public int maxProduct2(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            int product = nums[i];
            while (j < nums.length && nums[j] > 0) {
                product = product * nums[j];
                res = res < product ? product : res;
                j += 1;
            }
            res = res < product ? product : res;
            i = j < nums.length ? j : i;

        }

        return res;
    }

    // try : 1
    public int maxProduct1(int[] nums) {
        if (nums.length == 1 && nums[0] >= 0)
            return nums[0];

        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            int j = i + 1;
            int product = nums[i];
            while (j < nums.length && nums[j] > 0) {
                product = product * nums[j];
                res = res < product ? product : res;
                j += 1;
            }
            res = res < product ? product : res;
            i = j < nums.length ? j : i;

        }

        return res;
    }

    // trye : 0
    public int maxProduct0(int[] nums) {
        if (nums.length == 1 && nums[0] >= 0)
            return nums[0];

        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0 && nums[i] > res) {
                res = nums[i];
            }
            int j = i + 1;
            while (j < nums.length && nums[j] > 0) {
                res = res * nums[j];
                j += 1;
            }
        }
        return res;
    }
}
