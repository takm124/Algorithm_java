package leetcode_easy;

public class Calculate_Money_in_Leetcode_Bank_1716 {
    public int totalMoney(int n) {
        int count = 1;
        int answer = 0;

        while (n > 0) {
            if (n >= 7) {
                for (int i = 0; i < 7; i++) {
                    answer += (count + i);
                }
            }

            if (n < 7) {
                for (int i = 0; i < n; i++) {
                    answer += (count + i);
                }
            }

            n -= 7;
            count++;

        }
        return answer;
    }
}
