package inflearn.section1_String;

import java.util.Scanner;

public class Question6 { // 중복 문자 제거
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            String tmp = Character.toString(c);
            if (sb.indexOf(tmp) == -1) {
                sb.append(tmp);
            }
        }

        return sb.toString();
    }
}
