package leetcode;

import java.util.*;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
