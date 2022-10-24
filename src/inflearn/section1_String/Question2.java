package inflearn.section1_String;

import java.util.Scanner;

public class Question2 { // 대소문자 변환
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { // 대문자인 경우
                sb.append((char) (s.charAt(i) + 32));
            } else { // 소문자인 경우
                sb.append((char) (s.charAt(i) - 32));
            }
        }

        return sb.toString();
    }
}
