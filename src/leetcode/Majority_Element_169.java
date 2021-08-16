package leetcode;

import java.util.Arrays;

public class Majority_Element_169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Moore voting algorithm
    public int majorityElement2(int[] nums) {
        int count=0, major = 0;
        for (int num: nums) {
            if (count == 0) {
                major = num;
            }
            
            if (num != major) {
                count--;
            } else {
                count++;
            }
        }
        return major;
    }
}
