package programmers;

public class Question007 { // 숫자의 표현
    public int solution(int n) {
        int count = 0;
        int lp = 1;
        while (lp <= n) {
            int sum = 0;
            for (int rp = lp; rp <= n; rp++) {
                sum += rp;

                if (sum == n) count++;
                if (sum > n) break;
            }

            lp++;
        }

        return count;
    }
}
