package leetcode_easy;


public class Find_Lucky_Integer_in_an_Array_1394 {
    public int findLucky(int[] arr) {
        int[] nums = new int[501];

        for (int num : arr) {
            nums[num]++;
        }

        int answer = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == i) {
                answer = Math.max(answer, i);
            }
        }

        return answer;
    }
}
