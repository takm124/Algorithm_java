package leetcode_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum2_40 {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<>(), nums, target, 0);

        return ans;

    }

    public void dfs(List<List<Integer>> ans, List<Integer> tmp, int[] nums, int target, int idx) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        boolean[] check = new boolean[50];

        for (int i = idx; i < nums.length; i++) {
            if (!check[nums[i]] && target - nums[i] >= 0) {
                check[nums[i]] = true;
                tmp.add(nums[i]);
                dfs(ans, tmp, nums, target-nums[i], i+1);
                tmp.remove(tmp.size()-1);
            }
        }


    }
}
