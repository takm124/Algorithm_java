package inflearn.section1_String;

import java.util.Scanner;

public class Question10 { // 가장 짧은 문자거리
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        for (int i : solution(s1, s2)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String s1, String s2) {
        int[] answer = new int[s1.length()];
        int cnt = 1000;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                cnt = 0;
                answer[i] = cnt;
            } else {
                cnt++;
                answer[i] = cnt;
            }
        }

        cnt = 1000;

        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == s2.charAt(0)) {
                cnt = 0;
            } else {
                cnt++;
                answer[i] = Math.min(cnt, answer[i]);
            }
        }

        return answer;
    }
}
