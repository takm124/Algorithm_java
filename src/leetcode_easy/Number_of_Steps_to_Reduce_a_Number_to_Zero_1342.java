package leetcode_easy;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {
    public int numberOfSteps(int num) {
        int step = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            step++;
        }

        return step;
    }
}
