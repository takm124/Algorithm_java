package programmers;

import java.util.Locale;

public class Question036 { // n진수 게임
    public static void main(String[] args) {
        solution(2, 4, 2, 1);
    }

    public static String solution(int n, int t, int m, int p) {
        /**
         * n : 진수
         * t : 미리 구할 숫자의 개수
         * m : 게임에 참여하는 인원
         * p : 본인 순서
         */

        // m * t개의 숫자를 n 진수로 변경
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= m * t; i++) {
            sb.append(Integer.toString(i, n));
        }

        int idx = 0;
        StringBuilder ans = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            if (idx % m == (p - 1)) {
                ans.append(c);
            }
            idx++;
        }

        return ans.toString().toUpperCase();
    }

}
