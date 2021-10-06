package leetcode;

public class Set_Mismatch_645 {
    public int[] findErrorNums(int[] nums) {
        int[] array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            array[nums[i]]++;
        }

        int repeatedNum = 0;
        int missingNum = 0;
        int index = 0;
        for (int num : array) {
            if (num == 0) {
                missingNum = index;
            }

            if (num == 2) {
                repeatedNum = index;
            }

            index++;

        }

        return new int[]{repeatedNum, missingNum};
    }
}
