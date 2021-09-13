package leetcode;

public class Binary_Search_704 {
    public int search(int[] nums, int target) {
        int lt = 0;
        int rt = nums.length - 1;

        while (lt <= rt) {
            int center = (lt + rt) / 2;

            if (nums[center] < target) {
                lt = center + 1;
            } else {
                rt = center - 1;
            }

            if ( nums[center] == target) {
                return center;
            }
        }

        return -1;
    }
}
