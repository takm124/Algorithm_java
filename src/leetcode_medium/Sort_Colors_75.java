package leetcode_medium;

public class Sort_Colors_75 {
    // Sorting without sort func
    public void sortColors(int[] nums) {
        /**
         * 0이 놓인 현재 위치를 나타내는 zeroIndex와 2가 놓인 위치를 알려줄 twoIndex
         */
        int zeroIndex = 0;
        int twoIndex = nums.length - 1;

        int i = 0; // 현재 idx

        while (i <= twoIndex) {
            if (nums[i] == 0) {
                swap(nums, zeroIndex++, i++); // 0인 숫자를 발견하면, zeroIndex위치로 0을 옮기고 idx를 하나 증가
            } else if (nums[i] == 2) {
                swap(nums, twoIndex--, i); // 2인 숫자를 발견하면 twoIndex 위치로 2를 옮기고 idx는 그대로(바뀐 숫자가 무엇인지 모르기 때문)
            } else {
                i++; // 1인경우에는 그대로 놔두기
            }
        }
    }

    public void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }

}
