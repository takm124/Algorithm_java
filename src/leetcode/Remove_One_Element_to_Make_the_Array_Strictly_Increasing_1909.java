package leetcode;

public class Remove_One_Element_to_Make_the_Array_Strictly_Increasing_1909 {
    public boolean canBeIncreasing(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len - 1;i++) {
            if (nums[i] - nums[i + 1] >= 0) {
                count += 1;
                if (i - 1>=0 && i + 2<=len - 1 && nums[i] - nums[i + 2] >= 0 && nums[i - 1]-nums[i + 1] >= 0) {
                    return false;
                }
            }

        }
        return count <= 1;
    }
}
