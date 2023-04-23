package leetcode_easy;

import java.util.Arrays;

public class Maximum_Product_Difference_Between_Two_Pairs_1913 {
    public int maxProductDifference(int[] nums) {  // O(n logn)
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }

    public int maxProductDifference2(int[] nums) { // O(n)
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num:nums) {
            if (num > max1) {
                max2 = max1;
                max1=num;
            }
            else if (num>max2) {
                max2 = num;
            }

            if (num<min1) {
                min2 = min1;
                min1 = num;
            } else if(num<min2) {
                min2 = num;
            }

        }
        int productMax = max1 * max2;
        int productMin = min1 * min2;
        return productMax - productMin;

    }


}
