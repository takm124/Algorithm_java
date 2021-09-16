package leetcode;

public class Sort_Array_By_Parity_II_922 {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int len = nums.length;
        while (even < len && odd < len) {
            while (even < len && nums[even] % 2 == 0) {
                even += 2;
            }

            while (odd < len && nums[odd] % 2 == 1) {
                odd += 2;
            }

            if (even < len && odd < len) {
                swap(nums, even, odd);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int even, int odd) {
        int tmp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = tmp;
    }
}
