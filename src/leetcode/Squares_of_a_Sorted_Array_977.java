package leetcode;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public int[] sortedSquares(int[] nums) { // O(nlogn)
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i] * nums[i];
        }

        Arrays.sort(answer);

        return answer;
    }

    public int[] sortedSquares2(int[] nums) { //O(n)
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int[] answer = new int[nums.length];

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                answer[index] = nums[left] * nums[left];
                left++;
            } else {
                answer[index] = nums[right] * nums[right];
                right--;
            }

            index--;
        }

        return answer;
    }
}
