package inflearn.section1_String;

import java.util.Scanner;

public class Question2 { // 대소문자 변환
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        for (char c : s.toCharArray()) {
            if (c >= 97 && c <= 122) {
                answer += (char) (c - 32);
            } else {
                answer += (char) (c + 32);
            }
        }

        return answer;
    }
}
