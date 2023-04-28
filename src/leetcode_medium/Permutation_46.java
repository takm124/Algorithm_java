package leetcode_medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] ch = new boolean[nums.length];
        dfs(ans, new ArrayList<>(), nums, ch);
        return ans;
    }

    public void dfs(List<List<Integer>> ans, List<Integer> tmp, int[] nums, boolean[] ch) {
        if (tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (ch[i]) continue;
            tmp.add(nums[i]);
            ch[i] = true;
            dfs(ans, tmp, nums, ch);
            tmp.remove(tmp.size() - 1);
            ch[i] = false;
        }
    }
}
