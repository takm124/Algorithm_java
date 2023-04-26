package leetcode_medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    public void backtracking(List<List<Integer>> ans, List<Integer> tmp, int[] nums, int target, int idx) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtracking(ans, tmp, nums, target-nums[i], i);
            tmp.remove(tmp.size()-1);
        }
    }
}
