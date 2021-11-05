package leetcode;

public class Number_of_Good_Pairs_1512 {
    public int numIdenticalPairs(int[] nums) { // O(n^2)
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j ++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numIdenticalPairs2(int[] A) { // O(n)
        int res = 0, count[] = new int[101];
        for (int a: A) {
            res += count[a]++;
        }
        return res;
    }
}
