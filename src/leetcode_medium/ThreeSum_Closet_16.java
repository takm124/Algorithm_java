package leetcode_medium;

import java.util.Arrays;

public class ThreeSum_Closet_16 {
    //단순 3중 for문 해결
    public int threeSumClosest(int[] nums, int target) {
        int closet = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int tmp = 0;
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    tmp = nums[i] + nums[j] + nums[k];
                    if (Math.abs(tmp - target) < minDiff) {
                        minDiff = Math.abs(tmp - target);
                        closet = tmp;
                    }
                }
            }
        }

        return closet;
    }

    // 정렬 후 two pointer 활용
    public int solution2(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i < n - 2; i++){
            int low = i + 1,high = n - 1;
            while(low < high){
                int tmp = nums[i] + nums[low] + nums[high];
                if(Math.abs(target - tmp) < minDiff){
                    ans = tmp;
                    minDiff = Math.abs(target - tmp);
                }
                if(tmp == target){
                    return target;
                }
                else if(tmp > target){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return ans;
    }
}
