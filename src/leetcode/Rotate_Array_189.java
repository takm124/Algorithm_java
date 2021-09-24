package leetcode;

public class Rotate_Array_189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] answer = new int[len];

        if (k > len) {
            k %= len;
        }

        for (int i = 0; i < len; i++) {

            if (i + k < len) {
                answer[i + k] = nums[i];
            } else {
                answer[i + k - len] = nums[i];
            }
        }

        for (int i = 0; i < len; i++) {
            nums[i] = answer[i];
        }
    }
}
