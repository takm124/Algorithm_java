package leetcode_easy;

public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length - 1;

        while (lt <= rt) {
            int center = (lt + rt) / 2;
            if (nums[center] == target) {
                return center;
            } else if (nums[center] > target) {
                rt = center - 1;
            } else {
                lt = center + 1;
            }
        }

        return lt;
    }
}
