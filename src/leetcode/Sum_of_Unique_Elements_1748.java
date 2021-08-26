package leetcode;

public class Sum_of_Unique_Elements_1748 {
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        int ans = 0 ;

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) ans += i;
        }

        return ans;
    }
}
