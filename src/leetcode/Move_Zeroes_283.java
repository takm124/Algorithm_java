package leetcode;

public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int arr = 0;

        for (int num: nums) {
            if (num != 0) nums[arr++] = num;
        }

        while (arr < nums.length) {
            nums[arr++] = 0;
        }
    }
}
