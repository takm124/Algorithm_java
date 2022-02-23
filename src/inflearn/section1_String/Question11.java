package inflearn.section1_String;

import java.util.Scanner;

public class Question11 { // 문자열 압축
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        s += " ";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }
        return answer;
    }
}
