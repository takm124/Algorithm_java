package leetcode;

public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            answer ^= nums[i];
        }

        return answer;
    }
}
