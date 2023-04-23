package leetcode_easy;

public class Two_Sum_II_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int first = 0;
        while (first < numbers.length) {
            int second = target - numbers[first];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == second && i != first) {
                    answer[0] = first + 1;
                    answer[1] = i + 1;
                    return answer;
                }
            }
            first++;
        }
        return answer;

    }
}
