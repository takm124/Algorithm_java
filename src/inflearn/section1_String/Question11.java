package inflearn.section1_String;

import java.util.Scanner;

public class Question11 { // 문자열 압축
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        s = s + " ";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(s.charAt(i));
                if (cnt > 1) sb.append(cnt);
                cnt = 1;
            }
        }
        return sb.toString();
    }
}
